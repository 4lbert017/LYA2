package AnalizadorL;

public class Enum {

    public enum Mes {
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE
    }

    public static void main(String[] args) {
        // Obtener el nombre del mes actual
        Mes mesActual = Mes.MAYO;
        System.out.println("El mes actual es: " + mesActual);

        // Comprobar si el mes actual es de verano (junio, julio o agosto)
        if (mesActual == Mes.JUNIO || mesActual == Mes.JULIO || mesActual == Mes.AGOSTO) {
            System.out.println("Estamos en verano.");
        } else {
            System.out.println("No estamos en verano.");
        }

        // Imprimir todos los meses
        System.out.println("Todos los meses del año:");
        for (Mes mes : Mes.values()) {
            System.out.println(mes);
        }
    }
}
