# TAGLINE

scans PDF files for keywords that indicate potentially malicious content

# TLDR

**Analyze PDF structure**

```pdfid.py [file.pdf]```

**Scan multiple files**

```pdfid.py [file1.pdf] [file2.pdf]```

**Report entropy and EOF statistics (extra analysis)**

```pdfid.py --extra [file.pdf]```

**Recursively scan a directory for PDFs**

```pdfid.py --scan [path/to/directory]```

**Show only non-zero keyword counts**

```pdfid.py --nozero [file.pdf]```

**Create a disarmed copy (neutralize /JS, /JavaScript, /AA, /OpenAction, /Launch)**

```pdfid.py --disarm [file.pdf]```

**Report all names, not just the default keyword list**

```pdfid.py --all [file.pdf]```

# SYNOPSIS

**pdfid.py** [_options_] _file_...

# PARAMETERS

**--all**
> Detect all names in the PDF, not only the predefined keyword list.

**--extra**
> Calculate entropy and EOF statistics.

**--disarm**
> Write a disarmed copy of the PDF with dangerous elements neutralized.

**--force**
> Process the file even if it lacks a valid %PDF header.

**--nozero**
> Suppress keywords with zero counts in the output.

**--output** _FILE_
> Write results to the specified file.

**--scan**
> Recursively scan a directory for PDF files.

**--plugins** _PLUGINS_
> Load one or more plugin modules (comma-separated) for extended analysis.

**--pluginoptions** _OPTIONS_
> Pass options to the loaded plugins.

**--select** _EXPR_
> Filter results using a Python expression.

**--csv**
> Format output as comma-separated values.

**--literalfilenames**
> Treat filenames literally without wildcard expansion.

**--verbose**
> Show detailed error messages and stack traces.

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
/AA, /OpenAction  - Automatic/additional actions
/Launch           - Launch external programs
/EmbeddedFile     - Embedded files
/AcroForm, /XFA   - Interactive forms
/JBIG2Decode      - JBIG2 filter (historical exploit surface)
/RichMedia        - Flash/rich media content
/ObjStm, /Encrypt - Object streams / encryption
```

Obfuscated variants (hex-encoded names) are reported in parentheses alongside the plain count, e.g. `/JS 1(1)` means one occurrence with one obfuscated.

# CAVEATS

Keyword presence doesn't confirm malicious intent. Further analysis with pdf-parser recommended. Part of PDF analysis toolkit.

# HISTORY

pdfid was created by **Didier Stevens** as part of his PDF analysis tools for security research.

# SEE ALSO

[pdf-parser](/man/pdf-parser)(1), [pdfinfo](/man/pdfinfo)(1)
