package hoja2main;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class popStackTest {

    ArrayList<String> stack=new ArrayList();

    @Test
    void push(String item) {
        stack.add(item);
    }

    @Test
    void pop() {
        String top=stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        System.out.println(top);
    }

    @Test
    void peek() {
       String top=stack.get(stack.size()-1);
       System.out.println(top);
    }

    @Test
    void empty() {
        boolean r;
        if (stack.size()==0) {
            r = true;
        }
        else {
            r =false;
        }
        System.out.println(r);
    }

    @Test
    void size() {
        int size=stack.size();
        System.out.println(size);
    }
}