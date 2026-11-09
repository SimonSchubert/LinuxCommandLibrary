# TAGLINE

Python AST viewer for the terminal

# TLDR

**Explore the AST of a Python file**

```astare [my_script.py]```

**Set the dark mode theme** for the source display

```astare -t [monokai] [my_script.py]```

**Set the light mode theme** for the source display

```astare -T [friendly] [my_script.py]```

**List the available theme names**

```astare --themes```

# SYNOPSIS

**astare** [_options_] [_file_]

# PARAMETERS

**-t**, **--dark-theme** _THEME_
> Set the dark mode theme for the source display.

**-T**, **--light-theme** _THEME_
> Set the light mode theme for the source display.

**--themes**
> List the available theme names.

**-v**, **--version**
> Show version information.

**-h**, **--help**
> Show the help message.

# DESCRIPTION

**textual-astview** is a Textual widget library and a command-line tool, **astare**, for displaying and exploring the Python Abstract Syntax Tree. It loads a Python source file and shows its AST in an interactive tree alongside the source code. Themes are Pygments style names.

# CAVEATS

The command installed by the **textual-astview** package is **astare**. The repository is archived and unlikely to receive updates: the author points users to his newer application, DHV.

# HISTORY

**textual-astview** was created by **Dave Pearson** (davep) and is written in **Python** using the Textual framework.

# SEE ALSO

[python](/man/python)(1), [pyflakes](/man/pyflakes)(1), [ast-grep](/man/ast-grep)(1)

# RESOURCES

```[Source code](https://github.com/davep/textual-astview)```

<!-- verified: 2026-11-09 -->
