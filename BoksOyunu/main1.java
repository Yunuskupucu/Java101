package BoksOyunu;

public class main1 {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Ali" , 15 , 100, 90, 50);
        Fighter alex = new Fighter("Osman" , 10 , 95, 100, 50);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
