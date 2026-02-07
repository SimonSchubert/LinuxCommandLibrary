# TAGLINE

AI-powered code editor CLI

# TLDR

**Start interactive agent** session

```cursor agent```

**Start agent with initial prompt**

```cursor agent "Fix the authentication bug"```

**Run in non-interactive mode**

```cursor agent -p "Add error handling to api.js"```

**List previous conversations**

```cursor agent ls```

**Resume most recent** conversation

```cursor agent resume```

**Resume specific conversation** by ID

```cursor agent --resume="[chat-id]"```

**Use Plan mode** for complex tasks

```cursor agent --mode=plan "[task description]"```

# SYNOPSIS

**cursor** agent [_options_] [_prompt_]

# PARAMETERS

**-p** _prompt_
> Run in non-interactive print mode with specified prompt.

**--model** _model_
> Specify AI model to use.

**--mode** _mode_
> Operating mode: agent (default), plan, or ask.

**--resume** _chat-id_
> Resume a specific conversation by ID.

**--output-format** _format_
> Output format: text or other supported formats.

# COMMANDS

**agent**
> Start interactive AI coding assistant session.

**agent ls**
> List all previous conversations.

**agent resume**
> Resume the most recent conversation.

# INTERACTIVE COMMANDS

**/plan**
> Switch to Plan mode for task planning.

**/ask**
> Switch to Ask mode for questions.

**Shift+Tab**
> Toggle Plan mode.

**&** (prefix)
> Hand off task to Cloud Agent for background execution.

# DESCRIPTION

**cursor** is the command-line interface for Cursor, an AI-powered code editor. The CLI brings Cursor's AI coding capabilities to the terminal, allowing developers to write, review, debug, and test code without leaving their preferred environment.

The CLI operates in three modes: **Agent mode** (default) provides full access to all tools for complex coding tasks, **Plan mode** focuses on task decomposition and planning, and **Ask mode** handles questions and explanations.

Sessions are persistent and can be resumed later using **agent ls** and **agent resume**. The Cloud Agent feature (triggered with **&** prefix) allows tasks to run in the background while you continue working.

The CLI integrates with any terminal environment including Bash, Zsh, and terminal emulators like Warp. It works alongside other IDEs like Neovim, JetBrains, and Android Studio, enabling parallel agent execution.

# CAVEATS

Requires an active Cursor subscription. The CLI uses the same models and quota as the Cursor editor application. Cloud Agent features require network connectivity. Installation requires curl and bash on Unix systems or PowerShell on Windows.

# HISTORY

Cursor was founded in **2022** and launched as an AI-first code editor based on VS Code. The CLI was introduced in **2025** to extend Cursor's capabilities beyond the editor, enabling terminal-based workflows and headless operation. This allowed developers using alternative editors like Neovim or JetBrains IDEs to access Cursor's AI features.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [vscode](/man/vscode)(1)
