# TAGLINE

Python 3.4 interpreter with asyncio and pathlib

# TLDR

**Run Python 3.4 script**

```python3.4 [script.py]```

**Interactive mode**

```python3.4```

**Execute command**

```python3.4 -c "[print('hello')]"```

**Run module**

```python3.4 -m [module]```

# SYNOPSIS

**python3.4** [_options_] [_script_] [_args_]

# PARAMETERS

**-c** _command_
> Execute command.

**-m** _module_
> Run library module.

**-i**
> Interactive after script.

**-u**
> Unbuffered I/O.

**-O**
> Optimize bytecode.

**-B**
> Don't write bytecode.

**-v**
> Verbose imports.

**-V**
> Print version.

# DESCRIPTION

**python3.4** is the Python 3.4 interpreter. Released in 2014, Python 3.4 introduced asyncio, enum, pathlib, and other features. Now superseded by newer Python 3 versions.

# EXAMPLES

```bash
# Run script
python3.4 myscript.py

# Check version
python3.4 --version

# Create virtual environment
python3.4 -m venv myenv

# Run simple server
python3.4 -m http.server 8000
```

# FEATURES IN 3.4

```python
import asyncio         # Async I/O
import enum            # Enumerations
import pathlib         # Object-oriented paths
import statistics      # Basic statistics
import selectors       # I/O multiplexing
```

# CAVEATS

Python 3.4 is EOL (March 2019). Use Python 3.10+ for current development. Older versions lack security updates.

# HISTORY

Python 3.4 was released March 16, 2014. Each Python version has ~5 year support window.

# SEE ALSO

[python3](/man/python3)(1), [pip](/man/pip)(1), [venv](/man/venv)(1)
