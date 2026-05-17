package com.example.pdm0126.foodspot.data.dummy


import com.example.pdm0126.foodspot.model.Dish
import com.example.pdm0126.foodspot.model.Restaurant
val dummyRestaurants = listOf(

    // comida mexicana

    Restaurant(
        id = 1,
        name = "Tacos El Carnal",
        description = "Auténticos tacos de barbacoa y carnitas, directo desde la cocina mexicana",
        imageUrl = "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?q=80&w=1000",
        categories = listOf("Mexicana"),
        menu = listOf(
            Dish(id = 101, name = "Tacos al Pastor", description = "Tortilla de maíz con carne de cerdo marinada, piña, cebolla y cilantro", imageUrl = "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?q=80&w=800"),
            Dish(id = 102, name = "Quesadilla de Chicharrón", description = "Tortilla gruesa rellena de chicharrón prensado y queso Oaxaca", imageUrl = "https://i.ytimg.com/vi/8utGnBMc9-s/maxresdefault.jpg"),
            Dish(id = 103, name = "Burrito Supreme", description = "Harina de trigo rellena de carne, frijoles, arroz, guacamole y crema", imageUrl = "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?q=80&w=800")
        )
    ),
    Restaurant(
        id = 2,
        name = "Cantina México",
        description = "Ambiente tradicional con los mejores platillos del centro de México",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=1000",
        categories = listOf("Mexicana"),
        menu = listOf(
            Dish(id = 201, name = "Enchiladas Rojas", description = "Tortillas bañadas en salsa roja, rellenas de pollo y gratinadas con queso", imageUrl = "https://tse3.mm.bing.net/th/id/OIP.fcpJB-JqJys_lzxO-cdl_QHaEs?rs=1&pid=ImgDetMain&o=7&rm=3"),
            Dish(id = 202, name = "Guacamole con Totopos", description = "Aguacate fresco machacado con tomate, cebolla, cilantro y limón", imageUrl = "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?q=80&w=800"),
            Dish(id = 203, name = "Tamales Oaxaqueños", description = "Masa de maíz con mole negro y pollo, envuelta en hoja de plátano", imageUrl = "https://images.unsplash.com/photo-1600891964092-4316c288032e?q=80&w=800")
        )
    ),
    Restaurant(
        id = 3,
        name = "Burrito Brothers",
        description = "Burritos gigantes con ingredientes frescos y salsas caseras",
        imageUrl = "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?q=80&w=1000",
        categories = listOf("Mexicana"),
        menu = listOf(
            Dish(id = 301, name = "Burrito de Carne Asada", description = "Carne a la parrilla con pico de gallo, frijoles y arroz cilantro", imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=800"),
            Dish(id = 302, name = "Nachos Supremos", description = "Totopos cubiertos de carne, queso cheddar derretido, jalapeños y crema", imageUrl = "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?q=80&w=800"),
            Dish(id = 303, name = "Chilaquiles Verdes", description = "Tortillas fritas en salsa verde con pollo desmenuzado, crema y queso fresco", imageUrl = "https://images.unsplash.com/photo-1600891964092-4316c288032e?q=80&w=800")
        )
    ),
    Restaurant(
        id = 4,
        name = "El Taco Loco",
        description = "Especialidad en tacos de mariscos y birria estilo Jalisco",
        imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?q=80&w=1000",
        categories = listOf("Mexicana"),
        menu = listOf(
            Dish(id = 401, name = "Tacos de Birria", description = "Tacos dorados rellenos de birria de res, servidos con consomé", imageUrl = "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?q=80&w=800"),
            Dish(id = 402, name = "Coctel de Camarón", description = "Camarones cocidos en salsa de tomate con aguacate, cilantro y limón", imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=800"),
            Dish(id = 403, name = "Sopes de Pollo", description = "Base gruesa de maíz frijolada con pollo desmenuzado, crema y queso", imageUrl = "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?q=80&w=800")
        )
    ),

    // comida rapida
    Restaurant(
        id = 5,
        name = "Burger Spot",
        description = "Hamburguesas smash con carne 100% de res y pan artesanal",
        imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=1000",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(id = 501, name = "Smash Burger", description = "Doble carne smash, queso cheddar, cebolla caramelizada y salsa especial", imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=800"),
            Dish(id = 502, name = "Papas Trufadas", description = "Papas fritas crujientes con aceite de trufa y parmesano rallado", imageUrl = "https://images.unsplash.com/photo-1630384060421-cb20d0e0649d?q=80&w=800"),
            Dish(id = 503, name = "Chicken Wings BBQ", description = "Alitas de pollo glaseadas en salsa barbacoa con un toque picante", imageUrl = "https://www.kitchensanctuary.com/wp-content/uploads/2020/06/bbq-chicken-wings-tall2-50.jpg")
        )
    ),
    Restaurant(
        id = 6,
        name = "FryDay",
        description = "El mejor pollo frito crujiente y hamburguesas clásicas americanas",
        imageUrl = "https://images.unsplash.com/photo-1550547660-d9450f859349?q=80&w=1000",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(id = 601, name = "Bucket de Pollo Frito", description = "8 piezas de pollo frito crujiente con especias secretas", imageUrl = "https://images.unsplash.com/photo-1626082927389-6cd097cdc6ec?q=80&w=800"),
            Dish(id = 602, name = "Cheeseburger Clásica", description = "Carne de res, queso americano, lechuga, tomate y pepinillos", imageUrl = "https://images.unsplash.com/photo-1571091718767-18b5b1457add?q=80&w=800"),
            Dish(id = 603, name = "Aros de Cebolla", description = "Aros de cebolla empanizados y fritos hasta dorar, con dip de ranch", imageUrl = "https://images.unsplash.com/photo-1630384060421-cb20d0e0649d?q=80&w=800")
        )
    ),
    Restaurant(
        id = 7,
        name = "Hot Dog Express",
        description = "Perritos calientes gourmet con toppings ilimitados",
        imageUrl = "https://estaticos-cdn.prensaiberica.es/clip/a7142937-40ae-4701-9423-c19e7a60530d_16-9-discover-aspect-ratio_default_1218557.jpg",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(id = 701, name = "Hot Dog Chicago", description = "Salchicha de res con pepinillos, tomate, cebolla, relish y mostaza", imageUrl = "https://static01.nyt.com/images/2022/07/27/dining/27Chicagodogrex/05Chicagodogrex-threeByTwoMediumAt2X.jpg"),
            Dish(id = 702, name = "Papas con Chili", description = "Papas fritas cubiertas de chili de carne, queso cheddar y jalapeños", imageUrl = "https://images.unsplash.com/photo-1630384060421-cb20d0e0649d?q=80&w=800"),
            Dish(id = 703, name = "Malteada de Oreo", description = "Helado de vainilla con galletas Oreo trituradas y crema batida", imageUrl = "https://images.unsplash.com/photo-1572490122747-3968b75cc699?q=80&w=800")
        )
    ),
    Restaurant(
        id = 8,
        name = "Sub Factory",
        description = "Sándwiches submarinos recién hechos con pan artesanal",
        imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?q=80&w=1000",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(id = 801, name = "Sub de Pavo", description = "Pavo ahumado con lechuga, tomate, cebolla y mayonesa en pan italiano", imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?q=80&w=800"),
            Dish(id = 802, name = "Wrap de Pollo Crispy", description = "Tortilla de harina con pollo crujiente, lechuga y aderezo ranch", imageUrl = "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?q=80&w=800"),
            Dish(id = 803, name = "Papas Gajo", description = "Papas en gajo sazonadas con ajo y hierbas, horneadas hasta dorar", imageUrl = "https://images.unsplash.com/photo-1630384060421-cb20d0e0649d?q=80&w=800")
        )
    ),

    // comida tipica
    Restaurant(
        id = 9,
        name = "El Rinconcito",
        description = "Sabor salvadoreño auténtico: pupusas, atol y más delicias locales",
        imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?q=80&w=1000",
        categories = listOf("Típica"),
        menu = listOf(
            Dish(id = 901, name = "Pupusas de Queso", description = "Tortilla gruesa de maíz rellena de queso mozzarella y loroco", imageUrl = "https://img-global.cpcdn.com/recipes/90ff54109e703b98/751x532cq70/pupusas-de-queso-foto-principal.jpg"),
            Dish(id = 902, name = "Yuca Frita con Chicharrón", description = "Yuca cocida y frita acompañada de chicharrón curtido y salsa de tomate", imageUrl = "https://images.unsplash.com/photo-1600891964092-4316c288032e?q=80&w=800"),
            Dish(id = 903, name = "Atol de Elote", description = "Bebida tradicional a base de elote tierno, leche, canela y azúcar", imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?q=80&w=800")
        )
    ),
    Restaurant(
        id = 10,
        name = "Sabores de Casa",
        description = "Comida casera latinoamericana hecha con recetas de abuela",
        imageUrl = "https://images.unsplash.com/photo-1504674900247-0877df9cc836?q=80&w=1000",
        categories = listOf("Típica"),
        menu = listOf(
            Dish(id = 1001, name = "Sopa de Res", description = "Caldo de res con verduras frescas, yuca, elote y plátano", imageUrl = "https://images.unsplash.com/photo-1547592166-23ac45744acd?q=80&w=800"),
            Dish(id = 1002, name = "Gallo en Chicha", description = "Pollo guisado en chicha de maíz fermentado con especias dulces", imageUrl = "https://images.unsplash.com/photo-1600891964092-4316c288032e?q=80&w=800"),
            Dish(id = 1003, name = "Plátanos Fritos con Crema", description = "Plátanos maduros fritos servidos con crema agria y queso fresco", imageUrl = "https://images.unsplash.com/photo-1504674900247-0877df9cc836?q=80&w=800")
        )
    ),
    Restaurant(
        id = 11,
        name = "La Cazuela",
        description = "Especialidades guisadas y asadas de la cocina tradicional centroamericana",
        imageUrl = "https://images.unsplash.com/photo-1547592166-23ac45744acd?q=80&w=1000",
        categories = listOf("Típica"),
        menu = listOf(
            Dish(id = 1101, name = "Carne Asada con Chimol", description = "Filete de res a la parrilla con chimol fresco y tortillas calientes", imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?q=80&w=800"),
            Dish(id = 1102, name = "Tamales de Elote", description = "Tamales dulces de elote tierno envueltos en hoja de maíz", imageUrl = "https://images.unsplash.com/photo-1504674900247-0877df9cc836?q=80&w=800"),
            Dish(id = 1103, name = "Frijoles Volteados", description = "Frijoles negros refritos con queso fundido y tortilla de harina", imageUrl = "https://images.unsplash.com/photo-1600891964092-4316c288032e?q=80&w=800")
        )
    ),
    Restaurant(
        id = 12,
        name = "Desayunos Doña María",
        description = "Desayunos típicos salvadoreños con elote, plátano y más",
        imageUrl = "https://img.freepik.com/vector-premium/menu-desayuno-ilustracion-comida-tradicional-manana_97761-107.jpg",
        categories = listOf("Típica"),
        menu = listOf(
            Dish(id = 1201, name = "Desayuno Plátano", description = "Plátano frito, frijoles, crema, queso y huevos al gusto", imageUrl = "https://i.pinimg.com/originals/16/4e/97/164e9797bf5fa5cc963ec35f243d3df0.jpg"),
            Dish(id = 1202, name = "Atol Chuco", description = "Atol de maíz fermentado con chicharrón, limón y albahaca", imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?q=80&w=800"),
            Dish(id = 1203, name = "Quesadilla Salvadoreña", description = "Pan dulce de queso salvadoreño, crujiente por fuera y suave por dentro", imageUrl = "https://images.unsplash.com/photo-1504674900247-0877df9cc836?q=80&w=800")
        )
    ),

    // postres o café
    Restaurant(
        id = 13,
        name = "Dulce Momentos",
        description = "Repostería fina, pasteles de celebración y postres artesanales",
        imageUrl = "https://images.unsplash.com/photo-1563729784474-d77dbb933a9e?q=80&w=1000",
        categories = listOf("Postres & Café"),
        menu = listOf(
            Dish(id = 1301, name = "Cheesecake de Fresa", description = "Cremoso cheesecake horneado con coulis de fresa natural y galleta de vainilla", imageUrl = "https://images.unsplash.com/photo-1563729784474-d77dbb933a9e?q=80&w=800"),
            Dish(id = 1302, name = "Tiramisú Clásico", description = "Capas de bizcocho empapado en café con mascarpone y cacao en polvo", imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?q=80&w=800"),
            Dish(id = 1303, name = "Brownie con Helado", description = "Brownie de chocolate caliente con nueces y bola de helado de vainilla", imageUrl = "https://images.unsplash.com/photo-1606313564200-e75d5e30476d?q=80&w=800")
        )
    ),
    Restaurant(
        id = 14,
        name = "Café Central",
        description = "Café de especialidad, panadería francesa y desayunos gourmet",
        imageUrl = "https://images.unsplash.com/photo-1495474472287-4d71bcdd2085?q=80&w=1000",
        categories = listOf("Postres & Café"),
        menu = listOf(
            Dish(id = 1401, name = "Croissant de Almendra", description = "Croissant hojaldrado relleno de crema de almendra y topping de almendras tostadas", imageUrl = "https://images.unsplash.com/photo-1555507036-ab1f40380225?q=80&w=800"),
            Dish(id = 1402, name = "Capuccino Italiano", description = "Espresso doble con leche vaporizada y espuma de leche artesanal", imageUrl = "https://images.unsplash.com/photo-1495474472287-4d71bcdd2085?q=80&w=800"),
            Dish(id = 1403, name = "Tarta de Manzana", description = "Masa quebrada con relleno de manzana caramelizada y canela, servida tibia", imageUrl = "https://images.unsplash.com/photo-1568571780765-9276ac8b75a2?q=80&w=800")
        )
    ),
    Restaurant(
        id = 15,
        name = "Helados Artesanales",
        description = "Helados hechos a mano con frutas frescas y leche local",
        imageUrl = "https://images.unsplash.com/photo-1563805042-7684c019e1cb?q=80&w=1000",
        categories = listOf("Postres & Café"),
        menu = listOf(
            Dish(id = 1501, name = "Helado de Mango", description = "Helado cremoso de mango natural con trozos de fruta fresca", imageUrl = "https://images.unsplash.com/photo-1563805042-7684c019e1cb?q=80&w=800"),
            Dish(id = 1502, name = "Banana Split", description = "Banana partida con 3 bolas de helado, chocolate, crema y cereza", imageUrl = "https://images.unsplash.com/photo-1572490122747-3968b75cc699?q=80&w=800"),
            Dish(id = 1503, name = "Sundae de Caramelo", description = "Helado de vainilla cubierto de caramelo caliente y nueces picadas", imageUrl = "https://images.unsplash.com/photo-1563729784474-d77dbb933a9e?q=80&w=800")
        )
    ),
    Restaurant(
        id = 16,
        name = "Donas & Café",
        description = "Donas recién horneadas con café recién molido todos los días",
        imageUrl = "https://images.unsplash.com/photo-1551024601-bec78aea704b?q=80&w=1000",
        categories = listOf("Postres & Café"),
        menu = listOf(
            Dish(id = 1601, name = "Donas Glaseadas", description = "Donas esponjosas cubiertas de glaseado de azúcar y chispas de colores", imageUrl = "https://images.unsplash.com/photo-1551024601-bec78aea704b?q=80&w=800"),
            Dish(id = 1602, name = "Café Americano", description = "Café filtrado de granos arábica con notas de chocolate y caramelo", imageUrl = "https://images.unsplash.com/photo-1514432324607-a09d9b4aefda?q=80&w=800"),
            Dish(id = 1603, name = "Muffin de Arándanos", description = "Muffin esponjoso con arándanos frescos y crumble de canela", imageUrl = "https://images.unsplash.com/photo-1607958996333-41aef7caefaa?q=80&w=800")
        )
    )
)