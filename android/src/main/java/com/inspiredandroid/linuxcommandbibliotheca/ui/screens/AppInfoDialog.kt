package com.inspiredandroid.linuxcommandbibliotheca.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LinuxTheme
import com.linuxcommandlibrary.shared.*

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

// Todo: Replace with AlertDialog

@Composable
fun AppInfoDialog(
    onDismiss: () -> Unit = {},
) {
    val uriHandler = LocalUriHandler.current
    Dialog(onDismissRequest = { onDismiss() }) {
        Card(
            elevation = 8.dp,
            shape = RoundedCornerShape(6.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Text(
                    stringResource(R.string.app_name),
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier.padding(8.dp),
                )
                Row {
                    Button(
                        modifier = Modifier.padding(start = 6.dp),
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
                    IconButton(onClick = {
                        uriHandler.openUri("https://github.com/SimonSchubert/LinuxCommandLibrary")
                    }) {
                        Icon(
                            painterResource(R.drawable.ic_icons8_github),
                            contentDescription = null,
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
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                val link = "https://linuxcommandlibrary.com/proton-free-2025"
                                uriHandler.openUri(link)
                            },
                        painter = painterResource(R.mipmap.proton_free_horizontal),
                        contentDescription = null,
                    )
                    Spacer(Modifier.height(8.dp))
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                val link = "https://linuxcommandlibrary.com/linode-2025"
                                uriHandler.openUri(link)
                            },
                        painter = painterResource(R.mipmap.linode_horizontal),
                        contentDescription = null,
                    )

                    Spacer(Modifier.height(8.dp))
                    Text("Man pages", style = MaterialTheme.typography.h6)
                    Text("Licence information about the man page is usually specified in the man detail page under the category Author, Copyright or Licence. If there is no information on the page you can find the information in the man page source file on your linux system. If you have questions or can't find what you need, you can contact me at sschubert89@gmail.com.")

                    Spacer(Modifier.height(8.dp))
                    Text("TLDR pages", style = MaterialTheme.typography.h6)
                    Text(
                        "The MIT License (MIT) Copyright (c) 2014 the TLDR team and contributors Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the 'Software'), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.",
                    )
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
                        .padding(end = 6.dp),
                    onClick = onDismiss,
                )
            }
        }
    }
}

@Preview
@Composable
fun AppInfoDialogPreview() {
    LinuxTheme {
        AppInfoDialog()
    }
}
