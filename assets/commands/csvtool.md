# TLDR

**Extract specific columns** from a CSV

```csvtool col [1,3,5] [data.csv]```

**Extract rows by range**

```csvtool head [10] [data.csv]```

**Transpose CSV** (rows become columns)

```csvtool transpose [data.csv]```

**Join columns** from multiple files

```csvtool paste [file1.csv] [file2.csv]```

**Replace values** in a column

```csvtool replace [column] [old] [new] [data.csv]```

**Custom delimiter** input

```csvtool -t "[;]" col [1,2] [data.csv]```

# SYNOPSIS

**csvtool** [_options_] _command_ [_arguments_] _file_

# PARAMETERS

**col** _COLUMNS_
> Extract specified columns (1-indexed, comma-separated).

**head** _N_
> Output first N rows.

**drop** _N_
> Drop first N rows.

**transpose**
> Transpose rows and columns.

**paste**
> Paste files side by side.

**replace** _COL_ _OLD_ _NEW_
> Replace values in a column.

**join** _COL_
> Join files on a column.

**call** _COMMAND_
> Run command for each row.

**-t** _CHAR_
> Input delimiter (default: comma).

**-u** _CHAR_
> Output delimiter.

**-o** _FILE_
> Output file.

# DESCRIPTION

**csvtool** is a fast CSV manipulation utility written in OCaml. It provides various operations for transforming, filtering, and analyzing CSV data from the command line.

The tool is designed for speed and handles large files efficiently. It supports common operations like column extraction, row filtering, transposition, and file joining. The **call** command enables running external commands for each row.

csvtool uses a streaming approach where possible, allowing it to process files larger than available memory for many operations. It properly handles CSV quoting and escaping.

# CAVEATS

Column numbers are 1-indexed, not 0-indexed. Some operations require loading the entire file into memory. Quoting rules may differ from other CSV tools. Error messages can be cryptic.

# HISTORY

csvtool was developed as a fast, lightweight CSV processor. Written in OCaml for performance, it provides an alternative to heavier tools when simple, fast transformations are needed on CSV data.

# SEE ALSO

[csvkit](/man/csvkit)(1), [cut](/man/cut)(1), [awk](/man/awk)(1), [miller](/man/miller)(1)
