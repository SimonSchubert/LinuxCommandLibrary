# TAGLINE

Activate project virtual environment shell

# TLDR

**Activate virtual environment**

```poetry shell```

**Exit virtual environment**

```exit```

# SYNOPSIS

**poetry shell** [_options_]

# PARAMETERS

No specific parameters.

# DESCRIPTION

**poetry shell** spawns a new shell session with the project's virtual environment activated. All commands run within this shell will use the project's Python interpreter and installed packages.

Type **exit** or press Ctrl+D to leave the virtual environment shell and return to the original session. This is an alternative to prefixing every command with **poetry run**. The virtual environment is created automatically if it doesn't exist.

# CAVEATS

Creates subshell. Use exit to leave. Alternative to poetry run.

# HISTORY

poetry shell provides **interactive shell** in Poetry virtual environment.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-run](/man/poetry-run)(1)

