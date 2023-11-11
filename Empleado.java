import java.util.Scanner;

class Empleado {
    private String nombre;
    private int numEmpleado;

  
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        this.nombre = scanner.nextLine();

        System.out.print("Número de empleado: ");
        this.numEmpleado = scanner.nextInt();
    }

  
    public void verDatos(int numero) {
        System.out.println("Empleado #" + numero + ":");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Número de empleado: " + this.numEmpleado);
    }
}