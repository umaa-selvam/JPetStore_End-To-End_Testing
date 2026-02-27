package com.automation.TeamProjects;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExecution extends BaseClass {
	
	@DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"Divyaselvam", "divi@123"}
        };
	}
	@Test(dataProvider = "loginData")
	public void Execution(String user , String pass) throws InterruptedException {

		Homepage home = new Homepage(driver);
        home.clickSignIn();
        
        RegisterPage rpage = new RegisterPage(driver);
        rpage.clickRegister();
        
        RegisterDetails rdpage = new RegisterDetails(driver);
        rdpage.registerUser();
        
        rdpage.profileInfoTest();
        rdpage.clickSubmit();
        
        home.clickSignIn();
        LoginPage log = new LoginPage(driver);
        log.login(user, pass);
        
        CategoryPage categorypage  = new CategoryPage(driver);
        CardPage cPage = new CardPage(driver);
        
        categorypage.verifyFishcategory();
        
        cPage.cardInfo();
        cPage.cardInfoDetails();
        cPage.enableShipping();
        cPage.clickContinue();
        cPage.ShipInfo();
        cPage.ShipAddressClick();
        cPage.confirmButton();
        
        categorypage.verifyDogcategory();
        
        cPage.cardInfo();
        cPage.cardInfoDetails();
        //cPage.enableShipping();
        cPage.clickContinue();
        cPage.confirmButton();  

        categorypage.verifyReptilescategory();
        cPage.cardInfo();
        cPage.cardInfoDetails();
        //cPage.enableShipping();
        cPage.clickContinue();
        cPage.confirmButton(); 

        categorypage.verifyCatcategory();
        cPage.cardInfo();
        cPage.cardInfoDetails();
        cPage.enableShipping();
        cPage.clickContinue();
        cPage.ShipInfo();
        cPage.ShipAddressClick();
        cPage.confirmButton();        
        
        categorypage.verifyBirdscategory();
        cPage.cardInfo();
        cPage.cardInfoDetails();
        cPage.enableShipping();
        cPage.clickContinue();
        cPage.ShipInfo();
        cPage.ShipAddressClick();
        cPage.confirmButton(); 
        
	}
}