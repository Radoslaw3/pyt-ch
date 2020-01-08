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
