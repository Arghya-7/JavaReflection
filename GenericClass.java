public class GenericClass {
    public static void main(String[] args) throws ClassNotFoundException {
//      Assigning class type of non primitive class
        Book book1 = new Book("Demo",1);
        Class<Book> onlyBookClass = (Class<Book>) book1.getClass();
        Class<?> stringClass = "abc".getClass();
        Class<?> bookClass = new Book("Arghya's book",10000).getClass();

        Class<?> integerClass = int.class;


//      Assigning class by directly module name
        Class<?> packegedBookClass = Class.forName("Book");
    }
}
class Book{
    String name;
    int price;
    public Book(String name,int price){
        this.name = name;
        this.price = price;
    }
}
