package com.inspiredandroid.linuxcommandbibliotheca.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.SectionTitle
import kotlinx.coroutines.delay

@Composable
fun BookmarkFeedbackDialog(onDismiss: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(600)
        onDismiss()
    }

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
                    painterResource(R.drawable.ic_bookmark_black_24dp),
                    contentDescription = null, // Decorative, as title says "Bookmarked"
                    modifier = Modifier.size(48.dp),
                )

                Spacer(Modifier.height(8.dp))

                SectionTitle(title = "Bookmarked")
            }
        }
    }
}
