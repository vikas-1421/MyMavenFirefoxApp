package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

    public static void main(String[] args) throws Exception {

        // Open Firefox Browser
        WebDriver driver = new FirefoxDriver();



        // =========================
        // TAB 1
        // =========================

        driver.get("https://www.google.com");

        Thread.sleep(5000);



        // =========================
        // TAB 2
        // =========================

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.youtube.com");

        Thread.sleep(5000);



        // =========================
        // TAB 3
        // =========================

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://github.com");

        Thread.sleep(5000);



        // Close Browser
        driver.quit();
    }
}
