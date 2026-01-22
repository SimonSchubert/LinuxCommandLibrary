# TLDR

Print **memory map** for a process

```pmap 1234```

Show the **extended format**

```pmap -x 1234```

Show the **device format**

```pmap -d 1234```

Limit results to a **memory address range**

```pmap -A low,high 1234```

Print memory maps for **multiple processes**

```pmap 1234 5678```

Show **all kernel-provided** information

```pmap -XX 1234```

# SYNOPSIS

**pmap** [_options_] _pid_ [...]

# DESCRIPTION

**pmap** reports the memory map of a process or processes. It displays how memory is allocated and used by each process, including mapped files, heap, stack, and shared libraries.

# PARAMETERS

**-x, --extended**
> Display extended format with additional details

**-d, --device**
> Show device format output

**-q, --quiet**
> Suppress header and footer lines

**-A, --range low,high**
> Restrict results to specified address range

**-X**
> Provide additional details beyond -x option

**-XX**
> Display all kernel-provided information

**-p, --show-path**
> Include full file paths in mapping column

**-c, --read-rc**
> Load default configuration

**-C, --read-rc-from file**
> Load configuration from specified file

**-n, --create-rc**
> Generate new default configuration

**-N, --create-rc-to file**
> Generate configuration to specified file

# CAVEATS

Exit status 0 indicates success, 1 indicates failure, and 42 means not all requested processes could be found. Memory values are shown in kilobytes by default.

# HISTORY

**pmap** is part of the **procps-ng** package, providing process filesystem utilities for Linux. It reads information from /proc/[pid]/maps and related files.

# SEE ALSO

[ps](/man/ps)(1), [pgrep](/man/pgrep)(1), [proc](/man/proc)(5)
