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

**--tidy**, **--no-tidy**
> Remove or keep temporary files.

**--fitpaper** _BOOL_
> Fit the output paper size to the page contents (pdfjoin sets this to true).

**--suffix** _STRING_
> Suffix for the output filename (pdfjoin defaults to joined).

**--**
> End of options.

# DESCRIPTION

**pdfjoin** joins PDF files. It combines multiple PDFs into one.

A wrapper around pdfjam, which uses the LaTeX pdfpages package.

Page selection supported. Specify ranges or individual pages.

Preserves PDF quality. No recompression.

# CAVEATS

Requires a LaTeX installation. No longer shipped with **pdfjam**: it now lives in the unmaintained **pdfjam-extras** collection. It is a thin wrapper, so **pdfjam --fitpaper true --rotateoversize true --suffix joined** is equivalent. Large files may be slow.

# HISTORY

**pdfjoin** was originally distributed with **pdfjam** and is now kept, unmaintained, in the separate **pdfjam-extras** repository.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [pdfunite](/man/pdfunite)(1), [gs](/man/gs)(1)

# RESOURCES

```[Source code](https://github.com/pdfjam/pdfjam-extras)```

<!-- verified: 2026-11-08 -->
