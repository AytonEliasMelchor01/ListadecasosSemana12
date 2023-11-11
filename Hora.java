
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor que inicializa los datos a 0
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor que inicializa los datos a valores dados por el usuario
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Método para visualizar la hora en formato HH:MM:SS
    public void visualizarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    // Método para sumar dos objetos de tipo Hora y visualizar el resultado
    public void sumarHoras(Hora hora2) {
        this.segundos += hora2.segundos;
        this.minutos += hora2.minutos;
        this.horas += hora2.horas;

        // ponemos las condiciones que deben seguir para que la hora resultante sea correcta 
        if (this.segundos >= 60) {
            this.segundos -= 60;
            this.minutos += 1;
        }

        if (this.minutos >= 60) {
            this.minutos -= 60;
            this.horas += 1;
        }

        System.out.println("Resultado de la suma: ");
        visualizarHora();
    }
}