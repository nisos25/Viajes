import java.text.ParseException;
import java.text.SimpleDateFormat;

import co.unicauca.tallerpolimorfismo.modelo.*;
import org.junit.Assert;
import org.junit.Test;


public class ViajeTest {

    public ViajeTest() {
    }

    /**
     * Test de la clase ViajeFamiliar.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testViajeFamiliar() throws ParseException {
        System.out.println("Viaje familiar");
        ViajeFamiliar viaje = new ViajeFamiliar("Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
        Assert.assertEquals("Popayán", viaje.getOrigen());
        Assert.assertEquals("Bogotá", viaje.getDestino());
        Assert.assertEquals(1250000, viaje.getCosto());
        Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), viaje.getFechaSalida());
        Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), viaje.getFechaLlegada());
        Assert.assertEquals(5, viaje.getFamilia());
        Assert.assertEquals("Viaje para disfrutar con toda tu familia", viaje.descripcion());
        Assert.assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        Assert.assertEquals("Método implementado en la clase hija viaje familiar", viaje.cualquierMetodo2());
    }

    /**
     * Test de la clase ViajeIncentivo.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testViajeIncentivo() throws ParseException {
        System.out.println("Viaje incentivo");
        ViajeIncentivo viaje = new ViajeIncentivo("Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
        Assert.assertEquals("Popayán", viaje.getOrigen());
        Assert.assertEquals("Medellin", viaje.getDestino());
        Assert.assertEquals(2100000, viaje.getCosto());
        Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), viaje.getFechaSalida());
        Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), viaje.getFechaLlegada());
        Assert.assertEquals("Emtel", viaje.getEmpresa());
        Assert.assertEquals("Viaje incentivo que te envia la empresa Emtel", viaje.descripcion());
        Assert.assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        Assert.assertEquals("Método implementado en la clase hija viaje de incentivo", viaje.cualquierMetodo2());
    }

    /**
     * Test de la clase ViajeIndividual.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testViajeIndividual() throws ParseException {
        System.out.println("Viaje individual");
        Viaje viaje = new ViajeIndividual("Popayán", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        Assert.assertEquals("Popayán", viaje.getOrigen());
        Assert.assertEquals("San Andres", viaje.getDestino());
        Assert.assertEquals(4250000, viaje.getCosto());
        Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), viaje.getFechaSalida());
        Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"), viaje.getFechaLlegada());
        Assert.assertEquals("Disfruta tu viaje individual", viaje.descripcion());
        Assert.assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        Assert.assertEquals("Cualquier método2 implementado en la clase base", viaje.cualquierMetodo2());

    }

    /**
     * Test de la clase ViajeTodoIncluido.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testViajeTodoIncluido() throws ParseException {
        System.out.println("Viaje todo incluido");
        Viaje viaje = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        Assert.assertEquals("Popayán", viaje.getOrigen());
        Assert.assertEquals("Cartagena", viaje.getDestino());
        Assert.assertEquals(7350000, viaje.getCosto());
        Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), viaje.getFechaSalida());
        Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"), viaje.getFechaLlegada());
        Assert.assertEquals("Disfruta tu viaje todo incluido", viaje.descripcion());
        Assert.assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        Assert.assertEquals("Cualquier método2 implementado en la clase base", viaje.cualquierMetodo2());
    }

}