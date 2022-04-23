package Coursesss;


import P04_okulYönetimi.Course;

import java.util.ArrayList;

public class Course1  {
   /* fields (variable) : name,code,prefix,note,Teacher
    Methods : Course() , addTeacher() , printTeacher()

    */

    public String name;
    String code;
    String prefix;//unvan
   static int note;
   // Sözlü notu % ağırlık
    // Not ağırlık oranı kurs objesi oluştururken girilecek, notlar öğrenci objesi oluştururken öğrenciye özel girilece
   // k.

    static Teacher1 teacher;
    static int yaziliNot;
    static int sozluNot;

    public static ArrayList<Course1> courses = new ArrayList<Course1>();
    Course1 c1= new Course1("Matematik","MT",25);
    Course1 c2= new Course1("Fizik","F",20);
    Course1 c3= new Course1("Turkce","MT",35);



    // Obje oluştururken constructor ile kurs bilgilerini giriyoruz: ad, kod, prefix, not ağırlık oranı %
    public Course1(String name, String prefix, int note) {
        this.name = name;
        this.prefix = prefix;
        this.note = note;
        courses.add(this);

    }

    // Kurs objesine addTeacher metoduyla öğretmen ataması yapıyoruz.
    public void addTeacher(Teacher1 teacher) {
        this.teacher = teacher;
    }






}

