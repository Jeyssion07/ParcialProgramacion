package parcial;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
        Empresa1 Doña1 = new Empresa1("Queso Pera", "Doña Chele", "45", "Hatochips Ubaté", "100394284951");
        Empresa1 Doña2 = new Empresa1("Helado descremado consabor natural", "Doña Chele", "400", "Central Doña Chele Ubaté", "100394284951");
        Empresa2 Parlamat1 = new Empresa2("32", "400", "Parlamat", "ParlamatCol", "13342512523523");
        Empresa2 Parlamat2 = new Empresa2("25", "124", "Parlamat", "ParqueArgelia", "13342512523523");
        Doña1.MostrarDatos();
        Doña2.MostrarDatos();
        Parlamat1.MostrarDatos();
        Parlamat2.MostrarDatos();
    }
}
