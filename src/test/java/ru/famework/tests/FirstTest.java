package ru.famework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public void test(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
    }
}
