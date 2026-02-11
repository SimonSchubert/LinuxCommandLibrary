# TAGLINE

Format Python code with Ruff

# TLDR

**Format current directory**

```ruff format```

**Format specific files**

```ruff format [file.py]```

**Check formatting without changes**

```ruff format --check```

**Show diff**

```ruff format --diff```

# SYNOPSIS

**ruff** **format** [_options_] [_files_...]

# PARAMETERS

**--check**
> Check without modifying.

**--diff**
> Show formatting diff.

**--config** _file_
> Configuration file.

**--line-length** _n_
> Maximum line length.

# DESCRIPTION

**ruff format** is the code formatting subcommand of Ruff, providing a Black-compatible Python formatter written in Rust. It enforces consistent code style by reformatting Python source files according to opinionated rules covering indentation, line length, string quoting, and whitespace.

The **--check** flag validates formatting without modifying files, returning a non-zero exit code if changes would be made, which is useful for CI pipelines. The **--diff** flag displays the exact changes that would be applied. Configuration options like **--line-length** can be set per-project in pyproject.toml or ruff.toml.

# SEE ALSO

[ruff](/man/ruff)(1), [ruff-check](/man/ruff-check)(1), [black](/man/black)(1)

