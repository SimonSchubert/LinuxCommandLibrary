# TAGLINE

Install and run Python CLI tools

# TLDR

**Run tool without installing**

```uv tool run [tool]```

**Install tool globally**

```uv tool install [tool]```

**List installed tools**

```uv tool list```

**Uninstall tool**

```uv tool uninstall [tool]```

**Upgrade tool**

```uv tool upgrade [tool]```

# SYNOPSIS

**uv** **tool** _command_ [_options_]

# PARAMETERS

**run** _tool_
> Run tool temporarily.

**install** _tool_
> Install globally.

**uninstall** _tool_
> Remove tool.

**list**
> List installed tools.

**upgrade** _tool_
> Upgrade tool.

**upgrade** **--all**
> Upgrade all tools.

**dir**
> Show tools directory.

# DESCRIPTION

**uv tool** manages Python CLI tools in isolated environments. Like pipx but faster. Run tools without installation or install for persistent availability.

# SEE ALSO

[uv](/man/uv)(1), [pipx](/man/pipx)(1)

