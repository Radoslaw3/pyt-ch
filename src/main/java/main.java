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


 */
