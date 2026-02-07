# TAGLINE

GNU document formatting system

# TLDR

**Format document to PDF**

```groff -Tpdf [file.ms] > output.pdf```

**Format with man macros**

```groff -man [file.1] > output.ps```

**Format with ms macros**

```groff -ms [file.ms] > output.ps```

**Preview in terminal**

```groff -Tutf8 [file.roff] | less```

**Process with preprocessors**

```groff -t -e -p [file.roff] > output.ps```

# SYNOPSIS

**groff** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input files to process.

**-T** _DEVICE_
> Output device (pdf, ps, html, utf8).

**-m** _MACRO_
> Use macro package (man, ms, me, mm).

**-t**
> Run tbl preprocessor.

**-e**
> Run eqn preprocessor.

**-p**
> Run pic preprocessor.

**-s**
> Run soelim preprocessor.

**-man**
> Use man macros.

**-ms**
> Use ms macros.

**--help**
> Display help information.

# DESCRIPTION

**groff** is the GNU implementation of the roff document formatting system. It processes text files with embedded formatting commands to produce typeset output in various formats including PDF, PostScript, HTML, and terminal display.

The system includes preprocessors for tables (tbl), equations (eqn), and diagrams (pic), and supports multiple macro packages for different document types.

# CONFIGURATION

**/usr/share/groff/current/tmac/**
> System-wide macro files and configuration for groff output devices.

# CAVEATS

Steep learning curve. Macro packages have different conventions. PostScript output requires viewer.

# HISTORY

groff was created by **James Clark** as a free implementation of AT&T troff. It is now maintained as part of the **GNU** project.

# SEE ALSO

[troff](/man/troff)(1), [nroff](/man/nroff)(1), [man](/man/man)(1), [tbl](/man/tbl)(1), [eqn](/man/eqn)(1)
