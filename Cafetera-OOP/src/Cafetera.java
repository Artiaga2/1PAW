/**
 * Created by artiaga on 1/2/17.
 */
public class Cafetera {

    private final int CANTIDAD_CAPSULA = 50;
    private int capacidadMaxima;
    private int cantidadActual;
    private int capsulas;

    //Constructores

    /**
     * Constructor sin parámetros. Se pone la capacidad máxima a 1000
     * y la cantidad actual a 0.
     */
    public Cafetera(){
        this(1000,0,10);

    }

    /**
     * Constructor con un parametro. Configura tanto la capacidad maxima
     * como la actual al valor indicado en el parametro
     * @param capacidadMaxima int Capacidad maxima y cantidad actual.
     */
    public Cafetera(int capacidadMaxima){

        this(capacidadMaxima, capacidadMaxima, 10);
    }

    /**
     * Constructor con dos parametros. Configura los atributos del objeto
     * segun los valores de los parametros
     * @param capacidadMaxima int Capacidad de la cafetera
     * @param cantidadActual int cantidad de la cafetera
     */
     //Constructor Designado : Porque recibe todos los parametros
    public Cafetera(int capacidadMaxima, int cantidadActual, int capsulas){
        //this.setCapacidadMaxima(capacidadMaxima);
        if (cantidadActual > capacidadMaxima){

            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = capacidadMaxima;

        }else{

            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = cantidadActual;

        }
        this.capsulas = capsulas;
    }

    //Accesores
    /**
     * Getter atributo capsulas.
     * @return int valor capsulas.
     */
    public int getCapsulas() {
        return capsulas;
    }
    /**
     * Setter atributo capsulas
     * @param capsulas int valor para el atributo capsulas
     */
    public void setCapsulas(int capsulas) {
        this.capsulas = capsulas;
    }

    /**
     * Getter atributo capacidad máxima.
     * @return int valor capacidad máxima.
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Setter atributo capacidad máxima
     * @param capacidadMaxima int valor para el atributo capacidad máxima
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Getter atributo cantidad Actual.
     * @return int valor cantidad Actual.
     */
    public int getCantidadActual() {
        return cantidadActual;
    }


    /**
     * Setter atributo capacidad máxima
     * @param cantidadActual int valor para el atributo cantidad Actual.
     */
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    /**
     *
     */
    public void llenarCafetera(){
        System.out.println("llenando cafetera...");
        this.cantidadActual = this.capacidadMaxima;

    }

    /**
     * Vacia la cafetera, es decir, establece la cantidad actual a 0
     */
    public void vaciarCafetera (){
        this.cantidadActual = 0;
        System.out.println("Refilllll!!!");
    }

    /**
     * sustrae la cantidad de cafe indicada por la taza (parámetro).
     */
    public void servirTaza(){
        if(CANTIDAD_CAPSULA < this.cantidadActual){
            this.cantidadActual -= CANTIDAD_CAPSULA;
        }else{
            this.vaciarCafetera();
            System.out.println("No te he servido la taza entera porque no hay suficiente cafe");

        }

    }

    /**
     * Agregar una coantidad de cafe.
     * @param cantidad int Cantidad de café agregada a la cafetera
     */
    public void agregarCafe(int cantidad){
        //Compruebo que no me excedo de la capacidad máxima
        // ni añado unacantidad negativa
        if (cantidad > 0 && cantidad < this.capacidadMaxima) {
            //Compruebo que la cantidad a añadir en la cafetera más
            // lo que ya hay no excede la cantidad máxima.
            if(cantidad + this.cantidadActual > this.capacidadMaxima) {
                this.llenarCafetera();
                System.out.println("Lo que sobra me lo bebo con unas gotitas de wisky");
            }
        }
    }
}
