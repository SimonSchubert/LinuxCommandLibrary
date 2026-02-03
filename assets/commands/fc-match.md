# TLDR

**Find best matching font**

```fc-match [pattern]```

**Match monospace font**

```fc-match monospace```

**Match with specific family**

```fc-match "DejaVu Sans"```

**Show verbose output**

```fc-match -v [pattern]```

**Show specific elements**

```fc-match --format "%{family}\n" [pattern]```

**Match all fonts**

```fc-match -a [pattern]```

# SYNOPSIS

**fc-match** [_options_] [_pattern_]

# PARAMETERS

**-a**, **--all**
> Show all matching fonts.

**-s**, **--sort**
> Sort output by priority.

**-v**, **--verbose**
> Verbose output.

**--format** _format_
> Format output string.

# DESCRIPTION

**fc-match** matches fonts against fontconfig patterns. Shows which font will be used for a given pattern. Useful for debugging font configuration.

# SEE ALSO

[fc-list](/man/fc-list)(1), [fc-cache](/man/fc-cache)(1)

