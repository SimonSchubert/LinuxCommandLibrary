# TAGLINE

uses binary search to find lines beginning with a given prefix in a sorted file

# TLDR

Find lines **starting with prefix**

```look [prefix] [path/to/file]```

Search **case-insensitive** alphanumeric only

```look -f -d [prefix] [path/to/file]```

Specify **termination character**

```look -t [char] [prefix] [path/to/file]```

Search in **system dictionary**

```look [prefix]```

# SYNOPSIS

**look** [_options_] _string_ [_file_ ...]

# DESCRIPTION

**look** uses binary search to find lines beginning with a given prefix in a sorted file. Without a file argument, it searches the system dictionary (/usr/share/dict/words), and automatically applies case-insensitive and alphanumeric-only comparison.

# PARAMETERS

**-f, --ignore-case**
> Ignore the case of alphabetic characters

**-d, --alphanum**
> Only compare alphanumeric characters (dictionary order)

**-t, --terminate CHAR**
> Specify a string termination character; only the characters in the prefix up to and including the first occurrence of CHAR are compared

# CAVEATS

Requires input file to be sorted. For correct results, the file must be sorted with LC_COLLATE set to 'C', as look does not compare according to the current locale's collating order. When no file is specified, -f and -d are applied implicitly. Exits 0 if lines were found, 1 if no lines were found, and >1 on error.

# SEE ALSO

[grep](/man/grep)(1), [sort](/man/sort)(1), [spell](/man/spell)(1)
