import java.io.IOException;

public class Principal {

    public Principal(){

    }

    public static void main(String[] args) {

        new Principal();

        try {

            throw new ExceptionA("Isso é uma ExceptionA");
        } catch (Exception e) {
            System.out.println("Capturou uma exceção do tipo Exception: " + e.getMessage());
        }

        try {

            throw new ExceptionB("Isso é uma ExceptionB");
        } catch (Exception e) {
            System.out.println("Capturou uma exceção do tipo Exception: " + e.getMessage());
        }

        try {

            String str = null;
            str.length();
        } catch (Exception e) {
            System.out.println("Capturou uma exceção do tipo Exception: " + e.getMessage());
        }

        try {

            throw new IOException("Isso é uma IOException");
        } catch (Exception e) {
            System.out.println("Capturou uma exceção do tipo Exception: " + e.getMessage());
        }
    }

}
