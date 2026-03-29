# TAGLINE

Fast terminal Excel viewer with interactive TUI

# TLDR

**Open an Excel file in the interactive TUI**

```xleak [report.xlsx]```

**Open a specific sheet by name**

```xleak [report.xlsx] --sheet "[Q3 Results]"```

**Export a spreadsheet to CSV**

```xleak [data.xlsx] --export csv > [output.csv]```

**Export a spreadsheet to JSON**

```xleak [data.xlsx] --export json > [output.json]```

**List all tables in a workbook**

```xleak [workbook.xlsx] --list-tables```

**View formulas by default**

```xleak [data.xlsx] --formulas```

# SYNOPSIS

**xleak** [_options_] _file_

# PARAMETERS

**--sheet** _NAME|NUMBER_
> Open a specific sheet by name or index.

**-n**, **--num-rows** _COUNT_
> Limit the number of rows displayed. `0` shows all rows.

**-w**, **--width** _WIDTH_
> Set column width.

**-H**
> Enable horizontal scrolling with auto-sized columns.

**--formulas**
> Display cell formulas instead of computed values by default.

**--export** _FORMAT_
> Export the spreadsheet to stdout in `csv`, `json`, or `text` (tab-separated) format.

**--table** _NAME_
> Extract a specific named Excel table (.xlsx only).

**--list-tables**
> List all tables in the workbook and exit.

**--config** _PATH_
> Use a custom configuration file instead of the default at `~/.config/xleak/config.toml`.

# KEYBOARD SHORTCUTS

**Arrow keys**
> Move between cells.

**/**
> Search across all cells.

**n** / **N**
> Jump to next / previous search result.

**Enter**
> View cell details and formula.

**c**
> Copy cell value to clipboard.

**C**
> Copy entire row to clipboard.

**Tab** / **Shift+Tab**
> Switch between sheets.

**Ctrl+G**
> Jump to a specific cell or row number.

**t**
> Cycle through colour themes.

**?**
> Display help.

**q**
> Quit.

# DESCRIPTION

**xleak** is a terminal-based Excel viewer that supports .xlsx, .xls, .xlsm, .xlsb, and .ods files. Features include full-text search across cells, formula display, lazy loading for large files, clipboard support, and export to CSV and JSON.

# HISTORY

**xleak** was created by **Brandon Greenwell** (bgreenwell) and is written in **Rust**.

# SEE ALSO

[sc-im](/man/sc-im)(1), [csvlens](/man/csvlens)(1)
