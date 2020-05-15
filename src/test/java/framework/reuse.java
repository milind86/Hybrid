package framework;

import common.Action;
import config.LoadBrowser;
import or.LoginPage;

public class reuse extends LoadBrowser {
	
	Action loginchk;
	
	public void login() throws Exception{
		
		  loginchk = new Action();
		  loginchk.launch("https://www.flipkart.com/");
		  loginchk.click(LoginPage.txtusernm);
		  loginchk.insertTxt(LoginPage.txtusernm, "TESTQA");
		  loginchk.click(LoginPage.txtpassword);
		  loginchk.insertTxt(LoginPage.txtpassword, "TEST123");
		  loginchk.click(LoginPage.btnlogin);
		
	}





}
