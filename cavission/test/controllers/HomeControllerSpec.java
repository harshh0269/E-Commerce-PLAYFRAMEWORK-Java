import org.junit.Test;
import play.mvc.Result;
import play.test.WithApplication;
import play.inject.guice.GuiceApplicationBuilder;
import play.test.Helpers;
import play.Application;
import play.mvc.Http;
import play.data.Form;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
            .method("GET")
            .uri("/");
        Result result = Helpers.route(app, request);
        assertEquals(200, result.status());
        assertTrue(Helpers.contentAsString(result).contains("This is the index page."));
    }

    @Test
    public void testAbout() {
        Http.RequestBuilder request = new Http.RequestBuilder()
            .method("GET")
            .uri("/about");
        Result result = Helpers.route(app, request);
        assertEquals(200, result.status());
        assertTrue(Helpers.contentAsString(result).contains("This is the about page."));
    }
}
