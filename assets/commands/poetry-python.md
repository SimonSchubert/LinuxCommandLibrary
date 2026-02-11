# TAGLINE

Manage Python interpreter selection

# TLDR

**List available Python versions**

```poetry python list```

**Get Python installation info**

```poetry python info```

# SYNOPSIS

**poetry python** _command_ [_options_]

# PARAMETERS

**list**
> List Python versions.

**info**
> Show Python info.

# DESCRIPTION

**poetry python** provides information about Python interpreters available on the system. The **list** subcommand shows all discovered Python versions, and **info** displays details about the currently active Python interpreter.

This helps identify which Python versions are available for use with **poetry env use** when creating virtual environments for a project.

# CAVEATS

Requires Python 3.8+. Part of environment management.

# HISTORY

poetry python provides **Python interpreter** management capabilities.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-env](/man/poetry-env)(1)

