package test;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseClass;
import utils.Reusable;

import java.net.MalformedURLException;



public class Maps extends BaseClass{


    private static final Logger logger = LogManager.getLogger(Maps.class.getName());

        @Test
        public void test() throws MalformedURLException {


        AndroidDriver driver = getAndroidDriver();
            logger.info("---Kullanıcı maps uygulamasını baslatir---");

        /*

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

         */


        Reusable.waitFor(8);
        //restoran
        driver.findElementByXPath("//android.widget.Button[@content-desc=\"Restoranlar için arama yapın\"]").click();
        Reusable.waitFor(5);
        logger.info("Kullanici restorand sekmesine tiklar");


        /*
        //temizle geri çık
        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Temizle\"]").click();
        Reusable.waitFor(5);
        //benzin
        driver.findElementByXPath("//android.widget.Button[@text=\"Benzin\"]").click();
        Reusable.waitFor(5);
            logger.info("Kullanici benzin sekmesine tiklar");
        //temizle geri çık
        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Temizle\"]").click();
        Reusable.waitFor(5);
        //marketler
        driver.findElementByXPath("//android.widget.Button[@text=\"Marketler\"]").click();
        Reusable.waitFor(5);
            logger.info("Kullanici market sekmesine tiklar");
        //temizle geri çık
        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Temizle\"]").click();
        Reusable.waitFor(3);

        //git
        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.google.android.apps.maps:id/navigation_bar_item_icon_container\")").click();
        Reusable.waitFor(3);

        //kayıtlar
        driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Kayıtlılar\"]").click();
        Reusable.waitFor(3);

        //yenilkler
        driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Yenilikler\"]").click();
        Reusable.waitFor(3);


        //kesfet
        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.google.android.apps.maps:id/navigation_bar_item_icon_view\")").click();
        Reusable.waitFor(3);





/*

        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Yol tarifi\"]").click();
        Reusable.waitFor(5);
            logger.info("Kullanici navigasyonu baslatir");

      //varıs noktası
        driver.findElementByXPath("//android.widget.TextView[@text=\"Varış noktası seçin\"]").click();
        Reusable.waitFor(3);

       //sehir sec
       driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text").sendKeys("Erzurum");
       driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").index(0)").click();
        Reusable.waitFor(3);


        //toplu taşıma
        MobileElement metro= (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Toplu taşıma modu\"]");
        metro.click();
        Assert.assertTrue(metro.isDisplayed());
        System.out.println(metro.getAttribute("content-desc"));
        Assert.assertEquals(metro.getAttribute("content-desc"),"Toplu taşıma modu");
        Reusable.waitFor(3);

       //baslat
       MobileElement baslat= (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Navigasyonu başlat\"]");
       baslat.click();
        Reusable.waitFor(3);
       //Kuzeybatıyönü
        MobileElement kuzeybatiYonu= (MobileElement) driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.google.android.apps.maps:id/top_cue_text\")");
        kuzeybatiYonu.isDisplayed();
        Reusable.waitFor(3);
        //navigasyonu  kapat
        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Navigasyonu kapat\"]").click();
        Reusable.waitFor(3);





 */


















    }

}
