# TAGLINE

xAI's official terminal-native agentic coding CLI

# TLDR

**Start an interactive session** in the current directory

```grok```

**Run a one-off command** and exit (headless mode)

```grok -p "[prompt]"```

**Stream structured output** for scripting

```grok -p "[prompt]" --output-format streaming-json```

**Inspect what Grok discovers** in the current directory

```grok inspect```

**Select a specific model** in headless mode

```grok -m [model-id]```

**Provide xAI credentials** via environment variable

```export GROK_CODE_XAI_API_KEY="xai-..."```

# SYNOPSIS

**grok** [_options_] [_prompt_]

**grok** **inspect**

# PARAMETERS

**-p**, **--prompt** _text_
> Run in headless mode: execute a single prompt and exit. Useful inside scripts, CI/CD pipelines, GitHub Actions, or cron jobs.

**-m**, **--model** _model_
> Select the model used for the session.

**--output-format** _format_
> Set the response format (e.g. _streaming-json_) for machine-readable output in headless mode.

# DESCRIPTION

**Grok Build** is xAI's first-party command-line coding agent, built for professional software engineering, app development, and workflow automation. It runs as a terminal TUI by default and can also operate headlessly for automation.

It ships with **plan mode**, where the agent proposes a full plan that can be approved, commented on, or rewritten before any execution begins. Once approved, every change appears as a clean diff. For larger tasks, Grok Build delegates work to **parallel subagents**, optionally launched in their own git worktrees.

Grok Build is **ACP-first** and deliberately compatible with the Anthropic Skills format, so skills written for Claude Code work with little or no modification. It supports **MCP** out of the box, so existing servers (database connectors, GitHub integrations, custom tools) work without changes.

# CONFIGURATION

**AGENTS.md**
> Project-level instructions for the agent, loaded automatically from the working directory. Compatible with Claude Code's CLAUDE.md.

**GROK_CODE_XAI_API_KEY**
> Environment variable holding the xAI API key. Used when not authenticated via the browser flow.

**Custom model config**
> Models can be defined in the user config with a model id, base URL, display name, and env-key reference, then selected as the default or via _/model_ in the TUI.

# SLASH COMMANDS

**/model** _name_
> Switch the active model from within the TUI.

# CAVEATS

Grok Build is in **early beta** and is available to **SuperGrok Heavy** subscribers. Expect rough edges: commands that don't yet work, incomplete error handling, and occasional regressions in subagent coordination. For production CI/CD pipelines, prefer mature tools until Grok Build hits general availability; for exploration and side projects, beta is fine. First launch opens a browser for authentication unless an API key is set via environment variable.

# HISTORY

xAI launched **Grok Build** as an early beta in **May 2026**, entering the agentic-CLI space alongside Claude Code and Codex CLI. It is installed with a single curl-pipe-bash script from _x.ai/cli/install.sh_, ships with plan mode, parallel subagents with worktree integration, MCP support, and Anthropic-Skills compatibility, and is positioned as xAI's terminal-native counterpart to its web-based Grok coding tools.

# INSTALL

```zypper: sudo zypper install grok-build```

```nix: nix profile install nixpkgs#grok-build```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[grok](/man/grok)(1), [claude](/man/claude)(1), [copilot](/man/copilot)(1), [gh](/man/gh)(1)
