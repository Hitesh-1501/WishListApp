package com.example.mywishlistapp


import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun AppBarView(
    title:String,
    onBackNavClick:()->Unit={}
){
    val navigationIcon : (@Composable () -> Unit)? =
        if(!title.contains("WishList")) {
            {
                IconButton(onClick = { onBackNavClick() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        tint = Color.White,
                        contentDescription = null
                    )
                }
            }
        }else{
            null
        }

    TopAppBar(title = { Text(text = title,
        modifier = Modifier
            .padding(start = 4.dp)
            .heightIn(max = 24.dp),
        color = colorResource(id = R.color.white),
       )
    },
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.app_bar_color),
        navigationIcon =  navigationIcon
    )
}