package steps;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

    public Hooks() {
    }

    @Before
    public void runsBeforeAnyScenario() {

    }

    @After
    public void runsAfterAnyScenario() {
        driver.quit();
    }
}
