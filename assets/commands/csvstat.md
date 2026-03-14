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

**csvstat** [_options_] _file_

# DESCRIPTION

**csvstat** computes descriptive statistics for columns in CSV files. Part of csvkit, it automatically detects data types and provides appropriate statistics for each.

The tool reports counts, unique values, min/max, mean, median, standard deviation, and frequent values, giving a quick overview of data characteristics.

# PARAMETERS

**-c** _columns_
> Columns to analyze.

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

**--count**
> Show row count only.

**--sum**
> Show sum values only.

**--len**
> Show max string length only.

**--nulls**
> Show null value counts only.

**--csv**
> Output results as CSV table.

**--json**
> Output results as JSON.

**-n**
> Show column names and indices only.

**-d** _char_
> Field delimiter.

**-e** _encoding_
> Character encoding of the input file.

**-y** _n_
> Sniff limit for type detection (0 to disable).

**-I**
> Disable type inference; treat all columns as text.

# CAVEATS

Loads entire file into memory. Large files can be slow. Type detection may misclassify mixed data. Part of csvkit, requires Python.

# HISTORY

**csvstat** is part of **csvkit**, created by **Christopher Groskopf** in **2011**. It brings pandas-like summary statistics to the command line, essential for initial data exploration and validation.

# SEE ALSO

[csvcut](/man/csvcut)(1), [csvlook](/man/csvlook)(1), [csvclean](/man/csvclean)(1), [wc](/man/wc)(1)
