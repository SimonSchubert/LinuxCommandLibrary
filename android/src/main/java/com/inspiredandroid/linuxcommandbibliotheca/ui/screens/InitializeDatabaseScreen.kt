package com.inspiredandroid.linuxcommandbibliotheca.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.linuxcommandlibrary.shared.copyDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun InitializeDatabaseScreen(onFinish: () -> Unit = {}) {
    var status by remember {
        mutableIntStateOf(0)
    }
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painterResource(R.mipmap.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier
                .size(240.dp)
                .align(Alignment.CenterHorizontally),
        )
        Text(
            "Initialize database",
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
        LinearProgressIndicator(
            progress = status.div(100f),
            modifier = Modifier.padding(top = 16.dp),
        )
    }

    LaunchedEffect(Unit) {
        coroutineScope.launch(Dispatchers.IO) {
            copyDatabase(context) {
                status = it
            }
            withContext(Dispatchers.Main) {
                onFinish()
            }
        }
    }
}
