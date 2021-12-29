import java.util.ArrayList;

public class Musica {
        
    public PreguntasRespuestas pregunta1(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual de los siguientes es un genero Colombiano?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Reggaeton");
        opciones.add("Blues");
        opciones.add("Polca");
        opciones.add("Cumbia");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Cumbia");
        return pr;
    }
    public PreguntasRespuestas pregunta2(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("De que pais es la banda Soda Stereo?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Rusia");
        opciones.add("Argentina");
        opciones.add("Chile");
        opciones.add("Africa");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Argentina");
        return pr;
    }
    public PreguntasRespuestas pregunta3(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("El violonchelo es un instrumento de?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Viento");
        opciones.add("Electrico");
        opciones.add("Cuerda");
        opciones.add("Percusion");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Cuerda");
        return pr;
    }
    public PreguntasRespuestas pregunta4(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Que instrumento tocaba Jimi Hendrix?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Guitarra");
        opciones.add("Timbales");
        opciones.add("Trompeta");
        opciones.add("Marimba");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Guitarra");
        return pr;
    }
    public PreguntasRespuestas pregunta5(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("A que banda pertenece la cantante Nanna Bryndis?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Hermanos Lebron");
        opciones.add("White Stripes");
        opciones.add("Kabah");
        opciones.add("Of Monsters and Men");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Of Monsters and Men");
        return pr;
    }
}
