# TAGLINE

short form of **pacman --files**, which queries the files database

# TLDR

**Refresh** the files database from the configured mirrors

```sudo pacman -Fy```

**Find which package** owns a given file path

```pacman -F [bin/ls]```

**List all files** installed by a given package

```pacman -Fl [pacman]```

**Search for files** matching a regular expression

```pacman -Fx '[\.so\.1$]'```

**Machine-readable output** suitable for scripts

```pacman -F [pattern] --machinereadable```

# SYNOPSIS

**pacman** **-F** [_options_] [_file_...]

# PARAMETERS

**-y**, **--refresh**
> Download a fresh copy of each repository's **.files** database. Pass twice to force a download even if the local copy looks current.

**-l**, **--list**
> List the files owned by the given package(s).

**-x**, **--regex**
> Treat the query as a POSIX regular expression.

**-q**, **--quiet**
> Show less output (useful for scripting).

**--machinereadable**
> Output results in a tab-separated, script-friendly format.

# DESCRIPTION

**pacman -F** (equivalently **pacman --files**) queries the Arch files database, which maps every file in a package to its owning package. It answers the classic "which package provides **/usr/bin/foo**?" question without having the package installed.

The files database must be downloaded first with **pacman -Fy**. A bare **pacman -F** _pattern_ implicitly performs a filename search, so an explicit **-s** is not required.

# SEE ALSO

[pacman](/man/pacman)(8)
