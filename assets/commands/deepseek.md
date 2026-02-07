# TAGLINE

command-line interface for DeepSeek AI models

# TLDR

**Start DeepSeek CLI**

```deepseek```

**Chat with a prompt**

```deepseek "[Your question here]"```

**Use specific model**

```deepseek --model [deepseek-coder] "[prompt]"```

# SYNOPSIS

**deepseek** [_options_] [_prompt_]

# PARAMETERS

**--model** _model_
> Specify the model to use.

**--api-key** _key_
> DeepSeek API key.

# DESCRIPTION

**deepseek** is a command-line interface for interacting with DeepSeek AI models. It provides access to DeepSeek's language models, including the DeepSeek-Coder series optimized for code generation and understanding.

DeepSeek models support conversational AI, code completion, debugging assistance, and technical documentation. The CLI can be used for both interactive chat sessions and programmatic integration through prompt-based invocation.

DeepSeek-Coder models are trained on extensive code repositories and technical documentation, making them particularly effective for software development tasks across multiple programming languages.

# CAVEATS

Requires a DeepSeek API key. API calls may incur costs.

# SEE ALSO

[claude](/man/claude)(1), [ollama](/man/ollama)(1)
