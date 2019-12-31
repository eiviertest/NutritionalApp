package com.eivier.nutritionalapp.model

class Recetas(
    nombre: String,
    dificultad: String,
    tiempo: String,
    porciones: Int,
    ingredientes: String,
    preparacion: String,
    imagen: Int
) {

    var nombre: String = ""
    var dificultad: String = ""
    var tiempo: String = ""
    var porciones: Int = 0
    var imagen: Int = 0
    var ingredientes: String = ""
    var preparacion: String = ""

    init {
        this.nombre = nombre
        this.dificultad = dificultad
        this.tiempo = tiempo
        this.porciones = porciones
        this.ingredientes = ingredientes
        this.preparacion = preparacion
        this.imagen = imagen
    }
}