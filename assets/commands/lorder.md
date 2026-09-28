# TAGLINE

lists dependencies between object files

# TLDR

**List dependency pairs** between object files

```lorder [*.o]```

Sort object files into **link order**

```lorder [*.o] | tsort```

**Create a static library** with members in dependency order

```ar cr [libfoo.a] $(lorder [*.o] | tsort)```

Order **static libraries** for a single-pass link

```cc -o [program] [main.o] $(lorder [liba.a] [libb.a] | tsort)```

Use a **cross-toolchain nm**

```NM=[aarch64-linux-gnu-nm] lorder [*.o]```

# SYNOPSIS

**lorder** _file_ ...

# PARAMETERS

_FILE_
> Object files or library archives to analyze.

# ENVIRONMENT

**NM**
> Path to the nm binary (default **nm**).

**NMFLAGS**
> Extra flags passed to nm.

# DESCRIPTION

**lorder** uses **nm** to determine interdependencies between the object files and library archives given on its command line. It outputs pairs of file names such that the first file in each pair references at least one symbol defined by the second. Every file is also paired with itself so that it appears in the output.

The output is normally piped to **tsort** to find an ordering in which all references can be resolved in a single pass of the linker.

# CAVEATS

Modern linkers and **ranlib** symbol tables make lorder unnecessary; it is kept for legacy build systems. File names containing spaces or newlines are not handled. It ships with the BSDs and macOS but is not part of GNU binutils or util-linux, so most Linux distributions do not include it.

# HISTORY

A **lorder** utility appeared in **Version 7 AT&T UNIX** (1979) and was carried into the BSD systems.

# SEE ALSO

[tsort](/man/tsort)(1), [ar](/man/ar)(1), [nm](/man/nm)(1), [ld](/man/ld)(1), [ranlib](/man/ranlib)(1)

# RESOURCES

```[Source code](https://cgit.freebsd.org/src/tree/usr.bin/lorder)```

```[Documentation](https://man.freebsd.org/cgi/man.cgi?query=lorder)```

<!-- verified: 2026-09-29 -->
