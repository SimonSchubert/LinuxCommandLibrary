# TAGLINE

X11 clipboard command-line interface

# TLDR

Copy output to **primary selection**

```echo 123 | xclip```

Copy to **system clipboard**

```echo 123 | xclip -selection clipboard```

Copy **file contents** to clipboard

```xclip -selection clipboard input.txt```

Copy **image** to clipboard

```xclip -selection clipboard -target image/png image.png```

Copy from **user input**

```xclip -i```

**Paste** from primary selection

```xclip -o```

**Paste** from clipboard

```xclip -o -selection clipboard```

# SYNOPSIS

**xclip** [_-i_|_-o_] [_-selection sel_] [_-target type_] [_file_...]

# DESCRIPTION

**xclip** is an X11 clipboard manipulation tool. It can read data from standard input or files and write it to any X selection (primary, secondary, or clipboard), or output selection contents to stdout.

# PARAMETERS

**-i, -in**
> Read from stdin or files (default mode)

**-o, -out**
> Write selection to stdout

**-se, -selection SELECTION**
> Specify selection: primary, secondary, or clipboard

**-t, -target TYPE**
> Specify MIME target type (e.g., image/png, text/html)

**-d, -display DISPLAY**
> X display to connect to

**-l, -loops N**
> Number of paste requests to serve before exiting

**-f, -filter**
> Print input to stdout while copying

**-q, -quiet**
> Suppress informational output

**-v, -verbose**
> Print extra information

**-silent**
> Fork into background (used with -loops)

# X11 SELECTIONS

**primary**: Middle-click paste (highlight to copy)
**secondary**: Rarely used secondary selection
**clipboard**: Ctrl+C/Ctrl+V clipboard

# CAVEATS

Data is only available while xclip is running (unless using -loops or -silent). For persistent clipboard storage, use a clipboard manager. The default selection is primary, not clipboard.

# HISTORY

**xclip** was written by Kim Saunders as a command-line interface to X11 selections. It provides scriptable clipboard access without GUI dependencies.

# SEE ALSO

[xsel](/man/xsel)(1), [wl-copy](/man/wl-copy)(1), [wl-paste](/man/wl-paste)(1)
