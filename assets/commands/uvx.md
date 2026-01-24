# TLDR

**Run Python tool**

```uvx [ruff] [check] [.]```

**Run specific version**

```uvx [package]@[version] [args]```

**Run with extras**

```uvx --with [extra] [package]```

**Run from git**

```uvx [git+https://github.com/repo/tool]```

# SYNOPSIS

**uvx** [_--with extras_] _package_[@_version_] [_args_]

# PARAMETERS

_package_
> Package to run.

**--with** _EXTRA_
> Include extra.

**--from** _SOURCE_
> Install source.

**--python** _VER_
> Python version.

# DESCRIPTION

**uvx** runs Python tools. It's part of uv.

Ephemeral environments. No permanent install.

Fast installation. Rust-based uv.

Version pinning. Specific versions.

Similar to pipx run. Quick execution.

# CAVEATS

Requires uv. Python ecosystem. May download packages.

# HISTORY

**uvx** is part of **uv**, the fast Python package manager, providing ephemeral tool execution similar to pipx.

# SEE ALSO

[uv](/man/uv)(1), [pipx](/man/pipx)(1), [python](/man/python)(1)
