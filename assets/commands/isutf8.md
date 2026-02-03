# TLDR

**Check if file is valid UTF-8**

```isutf8 [file]```

**Check multiple files**

```isutf8 [file1] [file2] [file3]```

**Quiet mode (exit code only)**

```isutf8 -q [file]```

**List invalid files only**

```isutf8 -l [files...]```

# SYNOPSIS

**isutf8** [_options_] _file_...

# PARAMETERS

**-q**, **--quiet**
> No output, only exit code.

**-l**, **--list**
> List files that are not valid UTF-8.

**-h**, **--help**
> Show help.

# DESCRIPTION

**isutf8** checks whether files contain valid UTF-8 encoded text. Part of the moreutils package. Returns exit code 0 if valid UTF-8, 1 if invalid. Useful in scripts to validate file encoding before processing.

# SEE ALSO

[file](/man/file)(1), [iconv](/man/iconv)(1)

