package com.example.android.taller4;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class Datos {
    private static ArrayList<Celular> celular = new ArrayList<>();

    public static void guardar(Celular c){
        celular.add(c);
    }

    public static ArrayList<Celular> obtener(){
        return celular;
    }


}
