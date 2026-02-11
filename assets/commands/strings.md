# TAGLINE

Extract printable text from binary files

# TLDR

**Find printable strings** in a file

```strings [file]```

**Find strings** of minimum length

```strings -n [10] [file]```

**Print filename** with each string

```strings -f [file1] [file2]```

**Print offset** of each string

```strings -t d [file]```

**Print offset in hexadecimal**

```strings -t x [file]```

**Search entire file** (not just data sections)

```strings -a [file]```

**Search for specific encoding**

```strings -e l [file]```

**Scan multiple files**

```strings [*.bin]```

# SYNOPSIS

**strings** [_options_] _file_...

# DESCRIPTION

**strings** finds and prints sequences of printable characters in files, typically binary files. By default, it looks for sequences of at least 4 printable characters followed by an unprintable character.

The tool is commonly used to examine binaries, extract text from executables, find embedded messages, and perform basic forensic analysis. It can reveal version strings, error messages, and other embedded text.

strings ignores the structure of the file and simply scans for character sequences, making it useful when file format isn't known or important.

# PARAMETERS

**-a**, **--all**
> Scan entire file, not just data sections.

**-f**, **--print-file-name**
> Print filename before each string.

**-n** _min_, **--bytes=** _min_
> Minimum string length (default 4).

**-t** _format_, **--radix=** _format_
> Print offset (o=octal, d=decimal, x=hex).

**-e** _encoding_
> Character encoding (s=7-bit, S=8-bit, b/l=16-bit, B/L=32-bit).

**-o**
> Print offset in octal (like -t o).

**-T** _bfdname_, **--target=** _bfdname_
> Specify binary format.

# CAVEATS

Results include any character sequences, not necessarily meaningful text. False positives are common in binary data. Cannot determine context or purpose of found strings. Some strings may be partial or misleading.

# HISTORY

**strings** has been part of Unix since early versions, originating in **Version 6 Unix** at **Bell Labs** in the **1970s**. The GNU version is part of **binutils**. The tool remains essential for binary analysis and is commonly used in security research and reverse engineering.

# SEE ALSO

[file](/man/file)(1), [hexdump](/man/hexdump)(1), [od](/man/od)(1), [xxd](/man/xxd)(1)
