package com.castro.diego.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin {

    @Test
    fun main(){
        // Ponemos las 2 primeras palabras para el anagrama (Será True)
        val palabra1 = "SilenT"
        val palabra2 = "ListeN"

        // Ponemos las 2 siguientes palabras para el anagrama (será False)
        val palabra3="HellO"
        val palabra4="WorlD"


        // Llamamos la funcion para cada grupo de palabras           la funcion + los argumentos
        println("La cadena $palabra1 y la $palabra2 son anagramas?: ${sonAnagramas(palabra1,palabra2)}")
        println("La cadena $palabra3 y la $palabra4 son anagramas?: ${sonAnagramas(palabra3,palabra4)}")
        // Además, imprimimos cada palabra del grupo en una linea
    }

    private fun sonAnagramas(
        // Ponemos los argumentos y su tipo
        palabra1: String,
        palabra2: String
    ):Boolean{
    //Indica que el valor que nos devuelva sea un booleano (True o False)

        // Convierte cada palabra en una lista en minusculas y ordenada
        val palanra1LowerCase= palabra1.lowercase().toList().sorted()
        val palanra2LowerCase= palabra2.lowercase().toList().sorted()

        //Retorna una valor booleano (True o False)
        return palanra1LowerCase==palanra2LowerCase
    }
}