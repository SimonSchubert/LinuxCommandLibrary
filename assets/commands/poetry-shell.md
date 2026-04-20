# TAGLINE

Activate project virtual environment shell

# TLDR

**Activate the project's virtual environment** (Poetry 1.x)

```poetry shell```

**Exit** the activated shell

```exit```

**Install the plugin** on Poetry 2.x (command is no longer built in)

```poetry self add poetry-plugin-shell```

**Modern alternative** on Poetry 2.x — print the activation command for your shell

```eval $(poetry env activate)```

# SYNOPSIS

**poetry shell** [_options_]

# DESCRIPTION

**poetry shell** spawns a new shell session with the project's virtual environment activated. All commands run within this shell will use the project's Python interpreter and installed packages.

Type **exit** or press Ctrl+D to leave the virtual environment shell and return to the original session. The virtual environment is created automatically if it doesn't exist.

# CAVEATS

**Removed from Poetry core in Poetry 2.0 (January 2025).** On Poetry 2.x the command is only available after installing the **poetry-plugin-shell** plugin (**poetry self add poetry-plugin-shell**). The officially recommended replacement is **poetry env activate**, which prints the shell-specific activation command rather than spawning a subshell — run it via **eval** (POSIX shells) or **Invoke-Expression** (PowerShell).

Creates a new subshell as a child process; nested **poetry shell** invocations stack. Depending on your shell's configuration, rc files may be re-sourced on entry.

# HISTORY

poetry shell provides **interactive shell** in Poetry virtual environment.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-run](/man/poetry-run)(1)

