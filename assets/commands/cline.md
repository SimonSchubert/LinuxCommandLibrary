# TAGLINE

Model-agnostic AI coding agent for the terminal

# TLDR

**Start an interactive session** in the current directory

```cline```

**Run with a specific prompt**

```cline "[fix the login bug]"```

**Use a specific model provider**

```cline --provider [openai] "[prompt]"```

**Run in autonomous mode**

```cline --auto "[refactor auth module]"```

**Pipe context** to cline

```cat [error.log] | cline "[explain these errors]"```

# SYNOPSIS

**cline** [_options_] [_prompt_]

# PARAMETERS

**--provider** _PROVIDER_
> AI provider to use (openai, anthropic, ollama, etc.).

**--model** _MODEL_
> Specific model to use with the provider.

**--auto**
> Run in autonomous mode with minimal human intervention.

**--api-key** _KEY_
> API key for the selected provider.

**--max-tokens** _N_
> Maximum tokens for model response.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**cline** is an AI coding agent that works in the terminal, supporting multiple AI model providers including OpenAI, Anthropic, Google, AWS Bedrock, Ollama, and any OpenAI-compatible API. It can read and write files, execute terminal commands, and perform multi-step development tasks autonomously.

The tool integrates with your development environment to understand project context, navigate codebases, and implement changes across multiple files. It supports both interactive sessions for collaborative work and autonomous mode for hands-off task completion.

Cline began as a VS Code extension and expanded to include a CLI interface, making it accessible from any terminal environment. It uses a model-agnostic architecture, allowing users to choose their preferred AI backend.

# CAVEATS

Requires API keys for cloud-hosted model providers. Local model support via Ollama requires separate installation and model downloads. Token usage and API costs vary by provider and model.

# HISTORY

Cline was originally created as a Visual Studio Code extension under the name **Claude Dev** in **2024**, then renamed to Cline to reflect its model-agnostic design. It quickly grew to over 59,000 GitHub stars, becoming one of the most popular open-source AI coding tools. The CLI component extends the tool beyond IDE-only usage.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [codex](/man/codex)(1), [forge](/man/forge)(1)
