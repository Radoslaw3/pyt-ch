public class main {

}

/*
// passleader
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



 */
