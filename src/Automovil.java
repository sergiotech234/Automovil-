public class Automovil {
    private String marca;
    private String modelo;
    private int anio;

    public static final int ANIO_PRIMER_AUTOMOVIL = 1886;

    public Automovil(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca==null||marca.trim().isEmpty()){
            System.out.println("ERROR: no puede estar vacio la marca");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo==null||modelo.trim().isEmpty()){
            System.out.println("ERROR: no puede estar vacio el modelo");
        }
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio<ANIO_PRIMER_AUTOMOVIL){
            System.out.println("Error: El año " + anio + " es inválido. Ningún automóvil puede ser anterior a " + ANIO_PRIMER_AUTOMOVIL + ".");
        }else {
            this.anio = anio;
        }

    }
    public void mostrarInformacion() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Año=" + anio +
                '}';
    }
}
