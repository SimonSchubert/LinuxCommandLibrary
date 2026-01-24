# TLDR

**Start IPython**

```ipython```

**Run script**

```ipython [script.py]```

**Start with specific profile**

```ipython --profile=[name]```

**Run code and enter shell**

```ipython -i -c "[code]"```

**Start notebook server**

```ipython notebook```

**Create profile**

```ipython profile create [name]```

**Show configuration**

```ipython --help-all```

# SYNOPSIS

**ipython** [_options_] [_files_...]

# DESCRIPTION

**ipython** is an enhanced interactive Python shell. It provides features like syntax highlighting, tab completion, magic commands, and better introspection than the standard Python interpreter.

The tool supports multiple frontends including terminal, Qt console, and notebooks. It's widely used in data science and scientific computing.

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

# CAVEATS

Heavier than standard Python. Magic syntax not pure Python. Profile migration may be needed between versions.

# HISTORY

**IPython** was created by **Fernando Perez** in **2001** to improve Python's interactive experience. It evolved into the Jupyter project, with IPython remaining as the Python kernel. It became essential infrastructure for scientific Python.

# SEE ALSO

[python](/man/python)(1), [jupyter](/man/jupyter)(1), [bpython](/man/bpython)(1), [ptpython](/man/ptpython)(1)
