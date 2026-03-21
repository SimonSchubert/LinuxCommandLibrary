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
> CSV file to load into the Python environment. Also accepts piped input from stdin.

**-d** _CHAR_, **--delimiter** _CHAR_
> Field delimiter character (default: comma).

**-t**, **--tabs**
> Use tab characters as the field delimiter.

**-q** _CHAR_, **--quotechar** _CHAR_
> Character used for quoting fields.

**-e** _ENCODING_, **--encoding** _ENCODING_
> Specify the input file encoding (e.g., utf-8, latin1).

**-H**, **--no-header-row**
> Indicate that the file has no header row.

**-K** _N_, **--skip-lines** _N_
> Skip the first N lines of the input before processing.

**--agate**
> Load the file as an agate Table instead of a csv.reader object. The data is available as a variable named **table**.

**--dict**
> Load as a csv.DictReader where each row is a dictionary keyed by column headers.

**-I**, **--no-inference**
> Disable type inference when used with --agate, keeping all values as strings.

**-S**
> Disable CSV dialect sniffing.

**--blanks**
> Do not convert empty strings to None.

**--null-value** _VALUES_
> Convert specified values to None (can specify multiple).

**-y** _N_, **--sniff-limit** _N_
> Limit the number of bytes used for CSV dialect sniffing.

**-l**, **--linenumbers**
> Insert a column of line numbers at the beginning of the output.

**-z** _N_, **--field-size-limit** _N_
> Maximum length of a single field in the input CSV.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**csvpy** is part of csvkit that loads a CSV file into an interactive Python shell for exploration and analysis. If IPython is installed, it is used as the shell for a richer experience.

In default mode, the CSV data is loaded into a variable named **reader**, a csv.reader object. With **--dict**, it becomes a DictReader where each row is a dictionary. With **--agate**, it becomes a **table** variable with full analysis capabilities including sorting, filtering, and aggregation.

This tool is useful for quick data exploration, testing data transformations, and prototyping analysis code. The interactive environment allows immediate feedback while working with the data.

# CAVEATS

Large files may use significant memory when loaded entirely. The default csv.reader is consumed after a single iteration; use **--agate** for reusable data. Requires familiarity with Python for effective use.

# HISTORY

**csvpy** is part of **csvkit**, created by Christopher Groskopf in **2011**. It provides a quick way to drop into Python for ad-hoc data analysis without writing boilerplate file loading code.

# SEE ALSO

[csvkit](/man/csvkit)(1), [csvlook](/man/csvlook)(1), [csvstat](/man/csvstat)(1), [csvcut](/man/csvcut)(1), [csvgrep](/man/csvgrep)(1), [python](/man/python)(1), [ipython](/man/ipython)(1)
