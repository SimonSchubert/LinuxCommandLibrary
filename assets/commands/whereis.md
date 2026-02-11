# TAGLINE

Locate binary, source, and man page files

# TLDR

Locate **binary, source, and man pages** for SSH

```whereis ssh```

Locate **binary and man pages** only for ls

```whereis -bm ls```

Locate **source** of gcc and **man pages** for Git

```whereis -s gcc -m git```

Locate **binaries** for gcc in /usr/bin/ only

```whereis -b -B /usr/bin/ -f gcc```

Locate **unusual** binaries (more or less than one binary)

```whereis -u *```

Locate binaries with **unusual manual entries**

```whereis -u -m *```

# SYNOPSIS

**whereis** [**-bmsuf**] [**-BMS** _directory_... **-f**] _name_...

# PARAMETERS

**-b**
> Search only for binaries

**-m**
> Search only for manual sections

**-s**
> Search only for sources

**-u**
> Search for unusual entries (commands with more than one binary, or no manual)

**-B** _list_
> Limit binary search to specified directories

**-M** _list_
> Limit manual search to specified directories

**-S** _list_
> Limit source search to specified directories

**-f**
> Terminate directory list (required when using -B, -M, or -S)

**-l**
> Output list of effective search paths

# DESCRIPTION

**whereis** locates the binary, source, and manual page files for a command by searching a set of standard locations. Unlike **which**, it searches predefined directories rather than the PATH variable, and can find source and documentation files.

The command uses hardcoded directory lists that may include /bin, /sbin, /usr/bin, /usr/share/man, /usr/src, and similar system directories. Use **-l** to see the actual search paths on your system.

# CAVEATS

May not find binaries in non-standard locations (use **which** for PATH-based lookup). Source directories are often empty on binary distributions. Results depend on the compiled-in search paths which vary between distributions.

# HISTORY

Originated in **3BSD Unix** (1979) at UC Berkeley. One of the early Berkeley additions to Unix for locating program components. Part of **util-linux** on modern Linux systems.

# SEE ALSO

[which](/man/which)(1), [whatis](/man/whatis)(1), [type](/man/type)(1), [locate](/man/locate)(1)
