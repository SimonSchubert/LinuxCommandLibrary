# TAGLINE

Terminal AI chatbot client

# TLDR

**Ask question**

```tgpt "[What is Linux?]"```

**Interactive mode**

```tgpt -i```

**Code mode**

```tgpt -c "[Write a Python hello world]"```

**Multiline input**

```tgpt -m```

**With specific provider**

```tgpt --provider [openai] "[question]"```

**Generate image**

```tgpt -img "[A sunset over mountains]"```

# SYNOPSIS

**tgpt** [_-i_] [_-c_] [_--provider name_] [_options_] [_prompt_]

# PARAMETERS

**-i**
> Interactive mode.

**-c**
> Code generation.

**-m**
> Multiline input.

**--provider** _NAME_
> AI provider.

**-img**
> Image generation.

**-s**
> Silent mode.

# DESCRIPTION

**tgpt** is a terminal-based client for interacting with AI language models from multiple providers including OpenAI, Anthropic, and others. It supports one-shot prompts, interactive conversation mode (**-i**), and specialized code generation mode (**-c**).

The tool can also generate images using models like DALL-E via the **-img** flag. Some providers work without requiring API keys, while others need keys configured for authentication. Multiline input mode (**-m**) allows composing longer prompts directly in the terminal.

# CAVEATS

API key may be needed. Network required. Provider-specific features.

# HISTORY

**tgpt** was created as a terminal-based interface to various AI language models without requiring API keys for some providers.

# SEE ALSO

[chatgpt-cli](/man/chatgpt-cli)(1), [sgpt](/man/sgpt)(1)
