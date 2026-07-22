# TAGLINE

compiles MPI C++ programs

# TLDR

**Compile MPI C++ program**

```mpic++ -o [program] [source.cpp]```

**Compile with optimization**

```mpic++ -O2 -o [program] [source.cpp]```

**Show compiler command**

```mpic++ --showme [source.cpp]```

# SYNOPSIS

**mpic++** [_options_] _source_files_...

# PARAMETERS

**-o** _file_
> Output file name.

**-O** _level_
> Optimization level.

**--showme**
> Show underlying compiler command.

**-I** _dir_
> Include directory.

**-L** _dir_
> Library directory.

**-std=** _standard_
> C++ standard version (c++11, c++14, c++17, c++20).

**-show**
> Print the underlying compiler command line that would be invoked, then exit (MPICH-style).

**--showme:compile** / **--showme:link** / **--showme:command**
> Print only the compile flags, only the link flags, or only the wrapped compiler name (Open MPI).

# DESCRIPTION

**mpic++** is a compiler driver shipped with MPI implementations (Open MPI, MPICH, MVAPICH, Intel MPI) that invokes the underlying system C++ compiler with the include paths, library paths, and link libraries needed to build MPI programs. It is the C++ counterpart to **mpicc** and is typically a symlink or alias to **mpicxx**.

The wrapped compiler can be overridden via the `OMPI_CXX` (Open MPI) or `MPICH_CXX` (MPICH) environment variable, allowing the same wrapper to drive `g++`, `clang++`, `icpx`, etc.

# CAVEATS

The flags injected by the wrapper depend on the MPI implementation; do not rely on `--showme` semantics being identical between Open MPI and MPICH. Mixing object files compiled with different MPI wrappers is unsafe.

# INSTALL

```apk: sudo apk add openmpi-dev```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mpirun](/man/mpirun)(1), [mpicxx](/man/mpicxx)(1), [mpicc](/man/mpicc)(1)

