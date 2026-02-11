# TAGLINE

Enhanced interactive Python REPL

# TLDR

**Start Python REPL**

```ptpython```

**Start with vi mode**

```ptpython --vi```

**Execute file then REPL**

```ptpython -i [script.py]```

**Start IPython mode**

```ptipython```

# SYNOPSIS

**ptpython** [_options_] [_file_]

# PARAMETERS

_FILE_
> Python file to execute.

**--vi**
> Vi editing mode.

**-i**
> Interactive after file.

**--config-file** _FILE_
> Configuration file.

# DESCRIPTION

**ptpython** is an enhanced Python REPL built on the **prompt_toolkit** library. It provides syntax highlighting, multi-line editing, autocompletion, mouse support, and vi/emacs key bindings, offering a significantly improved interactive experience over the default Python shell.

Features include function signature display, input validation, clipboard support, and the ability to embed ptpython in existing applications. The **ptipython** variant combines ptpython's UI with IPython's magic commands and features.

# CONFIGURATION

**~/.config/ptpython/config.py**
> Python configuration file for customizing key bindings, color scheme, completion behavior, and other REPL settings.

# CAVEATS

Requires installation. Uses prompt_toolkit.

# HISTORY

ptpython was created as an **enhanced Python REPL** with modern features.

# SEE ALSO

[python](/man/python)(1), [ipython](/man/ipython)(1), [bpython](/man/bpython)(1)

