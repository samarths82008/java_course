import javax.xml.transform.Result;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[]  args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1+2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);


    }
}

