package Coursesss;


import P04_okulYönetimi.Course;

import java.util.ArrayList;
import java.util.List;

import static Coursesss.Course1.*;

public class Student1  {

    /*
    fields : name,stuNo,classes,course1,course2,course3,avarage,isPass
Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
     */
    String name;
    int stuNo;
    String sClas;
    Course course1;
    Course course2;
    Course course3;
    int yilOrtala;
    boolean isPass;




    static List<Student1> OgrenciBilgileri = new ArrayList<>();

    public  Student1(String name, int stuNo, String sClas) {


        this.name = name;
        this.stuNo = stuNo;
        this.sClas = sClas;
    }





    public static List<Student1> OgrenciBilgileri () {

        Student1 s1=new Student1("Ali Kaya",102,"7/A");
        Student1 s2=new Student1("Hatice Toprak",103,"7/A");
        Student1 s3=new Student1("Mehmet Tas",104,"7/A");
        Student1 s4=new Student1("Aylin Yagmur",105,"7/A");
        Student1 s5=new Student1("Asim Koc",106,"7/A");
        Student1 s6=new Student1("ali ",1222,"7/b");

        OgrenciBilgileri.add(Mat(55,66,s6));
        OgrenciBilgileri.add(Fizik(75,65,s6));
        OgrenciBilgileri.add(Turkce(85,80,s6));
        s6.yilOrtala(s6);

        OgrenciBilgileri.add(Mat(36,12,s1));
        OgrenciBilgileri.add(Fizik(75,56,s1));
        OgrenciBilgileri.add(Turkce(90,80,s1));
        s1.yilOrtala(s1);

        OgrenciBilgileri.add(Mat(85,80,s2));
        OgrenciBilgileri.add(Fizik(75,75,s2));
        OgrenciBilgileri.add(Turkce(90,80,s2));
        s2.yilOrtala(s2);

        OgrenciBilgileri.add(Mat(90,95,s3));
        OgrenciBilgileri.add(Fizik(85,70,s3));
        OgrenciBilgileri.add(Turkce(75,80,s3));
        s3.yilOrtala(s3);

        OgrenciBilgileri.add(Mat(65,55,s4));
        OgrenciBilgileri.add(Fizik(30,45,s4));
        OgrenciBilgileri.add(Turkce(70,75,s4));
        s4.yilOrtala(s4);

        OgrenciBilgileri.add(Mat(78,70,s5));
        OgrenciBilgileri.add(Fizik(65,70,s5));
        OgrenciBilgileri.add(Turkce(55,70,s5));
        s5.yilOrtala(s5);

        return OgrenciBilgileri;
    }



    public Student1() {



    }




   @Override
    public String toString() {
        return "\nOgrenci" +
                "\nIsmi= " + name +
                "\nOgrenci Numarsi=" + stuNo +
                "\nSinifi= " + sClas + "\nDers ";
    }




    public static Student1 Mat( int yaziliNot, int sozluNot,Student1 student){

        int not;
        int  matOrtalama=(yaziliNot*75/100)+(sozluNot*25/100);


        System.out.println(student+"Matematik : "+"\nYazili Notu : "+ yaziliNot +"\nSozlu Notu : "+ sozluNot +
                "\nMat Ders Ortalmasi : "+matOrtalama);

        if(matOrtalama >= 50) {
            System.out.println("Öğrenci dersten geçmiştir.");
        }
        else {
            System.out.println("Öğrenci dersi tekrar alacaktır.");
        }



        return student;
    }
    public static Student1 Fizik( int yaziliNot, int sozluNot,Student1 student){
        int not;
        int  fizikOrtalama=(yaziliNot*75/100)+(sozluNot*25/100);


        System.out.println(student+"Fizik : "+"\nYazili Notu : "+ yaziliNot +"\nSozlu Notu : "+ sozluNot +
                "\nFizik Ders Ortalmasi : "+fizikOrtalama);
        if(fizikOrtalama >= 50) {
            System.out.println("Öğrenci dersten geçmiştir.");
        }
        else {
            System.out.println("Öğrenci dersi tekrar alacaktır.");
        }


        return student;
    }

    public static Student1 Turkce(int yaziliNot, int sozluNot, Student1 student){
        int not;
        int  turkceOrtalama=(yaziliNot*75/100)+(sozluNot*25/100);


        System.out.println(student+"Turkce : "+"\nYazili Notu : "+ yaziliNot +"\nSozlu Notu : "+ sozluNot +
                "\nTurkce Ders Ortalmasi : "+turkceOrtalama);
        if(turkceOrtalama >= 50) {
            System.out.println("Öğrenci dersten geçmiştir.");
        }
        else {
            System.out.println("Öğrenci dersi tekrar alacaktır.");
        }




        return student;
    }

    public static void yilOrtala(Student1 student){
        int  matOrtalama=(yaziliNot*75/100)+(sozluNot*25/100);
        int  fizikOrtalama=(yaziliNot*75/100)+(sozluNot*25/100);
        int  turkceOrtalama=(yaziliNot*75/100)+(sozluNot*25/100);

        int yilOrtala =(matOrtalama+fizikOrtalama+turkceOrtalama)/3;

        if(yilOrtala>= 50) {
            System.out.println(student+"Öğrenci sinifi geçmiştir.");
        }
        else {
            System.out.println(student+"Öğrenci sinifi gecmistir." +
                    "\nFakat DERS Tekrariniz varsa ise Yil Sonu Butunleme Sinavlarina Bekleriz");
        }

        System.out.println("********IYI TATILLER************");




    }



}
