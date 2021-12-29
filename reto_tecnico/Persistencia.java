import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Persistencia {
    public void crear(Jugador jugador) {

        ArrayList<Jugador> listacrear=leerFichero();        
        listacrear.add(jugador);
        guardarFichero(listacrear);
        
    }
    public void guardarFichero(ArrayList<Jugador> guardarlista){

        try{
            ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("jugadores.txt"));
                    
            oos.writeObject(guardarlista);            
           
            oos.close();
        }
        catch(Exception e){}
    }
    public ArrayList<Jugador> leerFichero(){

        ArrayList<Jugador> nuevalista=new ArrayList<>();

        try{

            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("jugadores.txt"));
                      
            nuevalista=(ArrayList<Jugador>) ois.readObject();
                     
            ois.close();            
        }
        catch(Exception e){}

        return nuevalista;
    }
}
