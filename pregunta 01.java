/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        // Crear dos objetos inicializados
        Hora hora1 = new Hora(5, 30, 45);
        Hora hora2 = new Hora(3, 35, 20);

        // Crear un objeto no inicializado ( sin valores)
        Hora resultadoHora = new Hora();

        // Visualizar las horas iniciales
        System.out.println("Hora 1: ");
        hora1.visualizarHora();
        System.out.println("Hora 2: ");
        hora2.visualizarHora();

        // Sumar las dos horas inicializadas y dejar el resultado en el objeto no inicializado
    
        resultadoHora.sumarHoras(hora1);
        resultadoHora.sumarHoras(hora2);
        // acá se invoca el método 
    }
}