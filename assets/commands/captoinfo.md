# TAGLINE

Convert termcap descriptions to terminfo format

# TLDR

**Convert a termcap file** to terminfo format

```captoinfo [path/to/termcap_file]```

**Convert and compile** to terminfo database in one step

```captoinfo [path/to/termcap_file] | tic```

**Convert with verbose output** for debugging

```captoinfo -v [path/to/termcap_file]```

**Output fields one per line** instead of wrapped

```captoinfo -1 [path/to/termcap_file]```

**Convert with extended capabilities** support

```captoinfo -x [path/to/termcap_file]```

**Display version** information

```captoinfo -V```

# SYNOPSIS

**captoinfo** [**-v**_n_] [**-V**] [**-1**] [**-w** _width_] [**-x**] [_file_...]

# PARAMETERS

**-v**_n_
> Print verbose comments and debugging information to standard error. Higher values increase verbosity.

**-V**
> Display the version number of the ncurses library and exit.

**-1**
> Output fields one per line instead of wrapping multiple fields to a maximum width of 60 characters.

**-w** _width_
> Set the maximum output width for wrapped fields.

**-x**
> Enable parsing and emission of extended terminfo capabilities for modern terminal features.

# DESCRIPTION

**captoinfo** converts termcap terminal capability descriptions into the terminfo format. For each termcap entry found in the input file, an equivalent terminfo description is written to standard output.

If no files are specified, captoinfo reads from the file named in the **TERMCAP** environment variable and extracts only the entry for the terminal named in **TERM**. If TERMCAP is not set, it reads from /etc/termcap by default.

The utility is implemented as a link to **tic**(1) with the **-I** option implied. Other tic options like **-1**, **-f**, **-v**, **-w**, and **-x** can be used.

# CAVEATS

Some termcap capabilities may not have direct terminfo equivalents. Complex or non-standard termcap entries may require manual adjustment after conversion. The output is terminfo source format and must be compiled with **tic** to be used by applications.

# HISTORY

The termcap database was the original mechanism for terminal descriptions in Unix, widely used in the 1970s and early 1980s. Its limitations (fixed-size buffer, lack of strong typing) led to terminfo development in the mid-1980s. **captoinfo** was created as part of the ncurses project to facilitate migration from termcap to terminfo, allowing administrators to convert existing terminal definitions rather than rewriting them from scratch.

# SEE ALSO

[tic](/man/tic)(1), [infocmp](/man/infocmp)(1), [infotocap](/man/infotocap)(1), [tput](/man/tput)(1)
