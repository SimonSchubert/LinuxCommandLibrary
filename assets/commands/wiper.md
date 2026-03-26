# TAGLINE

TUI disk space analyzer and cleanup tool

# TLDR

**Analyze the current directory**

```wiper```

**Analyze a specific directory**

```wiper [/home]```

**Navigate with keyboard: j/k or arrows to move, l/Enter to enter folder, h/Backspace to go back**

```wiper```

**Press d twice to delete selected item, press t to toggle trash mode**

```wiper```

# SYNOPSIS

**wiper** [_path_]

# PARAMETERS

**j, k, Down, Up**
> Navigate up and down through directories

**l, Right, Enter**
> Enter a selected folder

**h, Left, Backspace**
> Return to parent directory

**d**
> Delete mode (press once to select, again to confirm)

**s**
> Toggle sort order between name and size

**c**
> Toggle gradient coloring for visual space usage

**t**
> Toggle trash mode (permanent vs. recoverable deletion)

**q**
> Exit the application

# DESCRIPTION

**wiper** is a terminal-based disk analyzer that scans directories and visually displays which folders consume the most space. It provides colored output, file size metrics, and keyboard shortcuts for navigating and cleaning up disk usage. Works on Linux, macOS, and Windows.

# HISTORY

**wiper** was created by **Alexandr Kobrin** (ikebastuz) and is written in **Rust**.

# SEE ALSO

[dust](/man/dust)(1), [dua](/man/dua)(1), [ncdu](/man/ncdu)(1), [du](/man/du)(1)
