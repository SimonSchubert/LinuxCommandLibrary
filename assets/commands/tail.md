# TLDR

**Show last 10 lines** of a file

```tail [file]```

**Show last N lines**

```tail -n [20] [file]```

**Show all lines starting from line N**

```tail -n +[10] [file]```

**Follow a file** (watch for new content)

```tail -f [file]```

**Follow multiple files**

```tail -f [file1] [file2]```

**Follow and retry** if file is recreated

```tail -F [file]```

**Show last N bytes**

```tail -c [100] [file]```

# SYNOPSIS

**tail** [_options_] [_file_...]

# PARAMETERS

**-n** _N_, **--lines**=_N_
> Output last N lines (or +N for starting from line N)

**-c** _N_, **--bytes**=_N_
> Output last N bytes (or +N for starting from byte N)

**-f**, **--follow**
> Output appended data as file grows

**-F**
> Same as --follow=name --retry

**--retry**
> Keep trying to open file if inaccessible

**-s** _N_, **--sleep-interval**=_N_
> Sleep N seconds between iterations with -f

**--pid**=_PID_
> With -f, terminate after process PID dies

**-q**, **--quiet**
> Never output headers with file names

**-v**, **--verbose**
> Always output headers with file names

# DESCRIPTION

**tail** outputs the last part of files. By default, it shows the last 10 lines. It's commonly used to view log files and monitor file changes in real-time.

The **-f** (follow) option is particularly useful for monitoring log files. Tail continues reading as new lines are appended, displaying them immediately.

Using **-n +N** outputs starting from line N rather than the last N lines. This is useful for skipping headers or combining with head for extracting specific ranges.

Multiple files can be specified; tail shows headers indicating which file output comes from.

# CAVEATS

**-f** follows the file descriptor. If a file is deleted and recreated (common with log rotation), use **-F** which follows by name and retries.

For large files, tail is efficient—it seeks to near the end rather than reading the entire file.

The **+** syntax for -n and -c counts from the beginning (1-indexed for lines, 0-indexed for bytes). **tail -n +1** outputs the entire file.

# SEE ALSO

[head](/man/head)(1), [less](/man/less)(1), [cat](/man/cat)(1), [multitail](/man/multitail)(1)
