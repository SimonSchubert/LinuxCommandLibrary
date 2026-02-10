# TAGLINE

creates and updates the manual page index caches

# TLDR

**Update** man page database

```mandb```

Update **single entry**

```mandb --filename [path/to/file]```

**Create** database from scratch

```mandb --create```

Process **user databases** only

```mandb --user-db```

**Don't purge** obsolete entries

```mandb --no-purge```

**Test** man pages validity

```mandb --test```

# SYNOPSIS

**mandb** [_options_] [_manpath_]

# DESCRIPTION

**mandb** creates and updates the manual page index caches. These caches are used by man and apropos to quickly find manual pages. It scans the manual page directories and builds a database of page names and descriptions.

# PARAMETERS

**--filename FILE**
> Update single file entry

**-c, --create**
> Create database from scratch

**-u, --user-db**
> Process only user databases

**-p, --no-purge**
> Don't purge obsolete entries

**-t, --test**
> Test validity without updating

**-q, --quiet**
> Suppress warnings

**-d, --debug**
> Print debugging information

# CAVEATS

Usually run automatically by package managers. May require root for system-wide databases.

# SEE ALSO

[man](/man/man)(1), [apropos](/man/apropos)(1), [whatis](/man/whatis)(1), [manpath](/man/manpath)(1)
