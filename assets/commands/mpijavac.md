# TAGLINE

compiles MPI Java programs

# TLDR

**Compile MPI Java program**

```mpijavac [MPIProgram.java]```

**Compile to specific directory**

```mpijavac -d [classes/] [MPIProgram.java]```

**Compile with classpath**

```mpijavac -cp [lib/*] [MPIProgram.java]```

# SYNOPSIS

**mpijavac** [_options_] _source_files_...

# PARAMETERS

**-d** _dir_
> Output directory for class files.

**-cp** _path_
> Classpath for compilation.

**-sourcepath** _path_
> Source file path.

**--showme**
> Show underlying javac command.

# DESCRIPTION

**mpijavac** compiles MPI Java programs. Wrapper around javac with MPI Java bindings. Used with OpenMPI's Java interface for parallel computing in Java.

# SEE ALSO

[mpirun](/man/mpirun)(1), [javac](/man/javac)(1), [mpicc](/man/mpicc)(1)

