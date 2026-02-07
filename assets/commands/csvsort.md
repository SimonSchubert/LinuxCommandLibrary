# TAGLINE

Type-aware CSV file sorter

# TLDR

**Sort by column**

```csvsort -c [column] [data.csv]```

**Sort descending**

```csvsort -r -c [column] [data.csv]```

**Sort by multiple columns**

```csvsort -c [col1,col2] [data.csv]```

**Sort numerically**

```csvsort -c [amount] [data.csv]```

**Sort with no header**

```csvsort -H -c [1] [data.csv]```

**Read from stdin**

```cat [data.csv] | csvsort -c [name]```

# SYNOPSIS

**csvsort** [_options_] _file_

# DESCRIPTION

**csvsort** sorts CSV files by one or more columns. Part of csvkit, it properly handles CSV quoting and data types, detecting numeric and date values for appropriate sorting.

The tool maintains CSV structure during sorting, preserving headers and quoted fields correctly.

# PARAMETERS

**-c** _columns_
> Column(s) to sort by.

**-r**, **--reverse**
> Sort in descending order.

**-H**, **--no-header-row**
> Input has no header.

**-d** _char_
> Field delimiter.

**-q** _char_
> Quote character.

**-e** _encoding_
> Input encoding.

**-y** _n_
> Rows to sniff for type.

# CAVEATS

Requires loading entire file into memory. Part of csvkit, needs Python. Type detection may not always match expectations. Large files can be slow.

# HISTORY

**csvsort** is part of **csvkit**, created by **Christopher Groskopf** in **2011**. The tool provides type-aware sorting that the Unix sort command cannot easily achieve with CSV data.

# SEE ALSO

[csvcut](/man/csvcut)(1), [csvlook](/man/csvlook)(1), [sort](/man/sort)(1), [csvstat](/man/csvstat)(1)
