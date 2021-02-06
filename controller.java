package hoja2main;

public class controller {
    view vi=new view();
    private Object popStack;
    private Object Vector;

    public void start(){
       vi.mainview();
        Vector = new Vector();
        popStack = new popStack<>();
    }


}
