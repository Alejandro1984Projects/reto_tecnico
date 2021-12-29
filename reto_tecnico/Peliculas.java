import java.util.ArrayList;

public class Peliculas {
    public PreguntasRespuestas pregunta1(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Que transporte usaban en la pelicula Mundo Acuatico?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Caballos");
        opciones.add("Dragones");
        opciones.add("Cohetes");
        opciones.add("Botes");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Botes");
        return pr;
    }
    public PreguntasRespuestas pregunta2(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("A que pelicula pertenece el personaje Hermione Granger?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("El señor de los Anillos");
        opciones.add("Mi Pobre Angelito");
        opciones.add("Harry Potter");
        opciones.add("El Silencio de los Inocentes");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Harry Potter");
        return pr;
    }
    public PreguntasRespuestas pregunta3(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("En que se convertian las personas en El Amanecer de los Muertos?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Zombies");
        opciones.add("Unicornios");
        opciones.add("Sicopatas");
        opciones.add("Payasos");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Zombies");
        return pr;
    }
    public PreguntasRespuestas pregunta4(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Como se llama el personaje principal de Kung Fu Panda?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Maggy");
        opciones.add("Po");
        opciones.add("Sofy");
        opciones.add("Henry");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Po");
        return pr;
    }
    public PreguntasRespuestas pregunta5(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual es la ocupacion del personaje Neo en Matrix?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Artista");
        opciones.add("Deportista");
        opciones.add("Actor");
        opciones.add("Programador");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Programador");
        return pr;
    }
    
}
