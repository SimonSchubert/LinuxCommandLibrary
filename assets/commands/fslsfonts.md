# TAGLINE

list fonts from X font server

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
> XLFD pattern of fonts to list (defaults to **\***).

**-l**
> Long listing — show font properties. Repeat as **-ll** or **-lll** for progressively more detail.

**-m**
> Include minimum and maximum character bounds in long listings.

**-C**
> Multi-column output.

**-1**
> Single-column output (one font per line).

**-w** _WIDTH_
> Set the column width used by **-C** (default 79).

**-n** _COLUMNS_
> Force the output to use _COLUMNS_ columns (implies **-C**).

**-u**
> Leave the output unsorted.

**-server** _HOST:PORT_
> Query the named font server (e.g. **tcp/host:7100**, **unix/:7100**) instead of the **FONTSERVER** environment variable.

# DESCRIPTION

**fslsfonts** lists fonts available from X font servers. It queries the font server and displays matching font names in XLFD (X Logical Font Description) format.

The tool helps identify available fonts for X applications. Patterns can match specific font families, weights, or sizes. Long format shows additional font properties.

fslsfonts is the font server equivalent of xlsfonts for local X fonts.

# CAVEATS

Requires running X font server. XLFD patterns can be complex. Less relevant with modern fontconfig.

# HISTORY

fslsfonts is part of the **X Window System** font server utilities. It queries xfs font servers, which were the standard way to share fonts across X terminals and workstations.

# INSTALL

```apt: sudo apt install x11-xfs-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xlsfonts](/man/xlsfonts)(1), [xfs](/man/xfs)(1), [fc-list](/man/fc-list)(1)
