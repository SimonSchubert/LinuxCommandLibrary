# TAGLINE

Terminal UI for chatting with large language models

# TLDR

**Start a chat session**

```oatmeal```

**Chat with a specific model**

```oatmeal --model [model_name]```

**Use a specific backend**

```oatmeal --backend [ollama|openai|claude]```

# SYNOPSIS

**oatmeal** [_options_]

# PARAMETERS

**--model** _MODEL_
> Specify the model to use.

**--backend** _BACKEND_
> Select the model backend (ollama, openai, claude, gemini).

# DESCRIPTION

**oatmeal** is a TUI for chatting with large language models using different backends. It integrates with editors so you can read selected code from an editor and submit model-provided code back. Each code block is indexed with a number for easy reference.

Supported backends include Ollama (default), OpenAI, Claude, and Gemini. Editor integrations include clipboard and Neovim plugin support.

# CAVEATS

Requires a running model backend (e.g., Ollama server) or valid API keys for cloud services.

# HISTORY

**oatmeal** was created by **dustinblackman** and is written in **Rust**.

# SEE ALSO

[ollama](/man/ollama)(1), [claude](/man/claude)(1)
