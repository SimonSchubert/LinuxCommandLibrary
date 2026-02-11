# TAGLINE

List available X11 fonts

# TLDR

**List all available fonts**

```xlsfonts```

**List fonts matching a pattern**

```xlsfonts -fn "*courier*"```

**List fonts with detailed info**

```xlsfonts -l```

**List fonts on specific display**

```xlsfonts -display [hostname:0]```

**List fonts one per line**

```xlsfonts -1```

**Count available fonts**

```xlsfonts | wc -l```

**List monospace fonts**

```xlsfonts -fn "*-m-*"```

# SYNOPSIS

**xlsfonts** [**-display** _HOST:DISPLAY_] [**-l**] [**-ll**] [**-lll**] [**-m**] [**-C**] [**-1**] [**-w** _WIDTH_] [**-n** _COLUMNS_] [**-u**] [**-o**] [**-fn** _PATTERN_]

# PARAMETERS

**-display** _HOST:DISPLAY_
> Connect to specified X display.

**-fn** _PATTERN_
> List only fonts matching pattern (wildcards supported).

**-l**
> List fonts with minimal attributes.

**-ll**
> List fonts with more attributes.

**-lll**
> List fonts with all attributes.

**-m**
> Use maximum output width (usually 79 columns).

**-C**
> Use multiple columns.

**-1**
> Force single column output.

**-w** _WIDTH_
> Maximum width for multi-column output.

**-n** _COLUMNS_
> Number of columns.

**-u**
> Leave output unsorted.

**-o**
> Use OpenFont/QueryFont instead of ListFonts.

# DESCRIPTION

**xlsfonts** lists fonts available from the X server's font path. By default, it lists all fonts in multiple columns. Font names follow the X Logical Font Description (XLFD) convention with fields for foundry, family, weight, slant, width, style, pixel size, point size, resolution, spacing, average width, and character set.

Patterns can include wildcards (* matches any string, ? matches single character). Common pattern uses filter by family (-fn "*helvetica*"), spacing (-fn "*-m-*" for monospace), or size.

# CAVEATS

xlsfonts shows X11 core fonts only, not modern fontconfig/Xft fonts used by most applications. The output can be extensive on systems with many fonts installed. Font paths and availability depend on X server configuration.

# HISTORY

xlsfonts has been part of the X Window System utilities since the early X11 releases in the late 1980s. While modern applications typically use fontconfig and Xft for antialiased font rendering, xlsfonts remains useful for diagnosing X11 core font availability and for legacy applications.

# SEE ALSO

[xfontsel](/man/xfontsel)(1), [fc-list](/man/fc-list)(1), [xset](/man/xset)(1)
