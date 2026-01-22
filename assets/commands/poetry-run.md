# TLDR

**Run command in virtual environment**

```poetry run [command]```

**Run Python script**

```poetry run python [script.py]```

**Run installed tool**

```poetry run pytest```

**Run with arguments**

```poetry run python -m [module] [args]```

# SYNOPSIS

**poetry run** _command_ [_args_]

# PARAMETERS

_COMMAND_
> Command to execute.

_ARGS_
> Arguments to pass.

# DESCRIPTION

**poetry run** executes commands in the project virtual environment. Activates env automatically.

The tool runs scripts and tools. No manual activation needed.

poetry run executes in venv.

# CAVEATS

Creates venv if not exists. Alternative to poetry shell.

# HISTORY

poetry run provides **virtual environment** command execution.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-shell](/man/poetry-shell)(1)

