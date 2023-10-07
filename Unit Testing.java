import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarComponentTests {

    @Test
    public void testEngineGetType() {
        Engine engine = new Engine("Capulet Engine");
        assertEquals("Capulet Engine", engine.getType());
    }

    @Test
    public void testBatteryGetType() {
        Battery battery = new Battery("Spindler Battery");
        assertEquals("Spindler Battery", battery.getType());
    }

    // Add more test cases as needed
}
