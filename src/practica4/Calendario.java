package practica4;

public class Calendario {

    // Atributos de la clase: año, mes, día y el límite de días de un mes
    int anyo, mes, dia, tope;

    // Constructor de la clase Calendario, que inicializa los valores de año, mes y día
    public Calendario(int anyo, int mes, int dia) {
        // Se asigna el valor del tope de días para el mes correspondiente
        tope = diasTope(mes);

        // Condición para validar los valores de año, mes y día
        // Si los valores no son válidos, se establece una fecha por defecto (01/01/1)
        if (anyo < 1 || mes > 12 || mes < 1 || dia > tope || dia < 1) {
            this.dia = 1;
            this.mes = 1;
            this.anyo = 1;
            return;  // Termina la ejecución del constructor si la fecha es inválida
        }

        // Si los valores son válidos, se asignan al objeto Calendario
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    // Método privado que devuelve el número máximo de días de un mes
    private int diasTope(int mes) {
        // Se utiliza un switch para devolver el número de días dependiendo del mes
        return switch (mes) {
            case 4, 6, 9, 11 -> 30;  // Meses con 30 días
            case 2 -> 28;  // Febrero tiene 28 días (sin considerar años bisiestos)
            default -> 31;  // El resto de meses tienen 31 días
        };
    }

    // Método para incrementar un día en la fecha actual
    public void incrementarDia() {
        // Si al incrementar el día se supera el tope del mes, se reinicia el día y se incrementa el mes
        if ((this.dia + 1) > tope) {
            this.dia = 1;
            incrementarMes();
        } else {
            // Si no se supera el límite, simplemente se incrementa el día
            this.dia += 1;
        }
    }

    // Método para incrementar un mes en la fecha actual
    public void incrementarMes() {
        // Si al incrementar el mes se supera el mes 12, se reinicia el mes a enero y se incrementa el año
        if ((this.mes + 1) > 12) {
            this.mes = 1;
            incrementarAnyo(1);
        } else {
            // Si no se supera diciembre, simplemente se incrementa el mes
            this.mes += 1;
        }
    }

    // Método para incrementar el año por el número de años proporcionado
    public void incrementarAnyo(int anyos) {
        // Se suma la cantidad de años proporcionada al año actual
        this.anyo += anyos;
    }

    // Método para mostrar la fecha en formato dd/mm/aaaa
    public void mostrar() {
        System.out.printf("%02d/%02d/%d\n", dia, mes, anyo);
    }

    // Método para comparar si dos objetos Calendario tienen la misma fecha
    public boolean iguales(Calendario otraFecha) {
        // Compara el año, mes y día de las dos fechas
        return (
                this.anyo == otraFecha.anyo
                        && this.mes == otraFecha.mes
                        && this.dia == otraFecha.dia
        );
    }
}

