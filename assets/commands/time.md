# TAGLINE

Measure command execution time

# TLDR

**Measure execution time of a command**

```time [command]```

**Measure time with verbose output** (GNU time)

```/usr/bin/time -v [command]```

**Output to a file** (GNU time)

```/usr/bin/time -o [time.log] [command]```

**Custom output format** (GNU time)

```/usr/bin/time -f "Real: %e User: %U Sys: %S" [command]```

**Append to output file** (GNU time)

```/usr/bin/time -a -o [time.log] [command]```

# SYNOPSIS

**time** [_command_ [_arguments_...]]

**/usr/bin/time** [**-v**] [**-o** _file_] [**-f** _format_] _command_ [_arguments_...]

# PARAMETERS (GNU TIME)

**-v**, **--verbose**
> Display detailed resource usage

**-o** _file_, **--output**=_file_
> Write timing statistics to file

**-a**, **--append**
> Append to output file instead of overwriting

**-f** _format_, **--format**=_format_
> Use specified output format

**-p**, **--portability**
> Use POSIX output format

# FORMAT SPECIFIERS (GNU TIME)

**%e**: Elapsed real time (seconds)
**%E**: Elapsed real time (h:mm:ss)
**%U**: User CPU time (seconds)
**%S**: System CPU time (seconds)
**%P**: Percentage of CPU ((U+S)/E)
**%M**: Maximum resident set size (KB)
**%x**: Exit status of command
**%C**: Command and arguments

# DESCRIPTION

**time** measures the execution time of a command, reporting real (wall clock), user (CPU time in user mode), and system (CPU time in kernel mode) times.

There are two versions: the shell builtin (bash, zsh) and GNU time (**/usr/bin/time**). The builtin is simpler; GNU time provides more detailed resource statistics and formatting options.

Real time is the actual elapsed time. User time is CPU time executing user code. System time is CPU time in kernel calls. User + System may exceed Real on multi-core systems with parallel execution, or be less if the process waits for I/O.

# CAVEATS

The shell builtin **time** takes precedence. Use **/usr/bin/time** or **\time** for the external command with full features.

For accurate benchmarking, run multiple iterations and consider system load. Use tools like **hyperfine** for statistical benchmarking.

Resource measurements (memory, I/O) are only available with GNU time, not the shell builtin.

# SEE ALSO

[timeout](/man/timeout)(1), [watch](/man/watch)(1), [hyperfine](/man/hyperfine)(1), [perf](/man/perf)(1)
