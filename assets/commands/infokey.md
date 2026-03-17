# TAGLINE

compile custom key bindings for the GNU Info reader

# TLDR

**Compile the default key bindings file**

```infokey```

**Compile a specific input file**

```infokey [path/to/file]```

**Compile and output to a specific file**

```infokey -o [path/to/output] [path/to/input]```

# SYNOPSIS

**infokey** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input file (default $HOME/.infokey).

**-o** _FILE_
> Output compiled key file (default $HOME/.info).

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**infokey** compiles a source file containing custom key bindings and variable settings for the GNU Info reader into a binary format. It reads $HOME/.infokey by default and writes the compiled output to $HOME/.info.

The input file contains sections for defining key sequences and their associated actions. The **#info** section defines key bindings for Info windows, the **#echo-area** section defines bindings for the echo area, and the **#var** section sets Info variables. Custom bindings override the default Info navigation keys.

# CAVEATS

The input file format is specific to Info and uses a custom syntax. The binary output is not human-readable. Requires the GNU Info reader to use the compiled bindings. In newer versions of Texinfo (6.0+), the infokey command was deprecated and the Info reader can read the .infokey text file directly without compilation.

# HISTORY

infokey is part of the **GNU Texinfo** package. It was introduced to allow customization of Info reader key bindings. In **Texinfo 6.0** (2015), the standalone infokey command was deprecated as the Info reader gained the ability to read the .infokey source file directly.

# SEE ALSO

[info](/man/info)(1)
