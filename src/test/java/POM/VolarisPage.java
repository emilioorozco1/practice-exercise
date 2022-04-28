package POM;

import selenium.ClsBrowser;


public class VolarisPage extends ClsBrowser {
    String Origin = "Guadalajara";
    String Destiny = "Cancun";
    String Header = "//header/div[1]/div[1]/div[1]/a[1]/img[2]";
    String SelectOrigin = "//mat-tab-body/div[1]/div[1]/div[1]/div[1]/mbs-search-widget[1]/div[1]/div[2]/div[1]/a[1]/h3[1]";
    String SelectDestiny = "//mat-tab-body/div[1]/div[1]/div[1]/div[1]/mbs-search-widget[1]/div[1]/div[2]/div[2]/a[1]/h3[1]";
    String OriginInput = "//input[@id='fnameOrigin']";
    String DestinyInput = "//input[@id='fnameDestination']";
    String GdlOrigin = "//div[contains(text(),'Guadalajara')]";
    String CancunDestiny = "//div[contains(text(),'Cancún')]";

    String MonthsNav = "//div[@class='dropdowns ng-star-inserted' and text()=' abril ' ]";
    String SelectMonth = "//option[@value='9']";
    String FlightExitDate = "//td[@class='weekend datecell-20221029 customfare available']";
    String FlightReturnDate = "//td[@class='datecell-20221104 returnVisible returnCustomfare available']";
    String DateBtn = "//*[@id=\"mat-dialog-2\"]/shared-calendar-dialog/div/div[5]/div/div/button";

    String SearchFlightBtn = "//body[1]/mbs-root[1]/div[1]/section[1]/mbs-home[1]/section[1]/mbs-sub-header[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[1]/mbs-search-widget[1]/div[1]/div[6]/div[1]/button[1]";
    String PriceFilter = "//body[1]/mbs-root[1]/div[1]/section[1]/mbs-flight[1]/div[1]/div[1]/section[1]/div[6]/mbs-flight-lists[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/select[1]";
    String LowerPriceFilter = "//body[1]/mbs-root[1]/div[1]/section[1]/mbs-flight[1]/div[1]/div[1]/section[1]/div[6]/mbs-flight-lists[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/select[1]/option[2]";
    String SelectFirstFlight = "//body[1]/mbs-root[1]/div[1]/section[1]/mbs-flight[1]/div[1]/div[1]/section[1]/div[6]/mbs-flight-lists[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]";
    String SelectFirstFlightCategory = "//body[1]/mbs-root[1]/div[1]/section[1]/mbs-flight[1]/div[1]/div[1]/section[1]/div[6]/mbs-flight-lists[1]/div[2]/div[1]/mbs-flight-fares[1]/div[1]/div[1]/div[1]/mat-card[1]";

    String SelectSecondFlight ="//body[1]/mbs-root[1]/div[1]/section[1]/mbs-flight[1]/div[1]/div[1]/section[1]/div[6]/mbs-flight-lists[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]";
    String SelectSecondFlightCategory = "//body[1]/mbs-root[1]/div[1]/section[1]/mbs-flight[1]/div[1]/div[1]/section[1]/div[6]/mbs-flight-lists[1]/div[2]/div[1]/mbs-flight-fares[1]/div[1]/div[1]/div[1]/mat-card[1]";



    /**
     * Choose origin
     */
    public void chooseOrigin() throws InterruptedException {
        WaitForLoad();
        WaitForElementClickable(Header);
        WaitForElementClickable(SelectOrigin);
        Click(SelectOrigin);
        WaitForElementClickable(OriginInput);
        SendKeys(OriginInput, Origin);
        WaitForElementClickable(GdlOrigin);
        Click(GdlOrigin);

    }


    /**
     * Choose destiny
     */
    public void chooseDestiny()
    {
        WaitForElementClickable(DestinyInput);
        SendKeys(DestinyInput,Destiny);
        WaitForElementClickable(CancunDestiny);
        Click(CancunDestiny);
    }


    /**
     * Choose month
     */
    public void chooseMonth()
    {
        WaitForElementClickable(MonthsNav);
        Click(SelectMonth);
        Click(SelectMonth);

    }


    /**
     * Select exit date
     */
    public void selectExitDate()
    {
        WaitForElementClickable(FlightExitDate);
        Click(FlightExitDate);
    }


    /**
     * Select return date
     */
    public void selectReturnDate()
    {
        WaitForElementClickable(FlightReturnDate);
        Click(FlightReturnDate);
    }

    public void selectDateBtn()
    {
        WaitForElementClickable(DateBtn);
        Click(DateBtn);
    }


    /**
     * Click search flight btn
     */
    public void searchFlight() throws InterruptedException {
        Thread.sleep(3000);
       WaitForElementClickable(SearchFlightBtn);
        Click(SearchFlightBtn);
    }


    /**
     * Select lower price filter
     */
    public void selectLowerPriceFilter()
    {
        WaitForLoad();
        WaitForElementClickable(PriceFilter);
        //Click(PriceFilter);
        Click(LowerPriceFilter);
    }


    /**
     * Select first flight
     */
    public void selectFirstFlight()
    {
        WaitForLoad();
        WaitForElementClickable(SelectFirstFlight);
        Click(SelectFirstFlight);

    }


    /**
     * Select first flight category
     */
    public void selectFirstFlightcategory()
    {
        WaitForLoad();
        WaitForElementClickable(SelectFirstFlightCategory);
        Click(SelectFirstFlightCategory);
    }

    /**
     * Select second flight
     */
    public void selectSecondFlight() throws InterruptedException {
        WaitForLoad();
        Thread.sleep(5000);
        WaitForElementClickable(SelectSecondFlight);
        Click(SelectSecondFlight);

    }

    /**
     * Select second flight category
     */
    public void selectSecondFlightcategory() throws InterruptedException
    {
        WaitForLoad();
        WaitForElementClickable(SelectSecondFlightCategory);
        Click(SelectSecondFlightCategory);
        Thread.sleep(10000);
    }


}
