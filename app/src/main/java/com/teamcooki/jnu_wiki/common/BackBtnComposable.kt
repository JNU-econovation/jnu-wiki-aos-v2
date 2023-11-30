package com.teamcooki.jnu_wiki.common

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.teamcooki.jnu_wiki.R

@Composable
fun BackButton(onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(
            painter = painterResource(id = R.drawable.back_icon),
            contentDescription = stringResource(R.string.content_description_back_btn),
            tint = colorResource(id = R.color.jnu_gray),
        )
    }
}