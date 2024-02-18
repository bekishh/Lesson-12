public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------- Programmer -------------------------------------");
        Programmer programmer = new Programmer("Beknazar", "programmer", "Peaksoft");
        System.out.println(programmer);
        programmer.learn("coding");
        programmer.walk("office");
        programmer.eat("hamburger");
        programmer.coding("Java");

        System.out.println("--------------------------------------- Dancer ---------------------------------------");
        Dancer dancer = new Dancer("Michael Jackson", "dancer", "The Jackson 5");
        System.out.println(dancer);
        dancer.learn("dance");
        dancer.walk("studio");
        dancer.eat("salad");
        dancer.dancing("Moonwalk");

        System.out.println("--------------------------------------- Singer ---------------------------------------");
        Singer singer = new Singer("Hendrix", "singer", "The Velvetones");
        System.out.println(singer);
        singer.learn("sing");
        singer.walk("scene");
        singer.eat("smoothie");
        singer.sing("Hey Joe");
        singer.playGuitar("Purple Haze");


    }
}