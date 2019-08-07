package Exception;

public class ExceptionGeneratorImpl implements ExceptionGenerator{
    public void generateNullPointerException(){
        Integer i1 = null;
        Integer i2 = i1 + 1;
    }

    public void generateClassCastException(){
        Object i = Integer.valueOf(42);
        String s = (String)i;
    }

    public void generateNumberFormatException(){
        int i = Integer.parseInt("abcd");
    }

    public void generateStackOverflowError(){
        while(true) {
            generateStackOverflowError();
        }
    }

    public void generateOutOfMemoryError(){
        long[][] a = new long[Integer.MAX_VALUE][];
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            a[i] = new long[Integer.MAX_VALUE];
        }
    }

    public void generateMyException(String message) throws MyException{
        MyException a = new MyException(message);
        throw a;
    }
}
