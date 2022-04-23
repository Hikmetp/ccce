package Coursesss;

import java.util.ArrayList;
import java.util.List;

public class Teacher1  {

    /*
    fields : name,mpno,branch
Methods : Teacher()
     */

    protected String name;
    protected String branch;
    protected int mpno;
    protected int sSO;

    static List<Teacher1> OgrtBilgileri = new ArrayList<>();


    public Teacher1(String name, String branch, int mpno,int sSO) {
        super();

        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
        this.sSO=sSO;

    }




    public static List<Teacher1> OgrtBilgileri () {

        Teacher1 t1 = new Teacher1("Ayse Kuzey", "Matematik", 22102, 25);
        Teacher1 t2 = new Teacher1("Hasan Bati", "Fizik", 22103, 20);
        Teacher1 t3 = new Teacher1("Nilay Guney", "Turkce", 22105, 35);
       //  Teacher1 t4 = new Teacher1("ali bulut","cografya",2555,25);
        OgrtBilgileri.add(t1);
        OgrtBilgileri.add(t2);
        OgrtBilgileri.add(t3);
        System.out.println(OgrtBilgileri);
        return OgrtBilgileri;
    }








    @Override
    public String toString() {
        return "\nOgretmen Bilgileri" +
                "\n Ismi ve Soyismi= " + name +
                "\n Bransi= " + branch +
                "\n Sicil No= " + mpno +
                "\nSozlu Sinavin Ortalamaya Etkisi= %" + sSO+
                "\n*****************************************"
                ;
    }


}

