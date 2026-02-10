# TAGLINE

GCC wrapper that compiles programs against musl libc instead of glibc

# TLDR

**Compile program with musl libc**

```musl-gcc -o [program] [source.c]```

**Compile static binary**

```musl-gcc -static -o [program] [source.c]```

**Compile with optimization**

```musl-gcc -O2 -o [program] [source.c]```

# SYNOPSIS

**musl-gcc** [_options_] _source_files_...

# PARAMETERS

**-o** _file_
> Output file name.

**-static**
> Create statically linked binary.

**-O** _level_
> Optimization level.

**-specs** _file_
> Use custom specs file.

# DESCRIPTION

**musl-gcc** is a GCC wrapper that compiles programs against musl libc instead of glibc. Musl is a lightweight C standard library designed for static linking and embedded systems. Creates smaller, portable binaries suitable for containers and minimal environments.

# SEE ALSO

[gcc](/man/gcc)(1), [clang](/man/clang)(1)

