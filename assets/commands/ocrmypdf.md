# TLDR

**Add OCR layer to PDF**

```ocrmypdf [input.pdf] [output.pdf]```

**OCR and correct skew**

```ocrmypdf --deskew [input.pdf] [output.pdf]```

**OCR and clean background**

```ocrmypdf --clean [input.pdf] [output.pdf]```

**Specify language**

```ocrmypdf -l [deu] [input.pdf] [output.pdf]```

**Multiple languages**

```ocrmypdf -l [eng+fra] [input.pdf] [output.pdf]```

**Force OCR even if text exists**

```ocrmypdf --force-ocr [input.pdf] [output.pdf]```

**Skip pages with text**

```ocrmypdf --skip-text [input.pdf] [output.pdf]```

**Optimize and reduce size**

```ocrmypdf --optimize [3] [input.pdf] [output.pdf]```

# SYNOPSIS

**ocrmypdf** [_-l lang_] [_--deskew_] [_--clean_] [_--force-ocr_] [_--optimize level_] [_options_] _input.pdf_ _output.pdf_

# PARAMETERS

**-l** _LANG_, **--language** _LANG_
> OCR language (Tesseract language codes).

**--deskew**
> Correct page skew before OCR.

**--clean**
> Clean page background before OCR.

**--clean-final**
> Clean and keep cleaned image in output.

**--rotate-pages**
> Rotate pages to correct orientation.

**--remove-background**
> Remove background from pages.

**--force-ocr**
> OCR all pages, replacing existing text.

**--skip-text**
> Skip pages that already have text.

**--redo-ocr**
> Redo OCR on pages with existing text.

**--optimize** _LEVEL_
> Optimize output (0=off, 1-3 increasing).

**--output-type** _TYPE_
> Output type: pdf, pdfa, pdfa-1, pdfa-2, pdfa-3.

**--pdfa-image-compression** _TYPE_
> Compression: jpeg, lossless.

**-j** _NUM_, **--jobs** _NUM_
> Number of parallel jobs.

**--image-dpi** _DPI_
> DPI for images without metadata.

**-q**, **--quiet**
> Suppress output.

**-v**, **--verbose** [_LEVEL_]
> Verbose output (0-2).

**--sidecar** _FILE_
> Write OCR text to sidecar file.

# DESCRIPTION

**ocrmypdf** adds an OCR text layer to scanned PDFs, making them searchable and selectable. It uses Tesseract OCR and outputs PDF/A for archival quality by default.

The tool preserves the original visual appearance while adding invisible text behind the scanned images. This means the file looks identical but text can be copied, searched, and indexed.

Image preprocessing improves OCR accuracy: deskew corrects tilted scans, clean removes noise and artifacts, and rotate-pages fixes orientation. These can significantly improve results on poor-quality scans.

Multiple languages can be combined (eng+fra+deu). Language packs must be installed for Tesseract. The tool detects existing text to avoid double-processing unless forced.

Optimization levels reduce file size through image recompression. Level 3 uses aggressive JBIG2 compression suitable for archival. PDF/A output ensures long-term readability.

Parallel processing speeds up multi-page documents. Progress is shown by default. Sidecar output extracts just the text for external processing.

# CAVEATS

OCR accuracy depends on scan quality. Very low resolution or heavily compressed images may produce poor results. Language packs must be installed separately. Some complex layouts may not OCR well. PDF/A conversion may strip some features. Processing large PDFs requires significant memory.

# HISTORY

**ocrmypdf** was created by **James R. Barlow** starting around **2013**. It wraps Tesseract OCR with intelligent PDF handling, image preprocessing, and PDF/A output. The project addressed the need for a complete solution to make scanned PDFs searchable, automating what was previously a manual multi-step process.

# SEE ALSO

[tesseract](/man/tesseract)(1), [pdftk](/man/pdftk)(1), [pdfimages](/man/pdfimages)(1), [img2pdf](/man/img2pdf)(1)
