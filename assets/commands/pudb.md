# TLDR

**Debug Python script**

```pudb [script.py]```

**Debug with arguments**

```pudb [script.py] [arg1] [arg2]```

**Start at breakpoint**

```python -m pudb [script.py]```

**Post-mortem debugging**

```pudb --post-mortem [script.py]```

# SYNOPSIS

**pudb** [_options_] _script_ [_args_]

# PARAMETERS

**--pre-run** _command_
> Run command before script.

**--post-mortem**
> Debug after exception.

**--steal-output**
> Capture stdout/stderr.

**-m** _module_
> Run module.

# DESCRIPTION

**pudb** is a full-screen, console-based visual debugger for Python. It provides a TUI with code view, variable inspector, stack trace, and breakpoints.

# EXAMPLES

```bash
# Debug script
pudb myscript.py

# With arguments
pudb myscript.py --config=test

# Run as module
python -m pudb myscript.py

# Post-mortem on crash
pudb --post-mortem crashing_script.py
```

# IN-CODE BREAKPOINT

```python
import pudb; pudb.set_trace()

# Or Python 3.7+
breakpoint()  # with PYTHONBREAKPOINT=pudb.set_trace
```

# KEY BINDINGS

```
n     - Next line
s     - Step into
c     - Continue
b     - Set breakpoint
q     - Quit
?     - Help
Ctrl+p - Preferences
```

# CAVEATS

Terminal must support curses. May conflict with some terminal settings. Python-specific.

# HISTORY

pudb was created by **Andreas Klöckner** as a visual alternative to pdb, inspired by Borland's Turbo Debugger.

# SEE ALSO

[pdb](/man/pdb)(1), [ipdb](/man/ipdb)(1), [gdb](/man/gdb)(1), [python](/man/python)(1)
