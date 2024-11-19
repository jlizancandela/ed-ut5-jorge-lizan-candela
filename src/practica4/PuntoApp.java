package practica4;

public class PuntoApp {
    public static void main(String[] args) {
        // Inicializo dos puntos y la variable para almacenar el resultado de la distancia euclidea
        Punto punto1,punto2;
        double resultado;

        punto1 = new Punto(3,4);
        punto2 = new Punto(4,10);

        // Desplazo los puntos
        punto1.desplazaX(1);
        punto2.desplazaY(4);
        // Los desplazo a donde estaban antes. Deberían volver a posición inicial.
        punto1.desplaza(-1,0);
        punto2.desplaza(0,-4);
        // Muestro sus posiciones
        punto1.muestra();
        punto2.muestra();

        // Almaceno el resultado del cálculo de la distancia Euclidea entre los dos puntos y lo muestro por pantalla.
        resultado = punto1.distanciaEuclidea(punto2);

        System.out.printf("La distancia Euclidea entre el punto 1 y el punto 2 es %.2f\n",resultado);
    }
}
