# TAGLINE

converts terminal descriptions from terminfo format to termcap format

# TLDR

**Convert terminfo to termcap**

```infotocap [terminfo_file]```

**Convert specific entry**

```infotocap -1 [term_name]```

**Output to file**

```infotocap [input] > [output.cap]```

**Verbose mode**

```infotocap -v [terminfo]```

# SYNOPSIS

**infotocap** [_options_] _file_...

# PARAMETERS

_FILE_
> Terminfo source file to convert.

**-1**
> One entry per line.

**-v**
> Verbose output.

**-V**
> Display version.

**-w** _N_
> Set output width.

# DESCRIPTION

**infotocap** converts terminal descriptions from terminfo format to termcap format. It's the reverse of captoinfo.

The tool enables compatibility with older applications requiring termcap. Some capabilities may not translate directly.

# CAVEATS

Some terminfo features lack termcap equivalents. Part of ncurses. Output may need manual adjustment.

# HISTORY

infotocap is part of **ncurses**, providing conversion between terminal description formats.

# SEE ALSO

[captoinfo](/man/captoinfo)(1), [tic](/man/tic)(1), [infocmp](/man/infocmp)(1), [terminfo](/man/terminfo)(5)
