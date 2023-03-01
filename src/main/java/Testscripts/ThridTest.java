package Testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class ThridTest extends BaseClass{
	
	@Test
	public void thridTest() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		
		home.searchfor("core java for selenium");
		soft.assertEquals(coreJava.getPageHeader(),"CORE JAVA FOR SELENIUM");
		
		coreJava.clickCoreJavaForSeleniumLink();
		soft.assertEquals(javaVideo.getPageHeader(), "Core Java For Selenium Training");
		
		javaVideo.clickCloseCookies();
		web.switchToFrame();
		javaVideo.clickPlayButton();
		Thread.sleep(2000);
		javaVideo.clickPauseButton();
		
		web.switchBackFromFrame();
		
		javaVideo.clickAddToWishList();
		
		soft.assertAll();
	}
	
	
	

}
