# TAGLINE

Fast CSV command-line toolkit

# TLDR

**Display CSV headers**

```xsv headers [file.csv]```

**Select specific columns**

```xsv select [Name,Age] [file.csv]```

**Format CSV as aligned table**

```xsv table [file.csv]```

**Get statistics** for all columns

```xsv stats [file.csv]```

**Search for pattern** in CSV

```xsv search "[pattern]" [file.csv]```

**Sort by column**

```xsv sort -s [column] [file.csv]```

**Count rows**

```xsv count [file.csv]```

**Sample random rows**

```xsv sample [10] [file.csv]```

# SYNOPSIS

**xsv** _command_ [_options_] [_input_]

# PARAMETERS

**cat**
> Concatenate CSV files by row or column.

**count**
> Count the rows in a CSV file.

**fixlengths**
> Force all rows to have the same length.

**flatten**
> Show each row on a single line.

**fmt**
> Format CSV output (delimiter, quoting).

**frequency**
> Show frequency tables for columns.

**headers**
> Display column headers.

**index**
> Create an index for fast random access.

**input**
> Read CSV data with special handling.

**join**
> Join two CSV files on a column.

**sample**
> Randomly sample rows.

**search**
> Search rows matching a regex pattern.

**select**
> Select specific columns.

**slice**
> Slice rows from the CSV.

**sort**
> Sort rows by columns.

**split**
> Split CSV into multiple files.

**stats**
> Compute statistics for columns.

**table**
> Format as aligned ASCII table.

**-d**, **--delimiter** _char_
> Field delimiter (default: comma).

**--no-headers**
> Input has no header row.

**-o**, **--output** _file_
> Write output to file.

# DESCRIPTION

**xsv** is a fast CSV command-line toolkit written in Rust. It provides commands for indexing, slicing, analyzing, splitting, and joining CSV files with excellent performance on large datasets.

The tool creates indexes to enable fast random access and statistics gathering. Commands are designed to be composable through Unix pipes while maintaining high performance.

xsv handles various CSV dialects and can work with different delimiters, quoting styles, and files with or without headers.

# CAVEATS

xsv is optimized for well-formed CSV files. Malformed input may produce unexpected results. Creating an index with **xsv index** significantly speeds up subsequent operations on large files.

# HISTORY

xsv was created by **Andrew Gallant** (BurntSushi) and first released in **2014**. It was developed as a demonstration of Rust's performance capabilities for command-line tools and CSV processing. The project has influenced the design of other Rust CSV tools and established patterns for high-performance CSV processing.

# SEE ALSO

[csvkit](/man/csvkit)(1), [miller](/man/miller)(1), [awk](/man/awk)(1), [cut](/man/cut)(1)
