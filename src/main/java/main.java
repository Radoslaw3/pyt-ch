
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class main {

    private int cos = 5;
    private void prvClass(){
        System.out.println("pokaz");
    }
    public void dwa(){
        main m1 = new main();
        this.cos = 4;
    }

    private main() {
        System.out.println("none");
    }

    private main(int cos) {
        this();
        this.cos = cos;
    }

        public static void main(String[] args) {
            main m2 = new main();

            System.out.println();
            //Wniosek:
            //this()     //jednie z konstruktora
            //  .this    //jedynie z instancji obiektu





////////////////////// Daty:
            //throw new NegativeArraySizeException()
            //LocalDateTime ldt = new LocalDateTime(20201010,121212);
            //LocalDateTime localDateTime;
            //System.out.println(LocalDateTime.now());
//        String date = LocalDate
//                .parse("2014-05-04")
//                .format(DateTimeFormatter.ISO_DATE_TIME); //to nie dziala...exception
//                //.format(DateTimeFormatter.ISO_LOCAL_DATE); //to dziala
//        System.out.println(date);

//        LocalDate date1 = LocalDate.now();
//        LocalDate date2 = LocalDate.of(2014,6,20);
//        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
//        System.out.println("date1 = " + date1);
//        System.out.println("date2 = " + date2);
//        System.out.println("date3 = " + date3);
////wynik:  date1 = 2020-02-15
////        date2 = 2014-06-20
////        date3 = 2014-06-20
//        LocalDateTime dt = LocalDateTime.of(2014,05,04,1,1,1);
////        dt.plusDays (30); //nie zmienilo daty
////        dt.plusMonths(1); //nie zmienilo daty
//        dt = dt.plusDays (30); //zmienilo daty
//        dt = dt.plusMonths(1); //zmienilo daty //Wniosek: musi byc przypisane spowrotem
//        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));


//        //Q 28.
//        //Which of the following can be inserted into the blank to create a date of June 21, 2014? (Choose all that apply)
//        import java.time.*;
//
//        public class StartOfSummer {
//
//            public static void main(String[] args) {
//                LocalDate date = ____________________________  //nie moze byc: new LocalDate()
//                                            //jedynie: LocalDate.of(2014,6,21)
//            }
//
//        }
//            //Q 29.
//        //What is the output of the following code?
//        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
//        date.plusDays(2);
//        date.plusHours(3);          //LocalDate...nie ma Hours !!!
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//                + date.getDayOfMonth());
//                //Q 30.
//        //What is the output of the following code?
//        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);  //Exception gdy invalid date...40 dzien miesiaca.
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//                + date.getDayOfMonth());
//        //Q 31.)
//        //What is the output of the following code?
//        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
//        date.plusDays(2);       //brak przypisania do "date", wiec brak jakiejkolwiek zmiany
//        date.plusYears(3);      //brak jakiejkolwiek zmiany
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//                + date.getDayOfMonth());
//        //Q 32.)
//        //What is the output of the following code?
//        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
//        Period p = Period.of(1, 2, 3);
//        d = d.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//        System.out.println(d.format(f)); // ofLocalizedTime, wiec jedynie time: 11:22 AM
            //Q. 33.)
//        //What is the output of the following code?
//        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
//        Period p = Period.ofDays(1).ofYears(2);   // Podchwytliwe !!! jedynie ofYears(2) jest brane pod uwage. Brak Method chaining.
//        d = d.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//        System.out.println(f.format(d));



////////////////////Lambdas:
//        List<PersonLambda> iList = Arrays.asList(new ArrayList<PersonLambda>((new PersonLambda("Hank", 45),
//                new PersonLambda("Charlie",40),
//                new PersonLambda("Smith",38));
//
//        doStanie(iList,a->a.name == "Charlie");
//
//}
//
//        static void doStanie(List<PersonLambda> person, Predicate<PersonLambda> predicate){
//            for (PersonLambda p1: person) {
//                if (predicate.test(p1)){
//                    System.out.println(p1.name + " " + p1.age);
//                }
//            }
//Q. 26  	What is the result of the following class?
//1: import java.util.function.*;
//2:
//3: public class Panda {
//4: int age;
//5: public static void main(String[] args) {
//6: Panda p1 = new Panda();
//7: p1.age = 1;
//8: check(p1, p -> p.age < 5);
//9: }
//10: private static void check(Panda panda, Predicate<Panda> pred) {
//11: String result = pred.test(panda) ? "match" : "not match";
//12: System.out.print(result);
//13: } } output: match

            //Q. 27  	What is the result of the following code?
            //1: interface Climb {
            //2: boolean isTooHigh(int height, int limit);
            //3: }
            //4:
            //5: public class Climber {
            //6: public static void main(String[] args) {
            //7: check((h, l) -> h.append(l).isEmpty(), 5);    // Compile error on line 7
            //8: }
            //9: private static void check(Climb climb, int height) {
            //10: if (climb.isTooHigh(height, 10))
            //11: System.out.println("too high");
            //12: else
            //13: System.out.println("ok");
            //14: }
            //15: }

//Q. 28  	Which of the following lambda expressions can fill in the blank? (Choose all that apply)
//List<String> list = new ArrayList<>();
//list.removeIf(___________________);
////Odp.: A.	s -> s.isEmpty() //ok
            //D.	s -> {return s.isEmpty();} //ok.
            //F. (String s) -> s.isEmpty()    //ok.

//Q. 29  	Which lambda can replace the MySecret class to return the same value? (Choose all that apply)
//interface Secret {
//String magic(double d);
//}
//
//class MySecret implements Secret {
//public String magic(double d) {
//return "Poof";
//} //ODp.: A.	caller((e) -> "Poof");  //ok
//} //      F.	caller((e) -> { String f = ""; return "Poof"; });   //ok

        }

    }
