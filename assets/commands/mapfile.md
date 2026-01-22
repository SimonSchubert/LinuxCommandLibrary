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
> Use delimiter instead of newline.

# DESCRIPTION

**mapfile** reads lines into a bash array. It's a bash builtin for array population.

The tool is also known as readarray. It efficiently reads files line by line into arrays.

mapfile reads lines into array.

# CAVEATS

Bash-specific builtin. Not available in sh. Alias is readarray.

# HISTORY

mapfile was added to **Bash 4.0** as a builtin for efficiently reading files into arrays.

# SEE ALSO

[readarray](/man/readarray)(1), [read](/man/read)(1), [bash](/man/bash)(1)

