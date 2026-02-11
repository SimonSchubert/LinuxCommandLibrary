# TAGLINE

Disable output buffering for commands

# TLDR

**Run command with unbuffered output**

```unbuffer [command]```

**Unbuffer in a pipeline**

```[command1] | unbuffer -p [command2] | [command3]```

**Unbuffer grep in a pipeline**

```tail -f [logfile] | unbuffer -p grep [pattern]```

**Unbuffer output of a script**

```unbuffer ./[script.sh] | tee [output.log]```

# SYNOPSIS

**unbuffer** [**-p**] _program_ [_args_]

# PARAMETERS

**-p**
> Pipeline mode: read from stdin and pass to program.

_program_
> The command to run with unbuffered output.

_args_
> Arguments to pass to the program.

# DESCRIPTION

**unbuffer** disables output buffering that occurs when program output is redirected. Many programs buffer their output when not connected to a terminal, which can cause delays or issues in pipelines.

The tool works by connecting the program to a pseudo-terminal (pty), making it behave as if running interactively. This forces line-buffered or unbuffered output even when redirected to files or pipes.

Common use cases include watching log files through grep, capturing colored output, and ensuring real-time output in scripts.

unbuffer is part of the Expect package and uses Expect's pty handling capabilities.

# CAVEATS

Does not read from stdin by default; use -p for pipeline mode. In pipeline mode with -p, unbuffer exits immediately when it encounters EOF. May affect programs that detect terminal capabilities. Part of the expect package, not installed by default on all systems.

# HISTORY

**unbuffer** was created as part of the Expect package by Don Libes at NIST. Expect is documented in "Exploring Expect: A Tcl-Based Toolkit for Automating Interactive Programs" (O'Reilly, 1995). The tool addresses a common Unix problem of output buffering in pipelines.

# SEE ALSO

[expect](/man/expect)(1), [stdbuf](/man/stdbuf)(1), [script](/man/script)(1), [tee](/man/tee)(1)
