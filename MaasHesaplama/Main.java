package MaasHesaplama;

public class Main {
    public static void main(String[] args) {
        Employe employee1 = new Employe("Maria", 2000.0, 34.0, 1999);
        Employe employee2 = new Employe("Mehmet", 3200.0, 50.0, 2003);
        Employe employee3 = new Employe("Mustafa", 2500.0, 45.0, 2011);
        Employe employee4 = new Employe("Fuat", 999, 60, 2021);
        employee1.toPrint();
        employee2.toPrint();
        employee3.toPrint();
        employee4.toPrint();
    }
}