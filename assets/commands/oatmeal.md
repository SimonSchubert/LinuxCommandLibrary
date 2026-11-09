# TAGLINE

Terminal UI for chatting with large language models

# TLDR

**Start a chat session**

```oatmeal```

**Chat with a specific model**

```oatmeal --model [model_name]```

**Use a specific backend**

```oatmeal --backend [ollama|openai|claude|gemini|langchain]```

**Integrate with Neovim**

```oatmeal --editor neovim```

**List previous sessions**

```oatmeal sessions list```

**Reopen a session** from an interactive list

```oatmeal sessions open```

**Create the default config file**

```oatmeal config create```

# SYNOPSIS

**oatmeal** [_options_] [_command_]

# PARAMETERS

**-m**, **--model** _MODEL_
> Initial model to use. Defaults to the first model available from the backend.

**-b**, **--backend** _BACKEND_
> Model backend: ollama (default), openai, claude, gemini or langchain.

**-e**, **--editor** _EDITOR_
> Editor to integrate with: clipboard (default), neovim or none.

**-c**, **--config-file** _FILE_
> Path to the configuration file.

**-t**, **--theme** _THEME_
> Code syntax highlighting theme.

**--theme-file** _FILE_
> Absolute path to a TextMate tmTheme file.

**--backend-health-check-timeout** _MS_
> Milliseconds to wait for a backend health check.

**--ollama-url** _URL_
> Ollama API URL.

**--open-ai-url** _URL_
> OpenAI API URL, or a compatible proxy.

**--lang-chain-url** _URL_
> LangChain Serve API URL.

**--open-ai-token**, **--claude-token**, **--gemini-token** _TOKEN_
> API tokens. Also available as the **OATMEAL_OPENAI_TOKEN**, **OATMEAL_CLAUDE_TOKEN** and **OATMEAL_GEMINI_TOKEN** environment variables.

# COMMANDS

**chat**
> Start a new chat session.

**sessions** **list** | **open** [**-i** _ID_] | **delete** (**-i** _ID_ | **--all**) | **dir**
> Manage past chat sessions.

**config** **create** | **default** | **path**
> Manage the configuration file.

**completions** **-s** _SHELL_
> Generate shell completions.

**manpages**
> Generate man pages on stdout.

# DESCRIPTION

**oatmeal** is a TUI for chatting with large language models using different backends. It integrates with editors so you can read selected code from an editor and submit model-provided code back. Each code block is indexed with a number for easy reference.

Supported backends include Ollama (default), OpenAI and compatible proxies, and experimental support for Claude, Gemini and LangChain. Editor integrations include clipboard (default) and Neovim plugin support.

# CAVEATS

Requires a running model backend (e.g., Ollama server) or valid API keys for cloud services.

# HISTORY

**oatmeal** was created by **dustinblackman** and is written in **Rust**. The latest release is v0.13.0 from March 2024.

# SEE ALSO

[ollama](/man/ollama)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/dustinblackman/oatmeal)```

```[Homepage](https://dustinblackman.com/posts/oatmeal/)```

<!-- verified: 2026-11-09 -->
