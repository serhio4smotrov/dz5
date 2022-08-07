import java.util.Arrays;

public class zad4 {
    public static void main(String[] args) {
        char[] reverseFullName = {'n','a','v','i',' ','v','o','n','a','v','i'};
        char p;
        for (int i = 0,k = 1;i < reverseFullName.length/2;i++,k++){
            p = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-k];
            reverseFullName[reverseFullName.length-k] = p;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}
