# TAGLINE

converts between terminal encoding and application encoding

# TLDR

**Run command with encoding conversion**

```luit -encoding [ISO-8859-1] [command]```

**Connect to remote with encoding**

```luit -encoding [EUC-JP] ssh [host]```

**Force specific locale**

```luit -encoding [GB2312] -x```

**List supported encodings**

```luit -list```

**Run shell with encoding**

```luit -encoding [KOI8-R]```

# SYNOPSIS

**luit** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Command to run with encoding.

**-encoding** _ENC_
> Character encoding.

**-x**
> Exit on child termination.

**-list**
> List encodings.

**-g** _N_
> GL character set.

**--help**
> Display help information.

# DESCRIPTION

**luit** converts between terminal encoding and application encoding. It enables UTF-8 terminals to run legacy apps.

The tool acts as a filter between the terminal and the application, translating character encodings.

# CAVEATS

X11 tool. May not handle all encodings. Complex legacy encoding support.

# HISTORY

luit was created for **XFree86/X.Org** to handle encoding conversion for terminals running UTF-8.

# SEE ALSO

[xterm](/man/xterm)(1), [iconv](/man/iconv)(1), [locale](/man/locale)(1)

