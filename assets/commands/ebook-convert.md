# TAGLINE

ebook format converter

# TLDR

**Convert EPUB to AZW3** (format is taken from the output file extension)

```ebook-convert [book.epub] [book.azw3]```

**Convert PDF to EPUB**

```ebook-convert [book.pdf] [book.epub]```

**Optimize for a device** with an output profile

```ebook-convert [input.epub] [output.azw3] --output-profile [kindle_pw3]```

**Convert with custom cover**

```ebook-convert [book.epub] [book.azw3] --cover [cover.jpg]```

**Set metadata**

```ebook-convert [book.epub] [book.azw3] --authors "[Author One & Author Two]" --title "[Book Title]"```

**Convert HTML to EPUB**

```ebook-convert [book.html] [book.epub]```

Convert to **PDF** with a given paper size and page numbers

```ebook-convert [book.epub] [book.pdf] --paper-size [a4] --pdf-page-numbers```

Clean up a badly formatted text or PDF source with **heuristics**

```ebook-convert [book.pdf] [book.epub] --enable-heuristics```

Download a **news recipe** as an ebook

```ebook-convert "[The Guardian].recipe" [news.epub]```

# SYNOPSIS

**ebook-convert** _input_ _output_ [_options_]

# DESCRIPTION

**ebook-convert** is Calibre's command-line tool for converting between ebook formats. It supports a wide range of formats including EPUB, MOBI, PDF, AZW3, KEPUB, DOCX, FB2, HTML, TXT and many others.

The output format is determined by the output file's extension; if the output name has no extension, it is treated as a directory and an OEB (HTML) book is written into it. Conversion runs as a pipeline: input plugin, structure detection, look and feel transforms, then output plugin, and each stage has its own options. Run **ebook-convert** _input_ _output_ **-h** to list every option valid for that format pair.

The tool handles format-specific optimizations and allows customization of output including fonts, margins, covers, and metadata.

# PARAMETERS

**--output-profile** _profile_
> Target device profile, e.g. _kindle_, _kindle_pw3_, _kobo_, _ipad_, _tablet_, _generic_eink_.

**--input-profile** _profile_
> Profile used to interpret the input, e.g. pixel-based lengths.

**--cover** _file_|_url_
> Use a custom cover image.

**--authors** _names_
> Set authors; separate multiple authors with **&**.

**--title** _title_
> Set book title.

**--series**, **--series-index**, **--tags**, **--language**, **--pubdate**
> Set further metadata fields (tags are comma-separated).

**--base-font-size** _pts_
> Base font size in points. 0 (default) lets the output profile decide.

**--extra-css** _file_|_css_
> CSS file or raw CSS appended to the book's styles.

**--embed-all-fonts**
> Embed every referenced font found on the system (EPUB, AZW3, DOCX, PDF).

**--change-justification** _left_|_justify_|_original_
> Text justification. Default is _original_.

**--margin-top**, **--margin-bottom**, **--margin-left**, **--margin-right** _pts_
> Page margins in points (default 5). A negative value keeps the source margin.

**--smarten-punctuation**
> Convert plain quotes, dashes and ellipses to typographic equivalents.

**--enable-heuristics**
> Enable heuristic processing to fix up poorly structured input.

**--level1-toc**, **--level2-toc**, **--level3-toc** _xpath_
> XPath expressions selecting entries for the table of contents.

**--input-encoding** _enc_
> Override the encoding declared by the input document.

**--epub-version** _2_|_3_
> EPUB output version. EPUB 2 is the most widely compatible.

**--paper-size** _size_
> Paper size for PDF output, e.g. _a4_ or _letter_.

**--pdf-engine** _calibre_|_pdftohtml_
> Engine used to read PDF input; _calibre_ is recommended as it removes headers and footers.

**--list-recipes**
> List built-in news recipe names.

**-v**, **--verbose**
> Increase verbosity.

**-h**, **--help**
> Show help; with input and output files given, lists all options for that conversion.

**--version**
> Show program version.

# CAVEATS

PDF is a poor input format: layout is reconstructed heuristically and often loses formatting. MOBI output is legacy; Amazon devices and Send to Kindle prefer EPUB or AZW3. DRM-protected books cannot be converted. Some formats have limited feature support. Large files can be slow.

# HISTORY

**ebook-convert** is part of **Calibre**, created by **Kovid Goyal** starting in **2006**. Originally focused on Sony Reader devices, Calibre grew into a comprehensive ebook management system supporting dozens of formats and devices.

# SEE ALSO

[calibre](/man/calibre)(1), [ebook-meta](/man/ebook-meta)(1), [calibredb](/man/calibredb)(1), [pandoc](/man/pandoc)(1)

# RESOURCES

```[Source code](https://github.com/kovidgoyal/calibre)```

```[Homepage](https://calibre-ebook.com/)```

```[Documentation](https://manual.calibre-ebook.com/generated/en/ebook-convert.html)```

<!-- verified: 2026-11-23 -->
