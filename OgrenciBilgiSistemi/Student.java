public class Student {

    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student (String name,int classes,String stuNo,Course mat, Course fizik,Course kimya){
        this.name = name;
        this. classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkVerbalNote(int verb_mat,int verb_fizik,int verb_kimya){
        if (verb_mat >= 0 && verb_mat <= 100) {
            this.mat.verbalNote = verb_mat;
        }

        if (verb_fizik >= 0 && verb_fizik <= 100) {
            this.fizik.verbalNote = verb_fizik;
        }

        if (verb_kimya >= 0 && verb_kimya <= 100) {
            this.kimya.verbalNote = verb_kimya;
        }
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        double fizik_Ave = this.fizik.note *0.75 + this.fizik.verbalNote * 0.25;
        double mat_Ave = this.mat.note *0.8 + this.mat.verbalNote * 0.2;
        double kimya_Ave = this.kimya.note *0.6 + this.kimya.verbalNote * 0.4;
        double _average = (fizik_Ave + kimya_Ave + mat_Ave) / 3;
        this.avarage = Math.round( _average*100)/100d;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci   : " + this.name);
        System.out.println("Matematik , Sinav notu : " + this.mat.note   +" , Sozel notu : "+ this.mat.verbalNote   +"   Oran ==> sinav %80  sozlu %20");
        System.out.println("Fizik     , Sinav notu : " + this.fizik.note +" , Sozel notu : "+ this.fizik.verbalNote +"   Oran ==> sinav %75  sozlu %25");
        System.out.println("Kimya     , Sinav notu : " + this.kimya.note +" , Sozel notu : "+ this.kimya.verbalNote +"   Oran ==> sinav %60  sozlu %40");
    }


}
