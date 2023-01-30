import clientInterfaces.ServerTimeNotify;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        BackSequence beckSequence =new BackSequence("Epam University");

        System.out.println(beckSequence.toString());

        System.out.println(beckSequence.charAt(3));

        System.out.println(beckSequence.subSequence(1,12));

        System.out.println(beckSequence.length());
    }

}
