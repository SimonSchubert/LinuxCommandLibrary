# TAGLINE

Run Python tools in ephemeral environments

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

**uvx** is a shorthand for **uv tool run** that executes Python command-line tools in temporary, isolated environments without permanently installing them. It is similar to **pipx run** but leverages uv's Rust-based resolver for dramatically faster execution.

Each invocation creates an ephemeral virtual environment, installs the requested tool and its dependencies, runs the command, and then discards the environment. This ensures tools don't conflict with each other or with project dependencies. Specific versions can be pinned using the **@version** syntax.

uvx is part of the uv Python package manager ecosystem and is useful for running one-off tools like linters, formatters, and code generators without cluttering the system with permanent installations.

# CAVEATS

Requires uv. Python ecosystem. May download packages.

# HISTORY

**uvx** is part of **uv**, the fast Python package manager, providing ephemeral tool execution similar to pipx.

# SEE ALSO

[uv](/man/uv)(1), [pipx](/man/pipx)(1), [python](/man/python)(1)
