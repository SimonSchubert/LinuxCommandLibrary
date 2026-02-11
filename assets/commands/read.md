# TAGLINE

Read a line of input into shell variables

# TLDR

**Read a line** into a variable

```read [variable]```

**Read with a custom prompt**

```read -p "Enter your name: " [name]```

**Read silently** (for passwords)

```read -s -p "Password: " [password]```

**Read with a timeout** (5 seconds)

```read -t 5 [variable]```

**Read a single character** without waiting for Enter

```read -n 1 [char]```

**Read into an array** (words split by IFS)

```read -a [array]```

**Read from a file** line by line

```while read line; do echo "$line"; done < [file]```

# SYNOPSIS

**read** [**-p** _prompt_] [**-t** _timeout_] [**-n** _nchars_] [**-s**] [**-a** _array_] [**-d** _delim_] [_name_...]

# PARAMETERS

**-p** _prompt_
> Display prompt string before reading (bash)

**-s**
> Silent mode; do not echo input (for passwords)

**-t** _timeout_
> Timeout after specified seconds; fail if no input

**-n** _nchars_
> Return after reading specified number of characters

**-N** _nchars_
> Read exactly N characters, ignoring delimiters

**-a** _array_
> Read words into array variable

**-d** _delim_
> Use specified delimiter instead of newline

**-r**
> Do not treat backslash as escape character (raw mode)

**-u** _fd_
> Read from file descriptor instead of stdin

**-e**
> Use readline for input (enables line editing)

# DESCRIPTION

**read** is a shell builtin that reads a line from standard input (or a file descriptor) and splits it into words, assigning them to variables. It is fundamental to interactive shell scripts and processing text files.

Without variable names, input is stored in the **REPLY** variable. With multiple variables, words are assigned in order, with remaining words going to the last variable. Words are split according to the **IFS** (Internal Field Separator) variable.

The **-r** option is recommended for most uses as it prevents backslash interpretation, which can cause unexpected behavior with file paths or special characters.

In **while read** loops, read returns false (exit status 1) at end-of-file, making it ideal for processing files line by line.

# CAVEATS

**read** is a shell builtin with varying options between shells (bash, zsh, dash). Options like **-p**, **-a**, and **-t** are bash extensions not available in POSIX sh.

Without **-r**, backslashes are interpreted as escape characters. Always use **read -r** unless you specifically need escape processing.

Leading and trailing whitespace is stripped based on IFS. To preserve whitespace, set **IFS=** before read: `IFS= read -r line`

The **-t** timeout option may not work in all shells or when reading from regular files (only terminals/pipes).

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1), [bash](/man/bash)(1), [sh](/man/sh)(1)
