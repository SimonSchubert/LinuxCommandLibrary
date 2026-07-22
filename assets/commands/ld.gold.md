# TAGLINE

multi-threaded ELF linker from GNU binutils

# TLDR

**Link object files** directly

```ld.gold -o [output] [file1.o] [file2.o]```

**Link against a system library**

```ld.gold -o [output] [file.o] -l[library]```

**Use gold via gcc**

```gcc -fuse-ld=gold -o [output] [file.c]```

**Build a shared library**

```ld.gold -shared -o [lib.so] [file.o]```

**Cap the number of threads**

```ld.gold --threads --thread-count=[4] -o [output] [*.o]```

**Enable incremental linking**

```ld.gold --incremental -o [output] [*.o]```

# SYNOPSIS

**ld.gold** [_options_] _files_...

# PARAMETERS

_FILES_
> Object files (.o) and archives (.a) to link.

**-o** _FILE_
> Write the linked output to _FILE_.

**-l** _NAME_
> Search for **libNAME.so** or **libNAME.a** in the link path.

**-L** _DIR_
> Add _DIR_ to the library search path.

**-shared**
> Produce a shared object instead of an executable.

**-static**
> Produce a fully statically linked executable.

**--threads**, **--no-threads**
> Enable or disable multi-threaded link stages.

**--thread-count** _N_
> Use _N_ worker threads when **--threads** is on.

**--incremental**
> Re-use a previous link's output for unchanged inputs.

**--gc-sections**
> Discard unreferenced sections from the output.

**-r**, **--relocatable**
> Produce a relocatable object (partial link).

**--help**
> Display help information.

# DESCRIPTION

**ld.gold** (commonly invoked as **gold**) is a high-performance ELF-only linker written for **GNU binutils**. Compared to the traditional **GNU ld** it is significantly faster on large C++ codebases, thanks to parallel processing of input objects, locality-aware symbol resolution, and an internal design tuned for modern multi-core CPUs.

Most projects invoke gold indirectly through the compiler driver with **-fuse-ld=gold**. It accepts the GNU ld command line for the most common options, which makes drop-in adoption straightforward. Specialized features like **--incremental** linking, plugin support (LTO), and DWARF-aware output are exposed through gold-specific options.

# CAVEATS

ELF only: gold cannot produce PE/COFF (Windows) or Mach-O (macOS) outputs. It supports a subset of GNU ld's linker scripts; very intricate scripts may need adjustment. Modern projects often use **LLVM lld** (faster still and cross-platform) instead; gold's upstream development has been deprioritized within binutils.

# HISTORY

Gold was developed at **Google** by **Ian Lance Taylor** to speed up large C++ links and was contributed to GNU binutils in **2008**. It was the default ELF linker on many distributions throughout the 2010s before LLVM's **lld** matured. In **2022** the binutils maintainers placed gold into maintenance mode, recommending lld or new ld features for new work.

# INSTALL

```apt: sudo apt install binutils-gold```

```dnf: sudo dnf install binutils-gold```

```apk: sudo apk add binutils-gold```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ld](/man/ld)(1), [gcc](/man/gcc)(1)
