# TAGLINE

GNU document formatting system

# TLDR

**Format document to PDF**

```groff -Tpdf [file.ms] > output.pdf```

**Format with man macros**

```groff -man [file.1] > output.ps```

**Format with ms macros to PDF**

```groff -ms -Tpdf [file.ms] > output.pdf```

**Preview in terminal**

```groff -Tutf8 [file.roff] | less```

**Process with table and equation preprocessors**

```groff -t -e -ms [file.ms] > output.ps```

**Format a man page to plain text**

```groff -Tutf8 -man [file.1]```

**Display the pipeline without executing it**

```groff -V -Tpdf [file.ms]```

# SYNOPSIS

**groff** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input files to process.

**-T** _DEVICE_
> Output device (pdf, ps, html, utf8, ascii, latin1, dvi).

**-m** _MACRO_
> Use macro package (man, ms, me, mm).

**-t**
> Run tbl preprocessor for tables.

**-e**
> Run eqn preprocessor for equations.

**-p**
> Run pic preprocessor for diagrams.

**-R**
> Run refer preprocessor for bibliographic references.

**-s**
> Run soelim preprocessor for file inclusion.

**-G**
> Run grap preprocessor for graphs.

**-S**
> Safer mode. Disables .open, .opena, .pso, .sy, and .pi requests.

**-U**
> Unsafe mode. Reverts to the unsafe requests disabled by -S.

**-V**
> Print the pipeline that would be run to standard error, without executing it.

**-Z**
> Disable postprocessing. Output raw troff intermediate output.

**-a**
> Generate a plain text approximation of the typeset output.

**-b**
> Print a backtrace on each error or warning.

**-man**
> Shorthand for -m man. Use man macros.

**-ms**
> Shorthand for -m ms. Use ms macros.

**--help**
> Display help information.

# DESCRIPTION

**groff** is the GNU implementation of the roff document formatting system. It is a front-end that orchestrates the execution of preprocessors, the troff formatter, and an output driver in a pipeline. It processes text files with embedded formatting commands to produce typeset output in various formats including PDF, PostScript, HTML, and terminal display.

The system includes preprocessors for tables (tbl), equations (eqn), and diagrams (pic), and supports multiple macro packages for different document types.

# CONFIGURATION

**/usr/share/groff/current/tmac/**
> System-wide macro files and configuration for groff output devices.

# CAVEATS

Steep learning curve. Macro packages have different conventions. The -man and -ms shorthands are groff extensions not present in traditional troff. The default output device is ps (PostScript) unless overridden with -T.

# HISTORY

groff was created by **James Clark** as a free implementation of AT&T troff. It is now maintained as part of the **GNU** project.

# SEE ALSO

[troff](/man/troff)(1), [nroff](/man/nroff)(1), [man](/man/man)(1), [tbl](/man/tbl)(1), [eqn](/man/eqn)(1), [pic](/man/pic)(1), [refer](/man/refer)(1), [soelim](/man/soelim)(1)
