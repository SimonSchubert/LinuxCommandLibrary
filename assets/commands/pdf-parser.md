# TLDR

**Parse PDF structure**

```pdf-parser [file.pdf]```

**Search for keyword**

```pdf-parser -s [keyword] [file.pdf]```

**Show specific object**

```pdf-parser -o [5] [file.pdf]```

**Extract streams**

```pdf-parser -d [output.bin] -o [5] [file.pdf]```

**Show statistics**

```pdf-parser -a [file.pdf]```

**Filter by object type**

```pdf-parser -t [/JavaScript] [file.pdf]```

**Decode streams**

```pdf-parser -f [file.pdf]```

# SYNOPSIS

**pdf-parser** [_-s search_] [_-o id_] [_-t type_] [_-f_] [_options_] _file_

# PARAMETERS

**-s** _STRING_
> Search for string.

**-o** _ID_
> Select object by ID.

**-t** _TYPE_
> Filter by type.

**-f**
> Apply stream filters.

**-d** _FILE_
> Dump stream to file.

**-a**
> Statistics and analysis.

**-w**
> Raw output.

**-r** _N_
> Reference object.

**-c**
> Content stream.

**-v**
> Verbose output.

# DESCRIPTION

**pdf-parser** analyzes PDF file structure. It's used for malware analysis and forensics.

Object enumeration shows all PDF objects. Each object's type and contents are displayed.

Searching finds embedded scripts, URLs, or suspicious content. JavaScript and launch actions are common malware vectors.

Stream extraction dumps compressed or encoded data. Filters decompress FlateDecode and other encodings.

Statistics summarize object types present. This quickly identifies files with unusual structures.

Reference following traces object relationships. Cross-references reveal document structure.

# CAVEATS

Malicious PDFs may crash parsers. Output can be very large. Not all PDF features supported.

# HISTORY

**pdf-parser** was created by **Didier Stevens** for PDF malware analysis. It's part of his toolkit for analyzing suspicious documents and is widely used in incident response.

# SEE ALSO

[pdfinfo](/man/pdfinfo)(1), [pdftotext](/man/pdftotext)(1), [pdfid](/man/pdfid)(1), [strings](/man/strings)(1)
