# TAGLINE

Chat with AI models from the terminal

# TLDR

**Ask a question**

```aichat "[explain quicksort]"```

**Pipe input for analysis**

```cat [file.py] | aichat "[review this code]"```

**Use a specific model**

```aichat --model [claude:claude-sonnet-4-20250514] "[question]"```

**Execute shell commands from natural language**

```aichat -e "[list large files in current directory]"```

**Start interactive chat session**

```aichat```

**Use a role/persona**

```aichat --role [shell] "[find duplicate files]"```

**Process a file**

```aichat --file [document.pdf] "[summarize this]"```

# SYNOPSIS

**aichat** [_options_] [_prompt_]

# PARAMETERS

**-m**, **--model** _MODEL_
> Model to use (provider:model format).

**-r**, **--role** _ROLE_
> Use a predefined role/persona.

**-e**, **--execute**
> Execute mode: translate natural language to shell commands.

**--file** _FILE_
> Include file in the conversation.

**-S**, **--no-stream**
> Disable streaming output.

**--list-models**
> List available models.

**--list-roles**
> List available roles.

**--info**
> Show current configuration.

# DESCRIPTION

**aichat** is an all-in-one AI CLI tool supporting chat, command execution, and RAG (Retrieval-Augmented Generation). It works with 20+ AI providers including OpenAI, Claude, Gemini, Ollama, Azure, and many more.

In chat mode, it provides a REPL with conversation history, multi-line input, and syntax highlighting. Execute mode translates natural language descriptions into shell commands and optionally runs them. RAG mode indexes documents for question-answering over local files.

Roles define reusable personas and system prompts. Built-in roles include %code%, %shell%, %explain-shell%, and %functions%. Custom roles are defined as individual files in the roles configuration directory.

The tool supports function calling, allowing AI models to invoke defined tools. Sessions persist conversations across invocations. Multiple providers and models can be configured simultaneously.

Install via `cargo install aichat`, Homebrew, or download binaries.

# CONFIGURATION

**~/.config/aichat/config.yaml**
> Main configuration file for model settings, API keys, roles, and default parameters.

**~/.config/aichat/roles/**
> Directory of custom role definitions, each as an individual file.

# CAVEATS

API keys required for cloud providers. Configuration file needed for multi-provider setup. RAG indexing requires additional setup. Token usage and costs vary by provider and model.

# HISTORY

**aichat** was created by **sigoden** in **2023** as a unified CLI for interacting with multiple AI providers. It grew from a simple chat tool into a comprehensive AI terminal toolkit with execute mode, RAG, and agent capabilities.

# SEE ALSO

[mods](/man/mods)(1), [smartcat](/man/smartcat)(1), [ollama](/man/ollama)(1), [llm](/man/llm)(1)
