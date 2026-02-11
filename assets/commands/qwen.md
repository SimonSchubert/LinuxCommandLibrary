# TAGLINE

CLI for Alibaba's Qwen AI models

# TLDR

**Chat with Qwen**

```qwen```

**Send prompt**

```qwen "[prompt]"```

**Use specific model**

```qwen --model [qwen-turbo] "[prompt]"```

# SYNOPSIS

**qwen** [_options_] [_prompt_]

# PARAMETERS

_PROMPT_
> Message to send.

**--model** _MODEL_
> Model to use.

**--temperature** _TEMP_
> Sampling temperature.

# DESCRIPTION

**qwen** is a command-line interface for interacting with Alibaba Cloud's Qwen series of large language models. It provides an interactive chat experience directly from the terminal, supporting both conversational prompts and single-shot queries for quick answers.

The tool connects to Alibaba's DashScope API to access various Qwen model variants, including Qwen Turbo for fast responses and larger models for more complex reasoning tasks. Temperature and other sampling parameters can be adjusted to control response creativity and determinism.

# CAVEATS

Requires API access. Alibaba Cloud service.

# HISTORY

Qwen is **Alibaba's** large language model series.

# SEE ALSO

[ollama](/man/ollama)(1), [llm](/man/llm)(1)

