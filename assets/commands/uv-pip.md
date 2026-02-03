# TLDR

**Install package**

```uv pip install [package]```

**Install from requirements**

```uv pip install -r requirements.txt```

**Uninstall package**

```uv pip uninstall [package]```

**List installed packages**

```uv pip list```

**Freeze dependencies**

```uv pip freeze```

# SYNOPSIS

**uv** **pip** _command_ [_options_]

# PARAMETERS

**install** _packages_
> Install packages.

**uninstall** _packages_
> Remove packages.

**list**
> List installed.

**freeze**
> Output requirements format.

**show** _package_
> Show package info.

**check**
> Verify dependencies.

**compile**
> Compile requirements.

**sync**
> Sync from requirements.

# DESCRIPTION

**uv pip** provides pip-compatible commands using uv's resolver. Drop-in replacement for pip with dramatically faster performance. Use for non-project package management.

# SEE ALSO

[uv](/man/uv)(1), [pip](/man/pip)(1)

