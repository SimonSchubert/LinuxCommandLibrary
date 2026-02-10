# TAGLINE

searches a prebuilt database to find files matching a pattern, making it much

# TLDR

**Find** files by pattern

```locate "[pattern]"```

Find **case-insensitive**

```locate -i "[pattern]"```

Find by **exact filename**

```locate "*/[filename]"```

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

# CAVEATS

Database is updated periodically, so recently created files may not be found. Run `updatedb` to refresh the database manually.

# SEE ALSO

[find](/man/find)(1), [updatedb](/man/updatedb)(1), [mlocate](/man/mlocate)(1)
