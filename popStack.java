package hoja2main;

import java.util.ArrayList;

public class popStack<E> implements Stack<E>{
    ArrayList<E> stack = new ArrayList<E>();

    /***
     *
     * @param item: objeto para hacer el push
     */
    @Override
    public void push(E item) {
        stack.add(item);
    }

    /***
     *
     * @return
     */
    @Override
    public E pop() {
        E top=stack.get(stack.size()-1);
        stack.remove(stack.size()-1);

        return top;
    }

    /***
     *
     * @return
     */
    @Override
    public E peek() {
        E top=stack.get(stack.size()-1);
        return top;
    }

    /***
     *
     * @return list size is empty
     */
    @Override
    public boolean empty() {
        if (stack.size()==0) {
            return true;
        }
        else {
            return false;
        }
    }

    /***
     *
     * @return list size
     */
    @Override
    public int size() {
        int size=stack.size();
        return size;
    }
}
