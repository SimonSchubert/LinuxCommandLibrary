# TAGLINE

Find files quickly using indexed database

# TLDR

**Find files by name**

```plocate [filename]```

**Case-insensitive search**

```plocate -i [filename]```

**Count matches**

```plocate -c [pattern]```

**Limit results**

```plocate -l [10] [pattern]```

**Use regex pattern**

```plocate --regex "[.*\.pdf$]"```

**Show only existing files**

```plocate -e [pattern]```

**Show database statistics**

```plocate -S```

**Update the database** (as root)

```sudo updatedb```

# SYNOPSIS

**plocate** [_-icle_] [_--regex_] [_-l limit_] [_pattern_]

# PARAMETERS

**-i**, **--ignore-case**
> Case-insensitive matching.

**-c**, **--count**
> Print count of matches.

**-l** _N_, **--limit** _N_
> Limit output to N entries.

**-e**, **--existing**
> Only show existing files.

**-b**, **--basename**
> Match only basename, not full path.

**-w**, **--wholename**
> Match full path (default).

**-r**, **--regex**
> Use POSIX extended regex.

**--regex**
> Pattern is a regular expression.

**-d** _PATH_, **--database** _PATH_
> Use specified database file.

**-0**, **--null**
> Null-terminate output.

**-S**, **--statistics**
> Show database statistics.

**-q**, **--quiet**
> Quiet mode, exit status only.

**-N**, **--literal**
> Match pattern literally.

# DESCRIPTION

**plocate** is a much faster replacement for mlocate, finding files by searching a pre-built database rather than scanning the filesystem in real-time.

The database (updated by updatedb, typically via cron) indexes all filenames on the system. Searches are essentially instant regardless of filesystem size - even with millions of files.

Pattern matching is substring by default: "foo" matches "/path/to/foobar.txt". Use --regex for precise matching or -b to match only the basename. Case sensitivity can be toggled with -i.

The -e option verifies files still exist before displaying, filtering out stale entries from recently deleted files. This adds overhead but ensures accurate results.

plocate uses a more compact database format than mlocate and employs posting lists for fast searching. The same updatedb database works with both tools.

# CONFIGURATION

**/var/lib/plocate/plocate.db**
> Default database file containing the indexed filesystem.

**/etc/updatedb.conf**
> Configuration for updatedb controlling which paths and filesystems to index.

# CAVEATS

Database must be updated regularly to reflect changes. updatedb typically runs daily via cron. New files won't appear until next update. Users can only see files they have permission to access. Database creation can be slow on first run.

# HISTORY

**plocate** was created by **Steinar H. Gunderson** around **2020** as a faster alternative to mlocate. It uses techniques from information retrieval (posting lists, SIMD acceleration) to achieve 10-100x faster searches. Despite being a complete rewrite, it maintains compatibility with mlocate databases.

# SEE ALSO

[locate](/man/locate)(1), [mlocate](/man/mlocate)(1), [updatedb](/man/updatedb)(8), [find](/man/find)(1)
