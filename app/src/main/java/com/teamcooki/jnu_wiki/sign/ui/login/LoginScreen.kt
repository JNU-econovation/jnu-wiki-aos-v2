package com.teamcooki.jnu_wiki.sign.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teamcooki.jnu_wiki.R
import com.teamcooki.jnu_wiki.common.BackButton
import com.teamcooki.jnu_wiki.common.SignTextField
import com.teamcooki.jnu_wiki.home.ui.theme.Jnu_WikiTheme


@Composable
fun LoginScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(20.dp))
        LoginBackBtn()
        Spacer(modifier = Modifier.weight(1f))
        LoginTitleText()
        Spacer(modifier = Modifier.height(8.dp))
        LoginWelcomeText()
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            SignTextField(
                title = stringResource(id = R.string.email_text),
                captionText = stringResource(id = R.string.sign_caption_email_text),
                onChange = {},
                text = ""
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            SignTextField(
                title = stringResource(id = R.string.pw_text),
                captionText = stringResource(
                    id = R.string.sign_caption_pw_text
                ),
                onChange = {},
                text = "",
                visible = false,
                changeVisible = {}
            )
        }
        Spacer(modifier = Modifier.weight(2f))
        LoginSubmitBtn()
        Spacer(modifier = Modifier.height(40.dp))
        LoginSignInBtn()
        Spacer(modifier = Modifier.weight(2f))
    }
}

@Composable
fun LoginBackBtn() {
    Row {
        Spacer(modifier = Modifier.width(16.dp))
        BackButton{

        }
    }
}

@Composable
fun LoginTitleText() {
    Row {
        Spacer(modifier = Modifier.width(24.dp))
        Text(
            text = stringResource(R.string.login_text),
            fontSize = 32.sp,
            color = colorResource(id = R.color.jnu_main_color)
        )
    }
}

@Composable
fun LoginWelcomeText() {
    Row {
        Spacer(modifier = Modifier.width(24.dp))
        Text(
            text = stringResource(R.string.login_welcome_text),
            fontSize = 16.sp,
            color = colorResource(id = R.color.jnu_main_color)
        )
    }
}

@Composable
fun LoginSubmitBtn() {
    Row {
        Spacer(modifier = Modifier.width(12.dp))
        Button(
            onClick = {},
            modifier = Modifier.weight(1f),
            colors = buttonColors(
                backgroundColor = colorResource(id = R.color.main_color_bright)
            ),
        ) {
            Text(
                text = stringResource(id = R.string.login_text),
                color = colorResource(id = R.color.jnu_main_reverse_text_color),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
        }
        Spacer(modifier = Modifier.width(12.dp))
    }
}

@Composable
fun LoginSignInBtn() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.registe_question_text),
            color = colorResource(id = R.color.jnu_gray),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.width(4.dp))
        TextButton(onClick = {}) {
            Text(
                text = stringResource(R.string.registe_text),
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.jnu_main_color),
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jnu_WikiTheme {
        LoginScreen()
    }
}