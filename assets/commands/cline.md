# TAGLINE

Model-agnostic AI coding agent for the terminal

# TLDR

**Start an interactive session** in the current directory

```cline```

**Run a task with a prompt**

```cline "[fix the login bug]"```

**Run in fully autonomous mode** (no interactive UI)

```cline -y "[refactor auth module]"```

**Set up authentication** with an AI provider

```cline auth -p [anthropic] -k [sk-ant-api-xxxxx]```

**Run in plan mode** to preview changes before acting

```cline -p "[add unit tests for auth]"```

**Pipe context** to cline in headless mode

```cat [error.log] | cline -y "[explain these errors]"```

# SYNOPSIS

**cline** [_options_] [_prompt_]

**cline** **auth** [_options_]

**cline** **config**

**cline** **history** [_options_]

**cline** **update**

# PARAMETERS

**-y**, **--yolo**
> Run in fully autonomous mode with no interactive UI. Output streams to stdout.

**-a**, **--act**
> Run in act mode (execute changes directly).

**-p**, **--plan**
> Run in plan mode (preview changes before acting).

**-m**, **--model** _MODEL_
> Specify the model to use.

**-i**, **--images** _PATHS_
> Attach image files to the prompt.

**--json**
> Stream structured JSON output for programmatic consumption.

**--thinking**
> Enable extended thinking mode.

**--timeout** _SECONDS_
> Set a timeout for the task.

**--continue**
> Continue the most recent task.

**--acp**
> Run as an ACP (Agent Client Protocol) compliant agent for editor integration.

**--config** _PATH_
> Custom configuration directory.

**-c**, **--cwd** _PATH_
> Set the working directory.

**-v**, **--verbose**
> Show detailed output.

**--help**
> Display help information.

# SUBCOMMANDS

**auth**
> Set up authentication with AI providers. Use **-p** for provider, **-k** for API key, **-m** for model ID, **-b** for base URL.

**config**
> Interactive configuration interface for settings, rules, workflows, and hooks.

**history**
> Browse task history. Use **-n** for limit and **-p** for page.

**update**
> Install the latest CLI version.

**version**
> Display the installed version number.

# DESCRIPTION

**cline** is an AI coding agent that works in the terminal, supporting multiple AI model providers including OpenAI, Anthropic, Google, AWS Bedrock, Ollama, and any OpenAI-compatible API. It can read and write files, execute terminal commands, and perform multi-step development tasks autonomously.

The tool operates in two main modes: interactive mode (default when running in a terminal) and headless mode (activated with **-y**/**--yolo** or when piping input/output). Headless mode is designed for automation, CI/CD pipelines, and scripting.

Cline began as a VS Code extension and expanded to include a CLI interface, making it accessible from any terminal environment. It uses a model-agnostic architecture, allowing users to choose their preferred AI backend. The **--acp** flag enables the Agent Client Protocol for integration with editors like JetBrains, Zed, Neovim, and Emacs.

# CAVEATS

Requires API keys for cloud-hosted model providers. Local model support via Ollama requires separate installation and model downloads. Token usage and API costs vary by provider and model. Run **cline auth** to configure providers before first use.

# HISTORY

Cline was originally created as a Visual Studio Code extension under the name **Claude Dev** in **2024**, then renamed to Cline to reflect its model-agnostic design. It quickly grew to become one of the most popular open-source AI coding tools. **Cline CLI 2.0** was released in **February 2026**, rebuilding the full agent for terminal-first workflows with headless mode and ACP support.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [codex](/man/codex)(1), [copilot](/man/copilot)(1)
