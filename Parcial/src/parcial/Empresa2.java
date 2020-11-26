package parcial;
import javax.swing.JOptionPane;
public class Empresa2 extends EmpresaLacteos{
    private String NumVehiculo, NumProductos, Sucursal;
    public Empresa2(String NumVehiculo, String NumProductos, String Sucursal, String Nombre, String Nit) {
        super(Nombre, Nit);
        this.NumVehiculo = NumVehiculo;
        this.NumProductos = NumProductos;
        this.Sucursal = Sucursal;
    }
    public String getNumVehiculo() {
        return NumVehiculo;
    }
    public void setNumVehiculo(String NumVehiculo) {
        this.NumVehiculo = NumVehiculo;
    }
    public String getNumProductos() {
        return NumProductos;
    }
    public void setNumProductos(String NumProductos) {
        this.NumProductos = NumProductos;
    }
    public String getSucursal() {
        return Sucursal;
    }
    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null, "En la sucursa #1 de"+getSucursal()
                +"\nLlamada: "+getNombre()
                +"\nIdentificada con nit:"+getNit()
                +"\nSe encuentran "+getNumVehiculo()
                +"numero de empleados\ny se encuentra una variedad de "+getNumProductos());
    }
}