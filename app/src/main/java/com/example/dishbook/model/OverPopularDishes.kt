package com.example.dishbook.model

import androidx.annotation.DrawableRes
import com.example.dishbook.R

data class OverPopularDishes (
    @DrawableRes val imageRes: Int
)

val overPopularDishes = listOf(
    OverPopularDishes(imageRes = R.drawable.pexels_amar_preciado_17593640),
    OverPopularDishes(imageRes = R.drawable.pexels_chan_walrus_958545),
    OverPopularDishes(imageRes = R.drawable.pexels_chevanon_photography_323682),
    OverPopularDishes(imageRes = R.drawable.pexels_chokniti_khongchum_2280545),
    OverPopularDishes(imageRes = R.drawable.pexels_j_a_n_n_g_u_y_e_n__2664216),
    OverPopularDishes(imageRes = R.drawable.pexels_j_a_n_n_g_u_y_e_n__699953),
    OverPopularDishes(imageRes = R.drawable.pexels_julie_aagaard_2097090),
    OverPopularDishes(imageRes = R.drawable.pexels_sebastian_coman_photography_3590401),
    OverPopularDishes(imageRes = R.drawable.pexels_taryn_elliott_4099127),
    OverPopularDishes(imageRes = R.drawable.pexels_nati_17216084),
    OverPopularDishes(imageRes = R.drawable.pexels_tijana_drndarski_3338681),
    OverPopularDishes(imageRes = R.drawable.pexels_tijana_drndarski_3338681__1_),
    OverPopularDishes(imageRes = R.drawable.pexels_valeria_boltneva_1247677),
    OverPopularDishes(imageRes = R.drawable.pexels_valeria_boltneva_15913452)
)