# TAGLINE

Extract structured text from PDFs and office documents

# TLDR

Print a PDF as **Markdown**

```papero-extract extract [paper.pdf]```

Write **Markdown and cropped images** beside the output file

```papero-extract extract [paper.pdf] -o [paper.md] --images```

Write **JSON**

```papero-extract extract [paper.pdf] -f json -o [paper.json]```

Write only the **tables** as CSV

```papero-extract extract [paper.pdf] -f csv -o [tables.csv]```

Limit the run to **selected pages**

```papero-extract extract [paper.pdf] -p [1-5] -f html```

Extract **plain text** through Apache Tika, skipping layout analysis

```papero-extract extract [paper.pdf] --fast```

Turn a **folder of PDFs** into a dataset of documents, chunks, and a fidelity report

```papero-extract batch [./documents] -o [./dataset]```

Start the **HTTP API** and browser app

```papero-extract serve --port [8000]```

# SYNOPSIS

**papero-extract** **--version**

**papero-extract** **extract** _file_ [**-o** _path_] [**-f** _format_] [**-p** _pages_] [**--fast**] [_options_]

**papero-extract** **batch** _input_ **-o** _directory_ [_options_]

**papero-extract** **serve** [**--host** _address_] [**--port** _port_]

# DESCRIPTION

**papero-extract** rebuilds the structure of a PDF: reading order, tables, formulas, figures, and a bounding box for every block. It is the command-line entry point of papero (the **papero-extract** Python package). Two engines run on the same file. A layout engine on PDFium reads glyphs, rules, and images and rebuilds columns and tables from geometry. Apache Tika adds metadata, tagged headings, OCR, and non-PDF formats such as DOCX, PPTX, XLSX, EPUB, and HTML.

**extract** handles one file. With no **-f**, the format follows the **-o** extension (**.md**, **.txt**, **.json**, **.html**, **.csv**) and otherwise is Markdown. **csv** writes tables only. **--images** crops figures, tables, and formulas to PNG; when **-o** is set, those files land in an **images/** directory next to the output. **--fast** skips the layout engine and returns cleaned text from Tika.

**batch** walks a directory (default pattern **\*.pdf**) and writes one Markdown and one JSON file per document, a **chunks.jsonl** file, a manifest, and a fidelity report under **fidelity/**. The report compares the extraction to the words PDFium reads on each page. It is a guide to documents worth reviewing, not a score against a ground-truth corpus.

**serve** starts the REST API and the bundled browser app. The API extra must be installed (**pip install 'papero-extract[api]'**). **POST /v1/extract** accepts an uploaded file. Interactive docs are at **/docs**.

# PARAMETERS

**extract** _file_

> Extract one document. Writes to stdout unless **-o** is set.

**-o**, **--output** _path_

> Output file. CSV is written as UTF-8 with a BOM. Other formats are UTF-8.

**-f**, **--format** _format_

> One of **markdown**, **text**, **json**, **html**, **csv**. Default: inferred from **-o**, otherwise **markdown**.

**-p**, **--pages** _spec_

> Page selection such as **1-3,5,10-**.

**--password** _password_

> Password for an encrypted PDF.

**--images**

> Crop figures, tables, and formulas to PNG.

**--image-scale** _scale_

> Crop resolution. The default **2** is 144 dpi.

**--no-tables**

> Skip table detection.

**--no-formulas**

> Skip formula detection.

**--ocr** **auto**|**off**|**force**

> When to OCR. The default **auto** OCRs pages that look scanned. **force** OCRs every page. **off** never does.

**--ocr-language** _langs_

> Tesseract language string. The default is **por+eng**.

**--no-tika**

> Run the PDFium layout engine only, with no Java Tika server.

**--page-breaks**

> Mark the start of each page in Markdown.

**--fast**

> Text only, via Tika. Fastest path. Layout, tables, and formulas are not rebuilt.

**--raw**

> With **--fast**, skip all text cleanup.

**--keep-headers**

> With **--fast**, keep headers and footers.

**--dehyphenate**

> With **--fast**, join words split by a hyphen at a line break.

**-w**, **--workers** _n_

> Worker processes. For **extract**, the default is the CPU count. For **serve**, workers are off unless this is set (exported as **PTE_WORKERS**).

**-q**, **--quiet**

> Suppress the stderr summary. Warnings are still printed.

**batch** _input_ **-o** _directory_

> _input_ is a directory (walked recursively) or a single file. **-o** is required and is the dataset directory.

**--pattern** _glob_

> Files to include. Default **\*.pdf**.

**--formats** _list_

> Per-document outputs, comma-separated. Default **markdown,json**.

**--chunk-size** _chars_

> Maximum chunk size in characters. Default **1500**. Chunks break on headings and keep tables whole.

**serve**

> HTTP API and browser app. Defaults to host **0.0.0.0** and port **8000**, or the **PORT** environment variable when it is set.

**--host** _address_

> Bind address.

**--port** _port_

> Listen port.

**--version**

> Print the package version and exit.

# CAVEATS

**serve** fails until the API extra is installed: **pip install 'papero-extract[api]'**. OCR and non-PDF formats need a working Tika and Tesseract setup. **--no-tika** drops both and keeps only the geometry engine.

Formula reconstruction is glyph-based. Fractions, roots, exponents, and indices become LaTeX. Matrices and aligned systems come out linear. A cropped image of the formula is the reliable copy when **--images** is on. Borderless tables with very narrow column gaps can be read as paragraphs.

Word (**.docx**) and Excel export exist in the browser app. The CLI formats are Markdown, text, JSON, HTML, and CSV. Scanned pages are not readable with **--fast**. That path warns when it finds little text.

# SEE ALSO

[pdftotext](/man/pdftotext)(1), [pdftohtml](/man/pdftohtml)(1), [mutool](/man/mutool)(1), [tesseract](/man/tesseract)(1), [pandoc](/man/pandoc)(1)

# RESOURCES

```[Source code](https://github.com/beatrizalmeidaf/papero-pdf-text-extractor)```

```[Homepage](https://beatrizalmeidaf.github.io/papero-pdf-text-extractor/)```

<!-- verified: 2026-10-01 -->
