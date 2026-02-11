# TAGLINE

Terminal spreadsheet with vim keybindings

# TLDR

**Open spreadsheet**

```scim [file.sc]```

**Open CSV file**

```scim --txtdelim="," [file.csv]```

**Start with file**

```scim [file.xlsx]```

**Read-only mode**

```scim -R [file.sc]```

# SYNOPSIS

**scim** [_--txtdelim delim_] [_-R_] [_options_] [_file_]

# PARAMETERS

**--txtdelim** _DELIM_
> Text delimiter.

**-R**
> Read-only mode.

**--nocurses**
> No ncurses mode.

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**scim** (sc-im) is a terminal-based spreadsheet calculator with vim-like keybindings and a modal interface. It provides a lightweight alternative to graphical spreadsheet applications, running entirely within an ncurses terminal interface for fast, keyboard-driven operation.

The spreadsheet supports formulas, mathematical functions, cell references, and ranges similar to conventional spreadsheet software. Files can be imported from and exported to CSV, TSV, and Excel formats, allowing interoperability with other tools. The native **.sc** format preserves all formulas and formatting.

Navigation and editing follow vim conventions: **h/j/k/l** for movement, **i** for insert mode, **=** for formula entry, and **:** for commands like save and quit. This modal approach enables efficient keyboard-only workflows without reaching for a mouse.

# KEY BINDINGS

- **h/j/k/l** - Navigation
- **i** - Insert mode
- **=** - Enter formula
- **:w** - Save
- **:q** - Quit

# CAVEATS

Learning curve steep. Limited Excel compatibility. Console only.

# HISTORY

**sc-im** is a spreadsheet calculator based on **sc**, with Vim-like interface and modern improvements.

# SEE ALSO

[sc](/man/sc)(1), [gnumeric](/man/gnumeric)(1), [calc](/man/calc)(1)
