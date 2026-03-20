# TAGLINE

Read lines from stdin into a bash array

# TLDR

**Read file into array**

```mapfile [array] < [file.txt]```

**Read with line limit**

```mapfile -n [10] [array] < [file.txt]```

**Skip first N lines**

```mapfile -s [2] [array] < [file.txt]```

**Remove trailing newlines**

```mapfile -t [array] < [file.txt]```

**Use specific delimiter**

```mapfile -d ':' [array] < [file.txt]```

**Read from command**

```mapfile [array] < <(ls)```

# SYNOPSIS

**mapfile** [_options_] [_array_]

# PARAMETERS

_ARRAY_
> Array variable name.

**-n** _COUNT_
> Maximum lines to read.

**-s** _COUNT_
> Lines to skip.

**-t**
> Remove trailing delimiters.

**-d** _DELIM_
> Use delimiter instead of newline (bash 4.4+).

**-O** _ORIGIN_
> Start assigning at array index ORIGIN (default: 0).

**-u** _FD_
> Read from file descriptor FD instead of standard input.

**-C** _CALLBACK_
> Evaluate CALLBACK after reading each quantum of lines.

**-c** _QUANTUM_
> Number of lines between CALLBACK calls (default: 5000).

# DESCRIPTION

**mapfile** (also known as **readarray**) is a bash builtin that reads lines from standard input into an indexed array variable. Without a variable name, it uses the default array `MAPFILE`.

It is significantly faster than a `while read` loop for reading files into arrays, as it is implemented as a builtin rather than running in a subshell.

# CAVEATS

Bash-specific builtin (bash 4.0+). Not available in sh or other POSIX shells. The `-d` option requires bash 4.4 or later. Cannot read from a pipe in a subshell context -- use process substitution (`< <(command)`) instead of piping (`command | mapfile`).

# HISTORY

**mapfile** was added to **Bash 4.0** (released 2009) as a builtin for efficiently reading files into arrays. The `-d` delimiter option was added in **Bash 4.4**.

# SEE ALSO

[read](/man/read)(1), [bash](/man/bash)(1)

