# TAGLINE

Groff terminal output driver

# TLDR

**Display in terminal**

```groff -Tutf8 [file.roff]```

**ASCII output**

```groff -Tascii [file.roff]```

**Direct grotty usage**

```grotty [file]```

**Disable SGR sequences**

```grotty -c [file]```

# SYNOPSIS

**grotty** [_options_] [_file_]

# PARAMETERS

_FILE_
> Groff intermediate output.

**-b**
> Suppress bold sequences.

**-c**
> Use old-style output (no SGR).

**-d**
> Ignore SGR escapes.

**-f**
> Feed mode for printers.

**-i**
> Use italic font.

**-o**
> Suppress overstriking.

**-u**
> Suppress underlining.

**-F** _DIR_
> Font directory.

**--help**
> Display help information.

# DESCRIPTION

**grotty** is a groff output driver for terminal display. It produces ASCII or UTF-8 output suitable for viewing in text terminals, supporting bold and underline via SGR escape sequences or overstriking.

It is the driver used for man page display and terminal document viewing.

# CAVEATS

Part of groff package. Output quality depends on terminal capabilities. Some formatting lost in text mode.

# HISTORY

grotty was developed as part of **GNU groff** to enable terminal viewing of formatted documents.

# SEE ALSO

[groff](/man/groff)(1), [nroff](/man/nroff)(1), [man](/man/man)(1)
