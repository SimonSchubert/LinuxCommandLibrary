# TLDR

**Open a CSV file**

```vd [file.csv]```

**Open a JSON file**

```vd [file.json]```

**Open multiple files**

```vd [file1.csv] [file2.xlsx]```

**Open from URL**

```vd [https://example.com/data.csv]```

**Pipe data from stdin**

```cat [file.csv] | vd```

**Open SQLite database**

```vd [database.db]```

**Specify filetype explicitly**

```vd -f json [file.txt]```

**Open with read-only mode**

```vd --readonly [file.csv]```

# SYNOPSIS

**vd** [_options_] [_file_...]

# PARAMETERS

**-f** _filetype_
> Force input file type.

**-b**, **--batch**
> Replay command log in batch mode.

**-p** _file_
> Replay command log file.

**-o** _file_
> Output to file after replay.

**--readonly**
> Disable saving/modifying.

**-d** _delimiter_
> Field delimiter for text files.

**-c** _cmdlog_
> Execute cmdlog file.

**--diff** _file_
> Show diff between sources.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# KEYBOARD COMMANDS

**h**/**j**/**k**/**l** or arrows
> Navigate cells.

**gj**/**gk**
> Go to first/last row.

**gh**/**gl**
> Go to first/last column.

**/**
> Search in current column.

**|**
> Select rows matching regex.

**,**
> Select rows where current column equals current cell.

**s**/**t**/**u**
> Select/toggle/unselect current row.

**gs**/**gt**/**gu**
> Select/toggle/unselect all rows.

**[**/**]**
> Sort by current column ascending/descending.

**F**
> Frequency table for current column.

**I**
> Describe (statistics) sheet.

**+**
> Add aggregator to column.

**Ctrl+s**
> Save current sheet.

**q**
> Quit current sheet.

# DESCRIPTION

**vd** (VisiData) is a terminal-based spreadsheet and data exploration tool. It opens tabular data from many formats including CSV, JSON, Excel, SQLite, and remote URLs.

Navigation uses vim-style keys. Sheets stack like buffers; **q** closes current sheet, returning to previous. The sheets sheet (**S**) shows all open sheets.

Data analysis features include frequency tables (**F**), column statistics (**I**), and aggregations (**+**). Group rows with **g** prefix commands. Create pivot tables and perform joins between sheets.

Selection (**s**/**t**/**u**) marks rows for operations. Use **|** to select by regex or **,** for exact match. **"** opens selected rows as new sheet.

Changes can be saved back to files with **Ctrl+s**. Command logs enable reproducible transformations and batch processing with **-b**.

# CAVEATS

Large files may use significant memory. Some formats require additional Python packages. Editing support varies by file type. Complex operations have learning curve.

# HISTORY

VisiData was created by **Saul Pwanson** and first released in **2016**. It was designed as a universal tool for exploring tabular data in the terminal, inspired by sc but supporting many formats. The project emphasizes keyboard efficiency and exploratory data analysis. VisiData has grown to support dozens of data formats and is widely used for data journalism and analysis workflows.

# SEE ALSO

[sc-im](/man/sc-im)(1), [csvkit](/man/csvkit)(1), [miller](/man/miller)(1), [xsv](/man/xsv)(1)
