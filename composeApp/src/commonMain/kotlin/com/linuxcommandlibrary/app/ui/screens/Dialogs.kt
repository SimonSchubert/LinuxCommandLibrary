package com.linuxcommandlibrary.app.ui.screens

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.linuxcommandlibrary.app.platform.showRateAppButton
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.af_linode
import com.linuxcommandlibrary.app.resources.af_proton
import com.linuxcommandlibrary.app.resources.app_logo
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import com.linuxcommandlibrary.app.ui.composables.SectionTitle
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.shared.Version
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource

@Composable
fun AppInfoDialog(
    onDismiss: () -> Unit = {},
) {
    val uriHandler = LocalUriHandler.current
    val githubPainter = rememberIconPainter(AppIcon.GITHUB)

    Dialog(onDismissRequest = { onDismiss() }) {
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 16.dp),
            shape = RoundedCornerShape(24.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = painterResource(Res.drawable.app_logo),
                    contentDescription = null,
                    modifier = Modifier.size(72.dp).clip(RoundedCornerShape(16.dp)),
                )
                Spacer(Modifier.height(12.dp))
                Text(
                    "Linux Command Library",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    "Version ${Version.APP_VERSION}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                )

                Spacer(Modifier.height(20.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    if (showRateAppButton) {
                        Button(
                            onClick = {
                                uriHandler.openUri("https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca")
                            },
                            modifier = Modifier.weight(1f).pointerHoverIcon(PointerIcon.Hand),
                            shape = RoundedCornerShape(12.dp),
                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
                            colors = ButtonDefaults.buttonColors(contentColor = Color.White),
                        ) {
                            Text("Rate the app")
                        }
                    }
                    OutlinedButton(
                        onClick = {
                            uriHandler.openUri("https://github.com/SimonSchubert/LinuxCommandLibrary")
                        },
                        modifier = Modifier.weight(1f).pointerHoverIcon(PointerIcon.Hand),
                        shape = RoundedCornerShape(12.dp),
                    ) {
                        Icon(
                            painter = githubPainter,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp),
                        )
                        Spacer(Modifier.width(8.dp))
                        Text("GitHub")
                    }
                }

                Spacer(Modifier.height(20.dp))
                HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f))
                Spacer(Modifier.height(20.dp))
                Text(
                    "Support this project",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    "By using my referral links for these amazing products.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
                )
                Spacer(Modifier.height(12.dp))
                OutlinedButton(
                    onClick = {
                        uriHandler.openUri("https://github.com/sponsors/SimonSchubert")
                    },
                    modifier = Modifier.fillMaxWidth().pointerHoverIcon(PointerIcon.Hand),
                    shape = RoundedCornerShape(12.dp),
                ) {
                    Icon(
                        painter = githubPainter,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp),
                    )
                    Spacer(Modifier.width(8.dp))
                    Text("Sponsor on GitHub")
                }
                Spacer(Modifier.height(12.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    Image(
                        painter = painterResource(Res.drawable.af_proton),
                        contentDescription = "Proton Free",
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(12.dp))
                            .pointerHoverIcon(PointerIcon.Hand)
                            .clickable {
                                uriHandler.openUri("https://linuxcommandlibrary.com/proton-free-2025")
                            },
                    )
                    Image(
                        painter = painterResource(Res.drawable.af_linode),
                        contentDescription = "Linode Cloud",
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(12.dp))
                            .pointerHoverIcon(PointerIcon.Hand)
                            .clickable {
                                uriHandler.openUri("https://linuxcommandlibrary.com/linode-2025")
                            },
                    )
                }

                Spacer(Modifier.height(24.dp))

                Text(
                    "Acknowledgements",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    "Man pages",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium,
                )
                Text(
                    "Licence information about the man page is usually specified in the man detail page under the category Author, Copyright or Licence.",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                )
                Spacer(Modifier.height(12.dp))
                Text(
                    "TLDR pages",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium,
                )
                Text(
                    "The MIT License (MIT) Copyright (c) 2014 the TLDR team and contributors",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                )
                Spacer(Modifier.height(12.dp))
                Text(
                    "Thanks to icons8.com for the icons",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
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
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
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
