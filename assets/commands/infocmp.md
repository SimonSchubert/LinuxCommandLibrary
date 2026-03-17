# TAGLINE

Compare or print out terminfo descriptions

# TLDR

**Show current terminal capabilities**

```infocmp```

**Show a specific terminal type**

```infocmp [xterm-256color]```

**Compare two terminal descriptions** (show differences)

```infocmp -d [xterm] [xterm-256color]```

**Output in terminfo source format** (can be compiled with tic)

```infocmp -I [xterm]```

**Show capabilities one per line**

```infocmp -1 [xterm]```

**Output in termcap format**

```infocmp -C [xterm]```

**Generate relative description** using use= fields

```infocmp -u [xterm-256color] [xterm]```

# SYNOPSIS

**infocmp** [_options_] [_termname_...]

# PARAMETERS

_termname_
> Terminal type(s) to display or compare.

**-d**
> Show differences between two terminal descriptions.

**-c**
> Show common capabilities between two terminals.

**-n**
> Show capabilities common to both, listing those that differ.

**-u**
> Produce a terminfo source relative to other entries using **use=** fields.

**-I**
> Output in terminfo source format.

**-C**
> Output in termcap format.

**-L**
> Use long C variable names in output.

**-1**
> Print one capability per line.

**-r**
> Show resolved paths for terminfo entries.

**-E**
> Dump capabilities as C initializer tables for a TERMTYPE structure.

**-e**
> Dump capabilities as a C initializer for a TERMTYPE structure.

**-F**
> Compare terminfo files, reporting matches and differences between entries.

**-A** _dir_
> Use the specified directory for the first terminal's terminfo database.

**-B** _dir_
> Use the specified directory for the second terminal's terminfo database.

# DESCRIPTION

**infocmp** compares or prints out terminal capability descriptions from the terminfo database. It can rewrite descriptions to use the **use=** field for sharing common capabilities, compare binary entries between different terminal types, and output in several formats including terminfo source and termcap.

The command reads compiled terminfo entries and outputs them in a readable format. It is useful for debugging terminal issues, understanding terminal features, and preparing terminfo source files for compilation with **tic**.

# CAVEATS

Terminfo database location varies by system (commonly **/usr/share/terminfo** or **/usr/lib/terminfo**). Some capabilities may be missing from terminal entries. Modern terminals support many extensions beyond the standard terminfo set. In compare mode (**-d**), only differing capabilities are shown.

# HISTORY

**infocmp** is part of the **ncurses** library, which implements the terminfo database. The terminfo system replaced the older termcap format, providing a more extensible binary format for terminal capabilities.

# SEE ALSO

[tic](/man/tic)(1), [tput](/man/tput)(1), [toe](/man/toe)(1)
