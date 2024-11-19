package practica4;


public class SintonizadorFMApp {
    public static void main(String[] args){
        // se inicializan los tres sintonizadores por defecto, a 107 Mhz y a 200 Mhz
        SintonizadorFM sintonizador1,sintonizador2,sintonizador3;

        sintonizador1 = new SintonizadorFM();
        sintonizador2 = new SintonizadorFM(107);
        sintonizador3 = new SintonizadorFM(200);

        // Se sube 1 Mhz el primero
        sintonizador1.down();
        sintonizador1.down();
        // Se sube 2 Mhz el segundo
        sintonizador2.up();
        sintonizador2.up();
        sintonizador2.up();
        sintonizador2.up();
        // Se imprime la frecuencia actual de los 3
        sintonizador1.display();
        sintonizador2.display();
        sintonizador3.display();
    }
}
