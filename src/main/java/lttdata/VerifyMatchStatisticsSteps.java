package lttdata;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class VerifyMatchStatisticsSteps {

    WebDriver driver;

    @Given("I am on the ESPN Cricinfo website")
    public void i_am_on_the_espn_cricinfo_website() {
        System.setProperty("webdriver.chrome.driver", "<<Path of chrome driver>>");
        driver = new ChromeDriver();
        driver.get("https://www.espncricinfo.com/");
    }

    @When("I select a completed cricket match")
    public void i_select_a_completed_cricket_match() {
        driver.findElement(By.cssSelector("a.completed-match-link")).click();
    }

    @When("I navigate to the match statistics")
    public void i_navigate_to_the_match_statistics() {
        driver.findElement(By.cssSelector("a.statistics-tab")).click();
    }

    @Then("I should see detailed statistics including runs, wickets, and overs")
    public void i_should_see_detailed_statistics_including_runs_wickets_and_overs() {
        String runs = driver.findElement(By.cssSelector("span.runs")).getText();
        String wickets = driver.findElement(By.cssSelector("span.wickets")).getText();
        String overs = driver.findElement(By.cssSelector("span.overs")).getText();

        Assert.assertNotNull(runs);
        Assert.assertNotNull(wickets);
        Assert.assertNotNull(overs);

        driver.quit();
    }
}
