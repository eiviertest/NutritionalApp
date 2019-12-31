package com.eivier.nutritionalapp.dataSource

import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.model.Recetas

/**
 * Metodo colocar Datos para Comida al modelo Recetas
 * Recibe: Nombre: String,
 * dificultad: String,
 * tiempo: String,
 * porciones: Int,
 * ingredientes: String,
 * preparacion: String,
 * imagen: Int; recursos disponibles
 *  Regresa un ArrayList
 */

class dataComida {

    companion object {

        fun createDataSet(): ArrayList<Recetas> {
            val listaComida = ArrayList<Recetas>()
            listaComida.add(
                Recetas(
                    "Pechuga de pollo a las finas hierbas",
                    "Baja",
                    "1 hora con 50 minutos",
                    4,
                    "4 pechugas de pollo\n" +
                            "al gusto de sal\n" +
                            "al gusto de pimienta\n" +
                            "4 cucharadas de salsa inglesa French's\n" +
                            "2 cucharadas de ajo\n" +
                            "3 cucharadas de romero\n" +
                            "3 cucharadas de tomillo\n" +
                            "3 cucharadas de perejil\n" +
                            "2 hojas de laurel\n" +
                            "2 cucharadas de cebolla en polvo\n" +
                            "1/4 de taza de miel de abeja\n" +
                            "1 cucharada de aceite\n" +
                            "1/4 de taza de vino blanco\n" +
                            "1 cucharada de aceite\n" +
                            "1/2 cebolla en cuartos\n" +
                            "2 dientes de ajo\n" +
                            "6 jitomates en cuartos\n" +
                            "4 chiles de árbol\n" +
                            "2 piezas de pimienta gorda\n" +
                            "1 cucharadita de comino\n" +
                            "1/2 taza de caldo de pollo\n" +
                            "suficiente de tomillo para decorar\n" +
                            "suficiente de romero\n" +
                            "papas cambray guisadas, para acompañar\n" +
                            "suficiente de pan para acompañar",
                    "Coloca el pollo en un bowl, sazona con sal y pimienta y agrega la Salsa Inglesa French's, el ajo, el romero, el tomillo, el perejil, el laurel, y la miel de abeja. Marina por 20 minutos en refrigeración.\n" +
                            "En una sartén de hierro fundido, agrega el aceite y dora el pollo; vierte el vino blanco y cocina por 30 minutos o hasta que el pollo esté doradito.\n" +
                            "Para la salsa de jitomate, en una sartén profunda agrega el aceite, la cebolla, el ajo, el jitomate, el chile de árbol, la pimienta gorda, el comino y cocina por 10 minutos; vierte el caldo de pollo y cocina hasta que se reduzca a la mitad. Licúa y reserva.\n" +
                            "Sirve un espejo de salsa, seguido del pollo, decora con el tomillo y el romero. Acompaña con papas cambray y pan.",
                    R.drawable.comida01
                )
            )
            listaComida.add(
                Recetas(
                    "Lomo de cerdo en salsa de mandarina",
                    "Media",
                    "2 horas con 45 minutos",
                    8,
                    "2 kilos de lomo de cerdo\n" +
                            "1/2 taza de miel\n" +
                            "3 cucharadas de paprika\n" +
                            "3 cucharadas de cebolla en polvo\n" +
                            "1 cucharada de pimienta\n" +
                            "2 cucharadas de ajo finamente picado\n" +
                            "1/2 taza de jugo de naranja\n" +
                            "1/4 de taza de salsa de soya\n" +
                            "3 cucharadas de Oli de Nutrioli® Aceite de Oliva para sellar\n" +
                            "1 cucharada de Oli de Nutrioli® Extra virgen Aceite de Oliva\n" +
                            "1/4 de cebolla\n" +
                            "1 cucharada de echalote\n" +
                            "1/4 de taza de apio\n" +
                            "1/4 de taza de zanahoria\n" +
                            "1 taza de mandarina\n" +
                            "2 cucharadas de azúcar mascabado\n" +
                            "1/2 taza de caldo de pollo\n" +
                            "al gusto de pimienta\n" +
                            "suficiente de mandarina (gajos) para decorar\n" +
                            "suficiente de tomillo fresco para decorar\n" +
                            "Ensalada para acompañar",
                    "Con ayuda de hilo de cáñamo, ata el lomo para conseguir una cocción uniforme.\n" +
                            "Para la marinada, en un bowl mezcla la miel, la paprika, la cebolla en polvo, la pimienta, el ajo, el jugo de naranja y la salsa soya; agrega el lomo y marina por 30 minutos.\n" +
                            "Sella el lomo en una sartén con Oli de Nutrioli Aceite de Oliva® por ambos lados. Retira y coloca en una charola para horno junto con el resto del marinado. Hornea a 200 °C.\n" +
                            "Para la salsa de mandarina, en una sartén agrega el Oli de Nutrioli Extra Virgen® y saltea la cebolla, el echalotte, el apio, la zanahoria, la mandarina, el azúcar mascabado, el caldo de pollo y la pimienta; deja reducir y licúa. Reserva.\n" +
                            "Reposa el lomo por 5 minutos sobre una tabla y rebana con ayuda de un cuchillo.\n" +
                            "Sirve y salsea con la salsa de mandarina, decora con gajos de mandarina y tomillo fresco. Acompaña con ensalada.",
                    R.drawable.comida02
                )
            )

            listaComida.add(
                Recetas(
                    "Pasta con camarones en salsa de jitomate y chipotle",
                    "Baja",
                    "35 minutos",
                    4,
                    "250 gramos de fetuccini\n" +
                            "suficiente de agua\n" +
                            "1 litro de agua\n" +
                            "16 cucharadas de Knorr® Mi Tomate\n" +
                            "2 cucharadas de chile chipotle en adobo y molido\n" +
                            "1 cucharada de orégano seco\n" +
                            "1 cucharada de mantequilla\n" +
                            "1/4 de taza de cebolla finamente picada\n" +
                            "1 diente de ajo finamente picado\n" +
                            "400 gramos de camarón mediano limpios, sin cáscara ni cabeza\n" +
                            "1 taza de jitomate cherry de colores, en mitades\n" +
                            "4 espárragos cortados en rodajas finas\n" +
                            "1 cucharadita de paprika\n" +
                            "1 cucharada de Knorr ® Caldo de camarón\n" +
                            "2 cucharadas de albahaca fresca\n" +
                            "suficiente de queso parmesano rallado",
                    "En una olla con agua hirviendo, cocina la pasta de acuerdo con las instrucciones del empaque. Escurre y reserva.\n" +
                            "En una olla con agua hirviendo, disuelve el contenido de Knorr® Mi Tomate y cocina por dos minutos. Agrega el chile chipotle molido y el orégano, mezcla y reserva.\n" +
                            "En un sartén profundo, derrite la mantequilla y cocina la cebolla y el ajo. Agrega los camarones y los jitomates cherry, los espárragos y sazona con la paprika y el Knorr® caldo de camarón. Cocina alrededor de 5 minutos.\n" +
                            "Añade la pasta que cocinaste con anterioridad, la salsa y cocina sólo para incorporar los sabores, espolvorea con queso parmesano rallado y decora con albahaca.",
                    R.drawable.comida03
                )
            )
            listaComida.add(
                Recetas(
                    "Papas Hasselback",
                    "Baja",
                    "1 hora con 40 minutos",
                    2,
                    "2 papas\n" +
                            "suficiente de palillo para brocheta\n" +
                            "suficiente de salami\n" +
                            "suficiente de queso cheddar\n" +
                            "suficiente de perejil para decorar",
                    "Precalienta el horno a 180 °C.\n" +
                            "Inserta los palillos a las papas, como se muestra en el video, y corta hasta llegar al palo de brocheta.\n" +
                            "Rellena los espacios de las papas con salami y queso cheddar.\n" +
                            "Hornea por 40 minutos, sirve con perejil y disfruta.",
                    R.drawable.comida04
                )
            )
            listaComida.add(
                Recetas(
                    "Pollo a la vizcaína",
                    "Baja",
                    "48 minutos",
                    4,
                    "3 cucharadas de aceite de oliva\n" +
                            "5 piernas de pollo con muslo\n" +
                            "1/2 taza de cebolla finamente picada\n" +
                            "2 cucharadas de ajo finamente picado\n" +
                            "2 tazas de jitomate en cubitos\n" +
                            "1 taza de puré de tomate\n" +
                            "1/2 taza de pimiento morrón en lata, en tiritas\n" +
                            "1/4 de taza de aceituna negra en rodajas\n" +
                            "1/4 de taza de aceituna verde en rodajas\n" +
                            "5 chiles güeros\n" +
                            "1/2 taza de caldo de pollo\n" +
                            "al gusto de sal\n" +
                            "al gusto de pimienta\n" +
                            "1/4 de taza de perejil finamente picado\n" +
                            "suficiente de perejil para acompañar",
                    "En una cacerola con aceite de oliva caliente, salpimienta y fríe el pollo por ambos lados a fuego medio. Retira las piezas de la cacerola y reserva el aceite utilizado.\n" +
                            "En el mismo aceite, sofríe la cebolla y el ajo hasta que cambien de color. Agrega el jitomate, el puré y cocina por unos minutos. Incorpora las piezas de pollo doradas, el pimiento morrón, la aceituna negra, la aceituna verde, el chile güero y el caldo de pollo; sazona con sal, pimienta y perejil. Tapa y cocina por 20 minutos o hasta que el pollo esté lo suficientemente cocido.\n" +
                            "Sirve en plato extendido decora con perejil picado, acompaña con arroz blanco y tortillas.",
                    R.drawable.comida05
                )
            )
            return listaComida
        }
    }
}