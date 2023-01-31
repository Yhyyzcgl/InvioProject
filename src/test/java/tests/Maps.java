package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseClass;
import utils.Reusable;

import java.net.MalformedURLException;
import java.time.Duration;


public class Maps extends BaseClass{


    private static Logger logger = (Logger) LogManager.getLogger(Maps.class.getName());

        @Test
        public void Maps() throws MalformedURLException {


        AndroidDriver driver = getAndroidDriver();
            logger.info("---Kullanici maps uygulamasini baslatir---");


        Reusable.waitFor(8);

            TouchAction touchAction=new TouchAction<>(driver);

            int startX1 = 720;
            int startY1 = 1953;

            int startX2 = 250;
            int startY2 = 505;

            touchAction.press(PointOption.point(startX1, startY1))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                    .moveTo(PointOption.point(startX2, startY2))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                    .release()
                    .perform();
            logger.info("----Kullanici alan kontrolu yapar----");




        Reusable.waitFor(10);

        driver.findElementByXPath("//android.widget.Button[@content-desc=\"Restoranlar için arama yapın\"]").click();
        Reusable.waitFor(5);
        logger.info("----Kullanici restaurant sekmesine tiklar----");


        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Temizle\"]").click();
        Reusable.waitFor(5);

        driver.findElementByXPath("//android.widget.Button[@text=\"Benzin\"]").click();
        Reusable.waitFor(5);
            logger.info("----Kullanici benzin sekmesine tiklar----");

        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Temizle\"]").click();
        Reusable.waitFor(5);

        driver.findElementByXPath("//android.widget.Button[@text=\"Marketler\"]").click();
        Reusable.waitFor(5);
            logger.info("----Kullanici market sekmesine tiklar----");

        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Temizle\"]").click();
        Reusable.waitFor(3);



        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.google.android.apps.maps:id/navigation_bar_item_icon_container\")").click();
        Reusable.waitFor(5);


        driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Kayıtlılar\"]").click();
        Reusable.waitFor(5);
            logger.info("----Kullanici kayitlar sekmesine tiklar----");

        driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Yenilikler\"]").click();
        Reusable.waitFor(5);
            logger.info("----Kullanici yenilikler sekmesine tiklar----");


        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.google.android.apps.maps:id/navigation_bar_item_icon_view\")").click();
        Reusable.waitFor(5);


        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Yol tarifi\"]").click();
        Reusable.waitFor(5);
            logger.info("----Kullanici yol tarifini baslatir----");


        driver.findElementByXPath("//android.widget.TextView[@text=\"Varış noktası seçin\"]").click();
        Reusable.waitFor(5);
            logger.info("----Kullanici varis noktasina tiklar----");

       driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text").sendKeys("Erzurum");
       driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").index(0)").click();
        Reusable.waitFor(3);
            logger.info("----Kullanici sehir secer----");


        MobileElement metro= (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Toplu taşıma modu\"]");
        metro.click();
        Assert.assertTrue(metro.isDisplayed());
        System.out.println(metro.getAttribute("content-desc"));
        Assert.assertEquals(metro.getAttribute("content-desc"),"Toplu taşıma modu");
        Reusable.waitFor(3);
            logger.info("Kullanici toplu tasima secenegine tiklar");




       MobileElement baslat= (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Navigasyonu başlat\"]");
       baslat.click();
        Reusable.waitFor(5);
            logger.info("----Kullanici navigasyonu baslatir----");

        MobileElement kuzeybatiYonu= (MobileElement) driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.google.android.apps.maps:id/top_cue_text\")");
        kuzeybatiYonu.isDisplayed();
        Reusable.waitFor(5);



        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Navigasyonu kapat\"]").click();
        Reusable.waitFor(5);
            logger.info("----Kullanici navigasyonu kapatir----");


    }

}
