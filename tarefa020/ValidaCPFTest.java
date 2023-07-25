package dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidaCPFTest {

    @Test
    public void testCPFValido() {
        assertTrue(ValidaCPF.isCPF("12345678909"));
    }

    @Test
    public void testCPFInvalido1() {
        assertFalse(ValidaCPF.isCPF("11111111111"));
    }

    @Test
    public void testCPFInvalido2() {
        assertFalse(ValidaCPF.isCPF("00000000000"));
    }

    @Test
    public void testCPFInvalido3() {
        assertFalse(ValidaCPF.isCPF("99999999999"));
    }

    @Test
    public void testCPFTamanhoInvalido() {
        assertFalse(ValidaCPF.isCPF("1234567890"));
    }

    @Test
    public void testCPFNaoNumerico() {
        assertFalse(ValidaCPF.isCPF("abcdeffghij"));
    }
}