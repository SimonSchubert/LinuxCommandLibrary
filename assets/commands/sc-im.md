# TLDR

**Start sc-im** with a new spreadsheet

```sc-im```

**Open an existing file** (CSV, TSV, XLSX, or SC format)

```sc-im [path/to/file]```

**Open a specific sheet** from an XLSX file

```sc-im --sheet=[2] [file.xlsx]```

**Import formulas** from XLSX instead of final values

```sc-im --xlsx_readformulas [file.xlsx]```

**Run in quiet mode** without info/error messages

```sc-im --quiet [file]```

**Run a script and quit** after loading

```sc-im --quit_afterload [script.sc]```

# SYNOPSIS

**sc-im** [_options_] [_file_]

# PARAMETERS

**--sheet=**_SHEET_
> Open specific sheet from XLSX file (name or number, default: 1)

**--version**
> Print version number and enabled features, then exit

**--nocurses**
> Run interactively without the ncurses interface

**--output=**_FILE_
> Save results to specified file

**--quit_afterload**
> Quit after loading files; useful for running scripts

**--quiet**
> Suppress info, error, and debug messages

**--autocalc**
> Enable automatic recalculation

**--numeric**
> Digit starts numeric value instead of command multiplier

**--half_page_scroll**
> Scroll half page instead of full page

**--newline_action=**_VAL_
> Cursor movement after entry (j for down, l for right)

**--external_functions**
> Enable external functions

**--xlsx_readformulas**
> Import formulas from XLSX rather than final cell values

# DESCRIPTION

**sc-im** (Spreadsheet Calculator Improvised) is a terminal-based spreadsheet application with vim-like keybindings. It supports up to 65,536 rows and 702 columns, making it suitable for substantial data manipulation directly in the terminal.

The program uses ncurses for its interface and supports importing and exporting CSV, TSV, and XLSX files. It features complex formula support, macro recording, undo/redo functionality, and GNUPlot integration for charting. Cells can be colorized with 256-color support, and formatting like bold or underline can be applied.

Navigation follows vim conventions: **h**, **j**, **k**, **l** move between cells, **gg** jumps to the first cell, **G** goes to the last row, and **w**/**b** move to the next/previous cell with content. Configuration is stored in **~/.config/sc-im/scimrc**.

# CAVEATS

XLSX import may not preserve all Excel features; complex formulas or formatting might be lost. Large files can be slow to load. The vim-like interface has a learning curve for users unfamiliar with modal editors.

# HISTORY

The original **sc** (Spreadsheet Calculator) was created by **James Gosling** and **Mark Weiser** in **1981** at Carnegie Mellon University. Development stalled around 2002. In **2015**, **Andrés Martinelli** forked the project as **sc-im**, adding modern features like XLSX support, 256 colors, undo/redo, and Lua scripting while maintaining the terminal-based, vim-like interface.

# SEE ALSO

[sc](/man/sc)(1), [vim](/man/vim)(1), [gnuplot](/man/gnuplot)(1), [csvtool](/man/csvtool)(1)
