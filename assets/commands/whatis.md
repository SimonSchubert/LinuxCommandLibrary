# TLDR

Display a **description** from a man page

```whatis [command]```

Don't **cut the description** off at the end of the line

```whatis -l [command]```

Display descriptions for commands matching a **glob**

```whatis -w net*```

Search man page descriptions with a **regex**

```whatis -r 'wish[0-9]\.[0-9]'```

Display descriptions in a **specific language**

```whatis -L en [command]```

# SYNOPSIS

**whatis** [**-dlv**] [**-r** | **-w**] [**-s** _list_] [**-m** _system_] [**-M** _path_] [**-L** _locale_] _name_...

# PARAMETERS

**-d**, **--debug**
> Enable debug mode

**-l**, **--long**
> Do not trim output to terminal width

**-r**, **--regex**
> Interpret name as a regular expression

**-w**, **--wildcard**
> Interpret name as a shell glob pattern

**-s** _list_, **--sections=**_list_
> Search only specified manual sections

**-m** _system_, **--systems=**_system_
> Search man pages from other systems

**-M** _path_, **--manpath=**_path_
> Set manual page search path

**-L** _locale_, **--locale=**_locale_
> Set locale for searching

**-v**, **--verbose**
> Print verbose warning messages

# DESCRIPTION

**whatis** searches the manual page names and displays brief descriptions from the NAME section of matching man pages. It queries the whatis database, a cache of manual page descriptions built by **mandb**.

The command is useful for quickly determining what a command does without reading the full manual page. Multiple commands can be queried at once, and pattern matching allows searching for groups of related commands.

# CAVEATS

Requires the whatis database to be built (usually done automatically by mandb). Results may be incomplete if the database is out of date. Use **mandb** to rebuild the database if necessary.

# HISTORY

Derived from **BSD Unix** as part of the man page system. The whatis database was introduced to speed up lookups compared to scanning all man pages. On modern systems, **mandb** maintains the database, replacing older **makewhatis** implementations.

# SEE ALSO

[man](/man/man)(1), [apropos](/man/apropos)(1), [whereis](/man/whereis)(1), [mandb](/man/mandb)(8)
