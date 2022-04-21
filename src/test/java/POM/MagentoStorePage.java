package POM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.ClsBrowser;

public class MagentoStorePage extends ClsBrowser {

    //Locators
    String Name = "Emilio";
    String LastName = "Orozco";
    String Email = "intern26@at.com";
    String Address = "Mi casita";
    String City = "Colima";
    String Zip = "28020";
    String Telephone = "3125500773";
    String Password = "Holaestoyaburrido123";

    String LGLCDtv ="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/button[1]";
    String CheckoutBtn = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/button[1]";
    String GuestContinueBtn = "//button[@id='onepage-guest-register-button']";
    String FirstNameInput = "//input[@id='billing:firstname']";
    String LastNameInput = "//input[@id='billing:lastname']";
    String EmailInput = "//input[@id='billing:email']";
    String AddressInput = "//input[@id='billing:street1']";
    String CityInput = "//input[@id='billing:city']";
    String SecondZipInput= "//input[@id='billing:postcode']";
    String TelephoneInput = "//input[@id='billing:telephone']";
    String SelectCountryMX = "//*[@id=\"billing:country_id\"]/option[141]";
    String BillingContinueBtn ="//body/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[2]/div[2]/form[1]/div[1]/div[1]/button[1]";
    String ShippingContinueBtn ="//body/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[4]/div[2]/form[1]/div[3]/button[1]";
    String MoneyPayment = "//input[@id='p_method_checkmo']";
    String PaymentContinueBtn = "//*[@id=\"payment-buttons-container\"]/button";
    String OrderContinueBtn ="//*[@id=\"review-buttons-container\"]/button";
    String SamsungTV = "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/button";
    String AccountBtn = "//*[@id=\"header\"]/div/div[2]/div/a";
    String RegisterBtn = "//a[contains(text(),'Register')]";
    String RegFirstName = "//input[@id='firstname']";
    String RegLastName = "//input[@id='lastname']";
    String RegEmail = "//input[@id='email_address']";
    String RegPassword = "//input[@id='password']";
    String ConfirmRegPassword = "//input[@id='confirmation']";
    String FinalRegisterBtn = "//*[@id=\"form-validate\"]/div[2]/button";








    //Methods


    /**
     * Add LG LCD TV to cart
     */
    public void addToCartLG()
    {
        WaitForLoad();
        WaitForElementClickable(LGLCDtv);
        Click(LGLCDtv);
    }

    /**
     * Add samsung tv to cart
     */
    public void addToCartSamsung()
    {
        WaitForLoad();
        WaitForElementClickable(SamsungTV);
        Click(SamsungTV);
    }

    /**
     * Click on checkout btn and checkout as guest
     */
    public void proceedCheckout() throws InterruptedException {
        WaitForLoad();
        WaitForElementClickable(CheckoutBtn);
        Click(CheckoutBtn);
        WaitForLoad();
        WaitForElementClickable(GuestContinueBtn);
        Click(GuestContinueBtn);
        WaitForLoad();

    }

    /**
     * enter requested billing information
     */
    public void billingInformation()
    {
        WaitForElementClickable(BillingContinueBtn);
        SendKeys(FirstNameInput,Name);
        SendKeys(LastNameInput,LastName);
        SendKeys(EmailInput,Email);
        SendKeys(AddressInput,Address);
        SendKeys(CityInput,City);
        SendKeys(SecondZipInput,Zip);
        Click(SelectCountryMX);
        SendKeys(TelephoneInput,Telephone);
        Click(BillingContinueBtn);
    }

    /**
     * Select shipping method
     */
    public void shippingMethod()
    {
        WaitForLoad();
        WaitForElementClickable(ShippingContinueBtn);
        Click(ShippingContinueBtn);

    }

    /**
     * Select payment method
     */
    public void paymentInformation()
    {
        WaitForLoad();
        WaitForElementClickable(PaymentContinueBtn);
        Click(MoneyPayment);
        Click(PaymentContinueBtn);
    }

    /**
     * Finish order
     */
    public void orderReview()
    {
        WaitForLoad();
        WaitForElementClickable(OrderContinueBtn);
        Click(OrderContinueBtn);

    }

    public void navigateToCreateAccount()
    {
        WaitForLoad();
        WaitForElementClickable(AccountBtn);
        Click(AccountBtn);
        WaitForElementClickable(RegisterBtn);
        Click(RegisterBtn);

    }

    public void fillCreateAccountInfo()
    {
        WaitForLoad();
        WaitForElementClickable(FinalRegisterBtn);
        SendKeys(RegFirstName,Name);
        SendKeys(RegLastName,LastName);
        SendKeys(RegEmail,Email);
        SendKeys(RegPassword,Password);
        SendKeys(ConfirmRegPassword,Password);
        Click(FinalRegisterBtn);


    }





}
