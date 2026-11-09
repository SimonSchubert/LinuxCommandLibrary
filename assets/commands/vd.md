# TAGLINE

Terminal-based data exploration spreadsheet

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

**Convert a file** without opening the interface

```vd -b [input.csv] -o [output.json]```

**Open a CSV with no header row**

```vd --header 0 [file.csv]```

**Replay a saved command log**

```vd -p [script.vdj]```

# SYNOPSIS

**vd** [_options_] [_file_...]

**vd** [_options_] **-p** _cmdlog_ [**-b**] [**-o** _output_] [_field_=_value_...]

# PARAMETERS

**-f**, **--filetype** _filetype_
> Force input file type instead of using the file extension (aliases: **-if**, **--input-filetype**).

**-p**, **--play** _cmdlog_
> Replay a saved command log file within the interface.

**-b**, **--batch**
> Run in batch mode (no interface): replay cmdlog and exit.

**-i**, **--interactive**
> Stay in the interface after a batch replay.

**-w**, **--replay-wait** _seconds_
> Wait the given number of seconds between replayed commands.

**-o**, **--output** _file_
> Save the final visible sheet to file at the end of replay.

**-of**, **--output-filetype** _filetype_
> Use the given saver for **-o** instead of the file extension.

**-d**, **--delimiter** _delimiter_
> Field delimiter for tsv/csv files.

**--header** _N_
> Parse the first N rows as column names (default: 1, use 0 for none).

**--skip** _N_
> Skip N rows before the header.

**--encoding** _encoding_
> Text encoding used to read files (default: utf-8-sig).

**-y**
> Auto-accept all confirmation prompts, including file overwrite.

**-ro**
> Do not overwrite existing files.

**-N**, **--nothing**
> Do not load .visidatarc or plugin addons.

**-n**, **--nonglobal**
> Apply subsequent options only to the paths given on the command line.

**-g**, **--global**
> Apply subsequent options globally (default).

**+**_toplevel_:_subsheet_:_col_:_row_
> Start with the given subsheet on top and the cursor at the given column and row. All parts are optional.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# KEYBOARD COMMANDS

**h**/**j**/**k**/**l** or arrows
> Navigate cells.

**gg**/**G**
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

**Enter**
> Open row as a new sheet (dive into nested data).

**F**
> Frequency/pivot table for current column.

**I**
> Describe sheet (statistics for all columns).

**+**
> Add aggregator to column.

**S**
> Open the Sheets sheet to switch between open sheets.

**e**
> Edit current cell.

**U**/**R**
> Undo/redo the last modification.

**Space**
> Run a command by its longname.

**Ctrl+s**
> Save current sheet.

**q**
> Quit current sheet.

**gq**
> Quit all sheets.

# DESCRIPTION

**vd** (VisiData) is a terminal-based spreadsheet and data exploration tool. It opens tabular data from many formats including CSV, JSON, Excel, SQLite, and remote URLs.

Navigation uses vim-style keys. Sheets stack like buffers; **q** closes current sheet, returning to previous. The sheets sheet (**S**) shows all open sheets.

Data analysis features include frequency tables (**F**), column statistics (**I**), and aggregations (**+**). The **g** prefix generally widens a command (for example to all rows or columns) and **z** narrows it. Create pivot tables and perform joins between sheets.

Selection (**s**/**t**/**u**) marks rows for operations. Use **|** to select by regex or **,** for exact match. **"** opens selected rows as new sheet.

Changes can be saved back to files with **Ctrl+s**. Command logs enable reproducible transformations and batch processing with **-b**.

# CAVEATS

Large files may use significant memory. Some formats require additional Python packages. Editing support varies by file type. Complex operations have learning curve.

# HISTORY

VisiData was created by **Saul Pwanson** and first released in **2016**. It was designed as a universal tool for exploring tabular data in the terminal, inspired by sc but supporting many formats. The project emphasizes keyboard efficiency and exploratory data analysis. VisiData has grown to support dozens of data formats and is widely used for data journalism and analysis workflows.

# SEE ALSO

[sc-im](/man/sc-im)(1), [csvkit](/man/csvkit)(1), [miller](/man/miller)(1), [xsv](/man/xsv)(1)

# RESOURCES

```[Source code](https://github.com/saulpw/visidata)```

```[Homepage](https://www.visidata.org/)```

```[Documentation](https://www.visidata.org/docs/)```

<!-- verified: 2026-11-09 -->
