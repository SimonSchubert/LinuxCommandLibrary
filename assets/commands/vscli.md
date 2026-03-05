# TAGLINE

CLI/TUI for launching VS Code dev containers

# TLDR

**Open current directory in VS Code**

```vscli open```

**Open with Cursor editor**

```vscli open --command cursor .```

**Browse recently opened projects**

```vscli recent```

# SYNOPSIS

**vscli** _command_ [_options_]

# DESCRIPTION

**vscli** simplifies launching VS Code projects with a focus on dev containers. It auto-detects whether a project uses dev containers and launches accordingly. Supports multiple editors including VS Code, VS Code Insiders, and Cursor. Tracks recent projects for quick access via an interactive list.

# HISTORY

**vscli** was created by **michidk** and is written in **Rust**.

# SEE ALSO

[code](/man/code)(1)
