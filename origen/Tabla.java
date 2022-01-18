import java.util.Scanner;

public class Tabla {
    
    
    int[] salarios = {};
    int Max = 0;
    int min = salarios[0];
    int R = 0;
    int intervalos = 0;
    int amplitud = 0;
    
    Scanner salario = new Scanner(System.in);

    for(int i=0; i<3; i++)
        
    private final Scanner entra = null;

    {
        System.out.println("escriba los numeros de la tabla");
        for(int j=0; j<3; j++){
            int[] salarios = entra.nextInt();
        }
    }

    public void cantidadSalario(){
        System.out.println("NUMERO DE DATOS (N): ");

        System.out.println(salarios.length);
    }

    public void maxSalario(){
        System.out.println("El maximo valor: ");

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > Max)
                Max = salarios[i];
        }
        System.out.println(Max);
    }

    public void minSalario(){
        System.out.println("El Minimo valor: ");

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] < min)
                min = salarios[i];
        }
        System.out.println(min);
    }
    public void ranSalario(){
        System.out.println("Rango: ");
        R= Max - min;

        System.out.println(R);

    }
    public void interSalario(){
        System.out.println("Intervalo: ");

        intervalos = (int) ((1+Math.log(salarios.length))/Math.log(2));

        System.out.println(intervalos);

    }
    public void ampliSalario(){
        System.out.println("Amplitud: ");

        amplitud = R/intervalos;

        System.out.println(amplitud);

    }
    public static void main(String[] args){
        Tabla salario = new Tabla();

        salario.cantidadSalario();
        salario.maxSalario();
        salario.minSalario();
        salario.ranSalario();
        salario.interSalario();
        salario.ampliSalario();

    }
    System.out.println("la transpuesta de esta matriz es: ");
        for(int i=0; i<100; i++){
        {
            System.out.print(int[]salarios + "\t" );
        }
        System.out.println("");
    }
}
