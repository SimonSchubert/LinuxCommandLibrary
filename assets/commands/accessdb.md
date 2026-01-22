# TLDR

**Dump** the man-db database contents

```accessdb```

Dump a **specific** database file

```accessdb [/var/cache/man/index.db]```

Display with **debug** information

```accessdb -d [database_path]```

# SYNOPSIS

**accessdb** [_-d_] [_database_]

# DESCRIPTION

**accessdb** is a utility that dumps the contents of the man-db database to standard output in a human-readable format. The database contains indexed information about manual pages, including their locations, names, descriptions, and timestamps.

This tool is primarily useful for debugging man-db issues, verifying that manual pages are properly indexed, or understanding how the manpage caching system works.

# PARAMETERS

**-d**, **--debug**
> Print debugging information

**database**
> Path to database file (defaults to system man-db location)

# CAVEATS

The database format is specific to man-db and may change between versions. This tool is mainly for debugging; regular users rarely need to interact with the database directly. The database must be built using **mandb** before it can be accessed.

# HISTORY

**accessdb** is part of the **man-db** package, which was originally written by John W. Eaton and later maintained by Colin Watson. The man-db project began in **1994** as a replacement for the older man package, introducing database caching for faster manual page lookups.

# SEE ALSO

[man](/man/man)(1), [mandb](/man/mandb)(8), [whatis](/man/whatis)(1), [apropos](/man/apropos)(1)
