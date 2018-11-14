public class Main {

    public static void main(String[] args) {
        /*
        String naam = "Brian";
        System.out.println("hallo mijn naam is " + naam +  " hoe gaat het ermee?");
        naam = "Erwin";
        System.out.println("hallo mijn naam is " + naam +  " hoe gaat het ermee?");
*/
        int amount =0;
        amount += sayHello("Erwin");
        amount += sayHello("Fred");
        amount += sayHello("Fred Flintstone");

        System.out.println("we hebben nu "+ amount + " letters");
    }
    public static int sayHello(String naam){
        //String naam = "Fred";
        System.out.println("hallo mijn naam is " + naam +  " hoe gaat het ermee?");

        return naam.length();

    }
}
