# TLDR

Compile from **directory**

```zic -d [path/to/directory]```

Compile with **warnings**

```zic -v [path/to/file].infile```

# SYNOPSIS

**zic** [_OPTIONS_] [_FILE..._]

# PARAMETERS

**-d** _DIRECTORY_
> Output directory for compiled files

**-v**
> Report warnings during compilation

**-L** _FILE_
> Leap second file

**-y** _COMMAND_
> Year type command

# DESCRIPTION

**zic** compiles timezone data files into binary format used by the system. It reads text files describing timezone rules and produces the binary files used by localtime and related functions.

This is primarily used for system administration to update timezone data.

# CAVEATS

Requires properly formatted timezone source files. Typically run as root. Incorrect data can break time handling system-wide.

# SEE ALSO

[zdump](/man/zdump)(8), [tzselect](/man/tzselect)(8)
