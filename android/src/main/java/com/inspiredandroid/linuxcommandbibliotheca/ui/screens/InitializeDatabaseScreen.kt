package com.inspiredandroid.linuxcommandbibliotheca.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.example.common.copyDatabase

@Composable
fun InitializeDatabaseScreen(onFinish: () -> Unit = {}) {
    val status = remember {
        mutableStateOf(0)
    }
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Image(
                painterResource(R.mipmap.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier.size(240.dp).align(Alignment.CenterHorizontally)
            )
            Text("Initialize database", modifier = Modifier.align(Alignment.CenterHorizontally))
            LinearProgressIndicator(progress = status.value.div(100f), modifier = Modifier.padding(top = 16.dp))
        }
    }

    LaunchedEffect(Unit) {
        coroutineScope.launch {
            withContext(Dispatchers.IO) {
                copyDatabase(context) {
                    status.value = it
                }
                onFinish()
            }
        }
    }
}