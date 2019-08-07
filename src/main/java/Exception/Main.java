package Exception;

public class Main {
    public static void main(String[] args) {
        ExceptionGeneratorImpl exceptionGenerator = new ExceptionGeneratorImpl();
        try {
            exceptionGenerator.generateNullPointerException();
        }catch(NullPointerException e){
            System.out.println("Успешно перехвачен NullPointerException");
        }

        try{
            exceptionGenerator.generateClassCastException();
        }catch(ClassCastException e){
            System.out.println("Успешно перехвачен ClassCastException");
        }

        try{
            exceptionGenerator.generateNumberFormatException();
        }catch(NumberFormatException e){
            System.out.println("Успешно перехвачен NumberFormatException");
        }

        try {
            exceptionGenerator.generateStackOverflowError();
        }catch(StackOverflowError e){
            System.out.println("Успешно перехвачен StackOverflowError");
        }

        try {
            exceptionGenerator.generateOutOfMemoryError();
        }catch(OutOfMemoryError e){
            System.out.println("Успешно перехвачен OutOfMemoryError");
        }

        try{
            exceptionGenerator.generateMyException("Hello");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
