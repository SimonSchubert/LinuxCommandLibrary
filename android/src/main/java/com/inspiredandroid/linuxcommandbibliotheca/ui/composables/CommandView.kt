package com.inspiredandroid.linuxcommandbibliotheca.ui.shared

import android.content.Intent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LinuxTheme
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.ManCommandElement
import com.linuxcommandlibrary.shared.TextCommandElement
import com.linuxcommandlibrary.shared.UrlCommandElement
import com.linuxcommandlibrary.shared.databaseHelper

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
fun CommandView(command: String, elements: List<CommandElement>, onNavigate: (String) -> Unit = {}) {
    val codeColor = MaterialTheme.colors.primary
    val annotatedString = remember(codeColor) {
        buildAnnotatedString {
            elements.forEachIndexed { index, element ->
                when (element) {
                    is TextCommandElement -> append(element.text)
                    is ManCommandElement -> {
                        pushStringAnnotation(tag = "$index", annotation = element.man)
                        withStyle(style = SpanStyle(color = codeColor)) {
                            append(element.man)
                        }
                        pop()
                    }

                    is UrlCommandElement -> {
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
    Row(modifier = Modifier.padding(start = 12.dp, end = 4.dp, top = 8.dp, bottom = 8.dp)) {
        ClickableText(
            text = annotatedString,
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),
            style = MaterialTheme.typography.subtitle2,
            onClick = { offset ->
                elements.forEachIndexed { index, element ->
                    if (element is UrlCommandElement) {
                        annotatedString.getStringAnnotations(
                            tag = "$index",
                            start = offset,
                            end = offset
                        )
                            .firstOrNull()
                            ?.let {
                                uriHandler.openUri(it.item)
                            }
                    }
                    if (element is ManCommandElement) {
                        annotatedString.getStringAnnotations(
                            tag = "$index",
                            start = offset,
                            end = offset
                        )
                            .firstOrNull()
                            ?.let {
                                val manCommand = databaseHelper.getCommand(it.item)
                                if (manCommand != null) {
                                    onNavigate("command?commandId=${manCommand.id}&commandName=${manCommand.name}")
                                }
                            }
                    }
                }
            })
        val shareCommand = shareCommandLambda(command)
        IconButton(
            modifier = Modifier.align(Alignment.CenterVertically),
            onClick = {
                shareCommand()
            }) {
            Icon(
                imageVector = Icons.Filled.Share,
                contentDescription = stringResource(R.string.share)
            )
        }
    }
}

@Composable
fun shareCommandLambda(command: String): () -> Unit {
    val context = LocalContext.current
    return {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(
            Intent.EXTRA_TEXT,
            command.dropWhile { it == '$' || it.isWhitespace() }.replace("\\n", "")
        )
        try {
            context.startActivity(Intent.createChooser(intent, "Share command"))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}


@Composable
@Preview
fun CommandViewPreview() {
    LinuxTheme {
        CommandView(
            command = "$ find ex?mple.txt",
            elements = listOf(
                TextCommandElement("$ "),
                ManCommandElement("find"),
                TextCommandElement(" ex?mple.txt")
            ),
        )
    }
}