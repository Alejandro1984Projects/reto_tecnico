import java.util.ArrayList;

public class Naturaleza{
    public PreguntasRespuestas pregunta1(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual es la selva mas grande del mundo?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Amazonas");
        opciones.add("Sahara");
        opciones.add("Tundra");
        opciones.add("Yellowstone");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Amazonas");
        return pr;
    }
    public PreguntasRespuestas pregunta2(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual es el rio mas largo del mundo?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Misisipi");
        opciones.add("Nilo");
        opciones.add("Yenisei");
        opciones.add("Amazonas");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Amazonas");
        return pr;
    }
    public PreguntasRespuestas pregunta3(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual es el desierto mas extenso del mundo?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Kalahari");
        opciones.add("Gobi");
        opciones.add("Sahara");
        opciones.add("Guajira");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Sahara");
        return pr;
    }
    public PreguntasRespuestas pregunta4(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual es la montaña mas alta del mundo?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("K2");
        opciones.add("Everest");
        opciones.add("Kanchenjunga");
        opciones.add("Cho Oyu");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Everest");
        return pr;
    }
    public PreguntasRespuestas pregunta5(){
        PreguntasRespuestas pr=new PreguntasRespuestas();

        pr.setPregunta("Cual es el oso que habita en Colombia?");
        ArrayList<String> opciones=new ArrayList<>();
        opciones.add("Oso Colombiano");
        opciones.add("Oso de Anteojos");
        opciones.add("Oso Polar");
        opciones.add("Oso Panda");
        pr.setOpciones(opciones);
        pr.setOpcionCorrecta("Oso de Anteojos");
        return pr;
    }
}