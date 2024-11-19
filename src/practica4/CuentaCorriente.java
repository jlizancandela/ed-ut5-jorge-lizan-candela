package practica4;

public class CuentaCorriente {
    private double saldo;
    private final String dni;
    private final String nombre;

    // Constructor para crear una cuenta con el DNI y el nombre del titular
    public CuentaCorriente(String dni, String nombre) {
        this.saldo = 0; // El saldo inicial es 0
        this.dni = dni;
        this.nombre = nombre;
    }

    // Método para ingresar dinero en la cuenta
    public void ingreso(double montante) {
        this.saldo += montante;
    }

    // Método para retirar dinero de la cuenta, retorna true si la operación es exitosa
    public boolean retiro(double montante) {
        if (this.saldo < montante) {
            return false; // No se puede retirar si el saldo es insuficiente
        }
        this.saldo -= montante;
        return true;
    }

    // Método que devuelve la información de la cuenta
    public String informacion() {
        // Usamos String.format para devolver la información en formato adecuado
        return String.format("Cuenta de %s con DNI %s, Saldo: %.2f €", this.nombre, this.dni, this.saldo);
    }
}
