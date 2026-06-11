# TAGLINE

Interact with Claude AI from the command line

# TLDR

**Send a simple message** to Claude

```anthropic -g user "Hello, Claude!"```

**Send a message** with a specific model

```anthropic -g user "[prompt]" -m [claude-opus-4-8]```

**Analyze an image** with Claude

```anthropic -g user "Describe this image" -i [path/to/image.png]```

**Set a system prompt** for context

```anthropic -g user "[prompt]" -s "You are a helpful coding assistant"```

**Multi-turn conversation** with assistant response

```anthropic -g user "Hello!" -g assistant "Hi there!" -g user "How are you?"```

**Control response length** and randomness

```anthropic -g user "[prompt]" -x [2048] -t [0.7]```

# SYNOPSIS

**anthropic** [**-g** _role_ _content_] [**-m** _model_] [**-s** _system_] [**-i** _image_] [**-t** _temp_] [**-x** _tokens_]

# PARAMETERS

**-g**, **--message** _role_ _content_
> Add a message with the specified role (user/assistant) and content. Can be repeated for multi-turn conversations.

**-m**, **--model** _model_
> Specify the Claude model to use. The built-in default is claude-3-opus-20240229, which has since been retired, so pass a current model such as claude-opus-4-8 or claude-sonnet-4-6.

**-s**, **--system** _prompt_
> System message providing context or instructions for the conversation.

**-i**, **--image** _path_
> Path to an image file (PNG, JPEG, or PDF) for vision tasks.

**-t**, **--temperature** _value_
> Controls response randomness. Higher values produce more creative outputs.

**-k**, **--top_k** _value_
> Restricts sampling to the top k most likely tokens.

**-p**, **--top_p** _value_
> Nucleus sampling; restricts to tokens with cumulative probability above threshold.

**-x**, **--max_tokens** _count_
> Maximum number of tokens in the response. Default: 1024.

# DESCRIPTION

**anthropic** is a command-line interface for interacting with Anthropic's Claude AI models. It provides direct access to the Claude API from the terminal, allowing users to send text messages and images for analysis.

The tool supports multi-turn conversations by chaining multiple **-g** flags, enabling context-aware interactions. It handles various image formats including PNG, JPEG, and PDF files for vision tasks. The CLI integrates well with shell pipelines, making it useful for scripting and automation workflows.

# CAVEATS

Requires an **ANTHROPIC_API_KEY** environment variable to be set with valid API credentials. PDF processing requires the **Poppler** library (used by **pdf2image**) to be installed on the system; it is not needed if you never pass PDFs. The hardcoded default model (claude-3-opus-20240229) has been retired, so supply a current model with **-m**. API usage incurs costs based on token consumption.

# HISTORY

The anthropic-cli tool is a community project by **dvcrn** that provides command-line access to Anthropic's Claude models. It wraps the official Anthropic Python SDK and was created for developers who prefer terminal-based workflows over web interfaces. It is distributed on PyPI as **anthropic-cli** and is unrelated to Anthropic's own **claude** (Claude Code) and **ant** command-line tools.

# SEE ALSO

[claude](/man/claude)(1), [ollama](/man/ollama)(1), [llm](/man/llm)(1)

# RESOURCES

```[Source code](https://github.com/dvcrn/anthropic-cli)```

<!-- verified: 2026-06-11 -->
