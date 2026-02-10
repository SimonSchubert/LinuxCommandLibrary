# TAGLINE

finds files by searching a pre-built database rather than scanning

# TLDR

**Find files by name**

```locate [pattern]```

**Case-insensitive search**

```locate -i [pattern]```

**Update database**

```sudo updatedb```

**Show only existing files**

```locate -e [pattern]```

**Limit results**

```locate -l [10] [pattern]```

**Count matches**

```locate -c [pattern]```

# SYNOPSIS

**locate** [_options_] _pattern_...

# PARAMETERS

**-i**, **--ignore-case**
> Case-insensitive match.

**-l** _n_, **--limit** _n_
> Limit output to n entries.

**-c**, **--count**
> Print count only.

**-e**, **--existing**
> Only existing files.

**-b**, **--basename**
> Match basename only.

**-r**, **--regexp**
> Use regex pattern.

**-d** _path_
> Use specific database.

# DESCRIPTION

**mlocate** (merging locate) finds files by searching a pre-built database rather than scanning the filesystem. This makes searches extremely fast.

The database is typically updated daily by cron, or manually with updatedb.

# DATABASE

```
Default: /var/lib/mlocate/mlocate.db
Config:  /etc/updatedb.conf

# Update database
sudo updatedb
```

# CAVEATS

Database may be outdated. New files won't appear until updatedb runs. Some paths excluded by default. Requires updatedb for fresh results.

# HISTORY

mlocate was created by **Miloslav Trmač** as an improvement over GNU locate, using a more efficient database format that tracks file changes.

# SEE ALSO

[updatedb](/man/updatedb)(8), [find](/man/find)(1), [fd](/man/fd)(1), [plocate](/man/plocate)(1)
