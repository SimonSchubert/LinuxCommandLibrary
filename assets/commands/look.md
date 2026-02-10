# TAGLINE

uses binary search to find lines beginning with a given prefix in a sorted file

# TLDR

Find lines **starting with prefix**

```look [prefix] [path/to/file]```

Search **case-insensitive** alphanumeric only

```look -f -d [prefix] [path/to/file]```

Specify **termination character**

```look -t [char] [prefix] [path/to/file]```

Search in **dictionary**

```look [prefix]```

Search in **alternative dictionary**

```look -a [prefix]```

# SYNOPSIS

**look** [_options_] _prefix_ [_file_]

# DESCRIPTION

**look** uses binary search to find lines beginning with a given prefix in a sorted file. Without a file argument, it searches the system dictionary (/usr/share/dict/words).

# PARAMETERS

**-f, --ignore-case**
> Case-insensitive search

**-d, --alphanum**
> Only compare alphanumeric characters

**-t, --terminate CHAR**
> Specify string termination character

**-a, --alternative**
> Use alternative dictionary (web2)

# CAVEATS

Requires input file to be sorted. Uses binary search for efficient lookups. Default behavior searches dictionary when no file specified.

# SEE ALSO

[grep](/man/grep)(1), [sort](/man/sort)(1), [spell](/man/spell)(1)
