# TAGLINE

outputs the first 10 lines of each FILE to standard output

# TLDR

Display **first 10 lines** of a file

```head path/to/file```

Display first **5 lines** of a file

```head -n 5 path/to/file```

Display first **100 bytes** of a file

```head -c 100 path/to/file```

Display all but the **last 5 lines**

```head -n -5 path/to/file```

Display first lines of **multiple files**

```head path/to/file1 path/to/file2```

Suppress **filename headers**

```head -q path/to/file1 path/to/file2```

# SYNOPSIS

**head** [_OPTION_]... [_FILE_]...

# DESCRIPTION

**head** outputs the first 10 lines of each FILE to standard output. When processing multiple files, it precedes each with a header containing the filename. If no file is specified or when FILE is "-", it reads from standard input.

# PARAMETERS

**-c, --bytes=[-]NUM**
> Print the first NUM bytes of each file; with leading "-", print all but the last NUM bytes

**-n, --lines=[-]NUM**
> Print the first NUM lines instead of 10; with leading "-", print all but the last NUM lines

**-q, --quiet, --silent**
> Never print headers giving filenames

**-v, --verbose**
> Always print headers giving filenames

**-z, --zero-terminated**
> Use NUL as line delimiter instead of newline

# CAVEATS

NUM may have a multiplier suffix: b (512), kB (1000), K (1024), MB (1000*1000), M (1024*1024), and so on for G, T, P, E, Z, Y. Binary prefixes like KiB, MiB are also supported.

# HISTORY

**head** is part of GNU **coreutils**, providing basic file viewing utilities since early Unix systems.

# SEE ALSO

[tail](/man/tail)(1), [cat](/man/cat)(1), [less](/man/less)(1), [more](/man/more)(1)
