import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Interfaz {
    
    public String mostrarPregunta(PreguntasRespuestas objeto){
        String pregunta=objeto.getPregunta();
        String [] opciones={objeto.getOpciones().get(0),objeto.getOpciones().get(1),
            objeto.getOpciones().get(2),objeto.getOpciones().get(3),"Guardar y Salir"};
        int opcion=JOptionPane.showOptionDialog(null, pregunta, "Concurso de Preguntas y Respuestas", 0, 3, null, opciones, "");
        if(opcion>=0){
        if(opciones[opcion].equals(objeto.getOpcionCorrecta())){
            return "correcto";
        }else
        if(opciones[opcion].equals("Guardar y Salir")){
            return "salir";
        }else  return "null";
    }else  return "null";
    }
    public String guardarNombre(){
        String nombre="";
        nombre=JOptionPane.showInputDialog("Ingresa un nombre");
        return nombre;
    }
    public int escogerCategoria(){
        String [] categorias={"Deportes","Lugares","Musica","Naturaleza","Peliculas"};
        int numero=JOptionPane.showOptionDialog(null, "Escoge una categoria", "Concurso de Preguntas y Respuestas", 0, 3, null, categorias, "");
        return numero;
    }
    public void ganaste(){
        JOptionPane.showMessageDialog(null,"Ganaste");
    }
    public void mostrarJugadores(ArrayList<Jugador> lista){
        String jugadores="";
        jugadores+="Lista de Jugadores\n\n";
        for (Jugador jugador : lista){
            jugadores+="Nombre: ";
            jugadores+=jugador.getNombre()+"\n";
            jugadores+="Categoria: ";
            jugadores+=jugador.getCategoria()+"\n";
            jugadores+="Puntaje: ";
            jugadores+=jugador.getPuntaje()+"\n";
        }
        JOptionPane.showMessageDialog(null,jugadores);
    }
}
