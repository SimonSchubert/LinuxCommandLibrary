# TLDR

**Compile MPI C++ program**

```mpicxx -o [program] [source.cpp]```

**Compile with optimization**

```mpicxx -O3 -o [program] [source.cpp]```

**Show compiler command**

```mpicxx --showme```

# SYNOPSIS

**mpicxx** [_options_] _source_files_...

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

# DESCRIPTION

**mpicxx** compiles MPI C++ programs. Wrapper around system C++ compiler with MPI includes and libraries. Same as mpic++. Part of OpenMPI or MPICH implementations.

# SEE ALSO

[mpirun](/man/mpirun)(1), [mpic++](/man/mpic++)(1), [mpicc](/man/mpicc)(1)

