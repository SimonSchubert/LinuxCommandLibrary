# TAGLINE

python debugger

# TLDR

**Debug Python script**

```python3.4 -m pdb [script.py]```

**Set breakpoint in code**

```import pdb; pdb.set_trace()```

**Run until an error**, then enter post-mortem debugging

```python3.4 -m pdb -c continue [script.py]```

# SYNOPSIS

**python3.4** **-m** **pdb** [_options_] _script_ [_args_]

# PARAMETERS

_SCRIPT_
> Python script to debug.

**-c** _COMMAND_
> Execute command at start.

Debugger commands:
- **n** - next line
- **s** - step into
- **c** - continue
- **b** - breakpoint
- **p** - print
- **q** - quit

# DESCRIPTION

**pdb** is the Python debugger. Interactive debugging environment.

The tool provides breakpoints and inspection. Part of Python standard library.

# CAVEATS

Version specific: Python 3.4 reached end of life in March 2019. Later Python versions add features this one lacks, such as **python -m pdb -m module** and the **breakpoint()** built-in.

# HISTORY

pdb has been part of **Python standard library** since early versions.

# SEE ALSO

[python](/man/python)(1), [ipdb](/man/ipdb)(1), [pudb](/man/pudb)(1)

# RESOURCES

```[Documentation](https://docs.python.org/3/library/pdb.html)```

```[Source code](https://github.com/python/cpython)```

<!-- verified: 2026-11-08 -->
