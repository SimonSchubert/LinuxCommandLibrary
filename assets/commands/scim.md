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

**scim** is a spreadsheet calculator. It runs in the terminal.

Vim-like keybindings. Modal interface.

Supports formulas. Mathematical calculations.

Imports CSV and Excel. Multiple formats.

Ncurses interface. Terminal-based GUI.

Lightweight and fast. No GUI overhead.

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
