# TAGLINE

determines and displays the search path used to find manual pages

# TLDR

Display **search path**

```manpath```

Show **global** manpath

```manpath --global```

# SYNOPSIS

**manpath** [_options_]

# DESCRIPTION

**manpath** determines and displays the search path used to find manual pages. It examines configuration files and environment variables to construct the path.

# PARAMETERS

**-g, --global**
> Show entire global manpath

**-d, --debug**
> Print debugging information

**-q, --quiet**
> Suppress warnings

**-c, --catpath**
> Show catpath instead of manpath

# ENVIRONMENT

**MANPATH**: Override default search path
**PATH**: Used to derive manpath if MANPATH unset

# SEE ALSO

[man](/man/man)(1), [mandb](/man/mandb)(8)
