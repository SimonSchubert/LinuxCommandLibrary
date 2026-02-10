# TAGLINE

compiles MPI C programs

# TLDR

**Compile MPI C program**

```mpicc -o [program] [source.c]```

**Compile with optimization**

```mpicc -O2 -o [program] [source.c]```

**Show compiler command**

```mpicc --showme [source.c]```

# SYNOPSIS

**mpicc** [_options_] _source_files_...

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

**mpicc** compiles MPI C programs. Wrapper around system C compiler with MPI includes and libraries. Automatically links MPI libraries.

# SEE ALSO

[mpirun](/man/mpirun)(1), [mpic++](/man/mpic++)(1)

