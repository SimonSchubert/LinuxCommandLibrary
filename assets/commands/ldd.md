# TAGLINE

prints the shared objects required by each program or shared object

# TLDR

Display **shared library dependencies**

```ldd /path/to/binary```

Display **all information** about dependencies

```ldd -v /path/to/binary```

Display **unused** direct dependencies

```ldd -u /path/to/binary```

Report missing objects and perform **data relocations**

```ldd -d /path/to/binary```

Report missing objects and perform **function relocations**

```ldd -r /path/to/binary```

# SYNOPSIS

**ldd** [_option_]... _file_...

# DESCRIPTION

**ldd** prints the shared objects (shared libraries) required by each program or shared object on the command line. It identifies dependencies and displays their locations along with load addresses.

# PARAMETERS

**-v, --verbose**
> Print all information including symbol versioning

**-u, --unused**
> Print unused direct dependencies

**-d, --data-relocs**
> Perform data relocations and report missing objects (ELF only)

**-r, --function-relocs**
> Perform data and function relocations and report missing objects (ELF only)

**--version**
> Display version information

**--help**
> Display usage information

# CAVEATS

Never run ldd on untrusted executables as it may execute arbitrary code. For untrusted binaries, use: **objdump -p /path/to/program | grep NEEDED**

# HISTORY

**ldd** is part of the GNU C Library (glibc). It works by setting the **LD_TRACE_LOADED_OBJECTS** environment variable and invoking the dynamic linker.

# SEE ALSO

[ld.so](/man/ld.so)(8), [ldconfig](/man/ldconfig)(8), [objdump](/man/objdump)(1), [pldd](/man/pldd)(1)
