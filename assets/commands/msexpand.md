# TAGLINE

expand Microsoft COMPRESS.EXE compressed files

# TLDR

**Expand a compressed file** (output written to stdout)

```msexpand [file.ex_]```

**Expand a file and save the result**

```msexpand [file.ex_] > [file.exe]```

**Decompress from standard input**

```cat [file.ex_] | msexpand > [file.exe]```

**Expand multiple files**

```msexpand [file1.dl_] [file2.ex_]```

**Print version information**

```msexpand -V```

# SYNOPSIS

**msexpand** [**-h**]

**msexpand** [**-V**]

**msexpand** [_name_...]

# PARAMETERS

_name_
> One or more compressed input files. If omitted, input is read from standard input.

**-h**
> Display a short usage message.

**-V**
> Display version information.

# DESCRIPTION

**msexpand** decompresses files produced by **mscompress**(1) or the Microsoft **COMPRESS.EXE** utility (for example, the `*.??_` files found on Windows 3.x and early Windows 9x installation media).

When invoked without file arguments, msexpand reads compressed data from standard input and writes the decompressed output to standard output. When one or more filenames are supplied, each is decompressed to standard output in order; redirect the output to save the result to a file.

# CAVEATS

Handles only the legacy SZDD/KWAJ single-file compression format. It does not understand Microsoft CAB archives (use **cabextract**(1) for those) or modern ZIP archives. Unlike the original DOS `EXPAND.EXE`, msexpand does not rename the output file automatically.

# HISTORY

Part of the **mscompress** package, developed as a free re-implementation of the Microsoft COMPRESS/EXPAND file format so that legacy Windows installation files can be unpacked on Unix systems.

# SEE ALSO

[cabextract](/man/cabextract)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1)
