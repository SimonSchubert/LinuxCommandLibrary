# TAGLINE

CLI/TUI for launching VS Code dev containers

# TLDR

**Open the current directory in VS Code**

```vscli open```

**Open a specific project directory**

```vscli open [path/to/project]```

**Open with Cursor editor instead of VS Code**

```vscli open --command cursor .```

**Force opening as a dev container**

```vscli open --behavior force-container```

**Browse recently opened projects interactively**

```vscli recent```

**Dry run to see what would be launched without opening**

```vscli open --dry-run```

# SYNOPSIS

**vscli** [_options_] _command_ [_arguments_]

# SUBCOMMANDS

**open** [_PATH_] [_ARGS_]
> Open a project in VS Code. Auto-detects dev container configuration. Defaults to current directory.

**recent**
> Open an interactive list of recently used workspaces.

# PARAMETERS

**--command** _EDITOR_
> Specify which editor command to use (e.g., code, code-insiders, cursor).

**--behavior** _BEHAVIOR_
> Change launch behavior: force-container or force-classic.

**-s**, **--history-path** _PATH_
> Override the default path to the history file.

**-d**, **--dry-run**
> Show what would be launched without actually opening the editor.

**-v**, **--verbose**
> Increase logging verbosity.

**-q**, **--quiet**
> Decrease logging verbosity.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**vscli** simplifies launching VS Code projects with a focus on dev containers. It auto-detects whether a project uses dev containers and launches accordingly. When a project contains multiple dev container configurations, vscli prompts you to select one. It supports multiple editors including VS Code, VS Code Insiders, and Cursor. Tracks recent projects for quick access via an interactive TUI list.

# HISTORY

**vscli** was created by **michidk** and is written in **Rust**. It can be installed via Cargo, Homebrew, Chocolatey, or winget.

# SEE ALSO

[code](/man/code)(1)
