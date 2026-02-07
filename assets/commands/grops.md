# TAGLINE

Groff PostScript output driver

# TLDR

**Convert groff to PostScript**

```groff -Tps [file.roff] > output.ps```

**Direct grops usage**

```grops [file] > output.ps```

**Specify paper size**

```grops -p [a4] [file] > output.ps```

**Landscape mode**

```grops -l [file] > output.ps```

# SYNOPSIS

**grops** [_options_] [_file_]

# PARAMETERS

_FILE_
> Groff intermediate output.

**-c** _N_
> Number of copies.

**-F** _DIR_
> Font directory.

**-l**
> Landscape orientation.

**-p** _SIZE_
> Paper size (letter, a4, legal).

**-P** _PROLOGUE_
> Use prologue file.

**-b**
> Broken flag for compatibility.

**--help**
> Display help information.

# DESCRIPTION

**grops** is a groff output driver that produces PostScript. It is the primary driver for high-quality printed output from groff, generating Level 2 PostScript with support for color, graphics, and embedded fonts.

Output can be printed directly or converted to PDF with tools like ps2pdf.

# CAVEATS

Part of groff package. PostScript output can be large. Requires PostScript viewer or printer.

# HISTORY

grops was developed as part of **GNU groff** by **James Clark** as the primary output driver for printed documents.

# SEE ALSO

[groff](/man/groff)(1), [gropdf](/man/gropdf)(1), [ps2pdf](/man/ps2pdf)(1)
