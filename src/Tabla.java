public class Tabla {
    int[] salarios = {82, 63, 36, 49, 56, 64, 59, 35, 78, 43, 51, 70, 57, 62, 43, 68, 62, 26, 64, 72, 52, 51, 62, 60, 71, 61, 55, 59, 60, 67, 57, 67, 61, 67, 51, 81, 50, 64, 76, 44, 73, 56, 62, 63, 60};

    int Max = 0;

    int min = salarios[0];

    int R = 0;

    int intervalos = 0;

    int amplitud = 0;

    public void cantidadSalario(){
        System.out.println("CANTIDAD DE DATOS (N): ");

        System.out.println(salarios.length);
    }

    public void maxSalario(){
        System.out.println("Maximo valor: ");

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > Max)
                Max = salarios[i];
        }
        System.out.println(Max);
    }

    public void minSalario(){
        System.out.println("Minimo valor: ");

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] < min)
                min = salarios[i];
        }
        System.out.println(min);
    }
    public void ranSalario(){
        System.out.println("Rango de Valores (R): ");
        R= Max - min;

        System.out.println(R);

    }
    public void interSalario(){
        System.out.println("Intervalo de Valores(K): ");

        intervalos = (int) ((1+Math.log(salarios.length))/Math.log(2));

        System.out.println(intervalos);

    }
    public void ampliSalario(){
        System.out.println("Amplitud (A): ");

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
}
