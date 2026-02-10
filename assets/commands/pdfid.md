# TAGLINE

scans PDF files for keywords that indicate potentially malicious content

# TLDR

**Analyze PDF structure**

```pdfid [file.pdf]```

**Scan multiple files**

```pdfid [file1.pdf] [file2.pdf]```

**Extra analysis mode**

```pdfid -e [file.pdf]```

**Output as JSON**

```pdfid -j [file.pdf]```

# SYNOPSIS

**pdfid** [_options_] _file_...

# PARAMETERS

**-e**
> Extra data analysis.

**-j**
> JSON output.

**-s**
> Scan subfiles.

**-d**
> Disarm (remove /JS and /Launch).

**-p** _plugin_
> Use plugin.

# DESCRIPTION

**pdfid** scans PDF files for keywords that indicate potentially malicious content. It counts occurrences of JavaScript, embedded files, launch actions, and other suspicious elements.

# OUTPUT

```
PDFiD 0.2.7 document.pdf
 PDF Header: %PDF-1.4
 obj                   15
 endobj                15
 stream                 3
 /Page                  2
 /JS                    0
 /JavaScript            0
 /OpenAction            0
 /Launch                0
```

# SUSPICIOUS KEYWORDS

```
/JS, /JavaScript  - Embedded JavaScript
/OpenAction       - Automatic actions
/Launch           - Launch external programs
/EmbeddedFile     - Embedded files
/AcroForm         - Interactive forms
```

# CAVEATS

Keyword presence doesn't confirm malicious intent. Further analysis with pdf-parser recommended. Part of PDF analysis toolkit.

# HISTORY

pdfid was created by **Didier Stevens** as part of his PDF analysis tools for security research.

# SEE ALSO

[pdf-parser](/man/pdf-parser)(1), [peepdf](/man/peepdf)(1), [pdfinfo](/man/pdfinfo)(1)
