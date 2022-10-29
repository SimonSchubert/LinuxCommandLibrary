package com.inspiredandroid.linuxcommandbibliotheca.ui.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.ui.shared.CommandView
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LinuxTheme
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.ManCommandElement
import com.linuxcommandlibrary.shared.TextCommandElement

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
fun NestedCommandView(text: String, command: String, commandElements: List<CommandElement>, onNavigate: (String) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.width(40.dp),
            textAlign = TextAlign.Center
        )
        CommandView(
            command,
            commandElements,
            onNavigate
        )
    }
}

@Composable
@Preview
fun NestedCommandViewPreview() {
    LinuxTheme {
        NestedCommandView(
            text = "",
            command = "$ find ex?mple.txt",
            commandElements = listOf(
                TextCommandElement("$ "),
                ManCommandElement("find"),
                TextCommandElement(" ex?mple.txt")
            ),
            onNavigate = {})
    }
}