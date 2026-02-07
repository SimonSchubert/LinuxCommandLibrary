# TAGLINE

SQL-style joins for CSV files

# TLDR

**Join two CSV files** on a common column

```csvjoin -c [id] [file1.csv] [file2.csv]```

**Join on different column names** in each file

```csvjoin -c "[id1,id2]" [file1.csv] [file2.csv]```

**Perform left outer join**

```csvjoin --left -c [id] [file1.csv] [file2.csv]```

**Perform right outer join**

```csvjoin --right -c [id] [file1.csv] [file2.csv]```

**Perform full outer join**

```csvjoin --outer -c [id] [file1.csv] [file2.csv]```

**Join on multiple columns**

```csvjoin -c "[col1,col2]" [file1.csv] [file2.csv]```

# SYNOPSIS

**csvjoin** [_options_] _file1_ _file2_

# PARAMETERS

**-c** _COLUMN_, **--columns** _COLUMN_
> Column(s) to join on. Comma-separated if different in each file.

**--left**
> Perform a left outer join (keep all rows from first file).

**--right**
> Perform a right outer join (keep all rows from second file).

**--outer**
> Perform a full outer join (keep all rows from both files).

**-d** _CHAR_, **--delimiter** _CHAR_
> Field delimiter (default: comma).

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

**-H**, **--no-inference**
> Disable type inference.

**--no-header-row**
> Files have no header row.

# DESCRIPTION

**csvjoin** is part of csvkit that performs SQL-style joins on CSV files. It combines data from two files based on matching values in specified columns, similar to JOIN operations in databases.

The default join is an inner join, returning only rows with matches in both files. Left, right, and outer joins preserve unmatched rows from one or both files, filling missing values with empty strings.

When joining on columns with different names, specify both names separated by a comma. Multiple columns can be used as composite keys for more complex joins.

# CAVEATS

Both files must fit in memory for joining. Column matching is exact; consider cleaning data first. Non-matching join columns result in Cartesian products. Output column order follows first file then second file.

# HISTORY

csvjoin is part of **csvkit**, created by Christopher Groskopf in **2011**. It brings database-style join operations to command-line CSV processing, enabling data combination without importing into a database.

# SEE ALSO

[csvstack](/man/csvstack)(1), [csvsql](/man/csvsql)(1), [join](/man/join)(1), [csvkit](/man/csvkit)(1)
