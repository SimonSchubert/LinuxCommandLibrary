# TAGLINE

extracts PDF content to JSON format

# TLDR

**Convert PDF to JSON**

```pdf2json [input.pdf] [output.json]```

**Convert first page only**

```pdf2json -f [1] -l [1] [input.pdf] [output.json]```

**Include form fields**

```pdf2json -form [input.pdf] [output.json]```

**Split pages to separate files**

```pdf2json -split [input.pdf] [output_prefix]```

# SYNOPSIS

**pdf2json** [_options_] _input.pdf_ [_output.json_]

# PARAMETERS

**-f** _num_
> First page.

**-l** _num_
> Last page.

**-form**
> Include form data.

**-split**
> One file per page.

**-enc** _encoding_
> Text encoding.

# DESCRIPTION

**pdf2json** extracts PDF content to JSON format. It captures text, positions, fonts, and form fields, enabling programmatic access to PDF data.

# OUTPUT STRUCTURE

```json
{
  "pages": [
    {
      "width": 612,
      "height": 792,
      "texts": [
        {"x": 72, "y": 720, "text": "Hello"}
      ]
    }
  ]
}
```

# CAVEATS

Text extraction quality varies. Complex layouts may not preserve structure. Images not extracted.

# HISTORY

pdf2json is based on PDF.js or similar libraries, providing JSON export for PDF processing pipelines.

# SEE ALSO

[pdftotext](/man/pdftotext)(1), [pdftohtml](/man/pdftohtml)(1), [poppler-utils](/man/poppler-utils)(1)
