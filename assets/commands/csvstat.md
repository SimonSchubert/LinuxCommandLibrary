# TAGLINE

Descriptive statistics calculator for CSV columns

# TLDR

**Show statistics** for all columns

```csvstat [data.csv]```

**Statistics for specific columns**

```csvstat -c [column1,column2] [data.csv]```

**Show only specific stat**

```csvstat --mean -c [column] [data.csv]```

**Count unique values**

```csvstat --unique -c [column] [data.csv]```

**Show value frequency**

```csvstat --freq -c [column] [data.csv]```

**Show data types**

```csvstat --type [data.csv]```

**Output statistics as JSON**

```csvstat --json [data.csv]```

**Show column names and indices**

```csvstat -n [data.csv]```

# SYNOPSIS

**csvstat** [_options_] [_file_]

# DESCRIPTION

**csvstat** computes descriptive statistics for columns in CSV files. Part of csvkit, it automatically detects data types and provides appropriate statistics for each.

The tool reports counts, unique values, min/max, mean, median, standard deviation, and frequent values, giving a quick overview of data characteristics.

# PARAMETERS

**-c**, **--columns** _columns_
> Comma-separated column indices, names or ranges to examine (e.g. 1,id,3-5). Defaults to all columns.

**--type**
> Show column data types only.

**--unique**
> Show unique value counts only.

**--min**
> Show minimum values only.

**--max**
> Show maximum values only.

**--mean**
> Show mean values only.

**--median**
> Show median values only.

**--stdev**
> Show standard deviation only.

**--freq**
> Show frequent values only.

**--freq-count** _n_
> Maximum number of frequent values to display.

**--count**
> Show row count only.

**--sum**
> Show sum values only.

**--len**
> Show the length of the longest values only.

**--max-precision**
> Show the most decimal places only.

**--nulls**
> Show whether columns contain nulls only.

**--non-nulls**
> Show counts of non-null values only.

**--csv**
> Output results as CSV table.

**--json**
> Output results as JSON.

**-i**, **--indent** _n_
> Indent JSON output by this many spaces.

**-n**, **--names**
> Show column names and indices only.

**--decimal-format** _format_
> %-format specification for printing decimal numbers (default: %.3f).

**-G**, **--no-grouping-separator**
> Do not use grouping separators in decimal numbers.

**-d**, **--delimiter** _char_
> Field delimiter.

**-e**, **--encoding** _encoding_
> Character encoding of the input file.

**-H**, **--no-header-row**
> Input has no header row.

**-y**, **--snifflimit** _n_
> Limit CSV dialect sniffing to n bytes (0 disables sniffing, -1 sniffs the entire file).

**-I**, **--no-inference**
> Disable type inference; treat all columns as text.

# CAVEATS

Loads entire file into memory. Large files can be slow. Type detection may misclassify mixed data. Part of csvkit, requires Python.

# HISTORY

**csvstat** is part of **csvkit**, created by **Christopher Groskopf** in **2011**. It brings pandas-like summary statistics to the command line, essential for initial data exploration and validation.

# SEE ALSO

[csvcut](/man/csvcut)(1), [csvlook](/man/csvlook)(1), [csvclean](/man/csvclean)(1), [wc](/man/wc)(1)

# RESOURCES

```[Source code](https://github.com/wireservice/csvkit)```

```[Documentation](https://csvkit.readthedocs.io/en/latest/scripts/csvstat.html)```

<!-- verified: 2026-11-09 -->
