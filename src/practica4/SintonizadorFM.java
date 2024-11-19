package practica4;

public class SintonizadorFM {
    double Mhz;

    // Constructor con Frecuencia inicial de 80 Mhz
    public SintonizadorFM() {
        this.Mhz = 80;
    }

    // Constructor con Frecuencia opcional por parametro
    public SintonizadorFM(double Mhz) {
        /*
        Establece la frecuencia inicial dentro de los rangos permitidos.
        Si esta es inferior a 80 la establece a 80.
        Si esta es superior a 108 la establece a 108.
        Si el parametro está dentro de los rangos establece la frecuencia parametrizada.
         */
        this.Mhz = Mhz < 80
                ? 80
                : Mhz > 108
                ? 108
                : Mhz;
    }

    // Metodo que imprime por pantalla la frecuencia actual
    public void display() {
        System.out.printf("La frecuencia actual es %.1f Mhz\n", this.Mhz);
    }

    // Metodo que baja la frecuencia en 0.5 Mhz y comprueba si está dentro de los rangos permitidos.
    public void down() {
        this.Mhz -= 0.5;
        comprovarRango();
    }

    // Metodo que sube la frecuencia en 0.5 Mhz y comprueba si está dentro de los rangos permitidos.
    public void up() {
        this.Mhz += 0.5;
        comprovarRango();
    }

    /*
    Metodo que comprueba que la frecuencia este dentro de los rangos permitidos.
    Si esta es inferior a 80 la establece a 108.
    Si esta es superior a 108 la establece a 80.
    */
    private void comprovarRango() {
        if (this.Mhz < 80) {
            this.Mhz = 108;
        }

        if (this.Mhz > 108) {
            this.Mhz = 80;
        }
    }
}
