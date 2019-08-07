import org.junit.Test;
import Exception.*;


public class ExceptionGeneratorImplTest {

    @Test(expected = NullPointerException.class)
    public void generateNullPointerException() {
        new ExceptionGeneratorImpl().generateNullPointerException();
    }

    @Test(expected = ClassCastException.class)
    public void generateClassCastException() {
        new ExceptionGeneratorImpl().generateClassCastException();
    }

    @Test(expected = NumberFormatException.class)
    public void generateNumberFormatException() {
        new ExceptionGeneratorImpl().generateNumberFormatException();
    }

    @Test(expected = StackOverflowError.class)
    public void generateStackOverflowError() {
        new ExceptionGeneratorImpl().generateStackOverflowError();
    }

    @Test(expected = OutOfMemoryError.class)
    public void generateOutOfMemoryError() {
        new ExceptionGeneratorImpl().generateOutOfMemoryError();
    }

    @Test(expected = MyException.class)
    public void generateMyException() throws MyException {
        new ExceptionGeneratorImpl().generateMyException("Hello");
    }
}