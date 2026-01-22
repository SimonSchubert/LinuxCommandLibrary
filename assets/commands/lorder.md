# TLDR

**Find library dependencies**

```lorder [*.o]```

**Create library order**

```lorder [*.o] | tsort```

**Process specific files**

```lorder [file1.o] [file2.o] [file3.o]```

**Pipe to archive creation**

```ar cr libfoo.a $(lorder [*.o] | tsort)```

# SYNOPSIS

**lorder** _files_

# PARAMETERS

_FILES_
> Object files to analyze.

# DESCRIPTION

**lorder** lists dependencies between object files. It outputs pairs showing which files depend on others.

The output is typically piped to tsort to determine correct ordering for static libraries.

lorder finds object dependencies.

# CAVEATS

BSD utility. May not be available on all systems. Used with tsort and ar.

# HISTORY

lorder is a traditional **BSD** utility for determining the order of object files in static libraries.

# SEE ALSO

[tsort](/man/tsort)(1), [ar](/man/ar)(1), [nm](/man/nm)(1), [ld](/man/ld)(1)

