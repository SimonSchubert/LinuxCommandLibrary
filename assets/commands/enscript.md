# TAGLINE

convert text files to PostScript for printing

# TLDR

**Print file to default printer**

```enscript [file]```

**Generate PostScript output**

```enscript -o [output.ps] [file]```

**Print two columns**

```enscript -2 [file]```

**Print with syntax highlighting**

```enscript -E [file.c]```

**Print landscape**

```enscript -r [file]```

**Print with header**

```enscript -b "[Header Text]" [file]```

**Print line numbers**

```enscript -C [file]```

# SYNOPSIS

**enscript** [_options_] [_file_...]

# PARAMETERS

**-o** _file_
> Output to file instead of printer.

**-E** [_lang_]
> Syntax highlighting.

**-2**
> Two-column output.

**-r**
> Landscape orientation.

**-b** _header_
> Page header.

**-C**
> Print line numbers.

**-f** _font_
> Body font.

**-F** _font_
> Header font.

**-p** _printer_
> Select printer.

**--color**
> Color output.

# DESCRIPTION

**enscript** converts text files to PostScript, HTML, or RTF for printing or viewing. It provides advanced formatting capabilities including multi-column output, headers, footers, and syntax highlighting for numerous programming languages.

The tool is widely used for generating professional-looking printouts of source code and documentation. It can automatically detect file types and apply appropriate syntax highlighting, making code more readable when printed.

enscript supports customization through configuration files and command-line options, allowing control over fonts, page layout, borders, and output format. It's particularly useful in development environments for code reviews and documentation.

# CONFIGURATION

**/etc/enscript.cfg**
> System-wide configuration file for default settings.

**~/.enscriptrc**
> User-specific configuration file for personal preferences.

# SEE ALSO

[a2ps](/man/a2ps)(1), [lpr](/man/lpr)(1)

