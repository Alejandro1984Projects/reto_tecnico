public class Controlador {
    Jugador jugador=new Jugador();
    String nombre="";
    String categoria="";
    int puntaje=0;
    String [] categorias={"Deportes","Lugares","Musica","Naturaleza","Peliculas"};
    int opcionCategoria;
    public Controlador(){
        Interfaz interfaz=new Interfaz();

        nombre=interfaz.guardarNombre();
        jugador.setNombre(nombre);          
        
        opcionCategoria=interfaz.escogerCategoria();      
        if(opcionCategoria>=0){
            categoria=categorias[opcionCategoria];
            jugador.setCategoria(categoria);
            escogerOpcion(opcionCategoria);
        }
    }
    public void escogerOpcion(int opcion){
        if(categorias[opcion].equals("Deportes")){
            opcionDeportes();
        }
        else
        if(categorias[opcion].equals("Lugares")){
            opcionLugares();
        }
        else 
        if(categorias[opcion].equals("Musica")){
            opcionMusica();
        }
        else 
        if(categorias[opcion].equals("Naturaleza")){
            opcionNaturaleza();
        }
        else 
        if(categorias[opcion].equals("Peliculas")){
            opcionPeliculas();
        }
    }
    public void guardarPuntaje(){
        Persistencia persistencia=new Persistencia();
        persistencia.crear(jugador);
        new Interfaz().mostrarJugadores(persistencia.leerFichero());
    }
    public void opcionDeportes(){
        Interfaz interfaz=new Interfaz();
        String validar="";
        validar=interfaz.mostrarPregunta(new Deportes().pregunta1());
        if(validar.equals("correcto")){            
            puntaje++;jugador.setPuntaje(puntaje);
            validar=interfaz.mostrarPregunta(new Deportes().pregunta2());
            if(validar.equals("correcto")){                
                puntaje++;jugador.setPuntaje(puntaje);
                validar=interfaz.mostrarPregunta(new Deportes().pregunta3());
                if(validar.equals("correcto")){
                    puntaje++;jugador.setPuntaje(puntaje);
                    validar=interfaz.mostrarPregunta(new Deportes().pregunta4());
                    if(validar.equals("correcto")){
                        puntaje++;jugador.setPuntaje(puntaje);
                        validar=interfaz.mostrarPregunta(new Deportes().pregunta5());
                        if(validar.equals("correcto")){
                            puntaje++;jugador.setPuntaje(puntaje);
                            interfaz.ganaste();
                            guardarPuntaje();
                        }
                        else
                        if(validar.equals("salir")){
                            guardarPuntaje();
                        }
                        else 
                        if(validar.equals("null")){
                        jugador.setPuntaje(0);
                        guardarPuntaje();
                        }
                    }
                    else
                    if(validar.equals("salir")){
                        guardarPuntaje();
                    }                       
                    else 
                    if(validar.equals("null")){
                    jugador.setPuntaje(0);
                    guardarPuntaje();
                    }
                }
                else
                if(validar.equals("salir")){
                    guardarPuntaje();
                }
                else 
                if(validar.equals("null")){
                jugador.setPuntaje(0);
                guardarPuntaje();
                }
            }
            else
            if(validar.equals("salir")){
                guardarPuntaje();
            }
            else 
            if(validar.equals("null")){
            jugador.setPuntaje(0);
            guardarPuntaje();
            }
        }
        else
        if(validar.equals("salir")){
            guardarPuntaje();
        }
        else 
        if(validar.equals("null")){
        jugador.setPuntaje(0);
        guardarPuntaje();
        }
    
    }
    public void opcionLugares(){
        Interfaz interfaz=new Interfaz();
        String validar=interfaz.mostrarPregunta(new Lugares().pregunta1());
        if(validar.equals("correcto")){
            puntaje++;jugador.setPuntaje(puntaje);
            validar=interfaz.mostrarPregunta(new Lugares().pregunta2());
            if(validar.equals("correcto")){
                puntaje++;jugador.setPuntaje(puntaje);
                validar=interfaz.mostrarPregunta(new Lugares().pregunta3());
                if(validar.equals("correcto")){
                    puntaje++;jugador.setPuntaje(puntaje);
                    validar=interfaz.mostrarPregunta(new Lugares().pregunta4());
                    if(validar.equals("correcto")){
                        puntaje++;jugador.setPuntaje(puntaje);
                        validar=interfaz.mostrarPregunta(new Lugares().pregunta5());
                        if(validar.equals("correcto")){
                            puntaje++;jugador.setPuntaje(puntaje);
                            interfaz.ganaste();
                            guardarPuntaje();
                        }else
                        if(validar.equals("salir")){
                            guardarPuntaje();
                        }
                        else 
                        if(validar.equals("null")){
                        jugador.setPuntaje(0);
                        guardarPuntaje();
                        }
                    }else
                    if(validar.equals("salir")){
                        guardarPuntaje();
                    }
                    else 
                    if(validar.equals("null")){
                    jugador.setPuntaje(0);
                    guardarPuntaje();
                    }
                }else
                if(validar.equals("salir")){
                    guardarPuntaje();
                }
                else 
                if(validar.equals("null")){
                jugador.setPuntaje(0);
                guardarPuntaje();
                }
            }else
            if(validar.equals("salir")){
                guardarPuntaje();
            }
            else 
            if(validar.equals("null")){
            jugador.setPuntaje(0);
            guardarPuntaje();
            }
        }else
        if(validar.equals("salir")){
            guardarPuntaje();
        }
        else 
        if(validar.equals("null")){
        jugador.setPuntaje(0);
        guardarPuntaje();
        }
    }
    public void opcionMusica(){
        Interfaz interfaz=new Interfaz();
        String validar=interfaz.mostrarPregunta(new Musica().pregunta1());
        if(validar.equals("correcto")){
            puntaje++;jugador.setPuntaje(puntaje);
            validar=interfaz.mostrarPregunta(new Musica().pregunta2());
            if(validar.equals("correcto")){
                puntaje++;jugador.setPuntaje(puntaje);
                validar=interfaz.mostrarPregunta(new Musica().pregunta3());
                if(validar.equals("correcto")){
                    puntaje++;jugador.setPuntaje(puntaje);
                    validar=interfaz.mostrarPregunta(new Musica().pregunta4());
                    if(validar.equals("correcto")){
                        puntaje++;jugador.setPuntaje(puntaje);
                        validar=interfaz.mostrarPregunta(new Musica().pregunta5());
                        if(validar.equals("correcto")){
                            puntaje++;jugador.setPuntaje(puntaje);
                            interfaz.ganaste();
                            guardarPuntaje();
                        }else
                        if(validar.equals("salir")){
                            guardarPuntaje();
                        }
                        else 
                        if(validar.equals("null")){
                        jugador.setPuntaje(0);
                        guardarPuntaje();
                        }
                    }else
                    if(validar.equals("salir")){
                        guardarPuntaje();
                    }
                    else 
                    if(validar.equals("null")){
                    jugador.setPuntaje(0);
                    guardarPuntaje();
                    }
                }else
                if(validar.equals("salir")){
                    guardarPuntaje();
                }
                else 
                if(validar.equals("null")){
                jugador.setPuntaje(0);
                guardarPuntaje();
                }
            }else
            if(validar.equals("salir")){
                guardarPuntaje();
            }
            else 
            if(validar.equals("null")){
            jugador.setPuntaje(0);
            guardarPuntaje();
            }
        }else
        if(validar.equals("salir")){
            guardarPuntaje();
        }
        else 
        if(validar.equals("null")){
        jugador.setPuntaje(0);
        guardarPuntaje();
        }
    }
    public void opcionNaturaleza(){
        Interfaz interfaz=new Interfaz();
        String validar=interfaz.mostrarPregunta(new Naturaleza().pregunta1());
        if(validar.equals("correcto")){
            puntaje++;jugador.setPuntaje(puntaje);
            validar=interfaz.mostrarPregunta(new Naturaleza().pregunta2());
            if(validar.equals("correcto")){
                puntaje++;jugador.setPuntaje(puntaje);
                validar=interfaz.mostrarPregunta(new Naturaleza().pregunta3());
                if(validar.equals("correcto")){
                    puntaje++;jugador.setPuntaje(puntaje);
                    validar=interfaz.mostrarPregunta(new Naturaleza().pregunta4());
                    if(validar.equals("correcto")){
                        puntaje++;jugador.setPuntaje(puntaje);
                        validar=interfaz.mostrarPregunta(new Naturaleza().pregunta5());
                        if(validar.equals("correcto")){
                            puntaje++;jugador.setPuntaje(puntaje);
                            interfaz.ganaste();
                            guardarPuntaje();
                        }else
                        if(validar.equals("salir")){
                            guardarPuntaje();
                        }
                        else 
                        if(validar.equals("null")){
                        jugador.setPuntaje(0);
                        guardarPuntaje();
                        }
                    }else
                    if(validar.equals("salir")){
                        guardarPuntaje();
                    }
                    else 
                    if(validar.equals("null")){
                    jugador.setPuntaje(0);
                    guardarPuntaje();
                    }
                }else
                if(validar.equals("salir")){
                    guardarPuntaje();
                }
                else 
                if(validar.equals("null")){
                jugador.setPuntaje(0);
                guardarPuntaje();
                }
            }else
            if(validar.equals("salir")){
                guardarPuntaje();
            }
            else 
            if(validar.equals("null")){
            jugador.setPuntaje(0);
            guardarPuntaje();
            }
        }else
        if(validar.equals("salir")){
            guardarPuntaje();
        }
        else 
        if(validar.equals("null")){
        jugador.setPuntaje(0);
        guardarPuntaje();
        }
    }
    public void opcionPeliculas(){
        Interfaz interfaz=new Interfaz();
        String validar=interfaz.mostrarPregunta(new Peliculas().pregunta1());
        if(validar.equals("correcto")){
            puntaje++;jugador.setPuntaje(puntaje);
            validar=interfaz.mostrarPregunta(new Peliculas().pregunta2());
            if(validar.equals("correcto")){
                puntaje++;jugador.setPuntaje(puntaje);
                validar=interfaz.mostrarPregunta(new Peliculas().pregunta3());
                if(validar.equals("correcto")){
                    puntaje++;jugador.setPuntaje(puntaje);
                    validar=interfaz.mostrarPregunta(new Peliculas().pregunta4());
                    if(validar.equals("correcto")){
                        puntaje++;jugador.setPuntaje(puntaje);
                        validar=interfaz.mostrarPregunta(new Peliculas().pregunta5());
                        if(validar.equals("correcto")){
                            puntaje++;jugador.setPuntaje(puntaje);
                            interfaz.ganaste();
                            guardarPuntaje();
                        }else
                        if(validar.equals("salir")){
                            guardarPuntaje();
                        }
                        else 
                        if(validar.equals("null")){
                        jugador.setPuntaje(0);
                        guardarPuntaje();
                        }
                    }else
                    if(validar.equals("salir")){
                        guardarPuntaje();
                    }
                    else 
                    if(validar.equals("null")){
                    jugador.setPuntaje(0);
                    guardarPuntaje();
                    }
                }else
                if(validar.equals("salir")){
                    guardarPuntaje();
                }
                else 
                if(validar.equals("null")){
                jugador.setPuntaje(0);
                guardarPuntaje();
                }
            }else
            if(validar.equals("salir")){
                guardarPuntaje();
            }
            else 
            if(validar.equals("null")){
            jugador.setPuntaje(0);
            guardarPuntaje();
            }
        }else
        if(validar.equals("salir")){
            guardarPuntaje();
        }
        else 
        if(validar.equals("null")){
        jugador.setPuntaje(0);
        guardarPuntaje();
        }
    }
    
}
