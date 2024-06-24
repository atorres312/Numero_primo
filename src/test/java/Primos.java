import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Primos {
    
    @Test
    public void testNumeroPrimo() {
        PrimoChecker checker = new PrimoChecker();
        assertTrue(checker.esPrimo(2)); // debería devolver true
        assertTrue(checker.esPrimo(3)); // debería devolver true
        assertFalse(checker.esPrimo(4)); // debería devolver false
        assertTrue(checker.esPrimo(5)); // debería devolver true
        assertFalse(checker.esPrimo(6)); // debería devolver false
        assertFalse(checker.esPrimo(1)); // debería devolver false
    }
}