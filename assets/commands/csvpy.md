# TAGLINE

Interactive Python shell for CSV files

# TLDR

**Open a CSV file** in a Python shell

```csvpy [data.csv]```

**Open with tab delimiter**

```csvpy -t [data.tsv]```

**Load as an agate Table** for analysis

```csvpy --agate [data.csv]```

**Load as DictReader** (rows as dictionaries)

```csvpy --dict [data.csv]```

**Open with custom encoding**

```csvpy -e [latin1] [data.csv]```

**Open file without headers**

```csvpy -H [data.csv]```

**Open with a custom delimiter**

```csvpy -d "[;]" [data.csv]```

# SYNOPSIS

**csvpy** [_options_] _file_

# PARAMETERS

_FILE_
> CSV file to load into the Python environment. Piped input from stdin is not accepted.

**-d** _CHAR_, **--delimiter** _CHAR_
> Field delimiter of the input file.

**-t**, **--tabs**
> Input file is tab-delimited. Overrides **-d**.

**-q** _CHAR_, **--quotechar** _CHAR_
> Character used to quote strings in the input file.

**-u** _0|1|2|3_, **--quoting** _0|1|2|3_
> Input quoting style: 0 minimal, 1 all, 2 non-numeric, 3 none.

**-b**, **--no-doublequote**
> Whether double quotes are doubled in the input file.

**-p** _CHAR_, **--escapechar** _CHAR_
> Character that escapes the delimiter with **--quoting 3** or the quote character with **--no-doublequote**.

**-z** _N_, **--maxfieldsize** _N_
> Maximum length of a single field in the input.

**-e** _ENCODING_, **--encoding** _ENCODING_
> Encoding of the input file (e.g. utf-8, latin1).

**-L** _LOCALE_, **--locale** _LOCALE_
> Locale (e.g. en_US) of any formatted numbers.

**-S**, **--skipinitialspace**
> Ignore whitespace immediately following the delimiter.

**--blanks**
> Do not convert "", "na", "n/a", "none", "null" or "." to NULL.

**--null-value** _VALUES_
> Additional values to convert to NULL. Can be specified multiple times.

**--date-format** _FORMAT_
> strptime format for parsing dates, like "%m/%d/%Y".

**--datetime-format** _FORMAT_
> strptime format for parsing datetimes.

**-H**, **--no-header-row**
> The file has no header row. Default headers (a, b, c, ...) are created.

**-K** _N_, **--skip-lines** _N_
> Number of initial lines to skip before the header row.

**--dict**
> Load as a DictReader, where each row is a dictionary keyed by column header.

**--agate**
> Load as an agate Table instead of a reader. The data is available as a variable named **table**.

**--no-number-ellipsis**
> Disable the ellipsis if the maximum precision is exceeded.

**-y** _N_, **--snifflimit** _N_
> Limit CSV dialect sniffing to N bytes (default 1024). 0 disables sniffing, -1 sniffs the entire file.

**-I**, **--no-inference**
> Disable type inference when parsing the input, keeping all values as strings.

**-v**, **--verbose**
> Print detailed tracebacks when errors occur.

**-V**, **--version**
> Display version information and exit.

# DESCRIPTION

**csvpy** is part of csvkit that loads a CSV file into an interactive Python shell for exploration and analysis. If IPython is installed, it is used as the shell; otherwise the running Python shell is used.

In default mode, the CSV data is loaded into a variable named **reader**, an agate.csv.reader object. With **--dict**, **reader** is a DictReader where each row is a dictionary. With **--agate**, the data is available as a **table** variable with full analysis capabilities including sorting, filtering, and aggregation.

# CAVEATS

Cannot read from stdin, due to platform limitations. The default reader is consumed after a single iteration; use **--agate** for reusable data. Requires familiarity with Python for effective use.

# HISTORY

**csvpy** is part of **csvkit**, created by Christopher Groskopf in **2011**.

# SEE ALSO

[csvkit](/man/csvkit)(1), [csvlook](/man/csvlook)(1), [csvstat](/man/csvstat)(1), [csvcut](/man/csvcut)(1), [csvgrep](/man/csvgrep)(1), [python](/man/python)(1), [ipython](/man/ipython)(1)

# RESOURCES

```[Source code](https://github.com/wireservice/csvkit)```

```[Documentation](https://csvkit.readthedocs.io/en/latest/scripts/csvpy.html)```

<!-- verified: 2026-11-09 -->
