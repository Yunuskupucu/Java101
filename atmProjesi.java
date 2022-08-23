import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bakiye = 1000, toplam = 0, sifreHakkı = 3;
        String kullaniciAdi,sifre;

        System.out.print("Kullanici Adi Giriniz : ");
        kullaniciAdi = input.nextLine();
        System.out.print("Sifre Giriniz : ");
        sifre = input.nextLine();

        if(kullaniciAdi.equals("Yunus") && sifre.equals("Java123")){
            System.out.print("YEK Bankasina Hosgeldiniz\nYapmak Istediginiz Islemi Seciniz\n");
            System.out.print("1-)Para Yatirma\n2-)Para Cekme\n3-)Bakiye Sorgulama\n4-)Cikis\n");

            int a = input.nextInt();

            switch (a){
                case 1:
                    System.out.print("Para Miktari : ");
                    int eklenecekTutar = input.nextInt();
                    bakiye += eklenecekTutar;
                    System.out.print("Bakiyeniz : " + bakiye);
                    break;

                case 2:
                    System.out.print("Cekmek Istediginiz Tutar :");
                    int cekilecekTutar = input.nextInt();
                    if(cekilecekTutar > bakiye){
                        System.out.print("Yetersiz Bakiye");
                        break;
                    }else{
                        bakiye -= cekilecekTutar;
                        System.out.print("Kalan Bakiye : " + bakiye);
                        break;
                    }
                case 3:
                    System.out.print("Mevcut Bakiyeniz : " + bakiye);
                    break;
                case 4:
                    System.out.print("Iyi Gunler. Yine Bekleriz... ");
                    break;
            }
        }
        else{
            sifreHakkı--;
            System.out.println("Hatali kullanici veya sifre girdiniz tekrar deneyiniz.");
            if(sifreHakkı == 0)
                System.out.println("Hesabiniz bloke oldu. Bankayla iletisime geciniz.");
        }
    }
}
