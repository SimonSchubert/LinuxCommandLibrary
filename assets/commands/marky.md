# TAGLINE

Convert documents of many formats into Markdown

# TLDR

**Convert a PDF** and print the Markdown to stdout

```marky [document.pdf]```

**Convert a Word document** and save to a file

```marky [document.docx] --output [converted.md]```

**Convert an Excel spreadsheet** using the short form of the output flag

```marky [data.xlsx] -o [table.md]```

**Convert a PowerPoint presentation**

```marky [presentation.pptx] -o [slides.md]```

**Convert an HTML page to Markdown**

```marky [webpage.html] -o [content.md]```

**Convert a Jupyter notebook**

```marky [notebook.ipynb] -o [notebook.md]```

# SYNOPSIS

**marky** _INPUT_ [**-o** _OUTPUT_]

# PARAMETERS

**-o** _FILE_, **--output** _FILE_
> Write the generated Markdown to _FILE_. Without this flag the result is printed to standard output.

**-h**, **--help**
> Show usage information.

**-v**, **--version**
> Print the version and exit.

# DESCRIPTION

**marky** is a small Go command-line tool (and embeddable library) that converts documents into clean, readable **Markdown**. It understands CSV, EPUB, HTML, Jupyter notebooks (_.ipynb_), Microsoft Word (_.docx_), Microsoft Excel (_.xlsx_), PDF, and PowerPoint (_.pptx_) files.

The input format is detected from the file extension, so a single command — _marky somefile.ext_ — is usually enough. Without **-o**, Markdown goes to stdout so marky can be chained with other tools (_marky report.pdf | pandoc -o report.html_). The project also ships a **marky-mcp** companion that exposes the same conversion functions over the Model Context Protocol for use with coding agents.

# INSTALLATION

**marky** is distributed as a Go program:

```
go install github.com/flaviodelgrosso/marky/cmd/marky@latest
```

A Go 1.24 or newer toolchain is required. The companion MCP server installs with:

```
go install github.com/flaviodelgrosso/marky/marky-mcp@latest
```

# CAVEATS

Conversion fidelity depends on the underlying libraries (html-to-markdown, excelize, PDF parsers); complex layouts, equations, and embedded images may not round-trip perfectly. Very large Excel workbooks can consume significant memory because marky loads the whole document before conversion.

# HISTORY

**marky** is authored by **Flavio Del Grosso** and released under the **ISC license**. It combines several existing Go libraries into one cohesive CLI and MCP server to make feeding documents to AI agents straightforward.

# SEE ALSO

[pandoc](/man/pandoc)(1), [html2md](/man/html2md)(1), [pdftotext](/man/pdftotext)(1), [docx2txt](/man/docx2txt)(1)