/*
// passleader;
---
1.
interface Readable {
    public  void readBook();
    public void setBookMark();
}

--
public abstract class Book implements Readable {        //line n1
    public void readBook(){}
    //line n2

}
--
public class EBook extends Book {       //line n3
    public void readBook(){}
    //line n4
    public void setBookMark(){    }   //ok
}
--
        Book r1 = new EBook();
---
2.
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        names.add("John");

        if (names.remove("Bran")){   //wynik: [Robb, Rick, Bran]
            names.remove("John");
        }
        System.out.println(names);   //ladnie listuje cala liste [Robb, Bran, Rick, Bran]

---
3.
public class A {
    public A() {
        System.out.println("A");
    }
}

--
public class B extends A {
    public B() {
        System.out.println("B");
    }
}
--
public class C extends B {
    public C() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c = new C();  // A B C
        A c = new C();  // A B C
        A c = new B();  // A B
    }
}
---
4.
public class X {
    static int i;
    int j;

    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                x1.i + " " +
                        x1.j + "" +
                        x2.i + "" +
                        x2.j
        );


    }
}
---
5.
public class Test {
    public static void main(String[] args) {
        //insert code
        int[]array = new int[2];
        array[0]=10;
        array[1]=20;
        System.out.println(array[0]+ ":" + array[1]);
    }
}
---
6.
 String[] arr = {"A","B","C","D"};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
            if(arr[i].equals("C")){
                continue;
            }
            System.out.println("Work done");
            break;
        }
---
7.
Which three are advantages of the JAVA Exceptions mechanism?
a.improves the program structure because the error handling is separated from the normal program function
b.provide a set of standard exceptions that covers all the possible errors
c.improves the program structure because the programmer can chose where to handle the exceptions
d.improves the program structure because exceptions must be handled in the method in which they occurred
e.allows the creation of new exceptions that are tailored"dostosowane" to the particular program being created
odp.: a c e

---
8.
public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    } //javac Greeting.java
        //java Greeting Duke
}

---
9.
public class Alpha {
    int ns;         //50  //125     //0
    static int s;  //50     //125   //125

    public Alpha(int ns) {
        if (s < ns){
            s = ns;
            this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = " + ns + " s = " + s);
    }
}
--
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
//        ns = 50 s = 125
//        ns = 125 s = 125
//        ns = 0 s = 125
---
10.
        int ii = 0;
        int jj = 7;
        for (ii = 0; ii < jj; ii = ii + 2) {
            System.out.print(ii + " ");
            }
        // 0 2 4 6
---
11.
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014,6,20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
//        date1 = 2020-02-15
//        date2 = 2014-06-20
//        date3 = 2014-06-20
---
12.
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        //insert code here
        String str2 = str1;     //true
        System.out.print(str1 == str2);  //bada tylko referencje do obiektu
---
13.
public class Test {
    static int count = 0;
    int i = 0;
    public void changeCount(){
        while(i < 5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.print(check1.count + " : " + check2.count);
    }
}
---
14.
        double discount = 0;
        int qty = Integer.parseInt(args[0]);
        //line n1


        //2. ok
//        discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;

        //1. ok
//        if(qty >= 90){        //ok
//            discount = 0.5;
//        }
//        if (qty > 80 && qty < 90) {
//            discount = 0.2;
//        }
        //4. nie ok
//
//        if (qty > 80 && qty < 90) {
//            discount = 0.2;
//        }else{
//            discount = 0;
//        }
//        if(qty >= 90){        //ok
//            discount = 0.5;
//        }else{
//            discount = 0;
//        }

       System.out.println(discount);
---
15.
public class Test {
    public static void main(String[] args) {
        if(args[0].equals("Hello") ? false : true){  //odwrocone!!!
            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }
    }
}
---
16.
Which three statements describe the object-oriented features of the Java language?
a.Object cannot be reused
b.A subclass can inherit from superclass.
c.Objects can share behaviors with other objects
d.A package must contain more than one class.
e.Object is the root class of all other objects.
f.A main method must be declared in every class.

odp.BCE
---
17.
        String[] planets = {"Mercury","Venus", "Earth", "Mars"};

        System.out.println(planets.length);     //ilosc elementow tablicy
        System.out.println(planets[1].length()); //dlugosc Stringa
---
18.
public class CCMask {
    public static String maskCC(String creditCard){
        String x = "XXXX-XXXX-XXXX-";
        //line n1;
//        return x + creditCard.substring(15,19);  //ok 1
       //ok 2
//        StringBuilder sb = new StringBuilder(x);
//        sb.append(creditCard, 15, 19);
//        return sb.toString();

        //nie ok
//        StringBuilder sb = new StringBuilder(creditCard);
//        //StringBuilder s =
//                sb.insert(0,x);  //w zerowym miejscu doda String x //nie trzeba przypisawac do zmiennej
//        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
    }
}

---
19.
public class App {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        //line n1
        System.out.println(str1.toLowerCase()); //da "java"
        System.out.println(str2.toLowerCase()); //da "java
        if(str1.toLowerCase() == str2.toLowerCase()) //Not equal
            if(str1.toLowerCase().equals(str2.toLowerCase())) //Equal

        //not:
//        String str3 = str2;
//        if (str1.equals(str3))
        //ok:
        //if (str1.equalsIgnoreCase(str2)) //ok, Equals
        //nie:
//        String str3 = str2;
//        if(str1 == str3)
        {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
---
20.
public class SumTest {
    public static void doSum(Integer x, Integer y){
        System.out.println("Integer " + (x + y));
    }
    public static void doSum(double x, double y){
        System.out.println("double " + (x + y));
    }
    public static void doSum(float x, float y){
        System.out.println("float " + (x + y));
    }
    public static void doSum(int x, int y){
        System.out.println("int " + (x + y));
    }
        public static void doSum(Double x, Double y){
        System.out.println("Double " + (x + y));
    }

    public static void main(String[] args) {
        doSum(10, 20);
        doSum(10.0, 20.0);
    }
}

---
21.
        String[] strs = new String[2];
        System.out.println(strs[0]);
        System.out.println(strs[0].concat("a"));//Exception in thread "main" java.lang.NullPointerException
        int idx = 0;
//        for (String s : strs) {
//            strs[idx].concat(" element " + idx);//Exception in thread "main" java.lang.NullPointerException
//            idx++;
//        }
        for (idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }
---
22.
        String[] strs = new String[2];
        System.out.println(strs[0]);
        System.out.println(strs[0].concat("a"));//Exception in thread "main" java.lang.NullPointerException
        int idx = 0;
//        for (String s : strs) {
//            strs[idx].concat(" element " + idx);//Exception in thread "main" java.lang.NullPointerException
//            idx++;
//        }
        for (idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }
--
public class Vehicle {
    int x;
    Vehicle(){
        this(10);   //line n1
    }
    Vehicle(int x){
        this.x = x;
    }
}
--
         Vehicle y = new Car();
        System.out.println(y);
---
23.
package p1;

public class MyString {
    String msg;
    MyString(String msg){
        this.msg = msg;
    }
}
--
package p1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8")); //Hello Java SE 8
        System.out.println("Hello " + new String("Java SE 8")); //Hello Java SE 8
        System.out.println("Hello " + new MyString("Java SE 8")); //Hello p1.MyString@75412c2f
    }
}
---
24.
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
        iVar = fVar; //blad bo do mniejszego
        fVar = iVar; //ok
        dVar = fVar; //ok
        fVar = dVar; //blad bo do wiekszego
        dVar = iVar; //ok
        iVar = dVar; //blad bo do mniejszego
---
25.
public class MainTest {
    public static void main(int[] args) {
        System.out.println("int main" + args[0]);
    }

    public static void main(Object[] args) {
        System.out.println("Object main " + args[0]);
    }

    public static void main(String[] args) {
        System.out.println("String main " + args[0]);
    }
    // input java MainTest 1 2 3
    // out: String main 1

}
---
26.
        int num[][] = new int[1][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
                //System.out.println(num[i][j]); // 10 10 10
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
---
27.
public class Person {
    String name;
    int age = 25;


    public Person(String name){
        this();                     //line n1, brak bez param
        setName(name);
    }

    public Person(String name, int age){
        Person(name);               //line n2, tak sie nie da odwolac do konstruktora
        setAge(age);
    }

    //setter and getter methods go here


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show(){
        return name + " " + age; //+ number ;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
---
28.
public class Planet {
    public String name;
    public int moons;

    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

//    @Override
//    public String toString() {
//        return "Planet{" +
//                "name='" + name + '\'' +
//                ", moons=" + moons +
//                '}';
//    }
}
--
        Planet[] planets = {
                new Planet("Mercury", 0),
                new Planet("Venus", 0),
                new Planet("Earth", 1),
                new Planet("Mars",2)
        };

        System.out.println(planets);
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);
//odp.
[LPlanet;@75412c2f
Planet@282ba1e
1

---
29.
You are asked to develop a program for a shopping application, and you are given the following informations:
-the app must contain the classes Toy, EduToy, and consToy.
-the Toy class is the superclass of the other two classes.
-the int caicuiatePrice (Toy t) method calculates the price of a toy.
-the void printToy (Toy t) method prints the details of a toy.
---
30.
        int[] intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + ","); //da 15,30,75,60,90,
        }
---
31.

        int[] intArr = {8,16,32,64,128};
//        for(int i : intArr){              //ok
////            System.out.print(i + " ");
////        }
//        for(int i=0; i< intArr.length; i++){  //ok
//            System.out.print(intArr[i] + " ");
//        }
        //        int i = 0;
        //                for(; ; ){  //dodatkowy test i dziala
        //                    if (i >= intArr.length)
        //                        break;
        //
        //                        System.out.print(intArr[i] + " ");
        //                        i++;
        //        }
---
32.

 import / package / class - order
---
33.
Process all the elements of the array in the order of entry.
2.reverse
3.alter elements in order of entry

Which two are correct:
A.Requirements 1, 2 and 3 can be implemented by using the enhanced for loop.
B ...1 2 and 3...using standard for loop    //ok
c... 2 and 3 CANNOT be implemented by using the standard for loop.
d... 1 can be ...by enhanced for loop      //ok
e.... 3 CANNOT be implemented...by either the enhanced or the standard for loop.

        int[] array = {1,2,3,4,5};
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i]);

        }
        System.out.println();
        for (int a :
                array) {
            System.out.println(a);
        }
---
34.
public class TestScope {
    public static void main(String[] args) {
        int var1 = 200;
        System.out.print(doCalc(var1));
        System.out.print(" " + var1);
    }
    static int doCalc(int var1){
        var1 = var1 * 2;
        return var1;
    }
}
---
35.
abstract class + interface + clasa1 + classa2
odp.: gora - dol
ArrayList<poziom wyzszy> aaa
aaa.add(Object z poziom nizszy) <- tak jedynie moze byc
---
36.
Which statement is true about Java byte code?
a.it can run on any platform
b.it can run on any platform only if it was compiled for this platform
c.it can run on any platform that has the Java Runtime Environment  //ok
d.it can run on any platform that has a Java compiler
e.it can run on any platform only if that platform has both the Java Runtime Environment and a Java compiler.
---
37.

public class MarkList {
    static int iloscObjektowMarkList = 0;
    int num;

    public MarkList() {
        this.iloscObjektowMarkList += 1;

    }

    public MarkList(int num) {
        this();
        this.num = num;
    }

    public static void graceMarkus(MarkList obj4){
        obj4.num += 10;
    }

    public static void main(String[] args) {
        MarkList obj1  = new MarkList(5);
        MarkList obj2 = obj1;
        MarkList obj3 = null;
        obj2.num = 60;
        graceMarkus(obj2);
        System.out.println(obj1.num);
        System.out.println("MarkList obj x: " + iloscObjektowMarkList + ", " + obj1.getClass()); //dopisalem
    }
}
---
38.
public class Triangle {
    static double area;
    static int b = 2, h = 3;

    public static void main(String[] args) {
        double p,b,h;       //line n1
        //b=1;
        if (area == 0.0){
            b = 3;
            h = 4;
            p = 0.5;
        }
        area = p * b * h;       //line n2   //issue
        System.out.println("Area is " + area);
        Triangle t1 = new Triangle();
        System.out.println(t1.b + " " + " " + b);
    }
}
---
39.
public class Test {
    public static void main(String[] args) {
        //line n1
//        int x = 1;  //ok
        //short x = 1;  //ok, Byte - tez ok.
        Integer x = new Integer(1);

        switch(x){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
        }
    }
}
---
40.
public class App {
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];
        bool[0] = new Boolean(Boolean.parseBoolean("true"));  //da: true
//        bool[1] = new Boolean("true");  //da: true
        bool[1] = new Boolean(null);    //null czy "cokolwiek" da:  false

        System.out.println(bool[0] + " " + bool[1]);
    }
}


---
41.
public class MyException extends RuntimeException {
}
--
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.random());
        try{
            method1();
        }
        catch(MyException ne){
            System.out.print("A");
        }
    }
    public static void method1() {  //line n1
        try{
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        }
        catch (RuntimeException re){
            System.out.println("B");  //MyException extends RuntimeException...dlatego zawsze RuntimeException wypadnie.
        }
    }
}

---
42.

public class App {
    String myStr = "7007";

    public void doStuff(String str){
        int myNum = 0;
        try{
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }catch (NumberFormatException ne){
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }

    public static void main(String[] args){
        App obj = new App();
        obj.doStuff("9009");
    }
}
///odp.: myStr: 7007, myNum: 9009
---
43.
Which two are benefits of polymorphism?
a.Faster code at runtime
b.more efficient code at runtime
c.more dynamic code at runtime  //ok
d.more flexible and reusable code //ok
e.code that is protected from extension by other classes
odp.: D i C
---
44.
        int nums1[] = new int[3];
        int nums2[] = {1,2,3,4,5};
        nums1 = nums2;
        for (int x :
                nums1) {
            System.out.print(x + ":");
        }
---
45.
public class Product {
    int id;
    String name;
    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }
}
--
        Product p1 = new Product(101, "Pen");
        Product p2 = new Product(101, "Pen");
        Product p3 = p1;
        boolean ans1 = p1 == p2;  //nie
        boolean ans2 = p1.name.equals(p2.name); //tak
        System.out.print(ans1 + ":" + ans2);
//odp. false: true
---
46.
public class Employee {
    public int salary;
}
--
public class Manager extends Employee {
    public  int budget;
}
--
public class Director extends Manager {
    public int stockOptions;
}
--
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        //line n1
---
47.
public class Product {
    double price;
}
--
public class Test {
    public void updatePrice(Product product, double price){
        price = price *2;
        product.price = product.price + price;
    }

    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        Test t = new Test();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price + " : " + newPrice);
    } //400.0 : 100.0
}
---
48.
        int aVar = 9;
        if (aVar++ < 10){  //10 Hello World!
        //if (++aVar < 10){  //10 Hello Universe!
            System.out.println(aVar + " Hello World!");
        }else{
            System.out.println(aVar + " Hello Universe!");
        }
---
49.
        String date = LocalDate
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME); //to nie dziala...exception
                //.format(DateTimeFormatter.ISO_LOCAL_DATE); //to dziala
        System.out.println(date);
---
50.
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;       //line n1
        String s4 = (String) (s3 * s2);  //line n2
        System.out.println("Sum is " + s4);
        //throw new ClassCastException();
---
51.
What is the name of the Java concept that uses access modifiers to protect variables and hide them within a class?
a.encapsulation //ok
b.inheritance
c.abstraction
d.instantiation
e.polymorphism
---
52.
abstract class Planet {
    protected void revolve(){       //line n1

    }
    abstract void rotate();         //line n2
}
--
public class Earth extends Planet {
    void revolve(){         //linia n3

    }
    protected void rotate(){        //linia n4

    }
}
---
53.
class Vehicle {
    String type = "4W";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
--
class Car extends Vehicle {
    String trans;

    Car(String trans) {      //blad       //line n1
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this(trans); //blad         //line n2
    }

//    Car(String type, int maxSpeed) {
//        super(type, maxSpeed);
//        this.trans = trans;
//    }
}
---
54.
import java.io.IOException;

class X {
    public void printFileContent() throws IOException{   //Add IOException
        //code goes here:

        throw new IOException();
    }
}
--
public class Test {
    public static void main (String[] args) throws Exception{ //add Exception
        X xobj = new X();
        xobj.printFileContent();
    }
}
---
55.
public class Customer {
    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh){
        acct.addkWh(kWh);
        //acct.setBill(2);  //tu bysmy namieszali w rachunku
        System.out.println(acct);
    }
}
--
public class ElectricAccount {
    private double kWh;  //laczna ilosc zuzycia od poczatku
    private double rate = 0.07;
    private double bill; //aktualny rachunek

    //line n1
    //bill is equal = kwh * member variable rate
    public void addkWh(double kWh){
        if (kWh > 0){
            this.kWh = this.kWh + kWh;
            this.bill = this.kWh * rate;
            //setBill(this.kWh);
        }
    }
//    public void setBill(double kWh){  //z instancji Customer class jestesmy w stanie zmienic rachunek = blad.
//        bill = kWh * rate;
//    }

    @Override
    public String toString() {
        return "ElectricAccount{" +
                "kWh=" + kWh +
                ", rate=" + rate +
                ", bill=" + bill +
                '}';
    }
}
--
        Customer c1 = new Customer();
        c1.useElectricity( 10);
        c1.useElectricity( 10);
---
56.  Lambda - super fajny przyklad
public class Person {
    String name;
    int age;
    public Person(String n, int a){
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
--
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {     //lambda example
    public static void  checkAge(List<Person> list, Predicate<Person> predicate){
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank", 45),
                                            new Person("Charlie",40),
                                            new Person("Smith",38));
        //line n1
        //checkAge(iList,a->a.age > 40);  //to dziala, ale nie ma takiej odpowiedzi
        //checkAge(iList,p -> p.getAge()>40);  //to dziala
        checkAge(iList,(Person p) -> p.getAge()>40);  //to nie dziala przez: pusty: (), natomiast (p) juz dziala.
        //checkAge(iList,(Person p)->{return p.getAge()>40;}); //to dziala po korekcie: + return
    }
}
---
57.
        String[][] arr = {{"A","B","C"},{"D", "E"}};
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length; j++){  //ta czesc jest super. Okreslenie dlugosci kazdej linii
                System.out.print(arr[i][j]);
                if (arr[i][j].equals("B")){
                    break;
                }
            }
            continue;
        }  //ABDE

---
58.
        String str = " ";
        str.trim();
        System.out.println(str.equals("") + " " + str.isEmpty());
---
59.
public class CD {
    int r;
    CD(int r){
        this.r=r;
    }
}
--
public class DVD extends CD {
    int c;
    DVD(int r, int c){
        //line n1
        super(r);
        this.c = c;
    }
}
--
        DVD dvd = new DVD(10,20);
---
60.
        int a[] = {1,2,3,4,5};
        for(int e=0;e < 5; e += 2){  //to print 135 ?
            System.out.print(a[e]);
        }

---
61.
Which statement best describes encapsulation?
a. Encapsulation ensures that classes can be designed so that only certain fields and methods of an object are accessible from other objects.
b. Encapsulation ensures that classes can be designed so that their methods are inheritable.
c. Encapsulation ensures that classes can be designed with some fields and methods declared as abstract.
d. Encapsulation ensures that classes can be designed so that if a method has an argument MyType x, any subclass of MyType can be passed to that method.

a. potwierdzone
---
62.
package sales;

public class SalesMan {
}
--
package sales.products;

public class Product {
}
--
package market;

//import sales.SalesMan;
//import sales.products.Product;
import sales.*;  //right answer
import sales.products.*; //right answer

public class USMarket {
    SalesMan sm;
    Product p;
}
---
63.
public class CheckingAccount {
    public int amount;
    public CheckingAccount(int amount){
        this.amount = amount;
    }
    public int getAmount(){return amount;}
    public void changeAmount(int x){
        amount += x;
    }
}
--main w 2giej klasie:
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
        //line n1
        //acct(0);  //blad, bo do konstruktora tylko przez "new" mozna sie dostac
        //acct.amount = 0; //ok. poprawne da 0
        //acct.getAmount() = 0; //blad
        //acct.getAmount(0); //blad
        //acct.changeAmount(0); //kompiluje ale += nie daje 0
        //acct.changeAmount(-acct.amount); //ok. poprawne da 0
        //acct.changeAmount(-acct.getAmount()); //ok. poprawne da 0

        System.out.println(acct.getAmount());
--
64.
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        //shirts[0][2] = "blue2";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        //shirts[1][2] = "medium2";

        for(int index = 0; index < 2; ){  //poprawnie
            for(int idx = 0; idx < 2; ){
                System.out.print(shirts[index][idx] + ": ");
                idx++;
            }
            index++;
        }
//        for (int i = 0; i <shirts.length ; i++) {  //dla sprawdzenia
//            for (int j = 0; j < shirts.length ; j++) {
//                System.out.print(shirts[i][j] + ": ");
//            }
//        }
---
65.
import java.io.IOException;

public class Test {
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card");
    }
    void checkCard(int cardNo) throws RuntimeException{ //line n1  //to nie robi problemu
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        Test ex = new Test();
        int cardNo = 12344;
        ex.checkCard(cardNo);   //line n2
        ex.readCard(cardNo);    //line n3   //krzyczy problem. Bo checked Exception. Trzeba wsadzic w try/catch lub do metody throws Exception
        //throw new IOException(); // musi byc zlapane
        //throw new ClassCastException();  //nie musi byc zlapane
    }
}
---
66.
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        if (sb.equals(s)){
            System.out.println("Match 1");
        }else if(sb.toString().equals(s.toString())){  ///string nie potrzebuje toString(), ale nie jest problemem.
            System.out.println("Match 2");  //True. Prawidlowo. StringBuilder.toString equals String
        }else{
            System.out.println("No Match");
        }
---
67. //fajny opis na kartkach + grafika dodana

package p1;

public class Acc {
    int p;
    private int q;
    protected int r;
    public int s;
}
--
package p2;

import p1.Acc;

public class Test extends Acc {
    public static void main(String[] args) {
        Acc obj = new Test(); //to Acc, jest problemem
        //obj.;   //r i s sa widoczne ale r nie wyswietlimy poniewaz
                    // zmiana na: Test obj = new Test(); //juz pozwala uzyc zmiennej protected odziedziczonej z parenta
        System.out.println(obj.r); //nie wyswietli "r", krzyczy ze protected
             System.out.println("s = "+obj.s +" r = "+ obj.r);//nie wyswietli "r", krzyczy ze protected
    }
}
--
68.  POLYMORPHISM - super przyklad
public class Base {
    protected int a1;

    public void test(){
        System.out.println("Base ");
    }
}
--
public class DerivedA extends Base {
    protected int a2;
    public void test(){
        System.out.println("DerivedA ");
    }
}
--
public class DerivedB extends DerivedA {
    protected int a3;
    public void test(){
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1.test();      //DerivedB
        b1 = (Base)b3;
        b1.test();      //DerivedB
        Base b4 = (DerivedA)b3;
        b4.test();      //DerivedB
        b2.test();      //DerivedA
        Base be1 = new Base();
        be1.test();     //Base
        b1.
                //Zmienne: Parent = mniej zmiennych widzi, Child = wiecej zmiennych, nastepny glebszy child = jeszcze wiecej zm widzi.
    }
} //super opis:
//  Dynamic Method Dispatch or Runtime Polymorphism in Java
//  https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/
// Static Polymorphism  VS Dynamic Polymorphism
// https://beginnersbook.com/2013/04/runtime-compile-time-polymorphism/
---
69.
        ArrayList myList = new ArrayList();
        String[] myArray;
        int a = 0;
        try{
            while(true){
                myList.add("My String");
                //throw new RuntimeException();
            }
            //System.out.println("czy dokonczy try"); //unreachable statement gdy: while ma (true)
        }
        catch (RuntimeException re){
            System.out.println("Caught a RuntimeException");
        }
        catch (Exception e){
            System.out.println("Caught an Exception");
        }catch(Error re){           //dodaje...i...: "Caught an Error", then "Ready to use"
            System.out.println("Caught an Error");
        }finally {
            System.out.println("finally catch");
        }
        System.out.println("Ready to use");

 //odp.: Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 //po dodaniu finally: zawsze finally jest wyswietlone
        //zawsze "Ready to use" jest wyswietlone ostatnie gdy zlapie jakikolwiek catch
//nigdy nie dokonczy try{} i nie wyswietli: "czy dokonczy try"

---
70.
        System.out.println("5+2=" + 3 + 4);
        System.out.println("5+2=" + (3 + 4));
        String a = "ala";
        System.out.println(a + 3 + 4);
---
71.
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D'); //brak przypisania. btw.: replace zastepuje wszystkie wystapienia
        ta = ta.concat(tb);
        System.out.println(ta);
---
72.
        int x = 5;
        while (isAvailable(x)){
            System.out.print(--x); //tu powinno byc x--
        }
    }

    public static boolean isAvailable(int x){
        return x-- > 0 ? true : false;
---
73.
        //boolean opt = true; //boolean nie jest dozwolony w switch.
        String opt = "true";
        switch (opt){
            case "true":
                System.out.print("True");
                break;
            default :
                System.out.print("***");
        }
        System.out.println("Done");
---
74.
        int num = 5;
        do {
            System.out.print(--num + " "); //num-- da 5 // --num da 4
        }while(num == 0);
---
75.
        int x = 100;
        System.out.println("x=" + x); //x=100
        int a = x++;
        System.out.println("a=" + a); //a=100
        int b = ++x;
        System.out.println("b=" + b); //b=102
        int c = x++;
        System.out.println("c=" + c); //c=102
        int d = (a<b) ? (a<c) ? a:b : c;
//        int d = (a<b) ? (a<c) : ? a:(b<c) ? b: c;
        System.out.println(d);
---
76.
        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i; //Stringa tworzy z int-a
                i++;
            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
////wynik:
//        97 98
//        99 100 null null null
---
77.

public class Employee {
    String name;
    boolean contract;
    static double salary;

    Employee(){
        //line n1
//        this("Joe", true, 100); //nie ok

//        name = "Joe";   //OK niby tez. TRUE z duzej wymagalo importu klasy, ale dziala ok.
//        contract = TRUE;
//        salary = 100.0f;

//        this.name = new String ("Joe");  //ok
//        this.contract = new Boolean(true);
//        this.salary = new Double(100);
    }

    public String toString(){
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        // line n2

//        this.name = "Joe";   //"this" nie mozna uzyc wewnatrz static method
//        this.contract = true;
//        this.salary = 100;

//        e.name = "Joe";  //1 opcja OK.
//        e.contract = true;
//        e.salary = 100;

        System.out.print(e);
    }
}
---
78.
public class Student {
    public String name = "";
    public int age = 0;
    public String major = "Undeclared";
    public boolean fulltime = true;

    public void display(){
        System.out.println("Name: " + name + " Major: " + major);
    }

    public boolean isFullTime(){
        return fulltime;
    }
}
--
        //main method:
        Student student = new Student();
---
79.
        int[] array = {1,2,3,4,5};
        for (int i : array) {
            if (i < 2){
                //keyword1
                continue;

            }
            System.out.println(i);
            if (i == 3){
                //keyword2
                continue;
            }
        }
---
80.
        int i, j = 0;
        i = (3*2 +4 +5); //15
        j = (3* ((2+4) +5)); //33
        System.out.println(i + " " + j);

---
81.
        boolean log3 = (5.0 != 6.0) && (4 != 5);  //true //wniosek: jesli pierwszy true to drugi dopiero jest sprawdzany.
        boolean log4 = (4 != 4) || (4 == 4);  //true //wniosek: wystarczy ze jeden jest true
        System.out.println("log3:" + log3 + "\nlog4:" + log4);
---
82.
        StringBuilder strB = new StringBuilder("ala");
        strB.insert(3,"_ma");
        strB.delete(0,strB.length());  //poprawnie
        System.out.println(strB);
---
83.
        public class StaticField {
    static int i = 7;

    public static void main(String[] args) {
        StaticField obj = new StaticField();
        obj.i++;
        StaticField.i++;
        obj.i++;
        System.out.println(StaticField.i + " "+ obj.i);
    }
}
>out: 10 10
---
84.
//        Object array[]; //ok
        //Boolean array[3];  //blad przez 3
//        boolean array[] = new boolean[6]; //to by bylo ok
//        int[] array;  //ok
        Float[2] array;  //blad przez 2
---
85.
    public class Overloading {
    int x (double d){
        System.out.println("one");
        return 0;
    }
    String x(double d){
        System.out.println("two");
        return null;
    }
    double x(double d){
        System.out.println("three");
        return 0.0;
    }

    public static void main(String[] args) {
        new Overloading().x(4.0);
    }
}
//Odp.: D, Compilation Fails.  Przy Overloading nie moze byc ten sam parametr wejsciowy w kilku metodach.
---
86.
public class MainMethod {
    void main(){
        System.out.println("one");
    }
    static void main(String args){
        System.out.println("two");
    }

    public static void main(String[] args) {
        System.out.println("three");
    }
    void mina(Object[] args){
        System.out.println("four");
    }
}
---
87.
public class ScopeTest {
    int j; int k;

    public static void main(String[] args) {
        new ScopeTest().doStuff();
    }
    void doStuff(){
        int x = 5;
    doStuff2();
        System.out.println("x");
    }
    void doStuff2(){
        int y = 7;
        System.out.println("y");
        for (int z = 0; z < 5; z++) {
            System.out.println(z);
            System.out.println(y);
        }
    }

}
---
88.
public class Test {
    void inPut(int a,int b, int c){

    }

    public static void main(String[] args) {
        new Test().inPut(1,2); //Compilation fails
    }

}
Odp. A. Compilation fails.
---
89.
public class ForTest {
    public static void main(String[] args) {
        int[] arrar = {1,2,3};
        //wprowadz kod zamiast foo
//        for (int i: arrar){  //ok: A
//        for (int i=0;i<1;i++){  //ok: B
//            for (;;){             //ok: C
//        for(;i<1;){                 //nie ok: D E
//        }
    }
}
---
90.
public class SampleClass {
    public static void main(String[] args) {
        AnotherSampleClass asc = new AnotherSampleClass();
        SampleClass sc = new SampleClass();
        sc = asc;  //child do parenta = ok, nie an odwrot!
        System.out.println("sc: " + sc.getClass());
        System.out.println("asc: " + asc.getClass());
    }
}
--
public class AnotherSampleClass extends SampleClass {
}
---
91.
        int b = 3;
        if(!(b > 3)){
            System.out.print("square");
        }{
            System.out.print("circle");
        }
        //odp.: squarecircle...
---
92.
    public static void main(String[] args) {
       int a = 1, b = 2;
       int c = sum(a,b);
        System.out.println(c);
    }
    static int sum(int first, int second){
        return first + second;
    }
---
93.
    public static void main(String[] args) {

        System.out.println(new IllegalArgumentException().getClass());
        try{
            throw new IllegalArgumentException();

        }catch(NullPointerException e){
            System.out.println("1.) " + e);
        }catch(Error ez){
            System.out.println("all.) " + ez);
        }finally {
            System.out.println("finally.) ");
        }
        System.out.println("na zewnatrz.) ");
    }
---
94.
        boolean a = true;
        for (; a; ) {  //expr2 - is evaluated BEFORE each iteration.
            System.out.println("a ");
            a = false;
        }
---
95.
        String message = "Hi everyone!";
        System.out.println("message = " + message.replace("e", "X"));
        //odp.: message = Hi XvXryonX!
---
96.
        //int[][] twoD = new int[3][] {};
        int[][] twoD = {{1,2,3},{1},{1}};
//        twoD
//         Object ter;
//         ter.
        for (int i = 0; i <  twoD.length; i++) {
            for (int j = 0; j <  twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println();                 // time for a new row
        }
---
97. teoria
Wchich 3 statements are benefits of encapsulation?
a. allow a class implementation to change without changing the client
b. protects confidential data from leaking out of the object
c. prevent code from causing exceptions
d. enable the class implementation to protect its invariants  //invariants = cecha klasy ktora zawsze spelnia swoje warunki, niezaleznie ile transformacji przez publiczna metode przeszla
e. permits classes to be combined into the same package
f. enables multiple instances of the same class to be created safely
ABD(?) lub ADF (www info)

---
98.
        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(1001);
        list.add(1002);
        System.out.println(list.get(list.size())); //this line throws Index Out of Bounds
---
99.
        String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
        //which code fragment prints blue, cyan, ?
        //z palca:
//        Arrays.sort(colors);
//        int first = Arrays.binarySearch(colors,"blue"); //pierwsze miejsce => 0
//
//        System.out.println("first: " + first + " value: " + colors[first]); //da pozycje i wyswietli wartosc
//        System.out.println(Arrays.binarySearch(colors,"blue")); //posortowane da 0,
        for (String c : colors ) {
            if(c.length() != 4){
                continue;
            }
            System.out.print(c + ", ");
        }
---
100.

public class Hat {
    public int ID = 0;
    public String name = "hat";
    public String size = "One Size Fit All";
    public String color = "";
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
}
--
public class TestHat {
    public static void main(String[] args) {
        Hat blackCowboyHat = new Hat();
        blackCowboyHat.setName("new2Hat"); //this works

        System.out.println(blackCowboyHat.getName());
    }
}
---
101.
        //float flt = 100F;
//        float flt = (float) 1_11.00;
        //float flt = 100;
//        double y1 = 203.22;
//        float flt = y1;//issue
       //int y2 = 100;
        //float flt = (float)y2;
---
102.

brak.

---
122.
import java.unit.*;
????
public class Ref
{
public static void main(String[] args)
{
StringBuilder s1 = new StringBuilder("Hello Java!");
String s2 = s1.toString();
List<String> lst = new ArrayList<String>();
lst.add(s2);
System.out.println(s1.getClass());
System.out.println(s2.getClass());
System.out.println(lst.getClass());
}
}

123.
public class Case{
public static void main(String[] args){
String product = "Pen";
product.toLowerCase();
product.concat(" Box".toLowerCase());
System.out.print(product.substring(4,6));
}
}

124.
public class Whizlabs{
Psvm{
int sum = 0;
for (int x =0; x<=10; x++){
sum += x;
sout "Sum for 0 to " + x
sout " = " + sum;
}
}
}

125.
System.out.println(28+5<=4+29);
System.out.println((28+5) <= (4+29));

126.
public class Equal{
psvm
        String str1 = "Java";
        String[] str2 = {"J","a","v","a"};
        String str3 = "";
        for(String str : str2){
            str3 = str3+str;    //poniewaz cocncat uzywasz to JAVA tworzy StringBuilder a nie String...dlatego nie jest to samo co w String Pool.
        }
        boolean b1 = (str1 == str3);
        boolean b2 = (str1.equals(str3));
        System.out.print(b1+", "+b2);  //false, true
}

127.   (Wynik: ThirdException, Odp. E.)
    static void dispResult(int[] num){
        try{
            System.out.println(num[1] / (num[1] - num[2]));
        } catch(ArithmeticException e){
            System.err.println("first exception");
        }
        System.out.println("Done");  //jesli "ArithmetiException" by zlapal, to najpierw sie wyswietla: "Done", a nastepnie: "first exception"
    }
    public static void main(String[] args){
        try{
            int[] arr = {100, 100};  //tu nawiasy byly okragle "blad"
            dispResult(arr);
        } catch(IllegalArgumentException e) {
            System.err.println("second exception");
        } catch(Exception e) {
            System.err.println("third exception"); // Prawidlowy wynik to: "third exception" jedynie
        }
        //System.out.println("cztery"); //to sie pierwsze wyswietlilo...pod warunkiem ze exception zlapie
    }
128.
https://stackoverflow.com/questions/35515099/how-many-objects-are-created-in-the-memory-runtime
public class MarkList {
    int num;
    public static void graceMarks(MarkList obj4){
        obj4.num += 10;
    }

    public static void main(String[] args) {
        MarkList obj1 = new MarkList();  //tylko 1 obiekt jest stworzony. Konstruktory tylko tworza obiekty! inne rzeczy to sciema.
        MarkList obj2 = obj1;
        //MarkList obj1 =  null; //to krzyczy bledem poniewaz obj1 jest juz zdefiniowane
        obj2.num = 60;
        graceMarks(obj2);
        System.out.println(obj2.num);  //70 wyswietli
    }
}

129.
public class X implements Z{
    public String toString(){
        return "X";
    }

    public static void main(String[] args) {
        Y myY = new Y();
        X myX = myY;
        Z myZ = myX;
        System.out.print(myX);
        System.out.print((Y)myX);
        System.out.print(myZ);
    }
}
--
public class Y extends X{
    @Override
    public String toString() {
        return "Y";
    }
}
--
public interface Z {

String toString();

}

130.
public class Patient {
    String name;
    public Patient (String name){
        this.name = name;
    }
}
--
public class Test{
    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
        ////////insert code here
        //int f = ps.indexOf(Patient("Mike")); //nie
        //int f = ps.indexOf(new Patient("Mike")); //nie
        //Patient p = new Patient("Mike"); int f = pas.indexOf(p); //bzdura
        int f = ps.indexOf(p2);


        if(f >= 0){
            System.out.print("Mike Found");
        }else{
            System.out.println("not found");
        }
    }
}
--
131.
public class Test {
    public static void main(String[] args) {
        try{
            String[] arr = new String[4];
            arr[1]="Unix";
            arr[2]="Linux";
            arr[3]="Solarios";
            for (String var : arr){
                System.out.print(var + " ");
            }
        }catch(Exception e){
            System.out.print(e.getClass());
        }
    }
}
//da: null Unix Linux Solaris
--
132.
public class Series {
    private boolean flag;
    public void displaySeries(){
        int num = 2;
        while(flag){
            if(num%7 == 0)
                flag = false;
            System.out.print(num);
            num += 2;
        }
    }

    public static void main(String[] args) {
        new Series().displaySeries();
    }
}
--
133.
public interface CanFly {
    String type = "A";

    void fly();

    default String getType() {
        return type;
    }
}

134.
default?   czy w obu: interface i abstract class? tylko interface
--
135.
public class MyFor3 {
    public static void main(String[] args) {
        int[] xx = null;
        for(int ii : xx){
            System.out.println(ii);
        }
    }
}
odp. C = an exception is thrown at runtime
--
136.
public class TestLoop {
    public static void main(String[] args) {
        float myarray[] = {10.20f, 20.30f, 30.40f, 50.60f};
        int index = 0;
        boolean isFound = false;
        float key = 30.40f;
        //insert code here
        while(index < 4){
                if(key == myarray[index]) {
                    isFound = true;
                    break;
                }
            index++;
        }
        System.out.println(isFound);
    }

}
odp.: d...czyli ten kond w //insert

137.
Sub.java
public class Sub extends Base {
    public static void main(String[] args) {
        System.out.println("Overriden " + args[1]);
    }
}
//Odp.: java Sub 10 20 30 => Overriden 20
--
public class Base {
    public static void main(String[] args) {
        System.out.println("Base " + args[2]);
    }
}
--
138.
public class SpecialException extends Exception {
    public SpecialException(String message) {
        super(message);
        System.out.println(message); //to jest dodatkowei wypisuje message najpierw
    }
}
--
public class ExceptionTest {
    public static void main(String[] args) {
        try{
            doSomething();
        }catch(SpecialException e){
            System.out.println(e);
        }catch(Exception ex){  //dodaje dla testow
            System.out.println(ex); //to by dalo: java.lang.ArrayIndexOutOfBoundsException: 4
        }
    }
    static void doSomething() throws SpecialException{
        int[] ages = new int[4];
        ages[4] = 17; //podchwytliwe, brak przeciez 4go elementu
//        ages[3] = 17;
        doSomethingElse();
    }
    static void doSomethingElse() throws SpecialException{
        throw new SpecialException("Thrown at end of doSomething() method");
    }
}
//da: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
//po korekcie tablicy da:
//Thrown at end of doSomething() method
//SpecialException: Thrown at end of doSomething() method   //tak wyglada prawidlowo zlapane exception
--
139.
public interface Contract {
}
public class Super implements Contract {
}
public class Sub extends Super {
}
import java.util.ArrayList;
import java.util.List;

public class Ref {
    public static void main(String[] args) {
        List objs = new ArrayList();
        Contract c1 = new Super();
        Contract c2 = new Sub();   //line n1
        Super s1 = new Sub();
        objs.add(c1);
        objs.add(c2);
        objs.add(s1);   //line n2
        for(Object itm:objs){
            System.out.println(itm.getClass().getName()); //pieknie pokazuje nazwe klasy
        }

    }
}
---
140.
public class Test {
    public static void main(String[] args) {
        Test ts = new Test();
        System.out.println(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }
    public static boolean doStuff(){
        return !isAvailable;
    }
    static boolean isAvailable = false;
}
---
141.
public class Msg {
    public static String doMsg(char x){
        return "Good Day!";
    }
    public static String doMsg(int y){
        return "Good Luck!";
    }

    public static void main(String[] args) {
        char x = 8; //'8' to by dalo 8 jako char, a tak to jest pustka
        int z = '8'; //tu nie moze byc np. A, ale 'A' juz tak.
        System.out.println(doMsg(x));
        System.out.print(doMsg(z));
    }

}
---
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>inne:
public class Test {
    public static final int MIN = 1;

    public static void main(String[] args) {
        int x = args.length;
        if(checkLimit(x)){//line n1
            System.out.println("Java SE");
        }else{
            System.out.println("Java EE");  //ok
        }
    }
    public static boolean checkLimit(int x){
        return (x >= MIN)? true : false;
    }
}
---
            int data [] = {2010,2013,2014,2015,2014};
            int key = 2014;
            int count = 0;
            for(int e : data)
            {
                System.out.println(e);
                if (e!=key)
                {
                    //continue; // if continue is commented 3 is answer
                    count++; //unreachable statment
                }
            }

            System.out.println(count + "Found");
---
        int [] stack = {10,20,30};
        int size = 3;
        int idx = 0;
        System.out.println("The top Element 1:" +stack[idx]);
        do
        {
            idx++;
        }
        while (idx < size-1); //ok
        System.out.println("The top Element :" +stack[idx]);
---
Which three statements are true about exception handling?
a.only unchecked exceptions can be rethrown.                //false
b.All subclasses of the RuntimeException class are recoverable. //true
c.The parameter in a catch black is of Throwable type.      //true
d.All subclasses of the RuntimeException class must be caught or declared to be thrown. //false
e.All subclasses of the Exception class except the RuntimeException class are checked exceptions. //true
f.All subclasses of the Error class are checked exceptions and are recoverable. //false

---
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);  //to usunie
        points.add(4);
        points.add(null);  //to usunie
        points.remove(2);   //podchwytliwe !!!
        points.remove(null);
        System.out.println(points);


------------------
package p1;

public class A {
}
--
package p1.p2;

import p1.A;

public class B {   //gdy jest extends A...to tez wymaga to import-u
    public void doStuff(){
        A b = new A();      //to wymaga: import p1.A;
    }
}
--
package p3;

import p1.A;
import p1.p2.B;

public class C {
    public static void main(String[] args) {
        A 01 = new A();     //to wymaga import: import p1.A;
        B 02 = new B();   //to wymaga import: import p1.p2.B;
    }
}
------------------
public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age){   //brakuje bezparametrycznego = blad
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public Employee(String name, int age, int salary) {
        setSalary(salary);
        this(name, age);    //tu juz widze blad
    }
    //getters and setters methods for attributes go here
    public void printDetails(){
        System.out.println(name + " : " + age + " : " + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
--
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();  //brakuje bezparametrycznego blad
        Employee e2 = new Employee("Jack", 50) ; //tu bylo ("Jack, 50);
        Employee e3 = new Employee("Chloe", 40, 5000);
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}
----------
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try{
            for(String n: names){
                pwd[idx] = n.substring(2,6);
                idx++;
            }
        }
        catch(Exception e){
            System.out.println("Invalid Name");
        }

        for(String p: pwd){
            System.out.println(p);
        }
//output: Invalid Name
//        omas
//        null
//        null

        System.out.println("idziemy dalej");
-----------
public class Animal {
    String type = "Canine";
    int maxSpeed = 60;

    Animal(){}

    Animal(String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
--
public class WildAnimal extends Animal {
    String bounds;

    WildAnimal(String bounds){
        //line n1
        super();
        this.bounds = bounds;
    }
    WildAnimal(String type, int maxSpeed, String bounds){
        //line n2
        super(type,maxSpeed);
        this.bounds = bounds;

    }
}
--

        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);

//        A.
//                Replace line n1 with:
//        super ();
//        this.bounds = bounds;
//        E.
//                Replace line n2 with:
//        super (type, maxSpeed);
//        this.bounds = bounds;
//Canine 60 Long
//Feline 80 Short
--------------------
Which statement is true about the switch statement?
d.its expression must evaluate to a single value  //ok

--------------------
//terrary
        String stuff = "TV";
        String res = null;
        if (stuff.equals("TV")){
            res = "Walter";
        }else if(stuff.equals("Movie")) {
            res = "White";
        }else{
            res = "No Result";
        }
        System.out.println(res);

        //stuff.equals("TV")? res="Walter" : res="No Result";    //blad
        //stuff.equals("TV")? res="Walter" : stuff.equals("Movie")? res="White" : res="No Result";  ///blad bo zmienna res powinna byc na poczatku
        res = stuff.equals("TV")? "Walter" : stuff.equals("Movie")? "White" : "No Result";  //ok, POPRAWNIE
        int ala;
        ala = 5 > 3 ? 4 : 1; //ok, POPRAWNIE dla int
        System.out.println(stuff.equals("TV")? "Walter" : "No Result"); //ok: bo daje Stringa a w sout wchodzi String.
        res = stuff.equals("TV")? stuff.equals("Movie")?"Walter":"White":"No Result"; //No error. Ale logika nie poprawna.
---------------
        String str1 = "test";
        StringBuilder sb = new StringBuilder("test");
        StringBuilder sb1 = new StringBuilder(str1);
        //sb.deleteAll(); //blad
        //sb.delete(0,sb.size()); //blad
        sb.delete(0,sb.length()); //ok
        //sb.removeAll(); //blad
---------------
        boolean a = new Boolean("TRUE"); //da true
        System.out.println(a);
---------------
        String s = "Java Duke";
        int len = s.trim().length(); //String nie ma metod z method chaining!
        System.out.println(len);   //da 9
---------------
        int a = 9;
        if(a++ < 10){ //tu a=9
            System.out.println(a + " a < 10"); //tu a=10 UWAGA!!!
        }else{
            System.out.println(a + " a > 10");
        }
---------------
public class Vowel {
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';

        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);
    }
}
//da:
a, e
o, o
--------------
public class MyField {
    int x;
    int y;
    public void doStuff(int x, int y){
        this.x = x;
        y = this.y;
    }
    public void display(){
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;
        MyField m2 = new MyField();
        m2.doStuff(m1.x,m1.y);
        m1.display();
        m2.display();
    }
    //odp.: 100 200 : 100 0 :
}
--------------------
        try{
            int nim = 10;
            int div = 0;
            int ans = nim / div;
        }catch(ArithmeticException se){
            ans = 0;                //line n1
        }catch (Exception e) {
            System.out.println("Invalid calculation");
        }
        System.out.println("Answer = " + ans);  //line n2

        ///Compilation fails only at line n1 and line2.
        //ans - nie istnieje w tych catch oraz ponizej
-------------------
        public static void main(String... $n)
        System.out.println($n[0] + " " + $n[1]);  //ok
-------------------
        int s = 0;
        int s1 = 0;
        for (int i = 0; i < 10; i++) { //brak i++...infinitive loop
            i = i++;  //to nic nie zmienia. Dziwne! i = i + i, lub i = i + 1, lub i++... zmienia.
            //jesli brak i++ w for (; ; i++), to infinite loop. i = i++; nic nie zmienia(jakby i = i).
//            System.out.println(i);
//            s = s++;   //to jest zawsze 0
//            s += s;   //to jest zawsze 0
            s1 = s++; //to juz da 0-9
            System.out.println(s1);
        }
------------------
        int x = 5;
        while(x < 10){
            //x = x++; //niekonczaca petla...55555...
            x++; //ok. 6-10
            System.out.println(x);
        }
------------------
//skaplikowany temat ++ wewnatrz loop
        int x = 0 ;
        int y = 0 ;
        int z = 0 ;
        int end = 0;

        //do {
        for (int i = 0; i < 5; i++) {
            //end++;// = x + 1;
            //end = y++; //to jest bez znaczenia
            end = z++; //to jedynie jest brabe pod uwage: 0-4
            end = z++; //to da: 1 3 5 7 9
            end = z++; //to da: 2 5 8 11 14
            end = z++; //to da: 3 7 11 15 19 //czyli 1-loop: pierwszy ++ jest pomijany, a kazdy nastepny ++ sie liczy
                                            //2-loop: dodaje 4, poniewaz ++ x4 wystapily

            System.out.println(end);
        }
        //}while( x < 5);
------------------
String[] ala = new String[2];
        System.out.println(ala[0]); //ok. da: null
        //System.out.println(ala[0].concat(" element" + 0));//da NullPointerException
//        int idx = 0;
//        for (String s1 :
//                ala) {
//            ala[idx].concat(" element" + idx);  //da NullPointerException
//            idx++;
//        }
------------------
        //What is the output of the following code snippet?
                 int count = 0;
         ROW_LOOP: for(int row = 1; row <=3; row++)
             for(int col = 1; col <=2 ; col++) {
             if(row * col % 2 == 0) continue ROW_LOOP;
             count++;
             }
         System.out.println(count); //da 2
-----------------

        ///////////// switch - zasady:
        char grade = 'e';
        final char litera = 'c';  //final
        switch(grade){
            case 'a':
            case 'b':
            case litera:    //musi byc zmienna: final

        }
        /////////
        final String str = "ala";
        final String a1 = "a1";
        String start = "a1";
        switch(start){ //czyli.: tu nie musi byc zmienna typu: final
            case "a2":
            case a1:
            case str: //natomiast w "case": juz musi byc typu: final

        }
------------------





























---
>>>>>>>>>>>>>>>Rozne inne, ciekawe testy:
---
1.) Exception, oraz Varaiable ... jak to sie ma?
a.)
        try{
            Double number = Double.valueOf("120D");  //da 120.0
        }catch(NumberFormatException ex){
            System.out.println( ex + " " + number); //number - tu nie istnieje
        }
        System.out.println(number);  //number - tu tez nie istnieje
b.)

---
2.)  Testy
a.) Test - na klase.metode z argumentem String
public class Jakas {  //najedz na nazwe klasy i Alt+Enter -> Create Test
    static String inPut(String co){
        return "to";
    }
}
--
import org.junit.Assert;

import static org.junit.Assert.*;

public class JakasTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void inPut() {
        String back = Jakas.inPut("cos");
        Assert.assertEquals("bledny wynik","do",back);  //test na Stringu
//        Output:
//        org.junit.ComparisonFailure: bledny wynik
//        Expected :do
//            Actual   :to
    }
}
b.)
---
3.) ArrayList + wrzucanie roznych zmiennych
//////////////// ArrayList - investigation
        ArrayList myList = new ArrayList();
        String[] myArray;
        String str = "jakas tam zawartosc";
        //int innn = 56;
        char innn = 56;
        myList.add(innn);
        System.out.println(myList);
---
4.)     String = int + "";
        /////////////////
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = "" + numFish + 1; //da 41tuna, Natomiast: numFish + 1 + ""; //dalo by 5tuna
        System.out.println(anotherFish + fishType);

5.)     equals on (Array vs ArrayList)
        ///////////////////////////////
        int[] array1 = new int[2];
        int[] array2 = new int[2];
        System.out.println(array1.equals(array2)); //false, two Arrays are not equal
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        System.out.println(arrayList1.equals(arrayList2));//true, two ArrayList-s are equal, czyli the same element in the same order.
        arrayList1.remove(0); //Compiler ominie, Runtime - zlapie Exception: IndexOutOfBoundsException
        //The compiler does not know when an index is out of bounds and thus can’t give you a compiler error. The code will throw an exception at runtime, though.
---
6.)     Sortowanie Arrays - przy uzyciu Collections.sort
        //////////////////////////
                List<Integer> list = Arrays.asList(10, 4, -1, 5); //Array do List-y
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]); //spowrotem do Array
        System.out.println(array[0]);
---
7.)     Sort + Array
        /////////////////////////
        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        Arrays.sort(random); //sortuje
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
---
8.)     Sort + Array + kolejnosc hex
        ///////////////////////////
        List<String> hex = Arrays.asList("30", "8", "3A", "FF"); //kolejnosc: 0 2 1 3
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);  //2 1 -3
---
9.) /////////////// Vararg  vs tablica []   - analiza

    //public static String howMany(boolean[] b, boolean... b2){
    public static String howMany(boolean[] b, boolean[] b2){

        return b.length + " " + b2.length;
    }


//public static void main(String[] args, int... cosVarrag) { //blad, Error: Main method not found in class main, please define the main method as:
        public static void main(String[] args) {

            boolean[] aba = new boolean[5];
            int a[] = new int[5];
            a = new int[]{1,2,3,4,5};
            aba = new boolean[]{true,false}; //sposob wypelniania
            System.out.println(howMany(aba,new boolean[]{false,true}));
            System.out.println(howMany(aba,new boolean[2])); //przekazanie parametrow do Vararg

---
10.)



 */
