package com.ameno.mislugares

interface RepositorioLugares {
    fun elemento(id: Int): Lugar // devuelve el elemto usando su id
    fun agregar (ñugar :Lugar) //añade el elemento indicado
    fun nuevo
}