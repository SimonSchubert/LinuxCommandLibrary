# TAGLINE

JIT-compiled Python interpreter for speed

# TLDR

**Run Python script**

```pypy [script.py]```

**Start interactive mode**

```pypy```

**Run with arguments**

```pypy [script.py] [arg1] [arg2]```

**Execute code** inline

```pypy -c "[print('Hello')]"```

**Run a module** as a script

```pypy -m [module_name]```

Install a package using **pip** through PyPy

```pypy -m pip install [package]```

Run a script with **optimizations** enabled (removes assert statements)

```pypy -O [script.py]```

Enter interactive mode **after** running a script (for debugging)

```pypy -i [script.py]```

# SYNOPSIS

**pypy** [_options_] [_script_] [_args_]

# PARAMETERS

_SCRIPT_
> Python script to run.

_ARGS_
> Script arguments.

**-c** _CODE_
> Execute code.

**-m** _MODULE_
> Run module.

**-i**
> Interactive after script.

**-O**
> Optimize mode: removes assert statements and sets __debug__ to False.

**-V**, **--version**
> Print the PyPy version and exit.

**-u**
> Unbuffered binary stdout and stderr.

**-W** _arg_
> Warning control (e.g., **-Wall** to show all warnings).

# DESCRIPTION

**PyPy** is an alternative Python interpreter that uses a Just-In-Time (JIT) compiler to achieve significantly faster execution than CPython for many workloads. It is compatible with Python 2.7 and Python 3.x syntax and can run most pure-Python code without modification, offering speedups of 2-10x or more on long-running programs.

The JIT compiler analyzes code at runtime and compiles frequently executed paths to machine code, so programs that loop heavily or perform repetitive computations benefit the most. PyPy also includes optimizations for memory usage through more compact object representations. Some C extension modules may not be compatible, though cffi-based extensions work well.

# CAVEATS

Not all C extension packages are compatible; cffi-based extensions work well but some CPython C API extensions may not. JIT compilation has a warmup period, so short-lived scripts may not see speed improvements. Use **pypy -m pip** instead of system pip to install packages into the PyPy environment.

# HISTORY

PyPy was created as a **high-performance** Python interpreter with JIT.

# SEE ALSO

[python](/man/python)(1), [python3](/man/python3)(1), [pip](/man/pip)(1)

