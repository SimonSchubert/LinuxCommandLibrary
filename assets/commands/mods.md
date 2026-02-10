# TAGLINE

terminal AI assistant

# TLDR

**Ask AI**

```mods "[explain this code]"```

**Pipe input**

```cat [file.py] | mods "[review this code]"```

**Use specific model**

```mods --model [gpt-4] "[question]"```

**Conversation mode**

```mods --continue "[follow up]"```

**Format output**

```mods --format "[explain in markdown]"```

**List models**

```mods --list```

# SYNOPSIS

**mods** [_options_] _prompt_

# PARAMETERS

_PROMPT_
> Question or instruction.

**--model** _NAME_
> AI model to use.

**--continue**
> Continue conversation.

**--format** _FMT_
> Output format hint.

**--list**
> List available models.

**--help**
> Display help information.

# DESCRIPTION

**mods** is a terminal AI assistant. It queries language models from the command line.

The tool supports piping and formatting. Works with OpenAI and other providers.

# CAVEATS

API key required. Usage costs apply. Go-based tool by Charm.

# HISTORY

mods was created by **Charm** to provide terminal-based access to AI language models.

# SEE ALSO

[llm](/man/llm)(1), [ollama](/man/ollama)(1), [glow](/man/glow)(1)

