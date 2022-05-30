package com.ameno.mislugares

enum class TipoLugar private constructor(val texto:String, val recurso:Int){
    OTROS("Otros",5),
    RESTAURANTE("RESTAURANTE",2),
    BAR("Bar",6),
    COPAS("Copas",0),
    ESPECTACULO("Espectaculo",0),
    HOTEL("Hotel",0),
    COMPRAS("Compras",0),
    EDUCACION("Educacion",0),
    DEPORTE("Deporte",0),
    NATURALEZA("Naturaleza",0),
    GASOLINA("Gasolinera",0)
}