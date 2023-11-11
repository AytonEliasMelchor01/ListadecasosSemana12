public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor
    public Hora(int horas, int minutos, int segundos) {
        establecerHora(horas, minutos, segundos);
    }

    // Métodos de acceso
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    // Método avanzar
    public void avanzar(int horas, int minutos, int segundos) {
        this.segundos += segundos;
        this.minutos += minutos;
        this.horas += horas;

        // Ajustar los minutos y las horas si los segundos superan 60
        if (this.segundos >= 60) {
            this.minutos += this.segundos / 60;
            this.segundos %= 60;
        }

        // Ajustar las horas si los minutos superan 60
        if (this.minutos >= 60) {
            this.horas += this.minutos / 60;
            this.minutos %= 60;
        }

        // Ajustar las horas si superan 24
        this.horas %= 24;
    }

    // Método ponerACero
    public void ponerACero() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Método visualizar
    public void visualizar() {
        System.out.println(horas+":" +minutos+":"+ segundos);
    }

    // Método para establecer la hora inicial de manera segura
    private void establecerHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Hora no válida. Estableciendo a cero.");
            ponerACero();
        }
    }
}