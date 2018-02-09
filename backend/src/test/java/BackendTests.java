import org.testng.annotations.Test;

/**
 * Created by ozakarias on 2/9/2018.
 */
public class BackendTests {

    @Test
    public void testSomeBackendStuff() {

        //4.b
        DummyClassTwo.methodFromCommonModuleTwo();


        // mvn test -Dtest=com.mavenprex4.**.* -DfailIfNoTests=false
        // mvn surefire:test



    }

}
