package parcial;
public class EmpresaLacteos {
    private String Nombre, Nit;
    public EmpresaLacteos(String Nombre, String Nit){
        this.Nombre=Nombre;
        this.Nit=Nit;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getNit() {
        return Nit;
    }
    public void setNit(String Nit) {
        this.Nit = Nit;
    }
}
