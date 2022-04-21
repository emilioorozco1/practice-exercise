package TestCases;

import POM.MagentoStorePage;
import org.junit.*;
import org.junit.rules.TestName;

import com.aventstack.extentreports.Status;
import POM.AtLoginPage;
import selenium.ClsBrowser;
import selenium.ClsReport;

public class TestCase_Exec extends ClsBrowser
{
    @Rule //Missing import
    public TestName TC_Name = new TestName();
    public String URL;

    @BeforeClass
    public static void beforeClass()
    {
        ClsReport.fnSetupReport();
    }

    @Before
    public void setup()
    {
        ClsBrowser.BrowserName = "Chrome";
        OpenBrowser();
    }


    @Test //added
    public void FirstTC()
    {
        try
        {
            ClsReport.objTest = ClsReport.objExtent.createTest("First Test Case");
            URL = "http://live.guru99.com/index.php/tv.html";
            NavigateToUrl(URL);
            WaitForLoad();
            ClsReport.fnLog(Status.PASS, "First Log Comment.", false);
            MagentoStorePage objMag = new MagentoStorePage();
            //Methods
            objMag.addToCartLG();
            ClsReport.fnLog(Status.PASS, "Second Log Comment.", true);
        }
        catch(Exception e)
        {
            ClsReport.fnLog(Status.FAIL, "The: " + TC_Name.getMethodName() + " was not executed successfully. \n Exception: " + e.getMessage() , false);
        }
    }


    @Test //added
    public void SecondTC()
    {
        try
        {
            ClsReport.objTest = ClsReport.objExtent.createTest("Second Test Case");
            URL = "http://live.guru99.com/index.php/tv.html";
            NavigateToUrl(URL);
            WaitForLoad();
            ClsReport.fnLog(Status.PASS, "First Log Comment.", false);
            MagentoStorePage objMag = new MagentoStorePage();
            objMag.addToCartSamsung();
            objMag.proceedCheckout();
            objMag.billingInformation();
            objMag.shippingMethod();
            objMag.paymentInformation();
            objMag.orderReview();
            ClsReport.fnLog(Status.PASS, "Second Log Comment.", true);
        }
        catch (Exception e)
        {
            ClsReport.fnLog(Status.FAIL, "The: " + TC_Name.getMethodName() + " was not executed successfully. \n Exception: " + e.getMessage() , false);
        }
    }


   @Test
    public void ThirdTC()
    {
        try
        {
            ClsReport.objTest = ClsReport.objExtent.createTest("Third Test Case"); //Changed from second to Third
            URL = "http://live.guru99.com/index.php/tv.html"; //Changed url
            NavigateToUrl(URL);
            WaitForLoad();
            ClsReport.fnLog(Status.PASS, "First Log Comment.", false);
            MagentoStorePage objMag = new MagentoStorePage();
            objMag.navigateToCreateAccount();
            objMag.fillCreateAccountInfo();
            ClsReport.fnLog(Status.PASS, "Second Log Comment.", true);
        }
        catch (Exception e)
        {
            ClsReport.fnLog(Status.FAIL, "The: " + TC_Name.getMethodName() + " was not executed successfully. \n Exception: " + e.getMessage() , false);
        }
    }



    @After
    public void tearDown()
    {
        CloseBrowser();
        ClsReport.fnCloseReport();
    }

    //@After
    //public void tearDown()
    //{
       // CloseBrowser();
     //   ClsReport.fnCloseReport();        Repeated code
   // }

}