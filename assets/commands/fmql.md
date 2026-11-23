# TAGLINE

Query and manage files using a SQL-like language

# TLDR

**Find** every text file in a directory

```fmql sql "[SELECT * FROM ~/Documents WHERE extension = 'txt']"```

**List the ten biggest files** anywhere under a directory

```fmql sql "[WITH RECURSIVE SELECT size, path FROM ~ WHERE NOT is_directory ORDER BY size DESC LIMIT 10]"```

**Find** large recently-modified images

```fmql sql "[SELECT * FROM ~/Pictures WHERE (extension = 'jpg' OR extension = 'png') AND size > 1000000 AND modified > '2026-01-01']"```

**Summarise** disk usage by extension

```fmql sql "[SELECT extension, COUNT(*), SUM(size) FROM . GROUP BY extension ORDER BY SUM(size) DESC]"```

**Match** filenames with a regular expression

```fmql sql "[SELECT * FROM ~/logs WHERE name REGEXP '^app-[0-9]+\\.log$']"```

**Output** results as JSON

```fmql sql "[SELECT path, owner FROM . WHERE is_executable]" --format json```

**Preview** a permission change without applying it

```fmql sql "[UPDATE ~/scripts SET permissions = '755' WHERE extension = 'sh']" --dry-run```

**Rename** files in bulk

```fmql sql "[UPDATE ~/Pictures SET name = REPLACE(name, '.jpeg', '.jpg') WHERE extension = 'jpeg']"```

**Change ownership** recursively as root

```fmql --sudo sql "[WITH RECURSIVE UPDATE /srv/www SET owner = 'www']"```

# SYNOPSIS

**fmql** [**--sudo**[=_PROGRAM_]] **sql** "_QUERY_" [**-f** _FORMAT_] [**--dry-run**] [**-y**]

# PARAMETERS

**sql** _QUERY_
> Execute a SQL-like query against the filesystem.

**-f**, **--format** **text**|**json**
> Output format: `ls -l` style lines (default) or a JSON array.

**--dry-run**
> For **UPDATE**, list every entry that would change, with new names, owner and permissions, without changing anything.

**-y**, **--yes**
> Run a recursive **UPDATE** as root without asking for confirmation.

**--sudo**[=_PROGRAM_]
> Rerun fmql as root through **sudo**, or another program such as **doas** or **run0**. **~** still refers to the caller's home.

# QUERY LANGUAGE

**SELECT** * | _columns_ **FROM** _path_ [**WHERE** _condition_] [**ORDER BY** _column_ [ASC|DESC], ...] [**LIMIT** _n_]
> Match entries in _path_ and return selected attributes. Without **ORDER BY**, entries are listed by name.

**SELECT** _columns_ **FROM** _path_ [**WHERE** ...] [**GROUP BY** _attribute_, ...]
> Summarise with **COUNT(*)**, **COUNT**, **SUM**, **AVG**, **MIN** and **MAX**. **HAVING** is not supported.

**UPDATE** _path_ **SET** **permissions** = '_octal_', **owner** = '_user_' [**WHERE** _condition_]
> Change permissions, ownership or both on matching entries; rolled back if any change fails.

**UPDATE** _path_ **SET** **name** = _expression_ [**WHERE** _condition_]
> Rename entries in place. Expressions combine strings, **name**, **extension**, **||**, **CONCAT**, **REPLACE**, **LOWER** and **UPPER**.

**WITH RECURSIVE** _statement_
> Prefix any statement to include descendants instead of only immediate children.

# QUERYABLE ATTRIBUTES

**name**, **path**, **extension**, **owner**
> Strings. Extensions may be compared with or without the leading dot; no extension is `''`.

**mode**
> The `ls -l` mode string, e.g. `-rwxr-x---`.

**size**
> Size in bytes.

**permissions**
> Octal permission bits such as `644` (only `=` and `!=`).

**modified**, **created**, **accessed**
> Timestamps, compared with quoted `YYYY-MM-DD` (midnight UTC) or RFC 3339 strings.

**is_directory**, **is_executable**, **is_symlink**
> Booleans; may be used alone, as in `WHERE NOT is_symlink`. **is_executable** tests the owner execute bit.

# OPERATORS

```
=  !=  <>  <  >  <=  >=
[NOT] BETWEEN ... AND ...
[NOT] LIKE     case-insensitive, % and _ wildcards
ILIKE          case-insensitive LIKE
[NOT] REGEXP   case-sensitive regex match
AND  OR  NOT  ( )
```

# CAVEATS

**fmql** is a small experiment and its author warns it is buggy; its SQL dialect is "sort of" SQL. Unsupported constructs such as expressions in the select list, joins, subqueries, **OFFSET** and multiple statements are rejected. An **UPDATE** without **WHERE** changes every entry in scope; use **--dry-run** first. Symbolic links are listed but never followed, and updates skip them. Errors go to stderr with exit code 1. The README itself suggests **fselect** for SQL-style file finding.

# HISTORY

**fmql** was written by **Chris Mann** (**chriswmann**) in **Rust** and published at **github.com/chriswmann/fmql** and on **crates.io** as the **fmql** crate. The repository was created in **2025**; parsing is built on the **sqlparser** crate.

# SEE ALSO

[find](/man/find)(1), [fd](/man/fd)(1), [stat](/man/stat)(1), [chmod](/man/chmod)(1), [chown](/man/chown)(1), [fselect](/man/fselect)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/chriswmann/fmql)```

<!-- verified: 2026-11-23 -->
