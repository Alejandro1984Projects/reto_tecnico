import java.util.ArrayList;

public class Deportes {
    public PreguntasRespuestas pregunta1(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual de los siguientes objetos pertenece al futbol?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Bolos");
        opciones.add("Raqueta");
        opciones.add("Balon");
        opciones.add("Bate");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Balon");
        return pr;
    }
    public PreguntasRespuestas pregunta2(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("En que pais nacio Messi");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Colombia");
        opciones.add("Peru");
        opciones.add("Mexico");
        opciones.add("Argentina");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Argentina");
        return pr;
    } 
    public PreguntasRespuestas pregunta3(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual de los siguientes es considerado un deporte de invierno?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Lucha");
        opciones.add("Snowboard");
        opciones.add("Natacion");
        opciones.add("Tenis");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Snowboard");
        return pr;
    }
    public PreguntasRespuestas pregunta4(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cuantas bases hay en el beisbol?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("4");
        opciones.add("1");
        opciones.add("7");
        opciones.add("3");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("4");
        return pr;
    }
    public PreguntasRespuestas pregunta5(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("En que pais nacio el futbol?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Rusia");
        opciones.add("Argentina");
        opciones.add("Inglaterra");
        opciones.add("España");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Inglaterra");
        return pr;
    }
}
