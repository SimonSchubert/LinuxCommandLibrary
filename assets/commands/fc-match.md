# TAGLINE

find best matching font

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

**fc-match** matches fonts against fontconfig patterns and shows which font will be used for a given request. The tool is essential for debugging font configuration, understanding why certain fonts are selected, and verifying font substitution rules.

When applications request a font, fontconfig uses a sophisticated matching algorithm considering family name, style, weight, and other properties. fc-match reveals the result of this matching process, helping diagnose font-related issues.

# CAVEATS

Pattern syntax can be complex. Font matching rules depend on fontconfig configuration. Results may differ across systems with different font installations.

# SEE ALSO

[fc-list](/man/fc-list)(1), [fc-cache](/man/fc-cache)(1)
