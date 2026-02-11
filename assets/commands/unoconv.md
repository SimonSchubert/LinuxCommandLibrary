# TAGLINE

Convert documents between formats via LibreOffice

# TLDR

**Convert document to PDF**

```unoconv -f pdf [document.docx]```

**Convert to specific format**

```unoconv -f [odt] [document.docx]```

**Convert multiple files**

```unoconv -f pdf [*.docx]```

**Output to specific directory**

```unoconv -o [/output/dir] -f pdf [document.docx]```

**Start listener daemon**

```unoconv --listener &```

**List available output formats**

```unoconv --show```

**Convert with export options**

```unoconv -f pdf -e PageRange=[1-5] [document.docx]```

**Read from stdin, write to stdout**

```cat [doc.docx] | unoconv --stdin --stdout -f pdf > [output.pdf]```

# SYNOPSIS

**unoconv** [_options_] _file_...

**unoconv** **--listener** [_options_]

# PARAMETERS

**-f**, **--format** _format_
> Output format (default: pdf).

**-o**, **--output** _path_
> Output directory or filename.

**-e**, **--export** _option_
> Export filter options (e.g., PageRange=1-5).

**-i**, **--import** _option_
> Import filter options.

**-t**, **--template** _file_
> Template for importing styles.

**-l**, **--listener**
> Start as listener daemon.

**-p**, **--port** _port_
> Port for listener (default: 2002).

**--server** _address_
> Server address for listener.

**-n**, **--no-launch**
> Don't start own listener if none found.

**--stdin**
> Read input from stdin.

**--stdout**
> Write output to stdout.

**--show**
> List available output formats.

**-T**, **--timeout** _seconds_
> Connection timeout.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**unoconv** is a command-line document converter using LibreOffice/OpenOffice. It can convert between any formats supported by LibreOffice, including DOC, DOCX, ODT, PDF, HTML, TXT, and many more.

The tool communicates with a LibreOffice instance via UNO bindings. If no listener is running, unoconv starts a temporary instance automatically. For batch processing, start a persistent listener with --listener.

Export options allow fine-tuning of output, such as page ranges for PDF or image quality settings. Templates can apply consistent styling across conversions.

Note: unoconv is deprecated in favor of unoserver for new implementations.

# CAVEATS

Requires LibreOffice installation. First conversion may be slow while LibreOffice starts. Some format combinations may have limited fidelity. Consider unoserver for new projects.

# HISTORY

**unoconv** was created by Dag Wieers to provide command-line access to LibreOffice's conversion capabilities. It became widely used for automated document processing. The project is now in maintenance mode with unoserver as its successor.

# SEE ALSO

[libreoffice](/man/libreoffice)(1), [pandoc](/man/pandoc)(1), [soffice](/man/soffice)(1)
