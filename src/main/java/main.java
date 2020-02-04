import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //throw new NegativeArraySizeException()
        //LocalDateTime ldt = new LocalDateTime(20201010,121212);
        //LocalDateTime localDateTime;
        //System.out.println(LocalDateTime.now());




    }
}

/*
// passleader
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
str3 = str3+str;
}
boolean b1 = (str1 == str3);
boolean b2 = (str1.equals(str3));
System.out.print(b1+", "+b2);
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
3.) inne




 */
