package Modelar;

public class Equipos {
    
    private String Nombre;
    private int Lugar;
    private int TirosEsquina;
    private int Ganados;
    private int Perdidos;
    private int TirosGol;
    private int Goles;
    private int TarjetaAmarilla;
    private int TarjetaRoja;
    private int Faltas;

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String nombre){
        this.Nombre = Nombre;
    }

    public int getLugar(){
        return Lugar;
    }

    public void setLugar(int Lugar){
        this.Lugar = Lugar;
    }

    public int getTirosEsquina(){
        return TirosEsquina;
    }

    public void setTirosEsquna(int TirosEsquina){
        this.TirosEsquina = TirosEsquina;
    }

    public int getGanados(){
        return Ganados;
    }

    public void setGanados(int Ganados){
        this.Ganados = Ganados;
    }

    public int getPerdidos(){
        return Perdidos;
    }

    public void setPerdidos(int Perdidos){
        this.Perdidos = Perdidos;
    }

    public int getTirosGol(){
        return TirosGol;
    }

    public void setTirosGol(int TirosGol){
        this.TirosGol = TirosGol;
    }

    public int getGoles(){
        return Goles;
    }

    public void setGoles(int Goles){
        this.Goles = Goles;
    }

    public int getTarjetaAmarilla(){
        return TarjetaAmarilla;
    }

    public void setTarjetaAmarilla(int TarjetaAmarilla){
        this.TarjetaAmarilla = TarjetaAmarilla;
    }

    public int getTarjetaRoja(){
        return TarjetaRoja;
    }

    public void setTarjetaRoja(int TarjetaRoja){
        this.TarjetaRoja = TarjetaRoja;
    }

    public int getFaltas(){
        return Faltas;
    }

    public void setFaltas(int Faltas){
        this.Faltas = Faltas;
    }

}
