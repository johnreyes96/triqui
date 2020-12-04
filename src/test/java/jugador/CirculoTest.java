package jugador;

import jugador.Circulo;
import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

    @Test
    public void test() {
        Circulo circulo = new Circulo();
        boolean respuesta = circulo.test();
        Assert.assertTrue(respuesta);
    }
}
