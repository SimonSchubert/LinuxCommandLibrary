# TAGLINE

compiles MPI C++ programs

# TLDR

**Compile an MPI C++ program**

```mpicxx -o [program] [source.cpp]```

**Compile with optimization**

```mpicxx -O3 -o [program] [source.cpp]```

**Show the full underlying compiler command**

```mpicxx --showme```

**Show only compiler flags**

```mpicxx --showme:compile```

**Show only linker flags**

```mpicxx --showme:link```

**Compile and link against an additional library**

```mpicxx -o [program] [source.cpp] -l[library]```

# SYNOPSIS

**mpicxx** [_options_] _source_files_...

# PARAMETERS

**-o** _file_
> Output file name.

**-O** _level_
> Optimization level (0, 1, 2, 3).

**--showme**
> Show the full compiler command that would be invoked without actually compiling.

**--showme:compile**
> Show only the compiler flags added by the MPI wrapper.

**--showme:link**
> Show only the linker flags added by the MPI wrapper.

**--showme:command**
> Show the underlying C++ compiler command.

**--showme:incdirs**
> Show include directories used by the MPI wrapper.

**--showme:libdirs**
> Show library directories used by the MPI wrapper.

**--showme:libs**
> Show library names used for linking.

**--showme:version**
> Show the version of Open MPI.

**-I** _dir_
> Add directory to the include search path.

**-L** _dir_
> Add directory to the library search path.

**-l** _library_
> Link against the specified library.

# DESCRIPTION

**mpicxx** is the Open MPI C++ wrapper compiler. It is not a compiler itself but a convenience wrapper that adds the necessary compiler and linker flags for MPI programs, then invokes the underlying system C++ compiler. It is equivalent to **mpic++**.

The wrapper transparently adds **-I**, **-L**, and **-l** flags required to compile and link against the MPI library. All other flags are passed directly to the underlying C++ compiler. Users can inspect exactly what flags are added using the **--showme** family of options.

Environment variables such as **OMPI_CXX** (Open MPI) or **MPICH_CXX** (MPICH) can override the underlying C++ compiler used by the wrapper.

# SEE ALSO

[mpirun](/man/mpirun)(1), [mpiexec](/man/mpiexec)(1), [mpic++](/man/mpic++)(1), [mpicc](/man/mpicc)(1), [g++](/man/g++)(1)

