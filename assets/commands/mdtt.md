# TAGLINE

Markdown table editor TUI with vim-style keybindings

# TLDR

**Edit a markdown table** from a file

```mdtt [path/to/file.md]```

**Create a new table** interactively

```mdtt```

# SYNOPSIS

**mdtt** [_options_] [_file_]

# DESCRIPTION

**mdtt** is a terminal-based Markdown table editor with vim-style keybindings. Navigation uses **hjkl** keys, **i** switches to insert mode for editing cell content, and **Esc** returns to normal mode.

Features include adding rows and columns with **o**/**vo**, deleting with **dd**/**vd**, output to stdout and in-place file editing, delegating cell editing to an external **$EDITOR**, and HTML support within table cells for rich content formatting.

# CAVEATS

Only edits Markdown tables. Other Markdown content in the file is preserved but not editable through the TUI.

# HISTORY

**mdtt** was created by **szktkfm** and is written in **Go**.

# SEE ALSO

[vim](/man/vim)(1)
