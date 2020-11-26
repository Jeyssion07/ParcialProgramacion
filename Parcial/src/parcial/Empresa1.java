package parcial;
import javax.swing.JOptionPane;
public class Empresa1 extends EmpresaLacteos {
    private String ProdInsignia, Sucursal, NumEmpleados;

    public Empresa1(String ProdInsignia, String Sucursal, String NumEmpleados, String Nombre, String Nit) {
        super(Nombre, Nit);
        this.ProdInsignia = ProdInsignia;
        this.Sucursal = Sucursal;
        this.NumEmpleados = NumEmpleados;
    }
    public String getProdInsignia() {
        return ProdInsignia;
    }
    public void setProdInsignia(String ProdInsignia) {
        this.ProdInsignia = ProdInsignia;
    }
    public String getSucursal() {
        return Sucursal;
    }
    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }
    public String getNumEmpleados() {
        return NumEmpleados;
    }
    public void setNumEmpleados(String NumEmpleados) {
        this.NumEmpleados = NumEmpleados;
    }
    
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null, "En la sucursa #1 de"+getSucursal()
                +"\nLlamada: "+getNombre()
                +"\nIdentificada con nit:"+getNit()
                +"\nSe encuentran "+getNumEmpleados()
                +"numero de empleados\nSe encuentra su producto por excelencia "+getProdInsignia()+"\n");
    }
}