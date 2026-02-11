# TAGLINE

Transform and manipulate PDF file structure

# TLDR

**Decrypt PDF**

```qpdf --decrypt [input.pdf] [output.pdf]```

**Linearize PDF** (optimize for web)

```qpdf --linearize [input.pdf] [output.pdf]```

**Merge PDFs**

```qpdf --empty --pages [file1.pdf] [file2.pdf] -- [output.pdf]```

**Extract specific pages**

```qpdf --empty --pages [input.pdf] [1-5,10] -- [output.pdf]```

**Rotate pages**

```qpdf [input.pdf] [output.pdf] --rotate=[+90:1-5]```

**Compress streams**

```qpdf --compress-streams=y [input.pdf] [output.pdf]```

**Check PDF structure**

```qpdf --check [input.pdf]```

**Remove password**

```qpdf --password=[pass] --decrypt [encrypted.pdf] [output.pdf]```

# SYNOPSIS

**qpdf** [_--decrypt_] [_--linearize_] [_--pages spec_] [_--rotate spec_] [_options_] _input_ _output_

# PARAMETERS

**--decrypt**
> Remove encryption.

**--linearize**
> Optimize for web viewing.

**--encrypt** _user_ _owner_ _bits_
> Add encryption.

**--pages** _spec_
> Page selection specification.

**--rotate** [_+|-_]_angle_:_pages_
> Rotate pages.

**--empty**
> Use empty PDF as input base.

**--check**
> Check PDF structure.

**--show-encryption**
> Display encryption details.

**--password** _PASS_
> Input file password.

**--compress-streams**[=_y|n_]
> Compress/decompress streams.

**--decode-level** _LEVEL_
> Stream decoding: none, generalized, specialized, all.

**--normalize-content**[=_y|n_]
> Normalize content streams.

**--split-pages**[=_n_]
> Split into n-page files.

**--overlay** _file_
> Overlay pages from file.

**--underlay** _file_
> Underlay pages from file.

**--flatten-rotation**
> Make rotation permanent.

**--flatten-annotations**
> Flatten annotation appearances.

**--json**
> Output PDF structure as JSON.

**--qdf**
> Create QDF (editable PDF source).

# DESCRIPTION

**qpdf** is a command-line tool for structural, content-preserving transformations of PDF files. Unlike tools that rasterize or re-render, qpdf manipulates PDF structure directly.

Primary uses include encryption management (decrypting, encrypting, changing passwords), linearization (optimizing for web delivery), and page manipulation (merging, splitting, reordering).

Page specification uses flexible syntax: ranges (1-10), specific pages (1,3,5), reverse (z-1), and rotation (1-5:90). Multiple files can contribute pages using --pages with file:range pairs.

The --check option validates PDF structure without modifying, useful for identifying damaged files. JSON output exposes internal structure for analysis or custom processing.

QDF mode produces "normalized" PDFs that can be edited with text editors, enabling debugging and manual fixes. Stream decompression reveals human-readable content.

Linearization reorganizes PDFs for efficient byte-serving over HTTP, enabling page-at-a-time loading without downloading entire files.

# CAVEATS

Cannot edit text content (use other tools). Password-protected files need password for processing. Some malformed PDFs may not process. Large PDFs require significant memory. Encryption strength limited by PDF specification.

# HISTORY

**qpdf** was created by **Jay Berkenbilt** at Apex CoVantage starting around **2005**. Originally internal tooling for PDF processing, it was open-sourced and has become a standard library and command-line tool. Unlike PDF editors, qpdf focuses on structural transformations that preserve content exactly.

# SEE ALSO

[pdftk](/man/pdftk)(1), [poppler-utils](/man/poppler-utils)(1), [ghostscript](/man/ghostscript)(1), [pdfunite](/man/pdfunite)(1)
