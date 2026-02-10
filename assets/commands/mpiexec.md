# TAGLINE

launches MPI parallel programs

# TLDR

**Run MPI program**

```mpiexec -n [4] [program]```

**Run on hosts**

```mpiexec -n [8] -f [hostfile] [program]```

# SYNOPSIS

**mpiexec** [_options_] _program_ [_args_...]

# PARAMETERS

**-n** _num_
> Number of processes.

**-f** _file_
> Host file.

**-host** _host_
> Run on specific host.

**-env** _var_ _value_
> Set environment variable.

# DESCRIPTION

**mpiexec** launches MPI parallel programs. Standard MPI process launcher. Functionally similar to mpirun with slightly different options.

# SEE ALSO

[mpirun](/man/mpirun)(1), [mpicc](/man/mpicc)(1)

