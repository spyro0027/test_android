package com.ameno.mislugares;

class Principal {
    public static void main(String[] main){
        Lugar lugar = new Lugar("escuela prueba",
                "calle casa pais",
                new GeoPunto(-0.166093,38.995656),
                TipoLugar.EDUCACION,
                962849300, "http://google.com",
                "comentarios",
                System.currentTimeMillis(),3);
                System.out.print("Lugar" + lugar.toString());
    }
}