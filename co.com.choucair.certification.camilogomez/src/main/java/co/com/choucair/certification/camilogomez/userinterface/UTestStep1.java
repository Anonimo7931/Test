package co.com.choucair.certification.camilogomez.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;

public class UTestStep1 extends PageObject {
    public static final Target FIRST_NAME = Target.the("Box where do we write the first name").
            located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Box where do we write the last name").
            located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS = Target.the("Box where do we write the email address").
            located(By.id("email"));

    public static final Target MONTH = Target.the("Box where do we write the month").
            located(By.xpath("//option[@label='January']"));

    public static final Target DAY = Target.the("Box where do we write the day").
            located(By.xpath("//option[@label='17']"));

    public static final Target YEAR = Target.the("Box where do we write the year").
            located(By.xpath("//option[@label='1999']"));

    public static final Target NEXT = Target.the("button that get in the next step")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
