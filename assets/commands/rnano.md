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

**rnano** is read-only nano. It prevents modifications.

View files safely. No accidental edits.

Same interface as nano. Familiar navigation.

Syntax highlighting works. Colored output.

Good for viewing configs. Safe inspection.

# CAVEATS

Just links to nano -v. Limited compared to less/more. No search history.

# HISTORY

**rnano** is typically a symlink to **nano** that invokes it in read-only (view) mode, similar to how view relates to vim.

# SEE ALSO

[nano](/man/nano)(1), [less](/man/less)(1), [view](/man/view)(1), [cat](/man/cat)(1)
