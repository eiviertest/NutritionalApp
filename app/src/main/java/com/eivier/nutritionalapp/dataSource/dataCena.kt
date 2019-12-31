package com.eivier.nutritionalapp.dataSource

import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.model.Recetas

/**
 * Metodo colocar Datos para Cena al modelo Recetas
 * Recibe: Nombre: String,
 * dificultad: String,
 * tiempo: String,
 * porciones: Int,
 * ingredientes: String,
 * preparacion: String,
 * imagen: Int; recursos disponibles
 *  Regresa un ArrayList
 */

class dataCena {

    companion object {

        fun createDataSet(): ArrayList<Recetas> {
            val listaCena = ArrayList<Recetas>()
            listaCena.add(
                Recetas(
                    "Sandwich de portobello",
                    "Baja",
                    "30 minutos",
                    4,
                    "4 panes ciabatta\n" +
                            "4 hongos portobello\n" +
                            "1 jitomate en rodajas\n" +
                            "1/2 cebolla morada cortada en rodajas\n" +
                            "2 tazas de lechuga picada\n" +
                            "1 taza de mayonesa\n" +
                            "6 cucharadas de alcaparras picadas\n" +
                            "al gusto de pimienta al gusto\n" +
                            "2 cucharadas de salsa tabasco\n" +
                            "sal al gusto",
                    "Ponga a calentar un sartén o una parilla. Cocine los hongos portobello por al menos 25 minutos o hasta que estén bien cocidos de cada lado.\n" +
                            "Corte los panes ciabatta a la mitad.\n" +
                            "En un recipiente hondo pequeño mezcle la mayonesa con las aclaparras, la tabasco y sazone con sal y pimienta.\n" +
                            "Ponga una capa de mayonesa especial sobre cada pan ciabatta.\n" +
                            "Luego sobre el pan coloque 1 hongo portobello, 2 rodajas de jitomate, un poco de cebolla y lechuga, y coloque el otro pan faltante.",
                    R.drawable.cena01
                )
            )
            listaCena.add(
                Recetas(
                    "Panini Caprese",
                    "Baja",
                    "15 minutos",
                    3,
                    "3 teleras (pan para tortas)\n" +
                            "1 cucharadita de aceite de oliva\n" +
                            "hojas de albahaca lavadas y secas\n" +
                            "2 jitomates rebanados\n" +
                            "120 gramos de queso mozzarella en rebanadas\n" +
                            "pimientas\n" +
                            "sal",
                    "Corte las teleras por la mitad y barnice con aceite de oliva.\n" +
                            "Ponga las mitades en una charola para hornear (con el lado de aceite de oliva hacia abajo) y hornee por unos 10 minutos.\n" +
                            "Ponga encima una capa de hojas de albahaca, jitomate y mozarella en rebanadas. Espolvoree con sal y pimienta al gusto y tape con al otra mitad del pan.\n" +
                            "Vuelva a meter al horno por otros 5 minutos a temperatura muy alta hasta que el pan este dorado y el queso derretido, unos 3 minutos.\n" +
                            "Sirva inmediatamente.",
                    R.drawable.cena02
                )
            )

            listaCena.add(
                Recetas(
                    "Crema de verduras a la mexicana",
                    "Media",
                    "2 horas",
                    6,
                    "2 calabacitas en cubos\n" +
                            "1 jitomate chico picado en cuadritos\n" +
                            "1 elote en grano\n" +
                            "1 lata de leche evaporada\n" +
                            "1/2 taza de caldo de pollo\n" +
                            "2 dientes de ajo\n" +
                            "1/4 de cebolla finamente picada\n" +
                            "1 rama de epazote\n" +
                            "al gusto de pimienta",
                    "A fuego medio, agregar la cebolla hasta que se torne transparente.\n" +
                            "Agregar ajo finamente picado . Mezclar hasta que el ajo tome un color dorado claro.\n" +
                            "Agregar la leche y el caldo de pollo y los granos de elote.\n" +
                            "Dejar que suelte el primer hervor y se agregan la calabaza picada y el jitomate.\n" +
                            "Agregar la rama de epazote, sal y pimienta. Mezclar para integrar los ingredientes. Permita que hierva un par de minutos. Se sirve bien caliente.",
                    R.drawable.cena03
                )
            )
            listaCena.add(
                Recetas(
                    "Pasta con Salsa de Nuez",
                    "Baja",
                    "20 minutos",
                    8,
                    "150 gramos de nuez\n" +
                            "1/2 diente de ajo picado\n" +
                            "1 rebanada de pan sin orillas\n" +
                            "100 mililitros de leche de vaca\n" +
                            "30 gramos de queso parmesano rallado\n" +
                            "30 mililitros de aceite de oliva\n" +
                            "1 kilo de pasta tipo penne\n" +
                            "1/2 taza de perejil picado",
                    "Ponga a hervir una olla grande con agua y sal para la pasta.\n" +
                            "Ponga a tostar las nueces en un sartén, con cuidado de que no se quemen, hasta que empiecen a oler.\n" +
                            "Ponga a remojar el pan con la leche.\n" +
                            "Ponga las nueces (reservando como 2 cucharadas para decorar los platos al final), el pan remojado, el ajo, y el queso parmesano en una licuadora. Bata hasta que se forme una salsa cremosa. Agregue el aceite de oliva, sal y pimienta y vuelva a batir. Reserve.\n" +
                            "Cocine la pasta de acuerdo a las instrucciones en el paquete para que quede al dente. Reserve 1 taza del agua en la que se cocino la pasta.\n" +
                            "Agregue la salsa de nuez preparada a la pasta y si esta muy espesa, agregue un poco del agua en la que se cocinó la pasta.\n" +
                            "Pique las nueces reservadas y espolvoree encima de la pasta junto con más queso parmesano y el perejil picado.",
                    R.drawable.cena04
                )
            )
            listaCena.add(
                Recetas(
                    "Ensalada de fruta en conejo de melón",
                    "Baja",
                    "45 minutos",
                    6,
                    "1 melón grande y con forma ovalada\n" +
                            "1/2 sandía cortada en cubos o bolitas\n" +
                            "1 taza de mora azul\n" +
                            "1 taza de fresa cortadas\n" +
                            "1 zanahoria chica (para los bigotes)",
                    "Dibuje con una pluma sobre el melón una linea horizontal por la mitad sin llegar a dar la vuelta por completo (ahí va a estar la cabeza). Dibuje la cabeza del conejo en el frente y las dos orejas largas.\n" +
                            "Con un cuchillo muy filoso, corte alrededor de las marcas de la pluma.\n" +
                            "Con una cuchara para hacer bolitas de melón (o con un cuchillo) quite todo el relleno del melón. Puedes utilizar este melón para tu ensalada de frutas.\n" +
                            "Corte la sandia en cubitos o en bolitas. Corte las fresas en cuartos.\n" +
                            "Rellene la ensaladera de conejito con toda la fruta y con palillos encaje 2 moras azules para que sean los ojos, una bolita de sandia para que sea la nariz y forme bigotes de tiras de zanahoria muy delgaditas.",
                    R.drawable.cena05
                )
            )
            return listaCena
        }
    }
}