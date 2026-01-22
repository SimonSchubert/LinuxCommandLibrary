# TLDR

**View** a PDF file

```gs -dQUIET -dBATCH file.pdf```

**Reduce** PDF file size for e-book

```gs -dNOPAUSE -dQUIET -dBATCH -sDEVICE=pdfwrite -dPDFSETTINGS=/ebook -sOutputFile=output.pdf input.pdf```

Convert **PDF to JPEG** images

```gs -dQUIET -dBATCH -dNOPAUSE -sDEVICE=jpeg -r150 -sOutputFile=output_%d.jpg input.pdf```

Convert **specific pages** to images

```gs -dQUIET -dBATCH -dNOPAUSE -sDEVICE=jpeg -dFirstPage=1 -dLastPage=3 -sOutputFile=page%d.jpg input.pdf```

**Merge** PDF files

```gs -dQUIET -dBATCH -dNOPAUSE -sDEVICE=pdfwrite -sOutputFile=merged.pdf file1.pdf file2.pdf```

Convert **PostScript to PDF**

```gs -dQUIET -dBATCH -dNOPAUSE -sDEVICE=pdfwrite -sOutputFile=output.pdf input.ps```

List available **devices**

```gs -h```

# SYNOPSIS

**gs** [_options_] [_files_]...

# DESCRIPTION

**gs** (Ghostscript) is an interpreter for Adobe PostScript and PDF languages. It can convert between formats, render to various output devices, and process PDF and PostScript files.

# PARAMETERS

**-sDEVICE=DEVICE**
> Select output device (pdfwrite, jpeg, png16m, etc.)

**-sOutputFile=FILE**
> Specify output filename (use %d for page numbers)

**-r RES or -rXRESxYRES**
> Set output resolution in DPI

**-dPDFSETTINGS=SETTING**
> PDF quality preset (/screen, /ebook, /printer, /prepress)

**-dNOPAUSE**
> Do not pause between pages

**-dBATCH**
> Exit after processing files

**-dQUIET or -q**
> Suppress normal output messages

**-dSAFER**
> Restrict file operations (default)

**-dFirstPage=N**
> Start from page N

**-dLastPage=N**
> Process through page N

**-sPAPERSIZE=SIZE**
> Set paper size (a4, letter, legal, etc.)

**-I DIRECTORIES**
> Add library search paths

**-h or -?**
> Display help and available devices

# CAVEATS

The available devices depend on your Ghostscript installation. Use gs -h to see installed devices. PDFSETTINGS presets affect quality and file size: /screen (lowest), /ebook, /printer, /prepress (highest).

# HISTORY

**Ghostscript** has been developed since 1986, providing free PostScript and PDF interpretation. It is widely used for PDF manipulation on Linux systems.

# SEE ALSO

[ps2pdf](/man/ps2pdf)(1), [pdf2ps](/man/pdf2ps)(1), [pdftops](/man/pdftops)(1)
