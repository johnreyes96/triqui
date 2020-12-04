import jugador.CirculoTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CirculoTest.class
})
public class TestSuite {

    public static class RunnerTestSuite {

        public static void main(String[] args) {
            Result resultado = JUnitCore.runClasses(TestSuite.class);
            for (Failure fallo : resultado.getFailures()) {
                System.out.println(fallo.toString());
            }
            System.out.println(resultado.wasSuccessful());
        }
    }

}
