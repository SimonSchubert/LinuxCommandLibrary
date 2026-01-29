package com.linuxcommandlibrary.app.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.linuxcommandlibrary.app.platform.showRateAppButton
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import com.linuxcommandlibrary.app.ui.composables.SectionTitle
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.shared.Version
import kotlinx.coroutines.delay

@Composable
fun AppInfoDialog(
    onDismiss: () -> Unit = {},
) {
    val uriHandler = LocalUriHandler.current
    val githubPainter = rememberIconPainter(AppIcon.GITHUB)

    Dialog(onDismissRequest = { onDismiss() }) {
        Card(
            elevation = 8.dp,
            shape = RoundedCornerShape(6.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Text(
                    "Linux Command Library",
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier.padding(8.dp),
                )
                Row {
                    if (showRateAppButton) {
                        Button(
                            modifier = Modifier.padding(start = 6.dp).pointerHoverIcon(PointerIcon.Hand),
                            content = {
                                Text(
                                    "Rate the app",
                                    color = Color.White,
                                )
                            },
                            onClick = {
                                uriHandler.openUri("https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca")
                            },
                        )
                    }
                    IconButton(
                        modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                        onClick = {
                            uriHandler.openUri("https://github.com/SimonSchubert/LinuxCommandLibrary")
                        },
                    ) {
                        Icon(
                            painter = githubPainter,
                            contentDescription = "View on GitHub",
                            modifier = Modifier.size(40.dp),
                        )
                    }
                }
                Text(
                    "Version: ${Version.appVersion}",
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier.padding(8.dp),
                )
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                        .verticalScroll(rememberScrollState()),
                ) {
                    Text("Support this project", style = MaterialTheme.typography.h6)
                    Text("By using my referral links for these amazing products.")
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "Proton Free",
                        color = MaterialTheme.colors.primary,
                        modifier = Modifier
                            .pointerHoverIcon(PointerIcon.Hand)
                            .clickable {
                                uriHandler.openUri("https://linuxcommandlibrary.com/proton-free-2025")
                            },
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = "Linode Cloud",
                        color = MaterialTheme.colors.primary,
                        modifier = Modifier
                            .pointerHoverIcon(PointerIcon.Hand)
                            .clickable {
                                uriHandler.openUri("https://linuxcommandlibrary.com/linode-2025")
                            },
                    )
                    Spacer(Modifier.height(8.dp))
                    Text("Man pages", style = MaterialTheme.typography.h6)
                    Text("Licence information about the man page is usually specified in the man detail page under the category Author, Copyright or Licence.")

                    Spacer(Modifier.height(8.dp))
                    Text("TLDR pages", style = MaterialTheme.typography.h6)
                    Text("The MIT License (MIT) Copyright (c) 2014 the TLDR team and contributors")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "Thanks to commandlinefu.com for the one-liners and icons8.com for the icons",
                        style = MaterialTheme.typography.h6,
                    )
                }
                TextButton(
                    content = { Text("OK") },
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 6.dp)
                        .pointerHoverIcon(PointerIcon.Hand),
                    onClick = onDismiss,
                )
            }
        }
    }
}

@Composable
fun BookmarkFeedbackDialog(onDismiss: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(600)
        onDismiss()
    }

    val bookmarkPainter = rememberIconPainter(AppIcon.BOOKMARK)

    Dialog(onDismissRequest = onDismiss) {
        Card(
            elevation = 8.dp,
            shape = RoundedCornerShape(6.dp),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp),
            ) {
                Icon(
                    painter = bookmarkPainter,
                    contentDescription = null,
                    modifier = Modifier.size(48.dp),
                )

                Spacer(Modifier.height(8.dp))

                SectionTitle(title = "Bookmarked")
            }
        }
    }
}
