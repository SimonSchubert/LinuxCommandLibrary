# TAGLINE

Fast dependency-free document converter (Pandoc alternative)

# TLDR

**Convert Markdown to DOCX** (formats auto-detected from extensions)

```rudoc [README.md] [README.docx]```

**Convert DOCX to PDF**

```rudoc [report.docx] [report.pdf]```

**Convert Markdown to HTML** with explicit formats

```rudoc -f md -t html [README.md]```

**Write output** to a path

```rudoc [README.md] -o [/tmp/readme.pdf]```

**Convert CSV to XLSX**

```rudoc [data.csv] [report.xlsx]```

**Convert Markdown to PowerPoint slides**

```rudoc [notes.md] [slides.pptx]```

**Pipe Markdown to HTML** on stdout

```cat [README.md] | rudoc -f md -t html```

**Merge multiple Markdown files** into one document

```rudoc [ch1.md] [ch2.md] [ch3.md] -t html -o [book.html]```

# SYNOPSIS

**rudoc** [**-f** _FORMAT_] [**-t** _FORMAT_] [**-o** _FILE_] [_options_] [_input_...]

# PARAMETERS

**-f**, **--from** _FORMAT_

> Input format (auto-detected from file extension when omitted). Names are case-insensitive; aliases include **md**/**markdown**/**gfm**, **html**, **txt**, **docx**, **typ**/**typst**, **pdf**, **pptx**, **csv**, **xlsx**, **xml**, **opml**, **json**.

**-t**, **--to** _FORMAT_

> Output format (auto-detected from the output path or second path argument when omitted).

**-o**, **--output** _FILE_

> Output path. Default is stdout when formats allow streaming.

**--standalone**

> Emit a full HTML document with head metadata and CSS.

**--slide-level** _N_

> Heading level that starts a new slide when writing **pptx** (default: **1**).

**--sheet** _NAME_

> Sheet name for XLSX input/output (default: **Sheet1**).

**--pdf-paper** _SIZE_

> Paper size for PDF: **a4**, **a3**, **a5**, **us-letter**, **us-legal** (default: **a4**).

**--pdf-font** _NAME_

> Body font for Typst/PDF output (default: **Arial**).

**--wrap** _COLS_

> Line-wrap width for **md**/**txt** output (**0** = off).

**-q**, **--quiet**

> Suppress progress messages.

**-v**, **--verbose**

> Show intermediate IR stats and timing.

**-h**, **--help**

> Print help.

**--version**

> Print version.

# DESCRIPTION

**rudoc** is a small, static Rust document converter aimed at the common conversions people use every day. It is designed as a focused alternative to **pandoc**: a few megabytes, sub-5 ms startup, no language runtime, and a curated set of formats rather than dozens of backends.

Supported rich-text conversions are bidirectional among **Markdown**, **HTML**, **plain text**, **DOCX**, **Typst** (**.typ**), and **PDF** (PDF input is text extraction only; layout is not preserved). Presentations go **Markdown → PPTX**, with heading levels controlling slide boundaries. Tabular data converts **CSV ↔ XLSX**. Structured data converts **XML ↔ OPML ↔ JSON** with lossless round-trips inside that group.

Formats are usually inferred from file extensions, so many invocations need no flags. Explicit **-f** / **-t** overrides, stdin/stdout piping, multi-file Markdown merge, and PDF paper/font options cover scripted and batch use. For PDF output, rudoc prefers the **typst** CLI when present, can use a built-in printpdf path when compiled with the **pdf** feature, and otherwise prints install guidance.

# CAVEATS

Rudoc intentionally supports fewer formats than pandoc (roughly a dozen focused paths). PDF **reading** extracts text only and does not preserve layout. Highest-quality PDF **writing** works best with **typst** on **PATH**; without it you need a build that includes the optional built-in PDF feature, or conversion stops with an error. Presentation export is Markdown → PPTX only (not full bidirectional slide conversion).

# SEE ALSO

[pandoc](/man/pandoc)(1), [typst](/man/typst)(1), [libreoffice](/man/libreoffice)(1), [soffice](/man/soffice)(1)

# RESOURCES

```[Source code](https://github.com/asong56/rudoc)```

<!-- verified: 2026-07-26 -->
