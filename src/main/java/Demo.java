import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Date());

        System.out.println(getDate());
    }
    public static Long getDate(){
        return new Date().getTime();
    }
}
