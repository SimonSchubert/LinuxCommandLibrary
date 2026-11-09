# TAGLINE

Validate and clean CSV files

# TLDR

**Check for rows with length mismatches** in a CSV file

```csvclean --length-mismatch [data.csv]```

**Report length mismatches** and omit error rows from output

```csvclean --length-mismatch --omit-error-rows [data.csv]```

**Report empty columns** as errors

```csvclean --empty-columns [data.csv]```

**Enable all checks** on a CSV file

```csvclean -a [data.csv]```

**Fix short rows by joining** them into preceding rows

```csvclean --join-short-rows [data.csv]```

**Fill short rows** with a specified value

```csvclean --fill-short-rows --fillvalue "N/A" [data.csv]```

**Validate with custom delimiter** and encoding

```csvclean --length-mismatch -d "[;]" -e [latin1] [data.csv]```

**Separate clean rows from errors**

```csvclean -a --omit-error-rows [data.csv] > [clean.csv] 2> [errors.csv]```

# SYNOPSIS

**csvclean** [_options_] [_file_]

# PARAMETERS

_FILE_
> CSV file to clean or validate. Reads from stdin if omitted.

**--length-mismatch**
> Report rows that are shorter or longer than the header row.

**--empty-columns**
> Report empty columns as errors.

**-a**, **--enable-all-checks**
> Enable all error reporting checks.

**--join-short-rows**
> Merge consecutive short rows into a single row.

**--separator** _SEPARATOR_
> String used to join short rows (default: newline).

**--fill-short-rows**
> Fill short rows with missing values.

**--fillvalue** _VALUE_
> Value used to fill short rows (default: none, leaving the cell empty).

**--omit-error-rows**
> Exclude rows containing errors from standard output.

**--label** _LABEL_
> Add a label column to standard error for automated workflows. Use **-** to default to the input filename.

**--remove-empty-columns**
> Remove empty columns from standard output (csvkit releases after 2.2.0).

**--header-normalize-space**
> Strip leading/trailing whitespace and normalize whitespace in headers.

**-d** _CHAR_, **--delimiter** _CHAR_
> Field delimiter (default: comma).

**-t**, **--tabs**
> Use tabs as delimiter. Overrides **-d**.

**-q** _CHAR_, **--quotechar** _CHAR_
> Quote character (default: double quote).

**-u** _0|1|2|3_, **--quoting** _0|1|2|3_
> Input quoting style: 0 minimal, 1 all, 2 non-numeric, 3 none.

**-b**, **--no-doublequote**
> Quote characters are not doubled in the input.

**-p** _CHAR_, **--escapechar** _CHAR_
> Escape character for the delimiter (with **--quoting 3**) or the quote character (with **--no-doublequote**).

**-z** _N_, **--maxfieldsize** _N_
> Maximum length of a single field in the input.

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

**-S**, **--skipinitialspace**
> Ignore whitespace immediately following the delimiter.

**-H**, **--no-header-row**
> Input has no header row; default headers (a,b,c,...) are created.

**-K** _N_, **--skip-lines** _N_
> Skip the first N lines of the input file.

**-l**, **--linenumbers**
> Insert a column of line numbers at the front of the output.

**--zero**
> Use zero-based column numbering.

**-v**, **--verbose**
> Print detailed tracebacks when errors occur.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**csvclean** is part of csvkit that validates and cleans CSV files. It detects common problems like inconsistent column counts, empty columns, and encoding issues.

Since csvkit 2.0, csvclean no longer reports or fixes errors by default. You must explicitly enable checks (such as **--length-mismatch** or **--empty-columns**) or fixes (such as **--join-short-rows** or **--fill-short-rows**). Output is written to standard output and errors to standard error.

The tool handles various CSV dialects and can work with files using different delimiters, quote characters, and encodings. It is essential for preprocessing messy data before analysis.

# CAVEATS

Automatic cleaning may alter data in unexpected ways; review cleaned output carefully. Since csvkit 2.0, running csvclean without any check or fix flags will produce an error. **--join-short-rows** and **--fill-short-rows** are mutually exclusive. Rows longer than the header cannot be fixed automatically: add the missing columns to the header manually. If any enabled check finds errors, the exit status is 1. Original file is not modified.

# HISTORY

csvclean is part of **csvkit**, created by Christopher Groskopf and first released in **2011**. csvkit provides a suite of tools for working with CSV files, designed to bring the power of Unix philosophy to tabular data processing.

# SEE ALSO

[csvstat](/man/csvstat)(1), [csvcut](/man/csvcut)(1), [csvlook](/man/csvlook)(1), [csvformat](/man/csvformat)(1), [csvgrep](/man/csvgrep)(1)

# RESOURCES

```[Source code](https://github.com/wireservice/csvkit)```

```[Documentation](https://csvkit.readthedocs.io/en/latest/scripts/csvclean.html)```

<!-- verified: 2026-11-09 -->
