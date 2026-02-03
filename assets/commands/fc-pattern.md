# TLDR

**Parse font pattern**

```fc-pattern "[pattern]"```

**Show default pattern**

```fc-pattern --default [pattern]```

**Configure pattern**

```fc-pattern --config [pattern]```

**Custom format output**

```fc-pattern --format "%{family}" [pattern]```

# SYNOPSIS

**fc-pattern** [_options_] [_pattern_]

# PARAMETERS

**-d**, **--default**
> Apply default substitutions.

**-c**, **--config**
> Apply config substitutions.

**--format** _format_
> Custom output format.

# DESCRIPTION

**fc-pattern** parses and displays fontconfig patterns. Shows how fontconfig interprets font matching patterns. Useful for debugging font configuration.

# SEE ALSO

[fc-match](/man/fc-match)(1), [fc-list](/man/fc-list)(1)

