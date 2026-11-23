# TAGLINE

Terminal dashboard for multiple GSD workflow projects

# TLDR

**Launch the TUI** showing all registered GSD projects

```gsd-meta-manager```

**Register a project directory** in the global registry

```gsd-meta-manager add [path/to/project]```

**Open a registered project** directly by alias or path

```gsd-meta-manager [alias]```

**Register with a custom alias**

```gsd-meta-manager add [path/to/project] [alias]```

**Remove a project** from the registry by alias

```gsd-meta-manager remove [alias]```

**List all registered projects** on stdout

```gsd-meta-manager list```

**Use a non-default config file**

```gsd-meta-manager --config [path/to/config.json]```

**Show the version**

```gsd-meta-manager --version```

# SYNOPSIS

**gsd-meta-manager** [_--config FILE_] [_TARGET_]

**gsd-meta-manager** [_--config FILE_] _subcommand_ [_args_]

**gsd-meta-manager add** _PATH_ [_ALIAS_]

**gsd-meta-manager remove** _ALIAS_

**gsd-meta-manager list**

# PARAMETERS

**--config** _FILE_
> Override the default config file location.

_TARGET_
> Alias or path of a registered project to open directly. An alias that matches a subcommand name (e.g. **list**) must be opened by its path.

**-V**, **--version**
> Print the version number and exit.

**-h**, **--help**
> Display the help message.

# SUBCOMMANDS

**add** _PATH_ [_ALIAS_]
> Register the project at _PATH_ (must contain **.planning/**). _ALIAS_ defaults to the last folder component of the path. Git linked worktrees are refused in favor of their main worktree.

**remove** _ALIAS_
> Remove a project from the registry; project files are not deleted.

**list**
> Print all registered projects.

**help** [_SUBCOMMAND_]
> Show help for a specific subcommand.

# KEY BINDINGS

**j**, **k**
> Move down or up in the project list.

**Enter**
> Open the detail view for the selected project (**b** opens it on the Backlog tab).

**/**
> Filter projects; **Enter** keeps the filter, **Esc** clears it.

**s**
> Toggle sorting: alphabetical or attention first.

**a**
> Add an existing project (alias, then path).

**c**
> Create a new project.

**d**
> Remove the selected project from the registry after confirmation.

**Tab**
> Switch the terminal to the selected project's Claude or Codex session (tmux or herdr).

**1**-**8**
> In the detail view, jump to a tab; **Left**/**Right** move between tabs.

**M**
> Toggle mouse capture.

**?**
> Show or hide the help overlay.

**q**
> Quit from the dashboard, or return to it from the detail view. **Ctrl+C** force quits.

# DESCRIPTION

**gsd-meta-manager** is a Rust terminal UI that aggregates state from many GSD workflow projects into a single dashboard. It parses each project's **.planning/** directory directly from disk, so no Claude run or **/gsd-progress** call is needed to see phase status, roadmap progress, queued work and pending actions. It watches the files and refreshes live, detects running Claude Code (and, best-effort, Codex) sessions, auto-registers projects from active sessions, and can launch or resume a Claude session for a project.

Each registered project can be inspected through an 8-tab detail view: **Roadmap** (with git-log-style dependency lanes), **Phases** (with a Waves pane per plan), **Backlog**, **Git History**, **Queue**, **Sessions** (with an Agents sub-view), **Config**, and **Docs** (Files and shipped Milestones).

# CONFIGURATION

**~/.config/gsd-meta-manager/config.json**
> Default registry file (in the platform's user config directory; on macOS **~/Library/Application Support/gsd-meta-manager/config.json**). Stores registered project paths and aliases. Overridable with **--config**.

# CAVEATS

Projects must contain a gsd-core **.planning/** directory; gsd-pi projects (**.gsd/**) are not supported. The app writes only a few files (**.planning/config.json** on a Config-tab save, **.planning/meta-manager/QUEUE.md**, its own config and log) and never commits in your checkout, except when landing experimental driver or one-off runs. Live session detection reads **/proc**, so it works on Linux only; on macOS the Sessions tab stays empty.

# HISTORY

**gsd-meta-manager** was published by **bitcreed** in 2026 under the MIT license. It is distributed through **crates.io** (**cargo install gsd-meta-manager**) and requires Rust 1.89 or newer to build from source. Here GSD stands for "Git. Ship. Done."

# SEE ALSO

[cargo](/man/cargo)(1), [git](/man/git)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Source code](https://github.com/bitcreed/gsd-meta-manager)```

```[Documentation](https://github.com/bitcreed/gsd-meta-manager/blob/master/docs/CONFIGURATION.md)```

<!-- verified: 2026-11-23 -->
