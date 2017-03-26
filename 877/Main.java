import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
        long tempoInicio = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int pol = Integer.parseInt(sc.nextLine());
        sc.nextLine();

        while (pol > 0) {
            pol--;
            double offset = Double.parseDouble(sc.nextLine());
            int vertices = Integer.parseInt(sc.nextLine());
            System.out.println("vertices: "+vertices);
            double[] x = new double[vertices];
            double[] y = new double[vertices];
            int i = 0;
            double maxx = 0;
            double maxy = 0;
            while (vertices > 0) {
                vertices--;
                String values = sc.nextLine();
                System.out.println("String: " + values);
                String[] plot = values.split(" ");
                double dotx = Double.parseDouble(plot[0]);
                if (dotx > maxx) maxx = dotx;
                double doty = Double.parseDouble(plot[2]);
                if (doty > maxy) maxy = doty;
                x[i] = dotx;
                y[i] = doty;
                i++;
                //System.out.println(x + " " + y);
            }
            i = 0;
            while (i < vertices) {
                if (x[i] == maxx) {
                    
                }
            }
        }
        System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));
    }
}
