# TLDR

**Run Python script**

```pypy [script.py]```

**Start interactive mode**

```pypy```

**Run with arguments**

```pypy [script.py] [arg1] [arg2]```

**Execute code**

```pypy -c "[print('Hello')]"```

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
> Optimize mode.

# DESCRIPTION

**pypy** is fast Python implementation. JIT-compiled Python.

The tool runs Python faster. Alternative interpreter.

pypy accelerates Python.

# CAVEATS

Not all packages compatible. JIT warmup time.

# HISTORY

PyPy was created as a **high-performance** Python interpreter with JIT.

# SEE ALSO

[python](/man/python)(1), [python3](/man/python3)(1)

