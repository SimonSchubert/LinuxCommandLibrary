# TLDR

**List all fonts**

```fslsfonts```

**List fonts matching** pattern

```fslsfonts -fn '[*-courier-*]'```

**Show long listing**

```fslsfonts -l```

**List from specific** server

```fslsfonts -server [hostname:7100]```

**Show font columns**

```fslsfonts -C```

# SYNOPSIS

**fslsfonts** [_options_] [_pattern_]

# PARAMETERS

_PATTERN_
> Font pattern to match.

**-fn** _PATTERN_
> Font name pattern (XLFD).

**-l**
> Long listing with details.

**-C**
> Multi-column output.

**-server** _HOST:PORT_
> Font server to query.

**-1**
> One font per line.

**--help**
> Display help information.

# DESCRIPTION

**fslsfonts** lists fonts available from X font servers. It queries the font server and displays matching font names in XLFD (X Logical Font Description) format.

The tool helps identify available fonts for X applications. Patterns can match specific font families, weights, or sizes. Long format shows additional font properties.

fslsfonts is the font server equivalent of xlsfonts for local X fonts.

# CAVEATS

Requires running X font server. XLFD patterns can be complex. Less relevant with modern fontconfig.

# HISTORY

fslsfonts is part of the **X Window System** font server utilities. It queries xfs font servers, which were the standard way to share fonts across X terminals and workstations.

# SEE ALSO

[xlsfonts](/man/xlsfonts)(1), [xfs](/man/xfs)(1), [fc-list](/man/fc-list)(1)
