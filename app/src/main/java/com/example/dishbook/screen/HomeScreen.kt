package com.example.dishbook.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dishbook.R
import com.example.dishbook.model.OverPopularDishes
import com.example.dishbook.ui.theme.DishBookTheme


@Composable
fun HomeScreen(imageList: List<OverPopularDishes>) {

    LazyColumn() {

        item {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = stringResource(id = R.string.app_name),
                    modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                    style = MaterialTheme.typography.displayLarge,
                    color = MaterialTheme.colorScheme.primary)
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(dimensionResource(id = R.dimen.padding_medium),end = dimensionResource(id = R.dimen.padding_small))
                ) {
                    Icon(imageVector = Icons.Filled.Search,
                        contentDescription ="null"
                    )
                }
            }
            Text(text = stringResource(id = R.string.str1),
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier.padding(start = dimensionResource(id = R.dimen.padding_medium),
                    dimensionResource(id = R.dimen.padding_small)
                )
            )
            Image(
                painter = painterResource(id = R.drawable.pexels_amar_preciado_17593640),
                modifier = Modifier
                    .padding(
                        start = dimensionResource(id = R.dimen.padding_medium),
                        dimensionResource(id = R.dimen.padding_small),
                        end = dimensionResource(id = R.dimen.padding_medium)
                    )
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(MaterialTheme.shapes.small)
                    .clickable { },
                contentScale = ContentScale.Crop,
                contentDescription = "null",
            )
            Text(text = stringResource(id = R.string.str2),
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier.padding(start = dimensionResource(id = R.dimen.padding_medium),
                    dimensionResource(id = R.dimen.padding_small)
                )
            )
            LazyRow() {
                items(imageList) { image ->
                    OverPopularDishesCard(imageRes = image.imageRes, onClick = {})
                }
            }
            Text(text = stringResource(id = R.string.str3),
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier.padding(start = dimensionResource(id = R.dimen.padding_medium),
                    dimensionResource(id = R.dimen.padding_small)
                ))
            CatogariesCard()
        }

    }
}

@Composable
fun OverPopularDishesCard(imageRes: Int,onClick: () -> Unit ) {
    Image(painter = painterResource(id = imageRes),
        modifier = Modifier
            .width(180.dp)
            .height(90.dp)
            .padding(dimensionResource(id = R.dimen.padding_small))
            .clip(MaterialTheme.shapes.small)
            .clickable { onClick },
        contentScale = ContentScale.Crop,
        contentDescription = "null")
}

@Composable
fun CatogariesCard() {
    Card(elevation = CardDefaults.cardElevation(
        defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.padding_medium))
            .fillMaxSize()) {
        Column(verticalArrangement = Arrangement.SpaceAround ) {
            Row(modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.padding_small)),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                CatogariesCardButton(imageRes = R.drawable.icons8_dead_food_50, strRes = R.string.str4)
                CatogariesCardButton(imageRes = R.drawable.icons8_food_16, strRes = R.string.str4)
                CatogariesCardButton(imageRes = R.drawable.icons8_food_50, strRes = R.string.str4)
            }
            Row(modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.padding_small)),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                CatogariesCardButton(imageRes = R.drawable.icons8_fast_food_48, strRes = R.string.str4)
                CatogariesCardButton(imageRes = R.drawable.icons8_food_bar_16, strRes = R.string.str4)
                CatogariesCardButton(imageRes = R.drawable.icons8_food_bar_64, strRes = R.string.str4)
            }
            Row(modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.padding_small)),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                CatogariesCardButton(imageRes = R.drawable.icons8_food_bar_48, strRes = R.string.str4)
                CatogariesCardButton(imageRes = R.drawable.icons8_international_food_50, strRes = R.string.str4)
                CatogariesCardButton(imageRes = R.drawable.icons8_take_away_food_64, strRes = R.string.str4)
            }
            Row(modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.padding_small)),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                CatogariesCardButton(imageRes = R.drawable.icons8_vegan_food_50, strRes = R.string.str4)
                CatogariesCardButton(imageRes = R.drawable.icons8_street_food_50, strRes = R.string.str4)
                CatogariesCardButton(imageRes = R.drawable.icons8_food_50, strRes = R.string.str4)
            }
        }
    }
}

@Composable
fun CatogariesCardButton(imageRes: Int,strRes : Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = imageRes),
            modifier = Modifier
                .size(40.dp)
                .clickable { }
                .padding(dimensionResource(id = R.dimen.padding_small)),
            contentDescription = "null")
        Text(text = stringResource(id = strRes), style = MaterialTheme.typography.bodySmall)
    }
}



@Preview(showBackground = true)
@Composable
fun DishBookPreview() {
    DishBookTheme {

    }
}