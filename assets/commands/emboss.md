# TAGLINE

Deterministic accessible PDF generation for Python

# TLDR

**Install** the package (provides the **emboss** CLI)

```pip install emboss-pdf```

**Build** a multi-file Markdown directory into one PDF

```emboss build [path/to/docs] -o [handbook.pdf]```

**Verify** structural integrity or PDF/UA / PDF/A conformance

```emboss verify [report.pdf]```

```emboss verify [report.pdf] --conformance ua1```

**Diff** two PDFs into a redlined PDF

```emboss diff [old.pdf] [new.pdf] -o [redline.pdf]```

**Reproduce** a self-describing PDF from its embedded spec

```emboss reproduce [report.pdf]```

**Strip** embedded specs and internal ids before external sharing

```emboss strip [report.pdf] -o [external.pdf]```

# SYNOPSIS

**emboss** _command_ [_options_] [_args_]

# DESCRIPTION

**emboss** is the command-line interface for Emboss (**emboss-pdf** on PyPI), a pure-Python typesetting engine that turns declarative specs or Markdown into PDF/UA-tagged, deterministic PDFs. The same semantic model drives layout and the structure tree so accessibility tags cannot drift from visible content. Output is designed to be byte-identical across runs when inputs match.

The library API (**Document**, Fluent builders, **from_markdown** / **from_json**) is the primary authoring surface; the CLI covers batch builds, verification (including real **veraPDF** when installed), document redlines, reproducibility checks, and stripping embedded provenance before distribution.

Optional extras add pydantic LLM schemas, pikepdf verification helpers, cryptography for signatures, and an MCP server surface for agent workflows.

# COMMANDS

**build** _dir_ **-o** _out.pdf_

> Concatenate Markdown (and related sources) under _dir_ into one PDF. Optional **.order** file lists files explicitly; numeric prefixes sort alphabetically.

**verify** _file.pdf_ [**--conformance** ua1|2b|3b]

> Structural checks, or shell out to veraPDF for PDF/UA-1 / PDF/A-2b / PDF/A-3b when **verapdf** is on **PATH** (or **VERAPDF_PATH** is set).

**diff** _old.pdf_ _new.pdf_ **-o** _redline.pdf_

> Produce a redlined PDF of added/removed/changed blocks using stable node ids.

**reproduce** _file.pdf_

> Recover the embedded EmbossSpec (or structure-tree fallback), re-render, and report structural agreement.

**strip** _file.pdf_ **-o** _out.pdf_

> Remove embedded files, some metadata, and structure-tree node ids for external sharing.

# CAVEATS

Complex-script shaping (Arabic, Indic) and arbitrary HTML/CSS input are not supported. Conformance mode requires a real veraPDF installation. Package name on PyPI is **emboss-pdf**; the console script is **emboss**.

# SEE ALSO

[python](/man/python)(1), [pdftotext](/man/pdftotext)(1), [weasyprint](/man/weasyprint)(1)

# RESOURCES

```[Source code](https://github.com/GGChamp85/Emboss)```

```[Homepage](https://pypi.org/project/emboss-pdf/)```

<!-- verified: 2026-07-30 -->
