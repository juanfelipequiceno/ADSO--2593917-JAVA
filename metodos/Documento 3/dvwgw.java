import java.util.Scanner;

public class Municipios {

    static final int MAX_MUNICIPIOS = 1000;
    static final int MAX_DEPARTAMENTOS = 100;

    static Municipio[] municipios = new Municipio[MAX_MUNICIPIOS];
    static int numMunicipios = 0;

    static Departamento[] departamentos = new Departamento[MAX_DEPARTAMENTOS];
    static int numDepartamentos = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar municipio.");
            System.out.println("2. Ver lista de municipios.");
            System.out.println("3. Ver información municipio.");
            System.out.println("4. Registrar número de habitantes de un municipio.");
            System.out.println("5. Registrar altura sobre el nivel del mar de un municipio.");
            System.out.println("6. Ver lista de departamentos registrados.");
            System.out.println("7. Ver información de departamento.");
            System.out.println("8. Eliminar municipio.");
            System.out.println("9. Eliminar departamento.");
            System.out.println("10. Salir");
            System.out.println("Memoria disponible para " + (MAX_MUNICIPIOS - numMunicipios) + " municipios y " + (MAX_DEPARTAMENTOS - numDepartamentos) + " departamentos.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    registrarMunicipio();
                    break;
                case 2:
                    verListaMunicipios();
                    break;
                case 3:
                    verInformacionMunicipio();
                    break;
                case 4:
                    registrarNumeroHabitantes();
                    break;
                case 5:
                    registrarAlturaSobreNivelDelMar();
                    break;
                case 6:
                    verListaDepartamentos();
                    break;
                case 7:
                    verInformacionDepartamento();
                    break;
                case 8:
                    eliminarMunicipio();
                    break;
                case 9:
                    eliminarDepartamento();
                    break;
                case 10:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 10);
    }

    static void registrarMunicipio() {
        System.out.println("Ingrese el nombre del municipio:");
        String nombreMunicipio = sc.next();
        System.out.println("Ingrese el nombre del departamento al que pertenece:");
        String nombreDepartamento = sc.next();

        // Verificar si ya existe el municipio en el departamento
        Departamento departamento = buscarDepartamento(nombreDepartamento);
        if (departamento != null && buscarMunicipioEnDepartamento(nombreMunicipio, departamento) != null) {
            System.out.println("El municipio ya está registrado en el departamento.");
            return;
        }

        if (numMunicipios >= MAX_MUNICIPIOS) {
            System.out.println("No hay memoria disponible para registrar más municipios.");
            return;
        }

        Municipio municipio = new Municipio(nombreMunicipio, nombreDepartamento);
        municipios[numMunicipios] = municipio;
        numMunicipios++;

        // Si el departamento no existe, se registra
        if (departamento == null) {
            departamento = new Departamento(nombreDepartamento);
           
