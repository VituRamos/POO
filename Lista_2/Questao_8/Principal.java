public class Principal {

    public Principal(){

    }

    public static void main(String[] args) {

        new Principal();

        try {

            throw new ExceptionB("Isso é uma ExceptionB");

        } catch (ExceptionA e) {
            System.out.println("Capturou uma exceção do tipo ExceptionA: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Capturou uma exceção genérica: " + e.getMessage());
        }

        try {

            throw new ExceptionC("Isso é uma ExceptionC");

        } catch (ExceptionA e) {
            System.out.println("Capturou uma exceção do tipo ExceptionA: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Capturou uma exceção genérica: " + e.getMessage());
        }

        try {

            throw new ExceptionC("Isso é uma ExceptionC");

        } catch (ExceptionB e) {
            System.out.println("Capturou uma exceção do tipo ExceptionB: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Capturou uma exceção genérica: " + e.getMessage());
        }




    }

}
