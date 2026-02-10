# TAGLINE

lists symbols from object files, archives, and executables

# TLDR

**List symbols in object file**

```llvm-nm [file.o]```

**Show only external symbols**

```llvm-nm --extern-only [file.o]```

**Show only undefined symbols**

```llvm-nm --undefined-only [file.o]```

**Show symbol sizes**

```llvm-nm --print-size [file.o]```

**Demangle C++ symbols**

```llvm-nm --demangle [file.o]```

# SYNOPSIS

**llvm-nm** [_options_] [_file_...]

# PARAMETERS

**--extern-only**
> Show only external symbols.

**--undefined-only**
> Show only undefined symbols.

**--defined-only**
> Show only defined symbols.

**--demangle**
> Demangle C++ symbol names.

**--print-size**
> Show symbol sizes.

**--no-sort**
> Don't sort output.

**--numeric-sort**
> Sort by address.

# DESCRIPTION

**llvm-nm** lists symbols from object files, archives, and executables. Drop-in replacement for GNU nm. Shows symbol names, types, and addresses. Useful for debugging linking issues and understanding binary contents.

# SEE ALSO

[nm](/man/nm)(1), [llvm-objdump](/man/llvm-objdump)(1)

