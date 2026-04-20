# TAGLINE

AI-powered command-line assistant for shell commands

# TLDR

**Launch the interactive Copilot agent**

```gh copilot```

**Run a one-off prompt** non-interactively

```gh copilot -p "[how do I rebase onto main?]"```

**Pick a specific model**

```gh copilot --model [claude-sonnet-4.5]```

**Remove the bundled Copilot binary**

```gh copilot --remove```

# SYNOPSIS

**gh copilot** [_options_] [_prompt_]

# PARAMETERS

**-p**, **--prompt** _TEXT_
> Run a one-off prompt and print the response.

**--model** _MODEL_
> Select the LLM model used by Copilot.

**--allow-tool** _TOOL_, **--deny-tool** _TOOL_, **--allow-all-tools**
> Per-tool execution policy for the agent's built-in tools.

**--banner**
> Force the startup banner (useful inside scripts).

**--experimental**
> Opt in to experimental features.

**--remove**
> Uninstall the bundled standalone **copilot** binary managed by **gh**.

# SLASH COMMANDS (interactive mode)

**/login**
> Authenticate with GitHub Copilot.

**/model**
> Switch the active model.

**/lsp**
> Configure Language Server Protocol integrations.

**/feedback**
> Send feedback to GitHub.

# DESCRIPTION

**gh copilot** (previously an extension with **suggest** and **explain** subcommands) is now a thin launcher that downloads and runs the standalone **copilot** binary — GitHub's agentic coding assistant. The older **suggest**/**explain**/**config**/**alias** subcommands are deprecated; invoke **copilot** for an interactive agent session or pass **-p** for scripted use.

The tool supports various shells and command-line tools, providing interactive suggestions that can be copied or executed directly.

# CAVEATS

Requires GitHub Copilot subscription. Needs internet connection. Suggestions may not always be accurate. Review commands before executing. Privacy considerations for command data.

# HISTORY

GitHub Copilot CLI was released as a GitHub CLI extension after the success of GitHub Copilot for code. It extends AI assistance from code editors to the command line.

# SEE ALSO

[gh](/man/gh)(1), [tldr](/man/tldr)(1), [man](/man/man)(1)
