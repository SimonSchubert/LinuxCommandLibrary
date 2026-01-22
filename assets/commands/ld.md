# TLDR

**Link object files**

```ld -o [output] [file1.o] [file2.o]```

**Link with library**

```ld -o [output] [file.o] -l[library]```

**Specify library path**

```ld -o [output] [file.o] -L[/path/to/lib] -l[name]```

**Link shared library**

```ld -shared -o [lib.so] [file.o]```

**Entry point**

```ld -e [main] -o [output] [file.o]```

**Verbose linking**

```ld -v -o [output] [file.o]```

# SYNOPSIS

**ld** [_options_] _files_

# PARAMETERS

_FILES_
> Object files to link.

**-o** _FILE_
> Output file name.

**-l** _NAME_
> Link with library.

**-L** _DIR_
> Library search path.

**-shared**
> Create shared library.

**-e** _SYMBOL_
> Entry point symbol.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**ld** is the GNU linker. It combines object files into executables or libraries.

The linker resolves symbols and relocates code. It's typically invoked through gcc rather than directly.

ld links object files.

# CAVEATS

Usually called via gcc. Complex options. Platform-specific.

# HISTORY

ld is the GNU project linker, part of **binutils**, providing linking for the GNU toolchain.

# SEE ALSO

[gcc](/man/gcc)(1), [ld.gold](/man/ld.gold)(1), [ldd](/man/ldd)(1), [nm](/man/nm)(1)
