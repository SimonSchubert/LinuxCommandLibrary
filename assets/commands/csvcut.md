# TLDR

**Select specific columns**

```csvcut -c [1,3,5] [data.csv]```

**Select columns by name**

```csvcut -c [name,email] [data.csv]```

**Exclude columns**

```csvcut -C [column] [data.csv]```

**Use different delimiter**

```csvcut -d ";" -c [1,2] [data.csv]```

**Select column range**

```csvcut -c [1-5] [data.csv]```

**Read from stdin**

```cat [data.csv] | csvcut -c [name]```

# SYNOPSIS

**csvcut** [_options_] _file_

# DESCRIPTION

**csvcut** is part of csvkit, a suite of CSV processing utilities. It selects and reorders columns from CSV files, similar to cut but with proper CSV handling including quoted fields.

The tool correctly handles CSV edge cases like embedded commas and newlines within quoted fields, making it more reliable than text-based alternatives for structured data.

# PARAMETERS

**-c** _columns_
> Columns to select (names or indices).

**-C** _columns_
> Columns to exclude.

**-d** _char_
> Field delimiter character.

**-t** _char_
> Tab delimiter shortcut.

**-q** _char_
> Quote character.

**-e** _encoding_
> Input file encoding.

**-n**
> Display column names and indices.

**-l**
> Insert line numbers column.

**--no-header-row**
> Input has no header row.

# CAVEATS

Part of csvkit, requires Python. Column indices are 1-based. Large files may be slow compared to native tools. Memory usage scales with file size.

# HISTORY

**csvcut** is part of **csvkit**, created by **Christopher Groskopf** in **2011**. The toolkit was developed to provide reliable CSV handling for data journalism and analysis, addressing shortcomings of traditional Unix text tools with structured data.

# SEE ALSO

[csvlook](/man/csvlook)(1), [csvstat](/man/csvstat)(1), [cut](/man/cut)(1), [awk](/man/awk)(1)
