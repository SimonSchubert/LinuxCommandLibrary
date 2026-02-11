# TAGLINE

Interpreted general-purpose programming language

# TLDR

**Run Python script**

```python [script.py]```

**Start interactive REPL**

```python```

**Execute code**

```python -c "[print('Hello')]"```

**Run module**

```python -m [module]```

**Start HTTP server**

```python -m http.server [8080]```

**Check syntax**

```python -m py_compile [script.py]```

# SYNOPSIS

**python** [_options_] [_script_] [_args_]

# PARAMETERS

_SCRIPT_
> Python script to run.

_ARGS_
> Script arguments.

**-c** _CODE_
> Execute code string.

**-m** _MODULE_
> Run library module.

**-i**
> Interactive after script.

**-O**
> Optimize bytecode.

**-V**
> Show version.

**-u**
> Unbuffered output.

# DESCRIPTION

**python** is the interpreter for the Python programming language, executing scripts or starting an interactive REPL session. It supports procedural, object-oriented, and functional programming styles, and is widely used for scripting, web development, data analysis, automation, and scientific computing.

When invoked without arguments, it starts an interactive read-eval-print loop for experimentation. With a script file as argument, it compiles and executes the code. The **-m** flag runs installed modules as scripts, enabling built-in utilities like HTTP servers, JSON formatters, and package management through pip. On many systems, **python** may refer to Python 2; use **python3** explicitly for Python 3.

# CAVEATS

Python 2 vs 3 differences. Use python3 for Python 3.

# HISTORY

Python was created by **Guido van Rossum** in 1991.

# SEE ALSO

[python3](/man/python3)(1), [pip](/man/pip)(1), [pydoc](/man/pydoc)(1)

