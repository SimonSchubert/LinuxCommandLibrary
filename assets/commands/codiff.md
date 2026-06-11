# TAGLINE

Diff DWARF debug info between two object files

# TLDR

**Diff two object files** (default: show struct and function changes)

```codiff [old.o] [new.o]```

**Only show struct changes**

```codiff -s [old.o] [new.o]```

**Only show function changes**

```codiff -f [old.o] [new.o]```

**Print terse type changes**

```codiff -t [old.o] [new.o]```

**Verbose output** with full per-symbol detail

```codiff -V [old.o] [new.o]```

**Quiet mode** (exit status only, no output)

```codiff -q [old.o] [new.o]```

# SYNOPSIS

**codiff** [_options_] _OLD_FILE_ _NEW_FILE_

# PARAMETERS

**-s**, **--structs**
> Show diffs of struct/union/class definitions: added, removed, resized, or re-arranged members.

**-f**, **--functions**
> Show diffs of function signatures and prototypes: parameter or return-type changes, additions, removals.

**-t**, **--terse_type_changes**
> Print a compact summary line for each changed type instead of the full breakdown.

**-V**, **--verbose**
> Verbose output: show offsets, sizes, alignment, and per-member changes for each affected type.

**-q**, **--quiet**
> Only set the exit status; suppress all output. Useful for scripts.

**-F** _list_, **--format_path** _list_
> Comma-separated list of debug formats to try in order (e.g. **dwarf**, **ctf**, **btf**).

**--help**
> Print help text and exit.

# DESCRIPTION

**codiff** compares the **DWARF** (or **CTF/BTF**) debugging information embedded in two ELF object files and reports the differences in C-level types, structures, and function prototypes. It is part of the **dwarves** suite alongside **pahole**, **pfunct**, **pglobal**, and **pdwtags**.

The typical use case is verifying the impact of a patch on a kernel module, library, or large binary: a developer compiles the same translation unit before and after a change and runs **codiff** to see which structures grew, which fields moved, and which exported functions had their signatures altered. Because the comparison is structural rather than textual, renames of unrelated symbols and reordering of unrelated declarations are filtered out automatically.

Without **-s** or **-f**, both struct and function diffs are produced. The tool requires the input files to be built with debugging information (**-g** for GCC/Clang).

# CAVEATS

Input files must contain compatible debug information; stripped binaries produce no output. Comparisons across different toolchain or DWARF versions can yield noise. **codiff** is intended for object files (.o) and small libraries — full vmlinux comparisons may take significant time and memory.

# HISTORY

**codiff** was written by **Arnaldo Carvalho de Melo** as part of the **dwarves** project, first released in **2007** to help kernel developers analyse the binary impact of struct-layout changes. The toolset evolved together with **pahole** and is now widely used in the **Linux kernel** workflow, including by **BTF** generation for **eBPF**.

# SEE ALSO

[readelf](/man/readelf)(1), [objdump](/man/objdump)(1)
