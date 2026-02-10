# TAGLINE

joins PDF files

# TLDR

**Join PDFs**

```pdfjoin [file1.pdf] [file2.pdf]```

**Join with output name**

```pdfjoin -o [output.pdf] [file1.pdf] [file2.pdf]```

**Join specific pages**

```pdfjoin [file.pdf] [1-5] [file2.pdf] [2,4,6]```

**Join all PDFs in directory**

```pdfjoin [*.pdf]```

**Rotated pages**

```pdfjoin --rotateoversize false [file1.pdf] [file2.pdf]```

# SYNOPSIS

**pdfjoin** [_-o output_] [_options_] _file1_ [_pages_] _file2_ [_pages_] ...

# PARAMETERS

**-o** _FILE_
> Output filename.

**--rotateoversize** _BOOL_
> Rotate oversized pages.

**--paper** _SIZE_
> Paper size (a4, letter).

**--landscape**
> Landscape orientation.

**--tidy**
> Remove temp files.

**--**
> End of options.

# DESCRIPTION

**pdfjoin** joins PDF files. It combines multiple PDFs into one.

Part of pdfjam utilities. Uses LaTeX pdfpages package.

Page selection supported. Specify ranges or individual pages.

Preserves PDF quality. No recompression.

# CAVEATS

Requires LaTeX installation. Part of pdfjam package. Large files may be slow.

# HISTORY

**pdfjoin** is part of **pdfjam**, a collection of shell scripts for PDF manipulation using LaTeX.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [pdfunite](/man/pdfunite)(1), [gs](/man/gs)(1)
