package eon_test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Actionwords {

    private WebDriver driver;
    protected WebDriverWait wait;
    private String user = "";
    private String pwd = "";
    // private Select select;


    public void Wait() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
    }

    public Actionwords() {
//        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//        driver = new FirefoxDriver();
        System.setProperty("phantomjs.binary.path", "drivers/phantomjs.exe");
        driver = new PhantomJSDriver();
    }

    public void goToEonUrlUrl(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void enterUsernameUsername(String username) {
        user = username;
        driver.findElement(By.cssSelector("input[name=username]")).sendKeys(username);
        System.out.println(username);
    }

    public void enterPasswordPassword(String password) {
        pwd = password;
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys(password);

    }

    public void pressLoginButton() {
        driver.findElement(By.cssSelector("input[name=login]")).click();

    }

    public void shouldBeLoggedIn() {
        Assert.assertTrue(!driver.getCurrentUrl().contains("auth"));
        driver.close();

    }


    public void login() {
        this.driver.get("http://10.10.1.25:91");
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        this.wait = new WebDriverWait(this.driver, 45);
        this.driver.findElement(By.cssSelector("input[name=username]")).sendKeys(new CharSequence[]{"aram_teszt"});
        this.driver.findElement(By.cssSelector("input[name=password]")).sendKeys(new CharSequence[]{"aram", Keys.ENTER});

        System.out.println("////////////////////////////////////////////////////////");
        System.out.println(driver.getCurrentUrl());
        System.out.println("////////////////////////////////////////////////////////");
    }

    public void createNewGroup() {
        System.out.println(driver.getCurrentUrl());
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div m-splash-screen")));
//        this.Wait();
//        driver.findElement(By.cssSelector("a[href*=sugo]")).click();
//        driver.findElement(By.cssSelector("div m-subheader a.btn")).click();
//        driver.findElement(By.cssSelector("div.m-portlet button[type=submit]")).click();
//        driver.findElement(By.cssSelector("mat-dialog-container input")).sendKeys("Phantom");
//        driver.findElement(By.cssSelector("div mat-dialog-container button")).click();

    }

    public void saveTheCreatedGroup() {

//        driver.findElement(By.cssSelector(".mat-dialog-container .btn-primary")).click();
    }

    public void defineTheGroupContent() {

//        List<WebElement> csoportList = driver.findElements(By.cssSelector(".csoport"));
//        csoportList.get(csoportList.size() - 1).click();
//        driver.findElement(By.cssSelector(".m-portlet__body div.ng-star-inserted button[type=submit]")).click();
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("mat-dialog-container"))));
//        driver.findElement(By.cssSelector("mat-dialog-container input")).sendKeys("hipTest");
//        driver.findElement(By.cssSelector("mat-dialog-container textarea")).sendKeys("Phantom js csopoort");
    }

    public void theGroupShouldBeCreated() {
//        List<WebElement> csoportList = driver.findElements(By.cssSelector(".csoport"));
//        csoportList.get(csoportList.size() - 1);
//        Assert.assertEquals(csoportList.get(csoportList.size() - 1).getText(), "Hip csoport\n" +
//                "edit\n" +
//                "delete");
//        driver.close();


    }

    public void tipustervekMenupont() {
//        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
//        this.Wait();
//        this.driver.findElement(By.cssSelector(".m-menu__item a[href*=javascript]")).click();
//        this.driver.findElement(By.cssSelector("li.m-menu__item.ng-star-inserted.m-menu__item--submenu.m-menu__item--open li:nth-of-type(1)")).click();
//        this.Wait();
    }

    public void ujTipustervNevEsSzamMegadasa() {
//        this.driver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
//        this.driver.findElement(By.cssSelector("input[name=nev]")).sendKeys(new CharSequence[]{"Sikeres teszt"});
//        this.driver.findElement(By.cssSelector("input[name=tervszam]")).sendKeys(new CharSequence[]{"Sikeres terv12k"});

    }

    public void fajlFeltoltese() {
        // this.driver.findElement(By.cssSelector("input[type=file]")).sendKeys(new CharSequence[]{"C:\\Users\\MMSOne\\Desktop\\Teszt_fajlok\\123.jpg"});

    }

    public void tipustervMentese() {
        //this.driver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();
    }

    public void tipustervLetrejott() {
//        Wait();
//        if(driver.getCurrentUrl().contains("uj")){
//            Assert.assertTrue(driver.findElement(By.cssSelector("mat-dialog-container")).isDisplayed());
//        }
//        driver.close();
    }

    public void clickGepekMenupont() {
//        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
//        this.Wait();
//        this.driver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) > a:nth-child(1) > span:nth-child(2)")).click();
//        this.driver.findElement(By.cssSelector("li.m-menu__item.ng-star-inserted.m-menu__item--submenu.m-menu__item--open li:nth-of-type(3)")).click();
//        this.Wait();

    }

    public void clickUjGep() {
//        this.driver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
    }

    public void megnevezesoradijKitoltese() {
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=nev]")).sendKeys("Markoló");
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=oradij]")).sendKeys("10000");
    }

    public void mentes() {
//        this.driver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();
    }

    public void clickMegbizoCegekMenupont() {
//        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
//        this.Wait();
//        this.driver.findElement(By.cssSelector(".m-menu__item a[href*=megbizocegek]")).click();
//        this.Wait();
    }

    public void clickUjCegHozzaadasaGomb() {
//        this.driver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
    }

    public void adatokKitoltese() {
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=megbizoRovidNev]")).sendKeys("TST");
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=megbizoTeljesNev]")).sendKeys("Test megbízó cég");
//        this.driver.findElement(By.cssSelector("div.m-portlet mat-select[name=telepules]")).click();
//        Wait();
//        List<WebElement> telepulesek = driver.findElements(By.cssSelector("mat-option"));
//        String telepulesParameter = "Győr";
//        for (WebElement element : telepulesek) {
//            if (element.getText().contains(telepulesParameter)) {
//                element.click();
//                break;
//            }
//        }
//        this.driver.findElement(By.cssSelector("div.m-portlet mat-select[name=vallalat]")).click();
//        Wait();
//        List<WebElement> vallalatok = driver.findElements(By.cssSelector("mat-option"));
//        String vallalatParameter = "E.ON Dél-dunántúli Áramhálózati Zrt.";
//        for (WebElement element : vallalatok) {
//            if (element.getText().contains(vallalatParameter)) {
//                element.click();
//                break;
//            }
//        }
    }

    public void ujGepLetrehozasa(String s, String s1) {
//        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
//        this.Wait();
//        this.driver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) a:nth-child(1) span:nth-child(2)")).click();
//        this.driver.findElement(By.cssSelector("li.m-menu__item.ng-star-inserted.m-menu__item--submenu.m-menu__item--open li:nth-of-type(3)")).click();
//        this.Wait();
//        this.driver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=nev]")).sendKeys(s);
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=oradij]")).sendKeys(s1);
//        this.driver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();

    }

    public void ujHumanEroforrasLetrehozasa(String s, String s1) {
//        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
//        this.Wait();
//        this.driver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) div:nth-child(2) ul:nth-child(2) li:nth-child(4) a:nth-child(1) span:nth-child(2)")).click();
//        this.Wait();
//        this.driver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=megnevezes]")).sendKeys(s);
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=oradij]")).sendKeys(s1);
//        this.driver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();
    }

    public void ujFejezetLetrehozasa(String s, String s1, String tf, String s2, String s3) {
//        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
//        this.Wait();
//        this.driver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) div:nth-child(2) ul:nth-child(2) li:nth-child(5) a:nth-child(1) span:nth-child(2)")).click();
//        this.Wait();
//        this.driver.findElement(By.cssSelector("div.m-subheader a.btn")).click();
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=sorszam]")).sendKeys(s);
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=megnevezes]")).sendKeys(s1);
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=rovidnev]")).sendKeys(tf);
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=humanSzorzo]")).sendKeys(s2);
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=gepSzorzo]")).sendKeys(s3);
//        this.driver.findElement(By.cssSelector("div.m-portlet button.btn-primary")).click();

    }

    public void ujDijtetelLetrohazasaAMostLetrehozottAdatokkal(String s, String s1, String s2, String feles_sor, String díjtétel_leírása, String díjtétel_megjegyzése, String db, String s3, String s4) {
//        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("m-splash screen")));
//        this.Wait();
//        this.driver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) a:nth-child(1) span:nth-child(2)")).click();
//        this.Wait();
//        this.driver.findElement(By.cssSelector("li.m-menu__item:nth-child(6) div:nth-child(2) ul:nth-child(2) li:nth-child(2) a:nth-child(1) span:nth-child(2)")).click();
//        this.Wait();
//        this.driver.findElement(By.cssSelector("a.m-btn--pill:nth-child(1)")).click();
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=tetelszam]")).sendKeys(s);
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=fejezet]")).sendKeys("tf");
//        Wait();
//        List<WebElement> fejezetek = driver.findElements(By.className("mat-option"));
//        String fejezet = s1;
//        for (WebElement element : fejezetek) {
//            if (element.getText().contains(fejezet)) {
//                element.click();
//                break;
//            }
//        }
//
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=megnevezes]")).sendKeys(s2);
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=haromFelesSor]")).sendKeys(feles_sor);
//        this.driver.findElement(By.cssSelector("div.m-portlet textarea[name=leiras]")).sendKeys(díjtétel_leírása);
//        this.driver.findElement(By.cssSelector("div.m-portlet textarea[name=megjegyzes]")).sendKeys(díjtétel_megjegyzése);
//        this.driver.findElement(By.cssSelector("div.m-portlet mat-select[name=mertekegysegId]")).click();
//        Wait();
//        List<WebElement> megysegek = driver.findElements(By.cssSelector("mat-option"));
//        String megyseg = db;
//        for (WebElement element : megysegek) {
//            if (element.getText().contains(megyseg)) {
//                element.click();
//                break;
//            }
//        }
//        this.driver.findElement(By.cssSelector(".m-form div:nth-child(9) div:nth-child(2) a:nth-child(1)")).click();
//        Wait();
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=gepId]")).sendKeys("Teszt");
//        Wait();
//        List<WebElement> gepek = driver.findElements(By.cssSelector("mat-option"));
//        String gep = s3;
//        for (WebElement element : gepek) {
//            if (element.getText().contains(gep)) {
//                element.click();
//                break;
//            }
//        }
//        this.driver.findElement(By.cssSelector("m-gep-ora.ng-star-inserted input[name=oraSzam]")).sendKeys("2");
//        this.driver.findElement(By.cssSelector("m-gep-ora.ng-star-inserted input[name=monoblockOraszam]")).sendKeys("4");
//
//        this.driver.findElement(By.cssSelector(".m-form div:nth-child(12) div:nth-child(2) a:nth-child(1)")).click();
//        Wait();
//        this.driver.findElement(By.cssSelector("div.m-portlet input[name=humanId]")).sendKeys("Teszt");
//        Wait();
//        List<WebElement> humanok = driver.findElements(By.cssSelector("mat-option"));
//        String human = s4;
//        for (WebElement element : humanok) {
//            if (element.getText().contains(human)) {
//                element.click();
//                break;
//            }
//        }
//        this.driver.findElement(By.cssSelector("m-human-ora.ng-star-inserted input[name=oraSzam]")).sendKeys("2");
//        this.driver.findElement(By.cssSelector("m-human-ora.ng-star-inserted input[name=monoblockOraszam]")).sendKeys("4");
    }

    public void dijtetelMentese() {
//        this.driver.findElement(By.cssSelector("button.btn:nth-child(2)")).click();
    }
}