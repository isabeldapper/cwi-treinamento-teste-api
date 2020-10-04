package br.com.restassuredapitesting.runners;

import br.com.restassuredapitesting.tests.booking.tests.get.GetBookingByIdTest;
import br.com.restassuredapitesting.tests.booking.tests.get.GetBookingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.restassuredapitesting.suites.Contract.class)
@Suite.SuiteClasses({
        GetBookingTest.class, //Lista de reservas
        GetBookingByIdTest.class, //reserva específica por ID

})

public class Contract {
}
