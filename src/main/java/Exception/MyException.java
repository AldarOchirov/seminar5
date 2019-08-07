package Exception;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }

    public String getMessage(){
        String message = super.getMessage();
        System.out.println("message = " + message);
        return message;
    }
}
