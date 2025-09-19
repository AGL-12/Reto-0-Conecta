package controlador;

import java.util.List;
import modelo.ConvocatoriaExamen;
import modelo.Dao;
import modelo.DaoImplementMYSQL;
import modelo.Enunciado;
import modelo.UnidadDidactica;
import utilidades.Utilidades;

public class principal {

    private static Dao dao = new DaoImplementMYSQL();
    private List<Enunciado> listaEnunciado;
    private List<UnidadDidactica> listaUnidadDidactica;
    private List<ConvocatoriaExamen> listaConvocatoriaExamen;

    public static void main(String[] args) {

        int opc = 1;

        do {
            menu();
            opc = Utilidades.leerInt("Escoge la opcion deseada");
            switch (opc) {
                case 1:
                    crearUnidadDidactica();
                    crearConvocatoria();
                    break;
                case 2:
                    crearEnunciado();
                    break;
                case 3:
                    consultarEnunciado();
                    break;
                case 4:
                    consultarConvocatoria();
                    break;
                case 5:
                    visualizarTextoAsociado();
                    break;
                case 6:
                    asignarEnunciado();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

        } while (opc != 0);

    }

    private static void menu() {

        System.out.println("---MENU---");
        System.out.println("1.Crear Unidad Didactica y Convocatoria");
        System.out.println("2.Crear un Enunciado");
        System.out.println("3.Consultar Enunciados");
        System.out.println("4.Consultar Convocatoria");
        System.out.println("5.Visualizar texto asociado a un Enunciado");
        System.out.println("6.Asignar un Enunciado a una Convocatoria");
        System.out.println("0.Salir");

    }

    private static void crearUnidadDidactica() {

    }

    private static void crearConvocatoria() {

    }

    private static void crearEnunciado() {

    }

    private static void consultarConvocatoria() {

    }

    private static void consultarEnunciado() {

    }

    private static void visualizarTextoAsociado() {

    }

    private static void asignarEnunciado() {

    }

}
