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

# DESCRIPTION

**mpic++** compiles MPI C++ programs. Wrapper around system C++ compiler with MPI includes and libraries. Automatically links MPI libraries. Alias for mpicxx.

# SEE ALSO

[mpirun](/man/mpirun)(1), [mpicxx](/man/mpicxx)(1), [mpicc](/man/mpicc)(1)

