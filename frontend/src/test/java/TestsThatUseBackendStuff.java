import org.testng.annotations.Test;

/**
 * Created by ozakarias on 2/9/2018.
 */
public class TestsThatUseBackendStuff {

    @Test
    public void testThatUsesBackendStuff() {
        BackendStuff.webServiceIsCalled();
    }

}
