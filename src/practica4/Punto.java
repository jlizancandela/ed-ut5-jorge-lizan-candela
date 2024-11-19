package practica4;

// Clase que representa un punto en un plano cartesiano
public class Punto {
    double x, y; // Coordenadas del punto

    // Constructor que inicializa el punto con las coordenadas dadas
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para desplazar el punto en el eje X
    public void desplazaX(double dx) {
        this.x += dx;
    }

    // Método para desplazar el punto en el eje Y
    public void desplazaY(double dy) {
        this.y += dy;
    }

    // Método para desplazar el punto en ambos ejes
    public void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Calcula la distancia entre este punto y otro
    public double distanciaEuclidea(Punto otro) {
        return Math.sqrt(
                Math.pow(otro.x - this.x, 2) + Math.pow(otro.y - this.y, 2)
        );
    }

    // Muestra las coordenadas del punto
    public void muestra() {
        System.out.printf("Posición del Punto x: %.2f y: %.2f\n", this.x, this.y);
    }
}
