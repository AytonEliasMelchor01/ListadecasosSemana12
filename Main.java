public class Main {
    public static void main(String[] args) {
        
        Empleado[] empleados = new Empleado[50];

      
        for (int i = 0; i < 50; i++) {
            empleados[i] = new Empleado();
            System.out.println("\nIngrese los datos del empleado #" + (i + 1) + ":");
            empleados[i].leerDatos();
        }

     
        System.out.println("\nDatos de todos los empleados:");
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].verDatos(i + 1);
            System.out.println("-------------------------");
        }
    }
}







