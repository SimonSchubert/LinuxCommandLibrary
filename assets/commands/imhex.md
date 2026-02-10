# TAGLINE

feature-rich hex editor designed for reverse engineers and programmers

# TLDR

**Open** a file in ImHex

```imhex [path/to/file]```

**Create** a new empty file

```imhex --new```

Open file and **select** a byte range

```imhex --open [path/to/file] --select [0x100] [0x200]```

Display **file information**

```imhex --file-info [path/to/file]```

Calculate **hash** of a file

```imhex --hash [md5|sha1|sha256|sha512] [path/to/file]```

Generate **hex dump** of a file

```imhex --hexdump [path/to/file]```

# SYNOPSIS

**imhex** [_options_] [_file_]

# PARAMETERS

**--new**
> Create a new empty file

**--open** _FILE_
> Open specified file

**--select** _START_ _END_
> Select byte range (hexadecimal offsets)

**--file-info** _FILE_
> Display file information

**--hash** _ALGORITHM_ _FILE_
> Calculate file hash (md5, sha1, sha224, sha256, sha384, sha512)

**--hexdump** _FILE_
> Generate hexadecimal dump

**--version**
> Display version information

# DESCRIPTION

**ImHex** is a feature-rich hex editor designed for reverse engineers and programmers. It provides advanced analysis tools including a custom pattern language for parsing binary formats, data inspection, hash calculation, and visualization features.

The editor supports multiple data views, bookmark management, and extensibility through plugins. It can handle large files efficiently and includes built-in parsers for common file formats.

# CAVEATS

GUI application, though some features available via command line. Requires significant memory for very large files. Pattern language has a learning curve.

# HISTORY

ImHex was created by WerWolv and first released in **2020**. It was designed as a modern replacement for older hex editors, incorporating features specifically useful for reverse engineering and binary analysis.

# SEE ALSO

[xxd](/man/xxd)(1), [hexdump](/man/hexdump)(1), [radare2](/man/radare2)(1)
