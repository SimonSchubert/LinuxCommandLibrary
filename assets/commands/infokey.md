# TAGLINE

compile key bindings for GNU Info (removed in Texinfo 6.0)

# TLDR

Compile the **default** key bindings file (Texinfo before 6.0)

```infokey```

Compile a **specific** input file

```infokey [path/to/file]```

Compile to a specific **output** file

```infokey --output [path/to/output] [path/to/input]```

On current Texinfo, load a key bindings file **directly**

```info --init-file [path/to/infokey]```

# SYNOPSIS

**infokey** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input file (default $HOME/.infokey).

**--output** _FILE_
> Write the compiled key file to _FILE_ (default $HOME/.info).

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**infokey** compiled a source file containing custom key bindings and variable settings for the GNU Info reader into a binary format. It read $HOME/.infokey by default and wrote the compiled output to $HOME/.info.

The input file contains sections for defining key sequences and their associated actions. The **#info** section defines key bindings for Info windows, the **#echo-area** section defines bindings for the echo area, and the **#var** section sets Info variables. The same format is still used today, without the compile step.

# CAVEATS

**infokey** no longer exists in current Texinfo. Info now reads the plain text file directly, from **~/.infokey** or **$XDG_CONFIG_HOME/texinfo/infokey** (usually ~/.config/texinfo/infokey), or from the file given with **--init-file**. No compilation is needed.

# HISTORY

infokey was part of the **GNU Texinfo** package and was introduced to allow customization of Info reader key bindings. It was removed in **Texinfo 6.0** (June 2015), when Info gained the ability to read the .infokey source file directly and the **--init-file** option was added.

# SEE ALSO

[info](/man/info)(1)

# RESOURCES

```[Source code](https://cgit.git.savannah.gnu.org/cgit/texinfo.git)```

```[Homepage](https://www.gnu.org/software/texinfo/)```

```[Documentation](https://www.gnu.org/software/texinfo/manual/info-stnd/)```

<!-- verified: 2026-11-09 -->
