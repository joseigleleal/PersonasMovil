package com.joseigle.personasmovil;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<Persona> personas=new ArrayList();

    public static void guardar(Persona p){
        personas.add(p);
    }

    private static ArrayList<Persona> obtener(){
        return personas;
    }





}
