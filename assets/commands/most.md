# TAGLINE

paging program for viewing text files, designed as an alternative

# TLDR

**View a file**

```most [file]```

**View multiple files**

```most [file1] [file2]```

**Open in binary mode**

```most -b [file]```

**Squeeze multiple blank lines**

```most -s [file]```

**Wrap long lines**

```most -w [file]```

**Use as pager for man pages**

```export PAGER=most```

**Jump to specific line**

```most +[100] [file]```

# SYNOPSIS

**most** [_-bstvw_] [_+line_] [_files_]

# PARAMETERS

**-b**
> Binary mode (display control characters).

**-s**
> Squeeze multiple blank lines into one.

**-t**
> Disable tab expansion.

**-v**
> Display control characters visually.

**-w**
> Wrap long lines instead of truncating.

**+** _line_
> Start at specified line number.

**-d**
> Disable color ANSI sequences.

**-c**
> Make strokes color pages.

# KEYBOARD SHORTCUTS

**Space / D**
> Page down.

**B / U**
> Page up.

**Enter / Down**
> Scroll one line down.

**Up**
> Scroll one line up.

**< / >**
> Go to beginning / end of file.

**/ pattern**
> Search forward.

**? pattern**
> Search backward.

**n**
> Next search match.

**:n**
> Next file.

**:p**
> Previous file.

**q / Q**
> Quit.

**h**
> Help screen.

# DESCRIPTION

**most** is a paging program for viewing text files, designed as an alternative to more and less. It can display multiple windows and supports left-right scrolling for wide files.

Unlike less, most can open multiple windows on the same screen, allowing side-by-side file viewing or different positions in the same file. Window commands split the display and navigate between panes.

Color and ANSI escape sequence support makes it suitable as a pager for man pages and colorized output. Long lines can be wrapped or scrolled horizontally.

The search function supports regular expressions. Mark positions can be set and recalled for navigation. The interface is generally more visual than less, with status information displayed prominently.

Binary mode handles non-text files without cluttering the display. Squeeze mode collapses multiple blank lines, useful for files with excessive spacing.

# CAVEATS

Less feature-rich than less for some advanced operations. Window management has a learning curve. Not as universally available as less. Some key bindings differ from less/more conventions. May not handle extremely large files as efficiently.

# HISTORY

**most** was written by **John E. Davis** in the early **1990s** as part of the S-Lang library utilities. It was designed to address limitations in existing pagers, particularly adding multiple window support and better handling of wide files. The tool remains actively maintained as part of the S-Lang project.

# SEE ALSO

[less](/man/less)(1), [more](/man/more)(1), [bat](/man/bat)(1), [view](/man/view)(1)
