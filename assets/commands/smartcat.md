# TAGLINE

AI-powered Unix pipe text processor

# TLDR

**Process text with AI**

```echo "[text]" | sc "[summarize this]"```

**Transform piped input**

```cat [file.txt] | sc "[translate to French]"```

**Use with command output**

```git diff | sc "[write a commit message for these changes]"```

**Specify a custom prompt template**

```echo "[text]" | sc -c [my_template]```

**Use a specific model**

```echo "[text]" | sc -m [claude]```

**Interactive mode**

```sc -i "[explain Kubernetes networking]"```

# SYNOPSIS

**sc** [_options_] [_prompt_]

# PARAMETERS

_PROMPT_
> Instruction for processing the input.

**-c**, **--config** _NAME_
> Use a named prompt template.

**-m**, **--model** _NAME_
> Model or API to use.

**-i**, **--interactive**
> Interactive conversation mode.

**-r**, **--repeat**
> Repeat last command.

**-t**, **--temperature** _FLOAT_
> Sampling temperature.

**-s**, **--system-message** _TEXT_
> System message/persona.

**--list-models**
> List configured models.

**--list-configs**
> List prompt templates.

# DESCRIPTION

**smartcat** (command: **sc**) puts an AI brain behind Unix pipes. It reads from stdin, processes the content with a language model, and writes the result to stdout, fitting naturally into Unix pipelines.

The tool is designed for stream-based text transformation: summarizing, translating, reformatting, code reviewing, generating commit messages, and any other text processing task. It follows Unix philosophy by doing one thing well and composing with other tools.

Prompt templates define reusable transformations. Templates are stored in the config file and invoked by name with `-c`. This enables consistent, repeatable AI-powered text processing.

Supports multiple providers: OpenAI, Anthropic, Mistral, Ollama, and OpenAI-compatible APIs. Configuration is via a TOML file at `~/.config/smartcat/`.

Install via `cargo install smartcat`. The command is `sc` for quick typing.

# CONFIGURATION

**~/.config/smartcat/conversation.toml**
> Main configuration file defining API keys, default model, prompt templates, and provider settings.

**OPENAI_API_KEY**
> API key for OpenAI provider.

**ANTHROPIC_API_KEY**
> API key for Anthropic provider.

# CAVEATS

API key required for cloud providers. Stdin must be provided for pipe mode. Large inputs may exceed model context limits. Streaming output may not work with all downstream commands.

# HISTORY

**smartcat** was created by **Emilien Fugier** in **2023** with the tagline "Putting a brain behind `cat`." It was designed as a minimal, composable AI tool for the Unix command line, prioritizing integration with existing shell workflows over feature richness.

# SEE ALSO

[mods](/man/mods)(1), [aichat](/man/aichat)(1), [llm](/man/llm)(1), [cat](/man/cat)(1)
