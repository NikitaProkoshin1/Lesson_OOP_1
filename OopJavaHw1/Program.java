package OopJavaHw1;


public class Program {
    public static void main(String[] args) {

        Person alexey = new Person("Илья", "Никитин",
                30, "мужской", "женат","карие", "темные");
        Child nikita = new Child(15, "Никита", "Никитин");

        System.out.println(alexey);
        System.out.println(nikita);




    }
}