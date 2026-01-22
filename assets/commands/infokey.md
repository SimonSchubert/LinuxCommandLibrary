# TLDR

**Compile key bindings**

```infokey```

**Compile specific file**

```infokey [~/.infokey]```

**Output to specific file**

```infokey -o [output] [input]```

# SYNOPSIS

**infokey** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input file (default ~/.infokey).

**-o** _FILE_
> Output file (default ~/.info).

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**infokey** compiles custom key bindings for the info reader. It transforms text configuration into binary format.

The input file defines key sequences and their actions. Custom bindings override default info navigation.

infokey compiles info key bindings.

# CAVEATS

Input format specific to info. Binary output not human-readable. Requires info reader.

# HISTORY

infokey is part of the **GNU Texinfo** package, allowing customization of info reader keybindings.

# SEE ALSO

[info](/man/info)(1), [install-info](/man/install-info)(1)
