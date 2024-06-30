import java.util.ArrayList;
import java.util.List;

public class ClassIteration {
    public static void main(String[] args) throws ClassNotFoundException {
        iterationOfClass(int.class,SEX.class,Class.forName("Male"),"Hello Arghya".getClass());

//        Here it deals with objects. Not parent class. So here it will result ArrayList not List
        List<Integer> list = new ArrayList<>();
        iterationOfClass(list.getClass());
    }
    public static void iterationOfClass(Class<?> ... classes){
        for(Class<?> clazz:classes){
            System.out.println("Class name:"+ clazz.getSimpleName());
            System.out.println("Package name:" + clazz.getPackageName());
            System.out.println("Instance classes are:");
            Class<?> []instanceClass = clazz.getInterfaces();
            for(Class<?> inheritor:instanceClass){
                System.out.println(inheritor.getSimpleName());
            }
            System.out.println("=====================");
        }
    }
}
interface Person{
    String getName();
}
class Male implements Person{
    public String getName(){
        return "Arghya";
    }
}
enum SEX{
    MALE,
    FEMALE
}