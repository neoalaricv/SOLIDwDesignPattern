public class TestProgram {
    public static void main(String[] args){

        Student neo = new Student("Neo");
        Student alaric = new Student("Alaric");

        Book book1 = new Book("Introduction to Java");
        Journal journal1 = new Journal("Introduction to Python");

        Book book2 = new Book("Introduction to OOP");
        Journal journal2 = new Journal("Valorant");


        neo.borrowResource(book1);
        neo.borrowResource(journal1);

        System.out.println();

        alaric.borrowResource(book2);
        alaric.borrowResource(journal2);
    }
}