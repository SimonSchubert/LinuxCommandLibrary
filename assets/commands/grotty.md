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
> Suppress overstriking for bold characters in legacy (**-c**) output format.

**-c**
> Use grotty's legacy output format (overstriking) instead of SGR escape sequences.

**-d**
> Ignore all drawing commands in the input.

**-f**
> Emit a form feed at the end of each page whose last line has no output.

**-i**
> Render slanted fonts using the SGR italic attribute instead of underlining.

**-o**
> Suppress overstriking, other than for bold and/or underlined characters.

**-u**
> Suppress underlining for italic characters in legacy output format.

**-h**
> Use literal horizontal tab characters in the output.

**-t**
> Assume the output device supports SGR 38/48 (24-bit color) escape sequences.

**-F** _DIR_
> Prepend _DIR_/devname to the search path for font and device description files.

**-v**, **--version**
> Show version information and exit.

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

# RESOURCES

```[Source code](https://git.savannah.gnu.org/cgit/groff.git)```

```[Homepage](https://www.gnu.org/software/groff/)```

```[Documentation](https://www.gnu.org/software/groff/groff.html)```

<!-- verified: 2026-07-17 -->
