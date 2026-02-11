# TAGLINE

Run Ruff linter on Python code

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

**ruff check** is the linting subcommand of Ruff, an extremely fast Python linter written in Rust. It analyzes Python source files for style violations, potential bugs, and code quality issues, implementing rule sets from Flake8, isort, pyupgrade, and many other established Python tools in a single unified interface.

The **--fix** flag automatically corrects fixable violations in place, while **--select** and **--ignore** control which rule categories are active. Watch mode re-checks files on every save, providing real-time feedback during development. Output formats include plain text, JSON, and GitHub Actions annotations for CI integration.

# SEE ALSO

[ruff](/man/ruff)(1), [ruff-format](/man/ruff-format)(1), [flake8](/man/flake8)(1)

