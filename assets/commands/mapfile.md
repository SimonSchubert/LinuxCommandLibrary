# TAGLINE

Read lines from stdin into a bash array

# TLDR

**Read file into array, removing trailing newlines**

```mapfile -t [array] < [file.txt]```

**Read at most n lines**

```mapfile -t -n [10] [array] < [file.txt]```

**Skip the first n lines**

```mapfile -t -s [2] [array] < [file.txt]```

**Use a specific delimiter**

```mapfile -t -d ':' [array] < [file.txt]```

**Read NUL-separated output**

```mapfile -d '' [array] < <(find [path] -print0)```

**Read from a command**

```mapfile -t [array] < <([command])```

**Append to an existing array**

```mapfile -t -O "${#[array][@]}" [array] < [file.txt]```

# SYNOPSIS

**mapfile** [**-d** _delim_] [**-n** _count_] [**-O** _origin_] [**-s** _count_] [**-t**] [**-u** _fd_] [**-C** _callback_] [**-c** _quantum_] [_array_]

# PARAMETERS

_ARRAY_
> Array variable name (default: MAPFILE).

**-n** _COUNT_
> Copy at most COUNT lines. 0 copies all lines.

**-s** _COUNT_
> Discard the first COUNT lines read.

**-t**
> Remove a trailing delimiter (default newline) from each line.

**-d** _DELIM_
> Use the first character of DELIM to end each line instead of newline. An empty string uses NUL (bash 4.4+).

**-O** _ORIGIN_
> Start assigning at array index ORIGIN (default: 0). Without it, the array is cleared first.

**-u** _FD_
> Read from file descriptor FD instead of standard input.

**-C** _CALLBACK_
> Evaluate CALLBACK after every quantum of lines, passing the next array index and the line.

**-c** _QUANTUM_
> Number of lines between CALLBACK calls (default: 5000).

# DESCRIPTION

**mapfile** (also known as **readarray**) is a bash builtin that reads lines from standard input into an indexed array variable. Without a variable name, it uses the default array `MAPFILE`.

It reads an entire stream in one command, and it is much faster and simpler than appending to an array in a `while read` loop.

# CAVEATS

Bash-specific builtin (bash 4.0+), so not available in POSIX sh or the macOS system bash 3.2. The `-d` option requires bash 4.4 or later. In `command | mapfile`, mapfile runs in a subshell and the array is lost unless `lastpipe` is set; use process substitution (`< <(command)`) instead.

# HISTORY

**mapfile** was added in **Bash 4.0** (released 2009). The `-d` delimiter option was added in **Bash 4.4**.

# SEE ALSO

[read](/man/read)(1), [bash](/man/bash)(1), [declare](/man/declare)(1)

# RESOURCES

```[Source code](https://git.savannah.gnu.org/cgit/bash.git)```

<!-- verified: 2026-11-09 -->
