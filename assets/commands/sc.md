# TAGLINE

Terminal-based spreadsheet calculator

# TLDR

**Start sc** with a new spreadsheet

```sc```

**Open an existing spreadsheet file**

```sc [file.sc]```

**Start sc-im** (improved version)

```sc-im```

**Open a CSV file** in sc-im

```sc-im [file.csv]```

**Open an Excel file** in sc-im

```sc-im [file.xlsx]```

# SYNOPSIS

**sc** [_-rxnCqS_] [_file_]

# PARAMETERS

**-r**
> Read-only mode

**-x**
> Disable X11 functionality

**-n**
> No prompting for commands

**-C**
> Start with color disabled

**-q**
> Quiet mode

# KEYBOARD COMMANDS

**h, j, k, l**
> Move left, down, up, right (vi-style)

**g** _cell_
> Go to specified cell (e.g., gA1, gD3)

**e**
> Enter edit mode for current cell

**=**
> Enter a formula

**x**
> Delete current cell contents

**dd**
> Delete entire row

**yy**
> Yank (copy) row

**p**
> Paste yanked content

**ZZ**
> Save and quit

**ZQ**
> Quit without saving

# DESCRIPTION

**sc** is a terminal-based spreadsheet calculator with vi-style keybindings. It supports formulas, macros, and external functions while operating entirely in text mode. Spreadsheets are saved as human-readable command scripts.

The modern successor **sc-im** (Spreadsheet Calculator Improvised) extends sc with undo/redo, support for 65,536 rows and 702 columns, CSV/XLSX import/export, and Lua scripting. Both programs share similar vi-like navigation and editing commands.

Spreadsheet files can be exported to plain text, LaTeX, or CSV formats for use with other applications.

# CAVEATS

sc uses a unique file format (.sc) that stores spreadsheets as command sequences. The original sc development stalled in 2002; sc-im is the actively maintained fork for modern systems.

# HISTORY

Development of sc began in **1981** by James Gosling and Mark Weiser, making it one of the oldest open-source spreadsheet applications. Chuck Martin later added modifications. In **2015**, development resumed under the name **sc-im** with significant enhancements.

# SEE ALSO

[sc-im](/man/sc-im)(1), [gnumeric](/man/gnumeric)(1), [bc](/man/bc)(1), [vi](/man/vi)(1)
