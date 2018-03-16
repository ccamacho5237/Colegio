package colegio;

public class Perros {
    private final String Nombre;
    private final String Raza;
    private final String Localidad;
    private final String Nombre_Dueño;
    private final Integer Cedula_Dueño;
    private final Integer Telefono;
    private final String Asistencia;
    private Integer Visto;
    
    public Perros(String Nombre, String Raza, String Localidad, String Nombre_Dueño, Integer Cedula_Dueño, Integer Telefono, String Asistencia,Integer Visto){
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Localidad = Localidad;
        this.Nombre_Dueño = Nombre_Dueño;
        this.Cedula_Dueño = Cedula_Dueño;
        this.Telefono = Telefono;
        this.Asistencia=Asistencia;
        this.Visto = Visto;
    } 
    public String getNombre(){
        return Nombre;
    }
    public String getRaza(){
        return Raza;
    }
    public String getLocalidad(){
        return Localidad;
    }
    public String getNombre_Dueño(){
        return Nombre_Dueño;
    }
    public Integer getCedula_Dueño(){
        return Cedula_Dueño;
    }
    public Integer getTelefono(){
        return Telefono;
    }
    public String getAsistencia(){
        return Asistencia;
    }
    public Integer getVisto(){
        return Visto; 
    }
    public void setVisto(Integer Visto){
        this.Visto = Visto;
    }
    public static void Localidad(Perros perro[], int cant){
        
        String localidad;
        int visto;
        int numero = 0;
        
        for(int x =0;x<cant;x++){
            localidad=perro[x].getLocalidad();
            visto=perro[x].getVisto();
            if(visto!=1){
                System.out.println("Localidad : "+localidad);
            }
            for(int y=0;y<cant;y++){
                visto=perro[y].getVisto();
                if(perro[y].getLocalidad().equals(localidad) && visto != 1){
                    numero++;
                    System.out.println("Perro : "+ numero);
                    System.out.println("Nombre : " + perro[y].getNombre() +"\n" + "Raza : " +  perro[y].getRaza() + "\n"+
                            "Nombre del dueño : " + perro[y].getNombre_Dueño() + "\n"+"Cedula del Dueño : " + perro[y].getCedula_Dueño().toString() 
                            + "\n" + "Telefono : " + perro[y].getTelefono().toString() + "\n" +"Dia de Asistencia : " + perro[y].getAsistencia());
                    perro[y].setVisto(1);
                }
            }
            numero=0;
        }
    }
    @Override
    public String toString(){
        return "Nombre : " + Nombre +"\n" + "Raza : " +  Raza + "\n" +"Localidad : " + Localidad +"\n"+"Nombre del dueño : " + Nombre_Dueño + "\n"+
                "Cedula del Dueño : " + Cedula_Dueño + "\n" + "Telefono : " + Telefono + "\n" +"Dia de Asistencia : " + Asistencia;
    }
}
