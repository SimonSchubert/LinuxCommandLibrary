# TAGLINE

python debugger

# TLDR

**Debug Python script**

```python3.4 -m pdb [script.py]```

**Set breakpoint in code**

```import pdb; pdb.set_trace()```

**Run post-mortem debug**

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

Version specific (3.4). Same as pdb for other versions. Interactive debugger.

# HISTORY

pdb has been part of **Python standard library** since early versions.

# SEE ALSO

[python](/man/python)(1), [ipdb](/man/ipdb)(1), [pudb](/man/pudb)(1)

