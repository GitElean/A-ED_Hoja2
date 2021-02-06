package hoja2main;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
    void resolver() {
        ArrayList <String> input=new ArrayList<>();
        input.add("+");
        input.add("-");
        input.add("*");
        input.add("/");
        int i=5; double p=2.5; double p2=1.87;
        double ans;
        for (int x=0;x>i;x++){


            if (input.equals("+")) {
                ans = p + p2;
            }


            if (input.equals("-")) {
                ans = p - p2;
            }


            if (input.equals("*")) {
                ans = p * p2;
            }


            if (input.equals("/")) {

                if (p2 != 0) {
                    double an = (p / p2);
                    ans = (int)an;
                } else {
                    System.out.println("error: Division por 0.");
                }

            }
        }
    }
}