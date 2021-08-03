package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import cucumber.api.Scenario;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class Utility {
    public static Properties configProperties;
    public static Scenario scenario;
    public static String scenarioName;
    public String userAdminClientId = configProperties.getProperty("client_id");
    public String userAdminClientSecret = configProperties.getProperty("secret");
    public static Properties writeToConfigProperties;
    public static FileWriter writer;
    public static Properties accessTokenConfigProperties;


    public boolean isTokenGeneratedWithGrantTypePassword() {
        boolean isAuthGenerated;
        String authToken = "";
        try {
            authToken = given()
                    .auth().preemptive().basic(userAdminClientId, userAdminClientSecret)
                    .contentType("application/x-www-form-urlencoded")
                    .formParam("grant_type", "password")
                    .formParam("username", "EMEA\\svc_cm_omp")
                    .formParam("password", "KIiu85swkYK]GPU{")
                    .formParam("resource", "https://cm.adidas.com")
                    .when()
                    .post("https://sts-test.adidas-group.com/adfs/oauth2/token").then().extract()
                    .response().jsonPath().getString("access_token");
            writeTextIntoConfigFile("Access_Token", authToken, "AccessTokenConfig");

        } catch (Exception e) {
            reportFailure("Exception occurred while generating auth token : " + e.getStackTrace());
        }

        isAuthGenerated = !authToken.equals("");
        return isAuthGenerated;
    }

    public void writeTextIntoConfigFile(String key, String value, String configFileName) {
        try {

            String configFile = System.getProperty("user.dir") + "//src//main//resources//" + configFileName
                    + ".properties";
            writeToConfigProperties = new Properties();
            writeToConfigProperties.setProperty(key, value);

            File filePath = new File(configFile);
            if (filePath.exists()) {
                if (writer != null) {
                    writeToConfigProperties.store(writer, null);
                } else {
                    writer = new FileWriter(filePath);
                    writeToConfigProperties.store(writer, null);
                }

            } else {
                writer = new FileWriter(filePath);
                writeToConfigProperties.store(writer, null);

            }
        } catch (Exception e) {
            reportFailure("Exception occurred due to config file or IO issues : " + e.getStackTrace());
        }

    }

    public String readAccessToken() {
        String configFile = System.getProperty("user.dir")
                + "//src//main//resources//AccessTokenConfig.properties";
        accessTokenConfigProperties = new Properties();
        try {
            FileInputStream fisConfig = new FileInputStream(configFile);
            accessTokenConfigProperties.load(fisConfig);
        } catch (Exception e) {
            reportFailure("Exception occurred as config file could not be read properly : " + e.getStackTrace());
        }

        return accessTokenConfigProperties.getProperty("Access_Token");
    }

    public static String generateStringFromResource(String path) throws IOException {

        return new String(Files.readAllBytes(Paths.get(path)));

    }

    static {
        String configFile = System.getProperty("user.dir")
                + "//src//main//resources//config.properties";
        configProperties = new Properties();
        try {
            FileInputStream fisConfig = new FileInputStream(configFile);
            configProperties.load(fisConfig);
        } catch (Exception e) {
            reportFailure("Scenario failed as config file could not be read properly : " + e.getMessage());
        }
    }

    public static ExtentTest test;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;


    public static ExtentReports getExtentInstance() {
        if (extent == null) {
            Date date = new Date();
            String fileName = date.toString().replace(":", "_").replace(" ", "_") + ".html";
            String reportPath = System.getProperty("user.dir") + "/ExtentReports/" + fileName;
            htmlReporter = new ExtentHtmlReporter(reportPath);
            extent = new ExtentReports();
            htmlReporter.setAppendExisting(true);
            htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");
            extent.setSystemInfo("Test Suite", "Marketing API E2E ");
            extent.attachReporter(htmlReporter);

        }

        return extent;
    }


    public static void reportFailure(String failureMessage) {
        test.fail(failureMessage);
        extent.flush();
        Assert.fail(failureMessage);
    }

    public void reportInfo(String infoMessage) {
        test.info(infoMessage);
    }


    public void reportPass(String passMessage) {
        test.pass(passMessage);
    }


}
