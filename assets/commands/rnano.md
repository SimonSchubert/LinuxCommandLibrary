# TAGLINE

View files in read-only nano editor

# TLDR

**View file read-only**

```rnano [file]```

**View with line numbers**

```rnano -l [file]```

**View at specific line**

```rnano +[42] [file]```

**View with smooth scrolling**

```rnano -S [file]```

# SYNOPSIS

**rnano** [_-l_] [_+line_] [_options_] _file_

# PARAMETERS

**-l**
> Show line numbers.

**-S**
> Smooth scrolling.

**+**_LINE_
> Start at line.

**-v**
> View mode (default).

**-h**
> Show help.

# DESCRIPTION

**rnano** is the read-only mode of the nano text editor, typically implemented as a symlink that invokes nano with the **-v** (view) flag. It provides a familiar nano interface for viewing files while preventing any accidental modifications, making it suitable for inspecting configuration files and logs.

All of nano's navigation features remain available, including scrolling, line jumping with **+LINE**, syntax highlighting, line number display with **-l**, and smooth scrolling with **-S**. The editor simply refuses any modification commands, so users can browse safely without risk of unintended changes.

This is analogous to the relationship between **vi** and **view**, providing a read-only variant of a familiar editor.

# CAVEATS

Just links to nano -v. Limited compared to less/more. No search history.

# HISTORY

**rnano** is typically a symlink to **nano** that invokes it in read-only (view) mode, similar to how view relates to vim.

# SEE ALSO

[nano](/man/nano)(1), [less](/man/less)(1), [view](/man/view)(1), [cat](/man/cat)(1)
