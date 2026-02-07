# TAGLINE

ebook format converter

# TLDR

**Convert EPUB to MOBI**

```ebook-convert [book.epub] [book.mobi]```

**Convert PDF to EPUB**

```ebook-convert [book.pdf] [book.epub]```

**Set output profile**

```ebook-convert [input.epub] [output.mobi] --output-profile [kindle]```

**Convert with custom cover**

```ebook-convert [book.epub] [book.mobi] --cover [cover.jpg]```

**Set metadata**

```ebook-convert [book.epub] [book.mobi] --authors "[Author Name]" --title "[Book Title]"```

**Convert HTML to EPUB**

```ebook-convert [book.html] [book.epub]```

# SYNOPSIS

**ebook-convert** _input_ _output_ [_options_]

# DESCRIPTION

**ebook-convert** is Calibre's command-line tool for converting between ebook formats. It supports a wide range of formats including EPUB, MOBI, PDF, AZW3, HTML, and many others.

The tool handles format-specific optimizations and allows customization of output including fonts, margins, covers, and metadata.

# PARAMETERS

**--output-profile** _profile_
> Device profile (kindle, ipad, etc.).

**--cover** _file_
> Use custom cover image.

**--authors** _names_
> Set author metadata.

**--title** _title_
> Set book title.

**--base-font-size** _size_
> Base font size in points.

**--embed-all-fonts**
> Embed all fonts.

**--change-justification** _type_
> Text justification.

**--margin-top/bottom/left/right** _pts_
> Set margins.

**--list-recipes**
> List news recipes.

**--input-encoding** _enc_
> Input file encoding.

# CAVEATS

PDF conversion may lose formatting. Complex layouts may not convert well. Some formats have limited feature support. Large files can be slow.

# HISTORY

**ebook-convert** is part of **Calibre**, created by **Kovid Goyal** starting in **2006**. Originally focused on Sony Reader devices, Calibre grew into a comprehensive ebook management system supporting dozens of formats and devices.

# SEE ALSO

[calibre](/man/calibre)(1), [ebook-meta](/man/ebook-meta)(1), [ebook-viewer](/man/ebook-viewer)(1), [pandoc](/man/pandoc)(1)
