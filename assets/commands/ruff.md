# TLDR

**Check current directory**

```ruff check```

**Check specific files**

```ruff check [file.py] [other.py]```

**Auto-fix issues**

```ruff check --fix```

**Format code**

```ruff format```

**Show fixable issues**

```ruff check --show-fixes```

**Watch mode**

```ruff check --watch```

**Select specific rules**

```ruff check --select [E,F,W]```

**Ignore rules**

```ruff check --ignore [E501]```

# SYNOPSIS

**ruff** [_check_] [_format_] [_--fix_] [_--select rules_] [_options_] [_paths_]

# PARAMETERS

**check**
> Run linting.

**format**
> Format code.

**--fix**
> Auto-fix violations.

**--unsafe-fixes**
> Apply unsafe fixes.

**--select** _RULES_
> Rules to enable.

**--ignore** _RULES_
> Rules to ignore.

**--extend-select** _RULES_
> Additional rules.

**--config** _FILE_
> Configuration file.

**--show-fixes**
> Show available fixes.

**--watch**
> Watch for changes.

**--output-format** _FMT_
> Output format (text, json, etc.).

**--statistics**
> Show statistics.

**--diff**
> Show diff for fixes.

# DESCRIPTION

**ruff** is an extremely fast Python linter written in Rust. It implements rules from Flake8, isort, pyupgrade, and other tools.

Speed is the primary advantage. Ruff is 10-100x faster than traditional Python linters. This enables real-time feedback and CI integration without delays.

Rule selection controls which checks run. Categories include E (pycodestyle errors), F (Pyflakes), W (warnings), I (isort), UP (pyupgrade), and many more.

The formatter is Black-compatible, providing consistent code style. It integrates with the linter for a unified toolchain.

Configuration in pyproject.toml or ruff.toml customizes behavior. Per-file ignores and extends support complex project needs.

Fix mode modifies files automatically. Unsafe fixes may change behavior and require separate opt-in.

# CAVEATS

Rust-based - requires separate installation from Python. Not all Flake8 plugins are implemented. Rapidly evolving.

# HISTORY

**Ruff** was created by **Charlie Marsh** in **2022**. It achieved immediate popularity due to its speed, replacing multiple Python tools with a single fast alternative.

# SEE ALSO

[flake8](/man/flake8)(1), [black](/man/black)(1), [pylint](/man/pylint)(1), [isort](/man/isort)(1)
