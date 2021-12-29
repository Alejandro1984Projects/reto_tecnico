import java.util.ArrayList;

public class Lugares {
    public PreguntasRespuestas pregunta1(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("En que departamento queda Salto Del Tequendama?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Valle");
        opciones.add("Antioquia");
        opciones.add("Amazonas");
        opciones.add("Cundinamarca");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Cundinamarca");
        return pr;
    }
    public PreguntasRespuestas pregunta2(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual es el tunel vehicular mas largo de Colombia?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Tunel de La linea");
        opciones.add("Tunel de Oriente");
        opciones.add("Tunel del Toyo");
        opciones.add("Tunel de Occidente");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Tunel de La linea");
        return pr;
    }
    public PreguntasRespuestas pregunta3(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual es la montaña mas alta de Colombia?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Nevado del Huila");
        opciones.add("Nevado del Ruiz");
        opciones.add("Pico Simon Bolivar");
        opciones.add("Purace");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Pico Simon Bolivar");
        return pr;
    }
    public PreguntasRespuestas pregunta4(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual es la ciudad mas poblada de Colombia?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Medellin");
        opciones.add("Cali");
        opciones.add("Bogota");
        opciones.add("Cartagena");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Bogota");
        return pr;
    }
    public PreguntasRespuestas pregunta5(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("En que departamento queda Nuqui?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Choco");
        opciones.add("Antioquia");
        opciones.add("Valle");
        opciones.add("Cundinamarca");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Choco");
        return pr;
    }
}
