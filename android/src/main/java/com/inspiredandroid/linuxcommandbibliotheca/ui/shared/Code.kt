@file:OptIn(ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.shared

import android.content.Intent
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.inspiredandroid.linuxcommandbibliotheca.R
import org.example.common.*

/* Copyright 2022 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

@Composable
fun Code(command: String, mans: String, onNavigate: (String) -> Unit = {}) {
    val elements = remember(command, mans) {
        command.getCommandList(mans)
    }
    val codeColor = MaterialTheme.colors.primary
    val annotatedString = remember(codeColor) {
        buildAnnotatedString {
            elements.forEachIndexed { index, element ->
                when (element) {
                    is TextElement -> append(element.text.replace("\\n", ""))
                    is ManElement -> {
                        pushStringAnnotation(tag = "$index", annotation = element.man)
                        withStyle(style = SpanStyle(color = codeColor)) {
                            append(element.man)
                        }
                        pop()
                    }
                    is UrlElement -> {
                        pushStringAnnotation(tag = "$index", annotation = element.url)
                        withStyle(style = SpanStyle(color = codeColor)) {
                            append(element.command)
                        }
                        pop()
                    }
                }
            }
        }
    }

    val uriHandler = LocalUriHandler.current
    ListItem(text = {
        ClickableText(text = annotatedString, style = MaterialTheme.typography.subtitle2, onClick = { offset ->
            elements.forEachIndexed { index, element ->
                if (element is UrlElement) {
                    annotatedString.getStringAnnotations(tag = "$index", start = offset, end = offset)
                        .firstOrNull()
                        ?.let {
                            uriHandler.openUri(it.item)
                        }
                }
                if (element is ManElement) {
                    annotatedString.getStringAnnotations(tag = "$index", start = offset, end = offset)
                        .firstOrNull()
                        ?.let {
                            val command = databaseHelper.getCommand(it.item)
                            if (command != null) {
                                onNavigate("command?commandId=${command.id}&commandName=${command.name}")
                            }
                        }
                }
            }
        })
    }, trailing = {
        val shareCommand = shareCommandLambda(command)
        IconButton(onClick = {
            shareCommand()
        }) {
            Icon(
                imageVector = Icons.Filled.Share,
                contentDescription = stringResource(R.string.share)
            )
        }
    })
}

@Composable
fun shareCommandLambda(command: String): () -> Unit {
    val context = LocalContext.current
    return {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, command.dropWhile { it == '$' || it.isWhitespace() }.replace("\\n", ""))
        try {
            context.startActivity(Intent.createChooser(intent, "Share command"))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
