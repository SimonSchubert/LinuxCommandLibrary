package com.linuxcommandlibrary.app.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
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
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.linuxcommandlibrary.app.platform.showRateAppButton
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.app_logo
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import com.linuxcommandlibrary.app.ui.composables.AutoSizeText
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.shared.Version
import org.jetbrains.compose.resources.painterResource

@Composable
fun AppInfoDialog(
    onDismiss: () -> Unit = {},
    onOpenLicenses: () -> Unit = {},
) {
    val uriHandler = LocalUriHandler.current
    val githubPainter = rememberIconPainter(AppIcon.GITHUB)

    Dialog(onDismissRequest = { onDismiss() }) {
        Card(
            // widthIn caps the desktop window, where the platform default lets the dialog grow
            // far wider than this much text needs. The Column below fills width but not height,
            // so the card hugs its content instead of stretching to the whole window.
            modifier = Modifier.widthIn(max = 400.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 16.dp),
            shape = RoundedCornerShape(24.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 24.dp, vertical = 28.dp),
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

                // Outlined, not filled: Sponsor below is the dialog's single primary action now,
                // and two filled buttons competing for it read as noise.
                val rateButton: @Composable (Modifier) -> Unit = { buttonModifier ->
                    OutlinedButton(
                        onClick = {
                            uriHandler.openUri("https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca")
                        },
                        modifier = buttonModifier.pointerHoverIcon(PointerIcon.Hand),
                        shape = RoundedCornerShape(12.dp),
                    ) {
                        AutoSizeText("Rate the app")
                    }
                }
                val githubButton: @Composable (Modifier) -> Unit = { buttonModifier ->
                    OutlinedButton(
                        onClick = {
                            uriHandler.openUri("https://github.com/SimonSchubert/LinuxCommandLibrary")
                        },
                        modifier = buttonModifier.pointerHoverIcon(PointerIcon.Hand),
                        shape = RoundedCornerShape(12.dp),
                    ) {
                        Icon(
                            painter = githubPainter,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp),
                        )
                        Spacer(Modifier.width(8.dp))
                        AutoSizeText("GitHub")
                    }
                }
                BoxWithConstraints(modifier = Modifier.fillMaxWidth()) {
                    // Half of a narrow dialog leaves each label about 37dp - "GitHub" came out as
                    // "Gi / tH / ub". Stack the buttons when the dialog is narrow (largest display
                    // size) or the text is scaled up, so each label gets the full width.
                    val stack = maxWidth < 260.dp || LocalDensity.current.fontScale > 1.3f
                    if (stack) {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            if (showRateAppButton) {
                                rateButton(Modifier.fillMaxWidth())
                            }
                            githubButton(Modifier.fillMaxWidth())
                        }
                    } else {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            if (showRateAppButton) {
                                rateButton(Modifier.weight(1f))
                            }
                            githubButton(Modifier.weight(1f))
                        }
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
                    "Linux Command Library is free, open source and ad-free. Sponsoring keeps it that way.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                )
                Spacer(Modifier.height(12.dp))
                // Filled rather than outlined: with the affiliate banners gone this is the only
                // call to action in the section, so it carries the emphasis they used to.
                Button(
                    onClick = {
                        uriHandler.openUri("https://github.com/sponsors/SimonSchubert")
                    },
                    modifier = Modifier.fillMaxWidth().pointerHoverIcon(PointerIcon.Hand),
                    shape = RoundedCornerShape(12.dp),
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.White),
                ) {
                    Icon(
                        painter = githubPainter,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp),
                    )
                    Spacer(Modifier.width(8.dp))
                    AutoSizeText("Sponsor on GitHub")
                }

                Spacer(Modifier.height(8.dp))
                TextButton(
                    onClick = onOpenLicenses,
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                ) {
                    AutoSizeText("Open source licenses")
                }
            }
        }
    }
}
