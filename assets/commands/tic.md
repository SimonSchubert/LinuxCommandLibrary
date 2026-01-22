# TLDR

**Compile** and install terminfo

```tic -xe [terminal] [path/to/terminal.info]```

**Check** terminfo for errors

```tic -c [path/to/terminal.info]```

Print database **locations**

```tic -D```

# SYNOPSIS

**tic** [_OPTIONS_] _FILE_

# PARAMETERS

**-c**
> Check terminfo file for errors without installing

**-x**
> Compile and treat unknown capabilities as user-defined

**-e** _NAMES_
> Compile only specified terminal names

**-D**
> Print database locations

**-o** _DIR_
> Write compiled files to specified directory

**-v** _N_
> Verbose output (0-10)

# DESCRIPTION

**tic** compiles terminfo source files into the binary format used by ncurses and other terminal-handling libraries. The compiled descriptions are installed into the terminfo database where programs can look them up.

Terminfo describes terminal capabilities like cursor movement, color support, and special keys.

# CAVEATS

Installing to system directories requires root privileges. Syntax errors in source files prevent compilation. Use -c to validate before installing.

# HISTORY

**tic** is part of the **ncurses** library, the standard terminal handling library for Unix-like systems. Terminfo replaced the older termcap format for describing terminal capabilities.

# SEE ALSO

[infocmp](/man/infocmp)(1), [toe](/man/toe)(1), [terminfo](/man/terminfo)(5)
