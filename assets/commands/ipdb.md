# TLDR

**Start ipdb debugger**

```python -m ipdb [script.py]```

**Set breakpoint in code**

```import ipdb; ipdb.set_trace()```

**Post-mortem debugging**

```python -m ipdb -c continue [script.py]```

**Run until exception**

```ipdb.pm()```

# SYNOPSIS

**python -m ipdb** [_options_] _script_ [_args_]

# PARAMETERS

**-c** _command_
> Execute command on start.

_script_
> Python script to debug.

# DEBUGGER COMMANDS

```
n (next)      Execute next line
s (step)      Step into function
c (continue)  Continue execution
r (return)    Return from function
l (list)      List source code
p expr        Print expression
pp expr       Pretty-print expression
b line        Set breakpoint
cl            Clear breakpoints
q (quit)      Quit debugger
h (help)      Show help
```

# DESCRIPTION

**ipdb** is the IPython-enhanced Python debugger. It provides the same interface as pdb but with syntax highlighting, tab completion, and better introspection from IPython.

ipdb makes Python debugging more interactive and user-friendly, especially for exploring variables and understanding program state.

# USAGE IN CODE

```python
import ipdb

def problematic_function():
    x = calculate_something()
    ipdb.set_trace()  # Debugger starts here
    return process(x)
```

# CAVEATS

Requires ipython package. Breakpoints pause execution. Don't leave set_trace() in production code. Use breakpoint() in Python 3.7+ with PYTHONBREAKPOINT=ipdb.set_trace.

# HISTORY

ipdb was created as a drop-in replacement for pdb that leverages IPython's features. It provides the familiar pdb interface with enhanced usability.

# SEE ALSO

[pdb](/man/pdb)(1), [ipython](/man/ipython)(1), [pudb](/man/pudb)(1)
