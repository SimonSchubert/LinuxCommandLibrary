# TAGLINE

Intercepts and records dynamic library calls made by a process

# TLDR

**Trace library calls of a program**

```ltrace [path/to/program]```

**Count library calls and print a summary on exit**

```ltrace -c [path/to/program]```

**Trace specific library functions**

```ltrace -e malloc+free [path/to/program]```

**Trace calls and also display system calls**

```ltrace -S [path/to/program]```

**Attach to a running process**

```ltrace -p [pid]```

**Write trace output to a file**

```ltrace -o [path/to/file] [path/to/program]```

**Trace child processes created by fork**

```ltrace -f [path/to/program]```

**Show time spent inside each library call**

```ltrace -T [path/to/program]```

# SYNOPSIS

**ltrace** [_options_] [_command_ [_arg ..._]]

# DESCRIPTION

**ltrace** intercepts and records dynamic library calls made by a process and signals received by it. It is useful for debugging and understanding how programs interact with shared libraries.

# PARAMETERS

**-a**, **--align** _column_
> Align return values in a specific column (default is 5/8 of screen width).

**-A** _maxelts_
> Maximum number of array elements to print before suppressing the rest with an ellipsis.

**-b**, **--no-signals**
> Disable printing of signals received by the traced process.

**-c**
> Count time and calls for each library call and print a summary on program exit.

**-C**, **--demangle**
> Decode (demangle) low-level C++ symbol names into user-level names.

**-D**, **--debug** _mask_
> Show debugging output of ltrace itself.

**-e** _filter_
> Qualifying expression to select which library calls to trace.

**-f**
> Trace child processes created by fork(2) or clone(2).

**-F**, **--config** _pathlist_
> Colon-separated list of paths for prototype library configuration files.

**-i**
> Print the instruction pointer at the time of the library call.

**-l**, **--library** _library_pattern_
> Display only calls to functions in libraries matching the pattern.

**-L**
> Don't display library calls (use with -x to trace only symbol entry points).

**-n**, **--indent** _nr_
> Indent trace output by nr spaces for each nested call level.

**-o**, **--output** _filename_
> Write trace output to a file instead of stderr.

**-p** _pid_
> Attach to the process with the given process ID.

**-r**
> Print a relative timestamp with each line of the trace.

**-s** _strsize_
> Maximum string size to print (default: 32).

**-S**
> Display system calls as well as library calls.

**-t**
> Prefix each line with the time of day.

**-tt**
> Time of day with microseconds.

**-ttt**
> Microseconds since the epoch.

**-T**
> Show the time spent inside each call.

**-u** _username_
> Run command with the userid and groupid of the specified user.

**-w**, **--where** _nr_
> Show backtrace of nr stack frames for each traced function.

**-x** _filter_
> Qualifying expression for tracing symbol table entry points.

**-V**, **--version**
> Show version number and exit.

**-h**, **--help**
> Display help and exit.

# CAVEATS

May significantly slow down traced programs. Not all library calls may be intercepted on all architectures. The **-w** option requires elfutils or libunwind support at compile time.

# SEE ALSO

[strace](/man/strace)(1), [ldd](/man/ldd)(1), [gdb](/man/gdb)(1), [nm](/man/nm)(1), [objdump](/man/objdump)(1)
