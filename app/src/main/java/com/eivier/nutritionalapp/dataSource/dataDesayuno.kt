package com.eivier.nutritionalapp.dataSource

import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.model.Recetas

/**
 * Metodo colocar Datos para Desayuno al modelo Recetas
 * Recibe: Nombre: String,
 * dificultad: String,
 * tiempo: String,
 * porciones: Int,
 * ingredientes: String,
 * preparacion: String,
 * imagen: Int; recursos disponibles
 *  Regresa un ArrayList
 */

class dataDesayuno {

    companion object {

        fun createDataSet(): ArrayList<Recetas> {
            val listaDesayuno = ArrayList<Recetas>()
            listaDesayuno.add(
                Recetas(
                    "Avena con Puré de Manzana",
                    "Baja",
                    "26 minutos",
                    4,
                    "5 manzanas para el puré\n" +
                            "suficiente de agua para el puré\n" +
                            "1 taza de azúcar para el puré\n" +
                            "2 cucharadas de jugo de limón para el puré\n" +
                            "1 raja de canela para el puré\n" +
                            "2 clavos para el puré\n" +
                            "2 taza de avena\n" +
                            "1/4 de taza de nuez para la avena\n" +
                            "1/4 de taza de pasa para la avena\n" +
                            "1/4 de taza de cacahuate para la avena\n" +
                            "1 taza de yogurt para acompañar\n" +
                            "suficiente de miel para decorar",
                    "Para el puré, con ayuda de un pelador retira la cáscara de las manzanas y córtalas en cubos medianos. En una ollita a fuego medio hierve agua, agrega las manzanas, el azúcar, el jugo de limón, la canela y el clavo, cocina hasta que la manzana esté suficientemente blandita.\n" +
                            "Retira la canela y el clavo; cuela y machaca la manzana sobre un bowl hasta que tenga consistencia de puré. Reserva.\n" +
                            "Para la avena, en un sartén a fuego bajo, tuesta la avena junto con la nuez, las pasas y los cacahuates por 6 minutos. Reserva.\n" +
                            "Sobre un vaso coloca un poco de yogurt, agrega puré de manzana y granola, repite hasta llenar el vaso y terminar con avena. Decora con un poco de miel y ¡disfruta!",
                    R.drawable.desayuno01
                )
            )
            listaDesayuno.add(
                Recetas(
                    "Hotcakes de manzana con avena",
                    "Baja",
                    "16 minutos",
                    2,
                    "1/2 plátano\n" +
                            "6 cucharadas de Nestum® Cereal infantil Avena\n" +
                            "suficiente de aceite en aerosol\n" +
                            "1/2 manzana",
                    "En un bowl, machaca el plátano hasta hacerlo puré, agrega Nestum® Cereal infantil Avena y la manzana.\n" +
                            "En un sartén a fuego medio, agrega un poco de aceite en aerosol y vierte un poco de la mezcla de hotcakes, cocina por 3 minutos de cada lado.\n" +
                            "Sirve en un platito para bebé.",
                    R.drawable.desayuno02
                )
            )

            listaDesayuno.add(
                Recetas(
                    "Papilla de Pera y Papaya",
                    "Baja",
                    "10 minutos",
                    2,
                    "1/2 pera sin cáscara\n" +
                            "3 cucharadas de Nestum® Cereal infantil 4 cereales\n" +
                            "1 taza de papaya\n" +
                            "3 cucharadas de Nestum® Cereal infantil 4 cereales",
                    "En un procesador, agrega la pera con 3 cucharadas de Nestum® Cereal infantil 4 cereales y procesa hasta que tenga consistencia de papilla. Reserva.\n" +
                            "En un procesador, agrega la papaya con 3 cucharadas de Nestum® Cereal infantil 4 cereales y procesa hasta que tenga consistencia de papilla. Reserva.\n" +
                            "Coloca en un tazón la papilla de pera y luego la de papaya hasta formar los dos colores.",
                    R.drawable.desayuno03
                )
            )
            listaDesayuno.add(
                Recetas(
                    "Crepas de Guayaba",
                    "Baja",
                    "18 minutos",
                    6,
                    "2 tazas de yoghurt griego para el relleno\n" +
                            "1 cucharadita de jengibre en polvo, para el relleno\n" +
                            "2 cucharadas de jugo de limón para el relleno\n" +
                            "1/4 de taza de menta finamente picada para el relleno\n" +
                            "2 paquetes de Cups de guayaba Vita+® 170 g c/u\n" +
                            "1 taza de harina integral para la masa de crepa\n" +
                            "2 tazas de Cups de guayaba Vita+® 170 g c/u (utilizar sólo el jugo)\n" +
                            "2 claras de huevo para la masa de crepa\n" +
                            "2 cucharadas de azúcar para la masa de crepa\n" +
                            "2 cucharadas de aceite vegetal para la masa de crepa\n" +
                            "suficiente de aceite en aerosol para cocinar las crepas\n" +
                            "suficiente de crema batida para servir\n" +
                            "suficiente de guayaba (trocitos de Cups de guayaba Vita+®) para servir\n" +
                            "suficiente de menta (hojas) para servir",
                    "Para el relleno, en un bowl mezcla el yoghurt, el jengibre, el jugo de limón, la menta y los packs de Cups de guayaba Vita+® hasta incorporar por completo. Reserva.\n" +
                            "Para la masa de la crepa, en un bowl mezcla la harina integral, el jugo de Cups de guayaba Vita+®, las claras de huevo, el azúcar y el aceite vegetal hasta incorporar por completo. Calienta un sartén de teflón, engrasa con el aceite en aerosol y vierte la masa con ayuda de un cucharón; extiende con movimientos circulares y cocina por 3 minutos a fuego bajo. Repite hasta terminar con la mezcla. Reserva.\n" +
                            "Sobre una tabla, rellena las crepas con la mezcla de guayaba. Sirve en un plato extendido, acompaña con trocitos de Cups de guayaba Vita+®, crema batida y hojas de menta.",
                    R.drawable.desayuno04
                )
            )
            listaDesayuno.add(
                Recetas(
                    "Espinacas a la crema con huevo",
                    "Baja",
                    "15 minutos",
                    4,
                    "3 cucharadas de mantequilla\n" +
                            "1 taza de cebolla fileteada\n" +
                            "1 cucharada de ajo picado finamente\n" +
                            "4 tazas de espinaca\n" +
                            "4 tazas de crema\n" +
                            "4 huevos\n" +
                            "suficiente de queso manchego rallado\n" +
                            "al gusto de sal\n" +
                            "al gusto de pimienta\n" +
                            "al gusto de orégano\n" +
                            "suficiente de pan tostado para acompañar",
                    "Calienta un sartén a fuego medio y agrega la mantequilla, la cebolla, el ajo y las espinacas, cocina por 5 minutos; agrega la crema y sazona con sal y pimienta.\n" +
                            "Agrega los huevos sin que se deshagan, acomódalos en el sartén de forma distribuida; sazona con sal y pimienta y cocina a temperatura baja por 5 minutos. Agrega el queso manchego hasta fundir.\n" +
                            "Sirve acompañado de pan y disfruta.",
                    R.drawable.desayuno05
                )
            )
            return listaDesayuno
        }
    }
}