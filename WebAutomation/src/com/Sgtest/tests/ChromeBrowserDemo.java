package com.Sgtest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver  oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigation();
		closeApplication();
	}
	private static void LaunchBrowser() {
		try
		{
			oBrowser=new ChromeDriver();
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void navigation()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(10000);
		}catch (Exception e) {
		    e.printStackTrace();
		}

	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}