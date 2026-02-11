# TAGLINE

Open files in read-only Vim mode

# TLDR

**Open a file in read-only mode**

```view [file]```

**Open multiple files** in read-only mode

```view [file1] [file2]```

**Open at a specific line number**

```view +[line_number] [file]```

**Open and jump to pattern**

```view +/[pattern] [file]```

# SYNOPSIS

**view** [_options_] [_file ..._]

# PARAMETERS

All vim options are available. Common ones include:

**+**_num_
> Open file at line number.

**+/**_pattern_
> Open file at first occurrence of pattern.

**-c** _command_
> Execute command after loading file.

**-n**
> No swap file (useful for sensitive files).

**-o**
> Open files in horizontal splits.

**-O**
> Open files in vertical splits.

**-p**
> Open files in tabs.

# DESCRIPTION

**view** is a read-only mode of Vim. It is equivalent to running **vim -R** and opens files with the readonly option set, preventing accidental modifications.

You can still navigate, search, and use all viewing features of vim. Attempting to save will produce a warning, though you can force a write with **:w!** if you have permission.

All standard vim commands work for navigation: **h/j/k/l** for movement, **/** for search, **G** to go to end, **gg** to go to start, **:q** to quit.

# CAVEATS

While view prevents accidental saves, it doesn't prevent editing the buffer entirely. For stricter read-only mode, use **vim -M** which disables all modifications. Unlike less or cat, view loads the entire file and uses swap files by default.

# HISTORY

view has been part of **vi** and **vim** since the early days. The original vi was written by **Bill Joy** at UC Berkeley in **1976**. vim (Vi IMproved), created by **Bram Moolenaar**, was first released in **1991** and included view as a standard way to invoke read-only mode. The naming follows Unix convention where different names for the same binary trigger different behaviors.

# SEE ALSO

[vim](/man/vim)(1), [less](/man/less)(1), [cat](/man/cat)(1), [more](/man/more)(1)
