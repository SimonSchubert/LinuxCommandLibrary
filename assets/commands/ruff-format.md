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

**ruff format** formats Python code. Fast Python formatter written in Rust. Black-compatible formatting style. Part of the Ruff toolkit for Python code quality.

# SEE ALSO

[ruff](/man/ruff)(1), [ruff-check](/man/ruff-check)(1), [black](/man/black)(1)

