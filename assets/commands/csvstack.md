# TAGLINE

Vertically concatenate CSV files

# TLDR

**Stack multiple CSV files**

```csvstack [file1.csv] [file2.csv] > [combined.csv]```

**Stack with a grouping column to identify source files**

```csvstack -g [source1,source2] [file1.csv] [file2.csv]```

**Name the grouping column**

```csvstack -g [a,b] -n [source] [file1.csv] [file2.csv]```

**Stack using filenames as group values automatically**

```csvstack --filenames [file1.csv] [file2.csv]```

**Stack files that have no header row**

```csvstack -H [file1.csv] [file2.csv]```

**Stack semicolon-delimited files**

```csvstack -d ";" [file1.csv] [file2.csv]```

# SYNOPSIS

**csvstack** [_options_] [_files_...]

# DESCRIPTION

**csvstack** concatenates multiple CSV files vertically (row-wise). Part of csvkit, it aligns columns by header name and can add a grouping column to track source files.

The tool handles files with different column orders by matching header names, making it robust for combining datasets from different sources. If no file is given, it reads from standard input.

# PARAMETERS

**-g**, **--groups** _values_
> Comma-separated grouping values, one per input file, added as a new first column.

**-n**, **--group-name** _name_
> Name for the grouping column (default: group).

**-H**, **--no-header-row**
> Inputs have no header row.

**--filenames**
> Use each input file's name as its grouping value. Overrides **-g**.

**-d**, **--delimiter** _char_
> Field delimiter of the input files.

**-t**, **--tabs**
> Input files are tab-delimited. Overrides **-d**.

**-q**, **--quotechar** _char_
> Quote character of the input files.

**-e**, **--encoding** _encoding_
> Input encoding.

**-K**, **--skip-lines** _n_
> Number of initial lines to skip before the header row.

# CAVEATS

The output contains the union of all header names, and rows lacking a column get empty values. With **-H**, columns are stacked by position and the column count comes from the first file. The number of **-g** values must equal the number of input files. Do not redirect the output to one of the input files: it will grow indefinitely. Part of csvkit, requires Python.

# HISTORY

**csvstack** is part of **csvkit**, created by **Christopher Groskopf** in **2011**. It simplifies combining multiple data files, a common task in data processing and analysis workflows.

# SEE ALSO

[csvcut](/man/csvcut)(1), [csvlook](/man/csvlook)(1), [csvjoin](/man/csvjoin)(1), [csvgrep](/man/csvgrep)(1), [csvstat](/man/csvstat)(1)

# RESOURCES

```[Source code](https://github.com/wireservice/csvkit)```

```[Documentation](https://csvkit.readthedocs.io/en/latest/scripts/csvstack.html)```

<!-- verified: 2026-11-09 -->
