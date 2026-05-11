package com.linuxcommandlibrary.app.ui.screens.aichat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.ai.chat.ChatViewModel
import com.linuxcommandlibrary.ai.llm.LlmConfig
import com.linuxcommandlibrary.ai.llm.LlmProviderType
import com.linuxcommandlibrary.app.ui.composables.PaneTopBar
import org.koin.compose.koinInject

/**
 * Settings screen for configuring the AI provider.
 *
 * Supports selecting the provider type (OpenAI, Ollama, OpenAI-compatible),
 * entering API key, custom base URL, and model ID.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AiSettingsScreen(onBack: () -> Unit) {
    val viewModel: ChatViewModel = koinInject()
    val currentConfig = remember { viewModel.loadConfig() }

    var selectedProvider by remember { mutableStateOf(currentConfig.providerType) }
    var apiKey by remember { mutableStateOf(currentConfig.apiKey) }
    var baseUrl by remember { mutableStateOf(currentConfig.baseUrl) }
    var modelId by remember { mutableStateOf(currentConfig.modelId) }
    var providerDropdownExpanded by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize()) {
        PaneTopBar(title = "Ustawienia AI", onBack = onBack)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
        ) {
            Text(
                text = "Dostawca modelu LLM",
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(Modifier.height(12.dp))

            ExposedDropdownMenuBox(
                expanded = providerDropdownExpanded,
                onExpandedChange = { providerDropdownExpanded = it },
                modifier = Modifier.fillMaxWidth(),
            ) {
                OutlinedTextField(
                    value = selectedProvider.displayName,
                    onValueChange = {},
                    readOnly = true,
                    label = { Text("Dostawca") },
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(providerDropdownExpanded) },
                    modifier = Modifier.fillMaxWidth().menuAnchor(),
                    shape = RoundedCornerShape(12.dp),
                )
                ExposedDropdownMenu(
                    expanded = providerDropdownExpanded,
                    onDismissRequest = { providerDropdownExpanded = false },
                ) {
                    LlmProviderType.entries.forEach { type ->
                        DropdownMenuItem(
                            text = { Text(type.displayName) },
                            onClick = {
                                selectedProvider = type
                                if (baseUrl.isBlank()) baseUrl = type.defaultBaseUrl
                                if (modelId.isBlank()) modelId = type.defaultModel
                                providerDropdownExpanded = false
                            },
                        )
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            if (selectedProvider != LlmProviderType.OLLAMA) {
                OutlinedTextField(
                    value = apiKey,
                    onValueChange = { apiKey = it },
                    label = { Text("Klucz API") },
                    placeholder = { Text("sk-…") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                )
                Spacer(Modifier.height(16.dp))
            }

            OutlinedTextField(
                value = baseUrl,
                onValueChange = { baseUrl = it },
                label = { Text("URL serwera") },
                placeholder = { Text(selectedProvider.defaultBaseUrl) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
            )

            Spacer(Modifier.height(16.dp))

            OutlinedTextField(
                value = modelId,
                onValueChange = { modelId = it },
                label = { Text("Identyfikator modelu") },
                placeholder = { Text(selectedProvider.defaultModel) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
            )

            Spacer(Modifier.height(24.dp))

            Button(
                onClick = {
                    viewModel.saveConfig(
                        LlmConfig(
                            providerType = selectedProvider,
                            apiKey = apiKey,
                            baseUrl = baseUrl,
                            modelId = modelId,
                        ),
                    )
                    onBack()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .pointerHoverIcon(PointerIcon.Hand),
                shape = RoundedCornerShape(12.dp),
            ) {
                Text("Zapisz konfigurację")
            }

            Spacer(Modifier.height(16.dp))

            Text(
                text = buildString {
                    appendLine("Obsługiwane dostawcy:")
                    appendLine("• OpenAI — wymaga klucza API (platform.openai.com)")
                    appendLine("• Ollama — lokalny serwer LLM, domyślnie http://localhost:11434")
                    appendLine("• Kompatybilny z OpenAI — Groq, LM Studio, LocalAI i inne")
                },
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
            )
        }
    }
}
