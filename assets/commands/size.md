# TAGLINE

List binary object file section sizes

# TLDR

Display section sizes of an **executable**

```size [path/to/file]```

Display sizes in **octal**

```size -o [path/to/file]```

Display sizes in **decimal**

```size -d [path/to/file]```

Display sizes in **hexadecimal**

```size -x [path/to/file]```

Display **totals** for multiple files

```size -t [path/to/file1] [path/to/file2]```

Use **System V** output format

```size -A [path/to/file]```

# SYNOPSIS

**size** [**-A**|**-B**|**-G**] [**-d**|**-o**|**-x**] [**-t**] [_objfile_...]

# PARAMETERS

**-A, --format=sysv**
> Use System V output format (detailed section listing)

**-B, --format=berkeley**
> Use Berkeley output format (default: text, data, bss, total)

**-G, --format=gnu**
> Use GNU output format

**-d, --radix=10**
> Display sizes in decimal

**-o, --radix=8**
> Display sizes in octal

**-x, --radix=16**
> Display sizes in hexadecimal

**-t, --totals**
> Show aggregate totals for all listed object files

**--common**
> Include common symbols in the bss size

**--target** _bfdname_
> Specify object code format for the file

**-V, --version**
> Display version information

**-h, --help**
> Display help information

# DESCRIPTION

**size** lists the section sizes and total size of binary object files. For each object file, it displays the sizes of the text (code), data, and bss (uninitialized data) sections, along with the total size in bytes and hexadecimal.

The default Berkeley format shows a concise one-line output per file. System V format provides a detailed listing of all sections. If no files are specified, **a.out** is examined by default.

# CAVEATS

Only works on object files and executables in supported formats (ELF, COFF, etc.). Static libraries show sizes for each object module within. Results may vary based on compilation options and linking.

# HISTORY

**size** is part of GNU **binutils**, the collection of binary tools maintained by the Free Software Foundation. The command originated in early Unix systems at Bell Labs in the **1970s** and has been a standard development tool ever since. GNU binutils provides compatible implementations for various platforms.

# SEE ALSO

[objdump](/man/objdump)(1), [readelf](/man/readelf)(1), [nm](/man/nm)(1), [strip](/man/strip)(1)
