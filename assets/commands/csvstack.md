# TAGLINE

Vertical CSV file concatenator

# TLDR

**Stack multiple CSV files**

```csvstack [file1.csv] [file2.csv] > [combined.csv]```

**Stack with group column**

```csvstack -g [source1,source2] [file1.csv] [file2.csv]```

**Name the group column**

```csvstack -g [a,b] -n [source] [file1.csv] [file2.csv]```

**Stack files without headers**

```csvstack -H [file1.csv] [file2.csv]```

**Stack with different delimiters**

```csvstack -d ";" [file1.csv] [file2.csv]```

# SYNOPSIS

**csvstack** [_options_] _files_...

# DESCRIPTION

**csvstack** concatenates multiple CSV files vertically (row-wise). Part of csvkit, it aligns columns by header name and can add a grouping column to track source files.

The tool handles files with different column orders by matching header names, making it robust for combining datasets from different sources.

# PARAMETERS

**-g** _names_
> Add grouping column with values.

**-n** _name_
> Name for grouping column.

**-H**, **--no-header-row**
> Inputs have no header row.

**--filenames**
> Use filenames as group values.

**-d** _char_
> Field delimiter.

**-q** _char_
> Quote character.

**-e** _encoding_
> Input encoding.

# CAVEATS

All files should have matching columns for clean output. Missing columns filled with empty values. Part of csvkit, requires Python. Headers from first file used if different.

# HISTORY

**csvstack** is part of **csvkit**, created by **Christopher Groskopf** in **2011**. It simplifies combining multiple data files, a common task in data processing and analysis workflows.

# SEE ALSO

[csvcut](/man/csvcut)(1), [csvlook](/man/csvlook)(1), [cat](/man/cat)(1), [csvjoin](/man/csvjoin)(1)
