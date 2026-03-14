# TAGLINE

Enhanced interactive Python shell

# TLDR

**Start IPython**

```ipython```

**Run script**

```ipython [script.py]```

**Start with specific profile**

```ipython --profile=[name]```

**Run code and enter interactive shell**

```ipython -i -c "[import numpy as np; arr = np.array([1,2,3])]"```

**Start with no startup banner**

```ipython --no-banner```

**Create a named profile**

```ipython profile create [name]```

**Start the debugger on exceptions**

```ipython --pdb```

# SYNOPSIS

**ipython** [_options_] [_files_...]

# DESCRIPTION

**ipython** (Interactive Python) is an enhanced Python shell that extends the standard interpreter with features designed for productive exploratory programming. It provides automatic syntax highlighting, comprehensive tab completion for objects, modules, and file paths, inline docstring access with `?` and `??` suffixes, and a searchable input history that persists across sessions.

A distinguishing feature is IPython's system of magic commands -- special directives prefixed with `%` (line magics) or `%%` (cell magics) -- that provide functionality outside of normal Python syntax, such as `%timeit` for benchmarking, `%run` for executing scripts, `%debug` for post-mortem debugging, and `%paste` for correctly handling indented code from the clipboard. IPython also integrates tightly with the scientific Python ecosystem, offering optional auto-import of NumPy and Matplotlib via `--pylab`, and serves as the default kernel for Jupyter notebooks.

# PARAMETERS

**-i**
> Inspect interactively after script.

**-c** _code_
> Execute code.

**--profile** _name_
> Use named profile.

**--colors** _scheme_
> Color scheme.

**--no-banner**
> Suppress startup banner.

**--automagic**
> Enable calling magic commands without the % prefix.

**--pdb**
> Start debugger on exception.

**--pylab** [_backend_]
> Load numpy and matplotlib.

**--matplotlib** [_backend_]
> Load matplotlib.

# MAGIC COMMANDS

**%run**: Execute script
**%timeit**: Timing
**%debug**: Post-mortem debugging
**%history**: Show history
**%load**: Load code from file
**%edit**: Edit in external editor

# CONFIGURATION

**~/.ipython/profile_default/ipython_config.py**
> Default profile configuration for customizing startup behavior, magics, extensions, and key bindings.

# CAVEATS

Heavier than standard Python. Magic commands are not valid Python syntax. Profile configuration may need migration between major versions. The **ipython notebook** subcommand was removed; use **jupyter notebook** instead.

# HISTORY

**IPython** was created by **Fernando Perez** in **2001** to improve Python's interactive experience. It evolved into the Jupyter project, with IPython remaining as the Python kernel. It became essential infrastructure for scientific Python.

# SEE ALSO

[python](/man/python)(1), [jupyter](/man/jupyter)(1), [bpython](/man/bpython)(1), [ptpython](/man/ptpython)(1)
