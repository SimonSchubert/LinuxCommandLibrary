# TAGLINE

Execute commands in virtual environment

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

**poetry run** executes a command within the project's virtual environment without requiring manual activation. It automatically locates and uses the correct virtual environment for the current project.

This is the recommended way to run project scripts, test suites, and installed tools. For example, `poetry run pytest` runs tests using the project's dependencies, and `poetry run python script.py` executes a script with the project's Python interpreter. An alternative is **poetry shell** for an interactive session.

# CAVEATS

Creates venv if not exists. Alternative to poetry shell.

# HISTORY

poetry run provides **virtual environment** command execution.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-shell](/man/poetry-shell)(1)

