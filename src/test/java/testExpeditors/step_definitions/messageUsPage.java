package testExpeditors.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testExpeditors.utilty.ConfigurationReader;
import testExpeditors.utilty.Driver;

import java.time.Duration;
import java.util.List;

public class messageUsPage {

    @Test
    public void loadPage(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.manage().window().maximize();

        driver.get("https://www.bankofamerica.com/");

        WebElement savingButton = driver.findElement(By.xpath("//a[@id='navSavings']"));
        savingButton.click();

        WebElement savingsButton = driver.findElement(By.xpath("//a[@id='rewardsSavingsAccount']"));
        savingsButton.click();

        WebElement zip = driver.findElement(By.xpath("//input[@aria-describedby='zipCodeModalInputField_errorMessage zipCodeModalInputField-hint-text']"));
        zip.sendKeys("98027");


        WebElement goButton = driver.findElement(By.xpath("//div[@class='input-wrapper flex-container']/div[@class='modal-sparta-button']"));
        goButton.click();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button compare-accounts spa-btn spa-btn--primary spa-btn--small']")));

        WebElement openButton = driver.findElement(By.xpath("//a[@class='button compare-accounts spa-btn spa-btn--primary spa-btn--small']"));
        openButton.click();

//        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='button compare-accounts spa-btn spa-btn--primary spa-btn--small']")));
//
//        element.click();


        WebElement goAppButton = driver.findElement(By.xpath("//a[@id='go-to-application-mediumup']"));
        goAppButton.click();

        WebElement firstName = driver.findElement(By.xpath("//div[@id='zz_name_tb_fnm_v_1-box']"));
        firstName.sendKeys("Mariia");

        WebElement lastName = driver.findElement(By.xpath("//div[@id='zz_name_tb_lnm_v_1-box']"));
        lastName.sendKeys("Suzdal");

        WebElement dateButton = driver.findElement(By.xpath("//div[@id='zz_citz_tb_dob_search_v_1-box']"));
        dateButton.sendKeys("11/11/1993");

        WebElement addressButton = driver.findElement(By.xpath("//div[@id='zz_addr_tb_line1_v_1-box']"));
        addressButton.sendKeys("700 front st s");

        WebElement cityButton = driver.findElement(By.xpath("//div[@id='zz_addr_tb_city_v_1-box']"));
        cityButton.sendKeys("Issaquah");

        WebElement stateDD = driver.findElement(By.xpath("//select[@id='zz_addr_lb_state_v_1']"));
        Select selectState = new Select(stateDD);
        selectState.deselectByVisibleText("Washington");

        WebElement zipButton = driver.findElement(By.xpath("//div[@id='zz_addr_tb_zip_v_1-box']"));
        zipButton.sendKeys("98027");

        WebElement phoneButton = driver.findElement(By.xpath("//div[@id='zz_phn_tb_ppno_v_1-box']"));
        phoneButton.sendKeys("2064308776");

        WebElement phoneType = driver.findElement(By.xpath("//select[@id='zz_phn_lb_ppnotp_v_1']"));
        Select selectPhoneType = new Select(phoneType);
        selectPhoneType.deselectByVisibleText("Mobile");

        WebElement radioButtonUs = driver.findElement(By.xpath("//input[@id='zz_citz_lb_uscit_yes_v_1-real']"));
        radioButtonUs.click();

//        WebElement saveForLater = dateButton.findElement(By.xpath("//a[@id='uGLG02']"));
//        saveForLater.click();

        driver.quit();


    }



}
