# TAGLINE

TUI workspace for AI coding agents

# TLDR

**Launch from any project directory**

```sidecar```

**Specify a project root**

```sidecar --project [/path/to/project]```

**Open the in-app configuration** on the setup page

```sidecar setup```

**Open a file** at a line in a split pane

```sidecar open [path/to/file.go:88]```

**Open the git diff** in a split pane

```sidecar open --diff```

**Create a managed git worktree** with an agent

```sidecar create worktree [fix-auth] --base [main] --agent [claude]```

**Post a notification** to the running app

```sidecar notify post "[Review ready]"```

**Enable debug logging**

```sidecar --debug```

# SYNOPSIS

**sidecar** [**--project** _path_] [**--config** _path_] [**--debug**] [**--version**]

**sidecar** _command_ [_arguments_]

# PARAMETERS

**--project** _PATH_
> Project root directory (default: current directory).

**--config** _PATH_
> Path to the config file.

**--debug**
> Enable debug logging.

**--enable-feature** _LIST_
> Enable feature flags (comma-separated).

**--disable-feature** _LIST_
> Disable feature flags (comma-separated).

**-v**, **--version**
> Print version and exit.

# COMMANDS

**setup**
> Open the in-app Configuration on the Setup page.

**open** _target_
> Open a file (**path:line**), td issue, git diff (**--diff**) or provider resource (**--provider**) in a split pane.

**layout** _subcommand_
> Inspect and compose pane layouts programmatically.

**notify post** _message_
> Post an in-app notification, optionally with **--target** jump links.

**create worktree** _name_
> Create a managed git worktree with branch and agent setup.

**agent** _subcommand_
> List, start and prompt secondary coding agents.

**agents**
> Print capabilities for agents running inside sidecar.

# DESCRIPTION

**sidecar** is a terminal workspace that runs AI coding agents such as Claude Code, Codex, Gemini, Cursor and OpenCode in embedded interactive terminals. Alongside them it shows git diffs, a file browser, **td** task issues and agent sessions across all projects. You can review diffs, stage commits, and manage shells and git worktrees without leaving the terminal.

Press **?** for help, **,** for Configuration, **@** to switch projects, **W** to switch worktrees, **#** to change themes, and **q** to quit.

# CONFIGURATION

Settings live in **~/.config/sidecar/config.json** and can also be changed interactively with **,** or **sidecar setup**.

# CAVEATS

The embedded workspace depends on **tmux**. Sidecar runs locally, but checks GitHub for new versions on startup.

# HISTORY

**sidecar** was created by **Marcus Vorwaller** (marcus) and is written in **Go**.

# SEE ALSO

[lazygit](/man/lazygit)(1), [tig](/man/tig)(1), [gitui](/man/gitui)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Source code](https://github.com/marcus/sidecar)```

```[Documentation](https://sidecar.haplab.com/docs/intro)```

<!-- verified: 2026-11-09 -->
