# TLDR

**Validate and report errors** in a CSV file

```csvclean [data.csv]```

**Clean a CSV file** and output corrected version

```csvclean -n [data.csv]```

**Validate with custom delimiter**

```csvclean -d "[;]" [data.csv]```

**Check file with no header** row

```csvclean --no-header-row [data.csv]```

**Validate using specific encoding**

```csvclean -e [latin1] [data.csv]```

**Output errors to stderr** while cleaning

```csvclean [data.csv] 2> [errors.txt]```

# SYNOPSIS

**csvclean** [_options_] _file_

# PARAMETERS

_FILE_
> CSV file to clean or validate.

**-n**, **--dry-run**
> Don't create output files, just report errors.

**-d** _CHAR_, **--delimiter** _CHAR_
> Field delimiter (default: comma).

**-t**, **--tabs**
> Use tabs as delimiter.

**-q** _CHAR_, **--quotechar** _CHAR_
> Quote character (default: double quote).

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

**--no-header-row**
> File has no header row.

**-H**, **--no-inference**
> Disable type inference.

# DESCRIPTION

**csvclean** is part of csvkit that validates and cleans CSV files. It detects common problems like inconsistent column counts, stray quotes, and encoding issues, either reporting them or fixing them automatically.

When run without **-n**, it creates two output files: one with cleaned data and one with rows that had errors. This allows review of problematic rows without losing data. With **-n**, it only reports errors without creating files.

The tool handles various CSV dialects and can work with files using different delimiters, quote characters, and encodings. It's essential for preprocessing messy data before analysis.

# CAVEATS

Automatic cleaning may alter data in unexpected ways; review cleaned output carefully. Large files can be slow to process. Some edge cases in CSV formatting may not be detected. Original file is not modified.

# HISTORY

csvclean is part of **csvkit**, created by Christopher Groskopf and first released in **2011**. csvkit provides a suite of tools for working with CSV files, designed to bring the power of Unix philosophy to tabular data processing.

# SEE ALSO

[csvstat](/man/csvstat)(1), [csvcut](/man/csvcut)(1), [csvlook](/man/csvlook)(1), [csvkit](/man/csvkit)(1)
