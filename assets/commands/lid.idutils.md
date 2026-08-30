# TAGLINE

queries an ID database to find tokens matching a specified pattern

# TLDR

Dump **every token** in the database along with where it occurs

```lid```

Show which files use **one identifier**

```lid [token]```

Match **regardless of case**

```lid --ignore-case [token]```

Match any token **containing the text**

```lid --substring [text]```

Match with an **extended regular expression**

```lid --regexp "[pattern]"```

Print results as **grep-style lines**

```lid --result=grep [token]```

Print **only the filenames**

```lid --result=filenames [token]```

Read a database from **another path**

```lid --file [path/to/ID] [token]```

Show identifiers that occur **exactly once**, which often means dead code

```lid --frequency 1```

# SYNOPSIS

**lid** [_options_] [_pattern_]

# PARAMETERS

**-f _filename_**
> Specify which ID database file to read

**-i, --ignore-case**
> Perform case-insensitive pattern matching

**-l, --literal**
> Treat the pattern as a literal string (no regex)

**-r, --regexp**
> Force regular expression pattern matching

**-w, --word**
> Match whole words only (non-substring search)

**-s, --substring**
> Perform substring search

**-k _style_**
> Control output format: token, pattern, or none

**-R, --result _style_**
> Control result type: filenames, grep (show lines), edit (open in editor), or none

**-F, --frequency _range_**
> Match tokens by occurrence frequency (e.g., 1 for tokens appearing once)

# DESCRIPTION

**lid** queries an ID database to find tokens matching a specified pattern. Part of GNU **idutils**, it searches a pre-built token database to quickly locate identifiers across source files.

An ID database must first be built using the **mkid** command. The database indexes all tokens (identifiers, keywords, strings) found in source files, enabling fast lookups without rescanning the entire codebase.

Patterns are interpreted flexibly: if a pattern contains regex metacharacters, lid performs a regex substring search; otherwise it conducts a literal word search. When no pattern is given, all database entries are listed.

# CAVEATS

Requires a pre-built ID database created with **mkid**. The database must be regenerated after source files change to reflect current content. By default, lid searches for a file named **ID** in the current directory or its parents.

# HISTORY

The lid command is part of **GNU idutils**, originally written by Greg McGary. The idutils package has been maintained as part of the GNU project since the early 1990s, providing efficient source code indexing and searching capabilities.

# SEE ALSO

[mkid](/man/mkid)(1), [grep](/man/grep)(1)
