package hoja2main;

public class Vector implements Icalculadora{

    /***
     *
     */
    public Vector(){}
    popStack ps= new popStack();

    /***
     *
     * @param input:es la salida de texto que proviene del txt
     * @return  la respuesta de la operacion
     */
    @Override
    public double resolver(String input) {
        double ans = 0;
        double p;
        double p2;
        int i=ps.size();
        for (int x=0;x>i;x++){
            p= (double) ps.pop();
            p2 =  (double) ps.pop();

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

        return ans;
    }


}
