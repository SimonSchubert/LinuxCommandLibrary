# TAGLINE

searches a prebuilt database to find files matching a pattern

# TLDR

**Find** files by pattern

```locate "[pattern]"```

Find **case-insensitive**

```locate -i "[pattern]"```

Find by **exact filename** (basename only)

```locate -b "\[filename]"```

**Limit** output to a specific number of results

```locate -l [10] "[pattern]"```

**Count** the number of matching entries

```locate -c "[pattern]"```

**Display** database statistics

```locate -S```

**Update** the database

```sudo updatedb```

# SYNOPSIS

**locate** [_options_] _pattern_...

# DESCRIPTION

**locate** searches a prebuilt database to find files matching a pattern, making it much faster than find for simple filename searches. The database is typically updated daily by a cron job.

# PARAMETERS

**-i, --ignore-case**
> Case-insensitive search

**-l, --limit N**
> Limit output to N entries

**-c, --count**
> Print count of matches

**-e, --existing**
> Only print existing files

**-b, --basename**
> Match only basename

**-r, --regexp**
> Use basic regex pattern

**--regex**
> Use extended regex pattern

**-d, --database** _DBPATH_
> Search in specified database instead of the default

**-S, --statistics**
> Print statistics about each database and exit

**-w, --wholename**
> Match against the whole path name (default behavior)

# CAVEATS

Database is updated periodically, so recently created files may not be found. Run `updatedb` to refresh the database manually.

# SEE ALSO

[find](/man/find)(1), [updatedb](/man/updatedb)(1), [mlocate](/man/mlocate)(1), [plocate](/man/plocate)(1)
