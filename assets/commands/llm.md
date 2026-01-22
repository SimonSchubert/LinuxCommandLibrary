# TLDR

**Chat with default model**

```llm "[prompt]"```

**Use specific model**

```llm -m [gpt-4] "[prompt]"```

**Chat mode**

```llm chat```

**Continue conversation**

```llm -c "[follow up]"```

**List models**

```llm models```

**Pipe input**

```cat [file.txt] | llm "[summarize this]"```

# SYNOPSIS

**llm** [_options_] [_prompt_]

# PARAMETERS

_PROMPT_
> Text prompt for the model.

**-m** _MODEL_
> Model to use.

**-c**
> Continue last conversation.

**-s** _SYSTEM_
> System prompt.

**chat**
> Start interactive chat.

**models**
> List available models.

**--help**
> Display help information.

# DESCRIPTION

**llm** is a CLI for interacting with language models. It supports multiple providers including OpenAI and local models.

The tool manages conversations, templates, and API keys. It supports piping and scripting.

llm accesses language models.

# CAVEATS

Requires API keys for cloud models. Conversation history stored locally. Python-based tool.

# HISTORY

llm was created by **Simon Willison** to provide unified CLI access to various language model APIs and local models.

# SEE ALSO

[ollama](/man/ollama)(1), [chatgpt](/man/chatgpt)(1)

