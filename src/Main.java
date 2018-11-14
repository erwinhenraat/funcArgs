public class Main {

    public static void main(String[] args) {
        System.out.println("Demo over functions en arguments");

        function1("Erwin");
        System.out.println(function1("Henkie"));

    }
    public static int function1(String naam){

        String line = "Dit is een function geschreven door ";
        line += naam;
        System.out.println(line);

        System.out.println("deze function geeft het aantal characters als resultaat");

        return line.length();
    }
}
