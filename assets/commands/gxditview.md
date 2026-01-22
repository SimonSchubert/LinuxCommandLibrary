# TLDR

**View groff document**

```gxditview [file.roff]```

**Specify page size**

```gxditview -page [a4] [file.roff]```

**View from stdin**

```groff -X [file.roff]```

**View with specific resolution**

```gxditview -resolution [100] [file.roff]```

# SYNOPSIS

**gxditview** [_options_] [_file_]

# PARAMETERS

_FILE_
> Groff intermediate output.

**-page** _SIZE_
> Page size (a4, letter).

**-resolution** _DPI_
> Display resolution.

**-backingStore**
> Use backing store.

**-help**
> Display help information.

# DESCRIPTION

**gxditview** displays groff output in an X11 window. It provides on-screen preview of formatted documents without printing.

The tool reads groff's intermediate output format and renders it graphically. It's invoked by groff -X or can read ditroff output directly.

gxditview previews groff output in X11.

# CAVEATS

Part of groff package. Requires X11. Dated interface. May have font issues.

# HISTORY

gxditview was developed as part of **GNU groff** as an X11 previewer, derived from **xditview** from X11.

# SEE ALSO

[groff](/man/groff)(1), [groffer](/man/groffer)(1), [xditview](/man/xditview)(1)
