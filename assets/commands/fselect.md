# TLDR

**Find files by** name

```fselect name from [/path] where name = '[*.txt]'```

**Find large files**

```fselect name, size from [/path] where size > [1g]```

**Find by extension**

```fselect name from [/path] where ext = '[jpg]'```

**Find recent files**

```fselect name, modified from [/path] where modified > [yesterday]```

**Show image dimensions**

```fselect name, width, height from [/path] where ext = '[png]'```

# SYNOPSIS

**fselect** _fields_ **from** _paths_ [**where** _conditions_] [_options_]

# PARAMETERS

_FIELDS_
> Columns to output: name, size, modified, ext, width, etc.

_PATHS_
> Directories to search.

_CONDITIONS_
> Filter expressions.

**where**
> Introduce filter conditions.

**order by** _FIELD_
> Sort results.

**limit** _N_
> Limit output count.

**--help**
> Display help information.

# DESCRIPTION

**fselect** uses SQL-like syntax to find and query files. It treats the filesystem as a database, selecting attributes and filtering by conditions using familiar SQL syntax.

The tool extracts metadata including size, dates, permissions, and for images and audio, dimensions and tags. Aggregation functions like count and sum work on results.

fselect bridges the gap between find's power and SQL's readability.

# CAVEATS

Complex queries may be slow on large directories. Some fields require reading file content. SQL syntax has some limitations.

# HISTORY

fselect was created to provide an intuitive query language for file searching. It applies database query concepts to filesystem operations for familiar and powerful searches.

# SEE ALSO

[find](/man/find)(1), [fd](/man/fd)(1), [locate](/man/locate)(1)
