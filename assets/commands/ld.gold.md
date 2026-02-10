# TAGLINE

faster ELF linker

# TLDR

**Link with gold**

```ld.gold -o [output] [file1.o] [file2.o]```

**Link with library**

```ld.gold -o [output] [file.o] -l[library]```

**Use via gcc**

```gcc -fuse-ld=gold -o [output] [file.c]```

**Threaded linking**

```ld.gold --threads -o [output] [files.o]```

**Create shared library**

```ld.gold -shared -o [lib.so] [file.o]```

# SYNOPSIS

**ld.gold** [_options_] _files_

# PARAMETERS

_FILES_
> Object files to link.

**-o** _FILE_
> Output file name.

**-l** _NAME_
> Link with library.

**--threads**
> Enable threading.

**--no-threads**
> Disable threading.

**-shared**
> Create shared object.

**--help**
> Display help information.

# DESCRIPTION

**ld.gold** is a faster ELF linker. It focuses on speed over features compared to standard ld.

The linker supports multi-threading for large projects. It's part of GNU binutils.

# CAVEATS

ELF only. Not all ld features. Part of binutils.

# HISTORY

gold was developed at **Google** and contributed to GNU binutils as a faster alternative to the traditional ld.

# SEE ALSO

[ld](/man/ld)(1), [gcc](/man/gcc)(1), [lld](/man/lld)(1)
