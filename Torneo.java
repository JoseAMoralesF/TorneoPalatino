package Modelar;

public class Torneo {
    
    private Equipos Equipo1;
    private Equipos Equipo2;
    private Equipos Equipo3;
    private Equipos Equipo4;
    private Equipos Equipo5;

    public Equipos getEquipo1(){
        return Equipo1;
    }

    public void setEquipo1(Equipos Equipo1){
        this.Equipo1 = Equipo1;
    }

    public Equipos getEquipo2(){
        return Equipo2;
    }

    public void setEquipo2(Equipos Equipo2){
        this.Equipo2 = Equipo2;
    }

    public Equipos getEquipo3(){
        return Equipo3;
    }

    public void setEquipo3(Equipos Equipo3){
        this.Equipo3 = Equipo3;
    }

    public Equipos getEquipo4(){
        return Equipo4;
    }

    public void setEquipo4(Equipos Equipo4){
        this.Equipo4 = Equipo4;
    }

    public Equipos getEquipo5(){
        return Equipo5;
    }

    public void setEquipo5(Equipos Equipo5){
        this.Equipo5 = Equipo5;
    }

    //public int cantTotalGoles(){
         
    //}

    //public int cantTotalTirosEsquina(){

    //}

    //public int cantTotalAmarillas(){

    //}

    //public int cantTotalRojas(){

    //}

    public void HacerEquipo(){
        Equipos equipo1 = new Equipos();
        equipo1.setNombre("Los Angeles Azules");
    }
}
