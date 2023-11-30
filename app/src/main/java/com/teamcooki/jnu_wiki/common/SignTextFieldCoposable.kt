package com.teamcooki.jnu_wiki.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teamcooki.jnu_wiki.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignTextField(
    title: String,
    captionText: String,
    onChange: (String) -> Unit,
    text: String,
    visible: Boolean? = null,
    changeVisible: () -> Unit = {}
) {
    Text(
        text = title,
        color = colorResource(id = R.color.main_color_bright),
        fontSize = 16.sp
    )
    Spacer(modifier = Modifier.height(8.dp))

    OutlinedTextField(
        value = text,
        onValueChange = {
            onChange
        },
        colors = TextFieldDefaults.textFieldColors(
            cursorColor = colorResource(id = R.color.main_color_bright),
            focusedIndicatorColor = colorResource(id = R.color.main_color_bright)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        shape = RoundedCornerShape(8.dp),
        placeholder = {
            Text(
                text = captionText,
                color = colorResource(id = R.color.placeholder_color),
                fontSize = 14.sp
            )
        },
        visualTransformation = if (visible == null || visible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            if (visible != null) {
                val image = if (visible)
                    R.drawable.visible_icon
                else R.drawable.visible_off_icon

                val description =
                    if (visible) stringResource(R.string.content_description_hide_pw)
                    else stringResource(R.string.content_description_show_pw)

                IconButton(onClick = changeVisible) {
                    Icon(
                        painter = painterResource(id = image),
                        contentDescription = description,
                    )
                }
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
    )
}