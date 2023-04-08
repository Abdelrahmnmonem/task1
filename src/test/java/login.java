import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class login {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://swinji.azurewebsites.net");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        WebElement Emailtextbox = driver.findElement(By.xpath("//input[@id='Email']"));
        Emailtextbox.sendKeys("testregister@aaa.com");
        WebElement passwordtextbox = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        passwordtextbox.sendKeys("Wakram_123");
        WebElement loginbutton = driver.findElement(By.id("btnLogin"));
        loginbutton.click();

        WebElement courses = driver.findElement(By.xpath("//a[@id='btnMyCoursesList']"));
        courses.click();
        WebElement addcoursesbutton = driver.findElement(By.id("btnListAddCourse"));
        addcoursesbutton.click();

        WebElement coursename = driver.findElement(By.name("courseName"));
        coursename.sendKeys(new CharSequence[]{"abdelrahman course"});
        WebElement courseSubject = driver.findElement(By.xpath("//select[@id='courseSubject']"));
        Select courseSubjectvalue = new Select(courseSubject);
        courseSubjectvalue.selectByIndex(3);
        WebElement courseGrade = driver.findElement(By.id("courseGrade"));
        Select coursGradvalue = new Select(courseGrade);
        coursGradvalue.selectByIndex(4);
        WebElement coursStingclick = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[4]/div[2]/div[5]/div[2]/div[1]/label[1]"));
        coursStingclick.click();

        driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[5]/div[1]/h4[1]")).click();
        WebElement coursetype = driver.findElement(By.xpath("//div[@id='divCourseTypedropdown']"));
        coursetype.click();

        driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        WebElement Enabllearningchekbox = driver.findElement(By.id("lblLearningPath"));
        Enabllearningchekbox.click();

        WebElement Enabllokingchekbox = driver.findElement(By.id("lblSessionsSequentiallyLocked"));
        Enabllokingchekbox.click();

        WebElement studentlearnobjective = driver.findElement(By.id("lblQuizAchievementCoverageType"));
        studentlearnobjective.click();

        WebElement EnableCourseTrial = driver.findElement(By.id("lblResetCourse"));
        EnableCourseTrial.click();

        driver.findElement(By.id("resetCourseCount")).clear();
        driver.findElement(By.id("resetCourseCount")).sendKeys(new CharSequence[]{"5"});

        WebElement VideobasedClick = driver.findElement(By.xpath("//h4[contains(text(),'Video-Based Course Settings')]"));
        VideobasedClick.click();

        WebElement EnableplayVideoOption = driver.findElement(By.id("lblPlayCourse"));
        EnableplayVideoOption.click();

        WebElement Create = driver.findElement(By.id("btnSaveAsDraftCourse"));
        Create.click();

        driver.findElement(By.xpath("//body/div[1]/aside[1]/div[1]/div[2]/em[1]")).click();

        driver.findElement(By.id("btnMyCoursesList")).click();

        WebElement search = driver.findElement(By.id("txtCourseSearch"));
        search.sendKeys(new CharSequence[]{"abdelrahman"});
        WebElement btncoursesearch = driver.findElement(By.id("btnCourseSearch"));
        btncoursesearch.click();
    }
    }

