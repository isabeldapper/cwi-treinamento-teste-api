package br.com.restassuredapitesting.runners;

import br.com.restassuredapitesting.tests.auth.tests.PostAuthTest;
import br.com.restassuredapitesting.tests.booking.tests.delete.DltByIdAndBasicAuthTest;
import br.com.restassuredapitesting.tests.booking.tests.get.GetBookingByIdTest;
import br.com.restassuredapitesting.tests.booking.tests.get.GetBookingTest;
import br.com.restassuredapitesting.tests.booking.tests.put.PutBookingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.restassuredapitesting.suites.Acceptance.class)
@Suite.SuiteClasses({
        GetBookingTest.class,           //lista reservas
        GetBookingByIdTest.class,       //lista por id
        PutBookingTest.class,           //edita com token
        PostAuthTest.class,             //autoriza
        DltByIdAndBasicAuthTest.class,  //deleta reserva BasicAuth
})

public class Acceptance {
}
