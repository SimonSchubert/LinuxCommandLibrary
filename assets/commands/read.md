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

```while IFS= read -r line; do echo "$line"; done < [file]```

# SYNOPSIS

**read** [**-Eers**] [**-a** _array_] [**-d** _delim_] [**-i** _text_] [**-n** _nchars_] [**-N** _nchars_] [**-p** _prompt_] [**-t** _timeout_] [**-u** _fd_] [_name_...]

# PARAMETERS

**-p** _prompt_
> Display prompt string before reading (bash)

**-s**
> Silent mode; do not echo input (for passwords)

**-t** _timeout_
> Fail after the given seconds (fractions allowed), with a status above 128; **0** only tests whether input is available

**-n** _nchars_
> Return after reading specified number of characters, or earlier at the delimiter

**-N** _nchars_
> Read exactly N characters, ignoring delimiters

**-a** _array_
> Read words into array variable

**-d** _delim_
> Use the first character of the delimiter instead of newline; an empty string means NUL

**-r**
> Do not treat backslash as escape character (raw mode)

**-u** _fd_
> Read from file descriptor instead of stdin

**-e**
> Use readline for input (enables line editing)

**-E**
> Use readline with Bash's default and programmable completion

**-i** _text_
> Place text in the readline buffer before editing (with **-e** or **-E**)

# DESCRIPTION

**read** is a shell builtin that reads a line from standard input (or a file descriptor) and splits it into words, assigning them to variables. It is fundamental to interactive shell scripts and processing text files.

Without variable names, input is stored in the **REPLY** variable. With multiple variables, words are assigned in order, with remaining words going to the last variable. Words are split according to the **IFS** (Internal Field Separator) variable.

The **-r** option is recommended for most uses as it prevents backslash interpretation, which can cause unexpected behavior with file paths or special characters.

In **while read** loops, read returns false (exit status 1) at end-of-file, making it ideal for processing files line by line.

# CAVEATS

**read** is a shell builtin with varying options between shells (bash, zsh, dash). Options like **-p**, **-a**, and **-t** are bash extensions not available in POSIX sh.

Without **-r**, backslashes are interpreted as escape characters. Always use **read -r** unless you specifically need escape processing.

Leading and trailing whitespace is stripped based on IFS. To preserve whitespace, set **IFS=** before read: `IFS= read -r line`

The **-t** timeout has no effect when reading from regular files, only from terminals, pipes, and other special files.

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1), [bash](/man/bash)(1), [sh](/man/sh)(1)

# RESOURCES

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html#index-read)```

<!-- verified: 2026-11-08 -->
