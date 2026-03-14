# TAGLINE

GNU Octave, a numerical computing language

# TLDR

**Start an interactive session** (with GUI)

```octave```

**Start an interactive CLI session** without GUI

```octave --no-gui```

**Run a script file**

```octave [path/to/script.m]```

**Evaluate an expression and exit**

```octave --eval "[diag([1,2,3])]"```

**Run a script quietly** (suppress startup messages)

```octave --quiet [path/to/script.m]```

**Run in batch mode** (non-interactive, for scripts)

```octave --no-gui --silent [path/to/script.m]```

# SYNOPSIS

**octave** [_options_] [_file_]

# PARAMETERS

_FILE_
> Script file (.m) to execute.

**--eval** _CODE_
> Evaluate CODE and exit (unless --persist is also given).

**--gui**
> Start the graphical user interface.

**--no-gui**
> Use the command-line interface instead of the GUI.

**-q**, **--quiet**, **--silent**
> Suppress the startup message and version info.

**-i**, **--interactive**
> Force interactive mode (useful when running via pipes or remote shells).

**--no-init-file**
> Don't read the ~/.octaverc or .octaverc initialization files.

**--persist**
> Stay interactive after --eval or running a script file.

**--path** _dir_
> Add directory to the head of the function search path.

**--jit-compiler**
> Enable the JIT compiler for accelerating loops.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**GNU Octave** is a high-level interpreted language primarily intended for numerical computations. It provides a convenient command-line interface and GUI for solving linear and nonlinear problems numerically, and is largely compatible with MATLAB.

Octave features extensive tools for matrix operations, solving systems of equations, numerical integration, statistics, optimization, and 2D/3D plotting. It can be extended with packages from Octave Forge and supports calling C, C++, and Fortran code.

# CAVEATS

MATLAB compatibility is extensive but not complete; some MATLAB toolbox functions are unavailable or behave differently. Large matrix operations can consume significant memory. The JIT compiler is experimental in some versions.

# HISTORY

GNU Octave was created by **John W. Eaton** beginning in **1988** as a companion to a chemical reactor design textbook. It was first released as a standalone application in **1993** and is developed as a GNU project.

# SEE ALSO

[matlab](/man/matlab)(1), [gnuplot](/man/gnuplot)(1), [python](/man/python)(1)

