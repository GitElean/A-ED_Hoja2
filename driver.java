package hoja2main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * @author elean
 */
public class driver {
    public static void main(String[] args) {
        controller c = new controller();
        /***
         * File charger
         */
        try {
            File myObj = new File("operacion.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        c.start();


    }
}
