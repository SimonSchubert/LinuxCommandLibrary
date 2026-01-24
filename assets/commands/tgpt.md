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

**tgpt** chats with AI models. It's a terminal GPT client.

Multiple providers. OpenAI, Anthropic, etc.

Code generation mode. Programming help.

Interactive chat. Conversation mode.

Image generation. DALL-E support.

# CAVEATS

API key may be needed. Network required. Provider-specific features.

# HISTORY

**tgpt** was created as a terminal-based interface to various AI language models without requiring API keys for some providers.

# SEE ALSO

[chatgpt-cli](/man/chatgpt-cli)(1), [sgpt](/man/sgpt)(1)
