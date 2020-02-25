import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestLambda {     //lambda example
    public static void  checkAge(List<PersonLambda> list, Predicate<PersonLambda> predicate){
        for (PersonLambda p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<PersonLambda> iList = Arrays.asList(new PersonLambda("Hank", 45),
                                            new PersonLambda("Charlie",40),
                                            new PersonLambda("Smith",38));
        //line n1
        //checkAge(iList,a->a.age > 40);  //to dziala, ale nie ma takiej odpowiedzi
        //checkAge(iList,p -> p.getAge()>40);  //to dziala
        //checkAge(iList,() -> p.getAge()>40);  //to nie dziala przez: pusty: (),
        checkAge(iList, p -> p.getAge()>40); //natomiast (p) lub p lub (PersonLambda p) juz dziala.
        //checkAge(iList,PersonLambda p -> p.getAge()>40); //brak nawiasu (PersonLambda p)
        //checkAge(iList,(PersonLambda p)->{return p.getAge()>40;}); //to dziala po korekcie: + return
    }
}
