# TAGLINE

Reverse characters in each line

# TLDR

**Reverse** text typed into terminal (interactive mode)

```rev```

**Reverse** the text string "hello"

```echo "hello" | rev```

**Reverse** an entire file and print to stdout

```rev [path/to/file]```

**Use** '\0' as a line separator (zero termination)

```rev -0 [path/to/file]```

# SYNOPSIS

**rev** [_options_] [_file_...]

# PARAMETERS

**-0, --zero**
> Use NUL character as line terminator instead of newline

**-h, --help**
> Display help information

**-V, --version**
> Display version information

# DESCRIPTION

**rev** reverses the order of characters in each line of input. It reads from files specified on the command line or from standard input if no files are given. Each line is reversed independently.

The command is useful for text manipulation, creating palindrome effects, or processing data where character order needs to be inverted.

# CAVEATS

Only reverses characters within individual lines; does not reverse the order of lines themselves. Multi-byte characters may not be handled correctly in all locales. Part of the util-linux package.

# HISTORY

The **rev** command first appeared in Version 7 Unix and has been a standard utility since. It was originally created as a simple text transformation tool.

# SEE ALSO

[tac](/man/tac)(1), [cat](/man/cat)(1), [cut](/man/cut)(1), [tr](/man/tr)(1)
