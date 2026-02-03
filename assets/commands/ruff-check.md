# TLDR

**Check current directory**

```ruff check```

**Check specific files**

```ruff check [file.py]```

**Check and fix**

```ruff check --fix```

**Check with specific rules**

```ruff check --select [E,F]```

**Watch for changes**

```ruff check --watch```

# SYNOPSIS

**ruff** **check** [_options_] [_files_...]

# PARAMETERS

**--fix**
> Auto-fix violations.

**--select** _rules_
> Enable specific rules.

**--ignore** _rules_
> Ignore specific rules.

**--watch**
> Watch for file changes.

**--config** _file_
> Configuration file.

**--output-format** _format_
> Output format (text, json, github).

# DESCRIPTION

**ruff check** runs the Ruff linter on Python files. Extremely fast Python linter written in Rust. Compatible with Flake8, isort, and other tools. Enforces code quality rules.

# SEE ALSO

[ruff](/man/ruff)(1), [ruff-format](/man/ruff-format)(1), [flake8](/man/flake8)(1)

