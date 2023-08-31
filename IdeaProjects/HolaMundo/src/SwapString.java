import java.util.HashMap;
import java.util.Map;

public class SwapString {
    public static void main(String[] args) {
        String[] strings = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] answer = new String[strings.length];
        Map<String, String> swap = new HashMap<>();
        for(String val: strings){
            System.out.println("val = " + val);
            String a = val.substring(0,1);
            int uno = 0;
            uno++;

            for (String valDos : strings) {
                if (valDos.startsWith(a) && val.length() == valDos.length()){
                    System.out.println("valDos = " + valDos);
                    break;
                }

            }
        }
    }
}
