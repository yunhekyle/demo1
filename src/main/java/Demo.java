import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Date());

        System.out.println(getDate());

        System.out.println(hello());
    }
    public static Long getDate(){
        return new Date().getTime();
    }
    public static String hello(){
        return "hellojavaworld";
    }

}
