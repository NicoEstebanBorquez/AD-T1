package concesionario;

public class Coche {

    private String marca;
    private String modelo;
    private int año;
    private String matricula;
    public static int contador_de_coches = 0;

    public Coche() {
        contador_de_coches++;
    }

    public Coche(String marca, String modelo, int año, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.matricula = matricula;
        contador_de_coches++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "> Marca: " + marca + "  -  Modelo: " + modelo + "  -  Año: " + año + "  -  Matricula: " + matricula + "\n";
    }
}
