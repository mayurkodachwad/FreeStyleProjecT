package pageObjectModel;

import java.io.IOException;

public class TestLogoutActittime extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
        Loginpage1 lp = new Loginpage1(driver);
        Flib flib = new Flib();
        String validUsername = flib.readPropertyData(PROP_PATH, "username");
        String validPassword = flib.readPropertyData(PROP_PATH, "password");
     
        lp.validLoginToActiTime(flib.readPropertyData(PROP_PATH, "username"), validPassword);
        
        HomePage hp = new HomePage(driver);
        hp.logOutmethod();
        
	}

}
