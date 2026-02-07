# TAGLINE

enterprise AI coding agent

# TLDR

**Start an interactive session**

```droid```

**Execute a single prompt non-interactively**

```droid exec "[analyze this code and fix bugs]"```

**Run with high autonomy for full automation**

```droid exec --auto high "[fix bug, test, commit, and push]"```

**Read prompt from a file**

```droid exec -f [prompt.txt]```

**Use a specific model**

```droid exec -m [claude-3-opus] "[your prompt]"```

**Get JSON output for scripting**

```droid exec -o json "[your prompt]"```

**Continue an existing session**

```droid exec -s [session_id] "[continue the task]"```

# SYNOPSIS

**droid** [_options_] [_command_]

# PARAMETERS

**-v**, **--version**
> Output the version number

**-h**, **--help**
> Display help for command

# EXEC OPTIONS

**-o**, **--output-format** _FORMAT_
> Output format (default: text)

**--input-format** _FORMAT_
> Input format: stream-json for multi-turn sessions

**-f**, **--file** _PATH_
> Read prompt from file

**--auto** _LEVEL_
> Autonomy level: low, medium, or high

**--skip-permissions-unsafe**
> Skip ALL permission checks (dangerous)

**-s**, **--session-id** _ID_
> Continue an existing session

**-m**, **--model** _ID_
> Model ID to use

**-r**, **--reasoning-effort** _LEVEL_
> Reasoning effort level

**--use-spec**
> Start in spec mode (read-only operations)

**--enabled-tools** _IDS_
> Enable specific tools

# CONFIGURATION

**.factory/droids/**
> Directory containing custom sub-agent definitions as markdown files with YAML frontmatter.

# DESCRIPTION

**Droid** is Factory.ai's enterprise-grade AI coding agent for the terminal. It handles end-to-end development workflows including code analysis, feature implementation, bug fixing, code review, and automated testing.

By default, Droid runs in spec-mode where the agent only executes read-only operations. Use **--auto** to enable edits and command execution with configurable risk tiers. The tool supports custom sub-agents (Custom Droids) defined in **.factory/droids/** as markdown files with YAML frontmatter.

Droid achieves state-of-the-art performance on Terminal-Bench benchmarks, outperforming other CLI agents. It provides a professional trial plan with access to Claude and OpenAI models upon account creation.

# CAVEATS

Requires Factory.ai account authentication. The **--skip-permissions-unsafe** flag allows all operations without confirmation and should only be used in isolated environments like Docker containers. High autonomy mode (**--auto high**) can make destructive changes.

# HISTORY

Droid was developed by **Factory.ai** as an enterprise AI coding agent. It has achieved leading performance on Terminal-Bench with a score of 58.75% using Opus, surpassing other CLI agents including Claude Code and Codex CLI.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [aider](/man/aider)(1), [opencode](/man/opencode)(1)
