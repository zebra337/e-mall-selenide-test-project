import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegFormTest {

    @Test
    public void PositiveFillingOfRegFormTest() throws InterruptedException {
        open("https://emall.by/");
        WebDriverRunner.getWebDriver().manage().window().maximize();

        $(By.xpath("//button[contains(@class, 'colour_white__FyCpn')]")).click();
        $(By.xpath("//button[contains(@class, 'colour_white__FyCpn')]")).click();
        $(By.xpath("//button[contains(@class, 'KB1 banner_button')]")).click();
        $(By.xpath("//button[contains(@class, 'content_confirm_button')]")).click();
        $(By.xpath("//a[@href='https://emall.by/login?backurl=/']/i")).click();

        $(By.xpath("//button[contains(@class, 'btn_btn_colour_white')]")).click();
        $(By.xpath("//input[@autocomplete='given-name']")).setValue("Sasha");
        $(By.xpath("//input[@autocomplete='family-name']")).setValue("Sashin");
        $(By.xpath("//input[@autocomplete='additional-name']")).setValue("Sashevich");
        $(By.xpath("//input[@autocomplete='tel']")).setValue("259999999");
        $(By.xpath("//input[@autocomplete='email']")).setValue("aa@aa.aa");
        $(By.xpath("//input[@id='_r_c_']")).setValue("As000000");
        $(By.xpath("//input[@id='_r_d_']")).setValue("As000000");

        $(By.xpath("//span[contains(text(), ') и')]/parent::div//i")).click();
        $(By.xpath("//span[contains(text(), ') с')]/parent::div//i")).click();
        $(By.xpath("//button[contains(@class, 'scroll_to_bottom')]")).click();
        Thread.sleep(1000);
        $(By.xpath("//label[contains(@class, 'checkbox__PbQ_G')]//i")).click();
        $(By.xpath("//div[@class='policy-consent_actions___YqG_']/button[2]")).click();
        $(By.xpath("//button[contains(@class, 'btn_btn__jx6SQ')]")).click();

        $(By.xpath("//h1[@class='wrapper_title__hxKZS']")).shouldHave(text("Введите код"));
    }
}