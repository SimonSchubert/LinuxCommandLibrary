# TAGLINE

CSV to tab-separated values converter

# TLDR

**Convert CSV to TSV**

```csv2tsv [input.csv] > [output.tsv]```

**Convert from stdin**

```cat [input.csv] | csv2tsv > [output.tsv]```

**Convert input using a custom field delimiter** (e.g. semicolon)

```csv2tsv -c ";" [input.csv]```

**Concatenate multiple files**, keeping only the first header line

```csv2tsv -H [file1.csv] [file2.csv] > [combined.tsv]```

**Choose the replacement** for tabs and newlines embedded in fields

```csv2tsv --tab-replacement " " --newline-replacement " " [input.csv]```

# SYNOPSIS

**csv2tsv** [_options_] [_file_...]

# PARAMETERS

_FILE_
> Input CSV file(s). Reads from stdin if none are given or if **-** is specified.

**-H**, **--header**
> Treat the first line of each file as a header. When concatenating multiple files, only the header of the first file is written.

**-c** _CHR_, **--csv-delim** _CHR_
> Field delimiter in the CSV input (default: comma).

**-t** _CHR_, **--tsv-delim** _CHR_
> Field delimiter in the TSV output (default: TAB).

**-r** _STR_, **--tab-replacement** _STR_
> String to substitute for TAB characters found inside fields (default: space).

**-n** _STR_, **--newline-replacement** _STR_
> String to substitute for newline characters found inside fields (default: space).

**-q** _CHR_, **--quote** _CHR_
> Quoting character in the CSV input (default: double quote).

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**csv2tsv** converts comma-separated values (CSV) files to tab-separated values (TSV) format. TSV is often easier to process with Unix tools like cut, awk, and sort since tab and newline characters never appear inside fields.

The tool follows RFC 4180 CSV quoting rules: quoted fields may contain commas, newlines, and escaped quotes. During conversion, any TAB or newline characters found inside a field are replaced (by a space by default) so the resulting TSV has exactly one record per line and a fixed number of columns. The surrounding quotes are removed.

All three common newline conventions in the input (CR, CRLF, LF) are detected automatically, and output is always written with Unix (LF) newlines.

csv2tsv is part of eBay's tsv-utils suite and is commonly used as a preprocessing step before applying the suite's other tools or standard Unix text utilities.

# CAVEATS

By design, TAB and newline characters inside fields are replaced rather than escaped, so the conversion is not strictly reversible. Very large files are processed in a streaming fashion for memory efficiency. The tool assumes UTF-8 compatible input.

# HISTORY

csv2tsv is part of **eBay's tsv-utils**, a suite of command-line tools for manipulating large tabular data files written in the D programming language by Jon Degenhardt. The suite was open-sourced by eBay in 2017 and is optimized for speed on large datasets.

# SEE ALSO

[csvkit](/man/csvkit)(1), [cut](/man/cut)(1), [miller](/man/miller)(1), [awk](/man/awk)(1)

# RESOURCES

```[Source code](https://github.com/eBay/tsv-utils)```

```[Documentation](https://github.com/eBay/tsv-utils/blob/master/docs/tool_reference/csv2tsv.md)```

<!-- verified: 2026-06-26 -->
