public class Main{   
   
    public static void main(String[] args) {
        Hora horaActual = new Hora(12, 30, 45);

        System.out.println("Hora actual:");
        horaActual.visualizar();

        System.out.println("\nAvanzar 1 hora, 15 minutos y 30 segundos:");
        horaActual.avanzar(2, 15, 30);
        horaActual.visualizar();

        System.out.println("\nPoner a cero:");
        horaActual.ponerACero();
        horaActual.visualizar();
    }
}






