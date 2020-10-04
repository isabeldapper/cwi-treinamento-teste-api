package br.com.restassuredapitesting.runners;

import br.com.restassuredapitesting.tests.base.tests.PingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.restassuredapitesting.suites.HealthCheck.class)
@Suite.SuiteClasses({
        PingTest.class,

})

public class HealthCheck {
}
