# TAGLINE

CSV to tab-separated values converter

# TLDR

**Convert CSV to TSV**

```csv2tsv [input.csv] > [output.tsv]```

**Convert from stdin**

```cat [input.csv] | csv2tsv > [output.tsv]```

**Convert with custom delimiter**

```csv2tsv -d "[;]" [input.csv]```

**Convert multiple files**

```csv2tsv [file1.csv] [file2.csv] > [combined.tsv]```

**Handle files with** Windows line endings

```csv2tsv --crlf [input.csv]```

# SYNOPSIS

**csv2tsv** [_options_] [_file_...]

# PARAMETERS

_FILE_
> Input CSV file(s). Uses stdin if not specified.

**-d** _CHAR_, **--delimiter** _CHAR_
> Input field delimiter (default: comma).

**--crlf**
> Handle Windows-style line endings.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**csv2tsv** converts comma-separated values (CSV) files to tab-separated values (TSV) format. TSV is often easier to process with Unix tools like cut, awk, and sort since tabs are less common in data than commas.

The tool properly handles CSV quoting rules, preserving data integrity when fields contain commas, newlines, or quotes. Quoted fields are converted to unquoted TSV output where possible, with embedded tabs escaped if necessary.

csv2tsv is useful as a preprocessing step for CSV data before using standard Unix text processing tools, or for importing data into systems that prefer tab-delimited input.

# CAVEATS

Fields containing literal tabs require special handling. Very large files are processed in streaming mode for memory efficiency. The tool assumes UTF-8 encoding unless specified otherwise. Malformed CSV may produce unexpected results.

# HISTORY

csv2tsv was created as part of various Unix toolkits for CSV processing. It addresses the common need to convert between delimited formats while properly handling CSV quoting conventions that simpler tools like sed or tr cannot manage.

# SEE ALSO

[csvkit](/man/csvkit)(1), [cut](/man/cut)(1), [miller](/man/miller)(1), [awk](/man/awk)(1)
