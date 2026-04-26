# TAGLINE

Query and manage files using a SQL-like language

# TLDR

**Find** every text file in a directory

```fmql sql "[SELECT * FROM ~/Documents WHERE extension = 'txt']"```

**Recurse** into subdirectories

```fmql sql "[WITH RECURSIVE SELECT name, size FROM ~/projects WHERE extension = 'rs']"```

**Find** large recently-modified images

```fmql sql "[SELECT * FROM ~/Pictures WHERE (extension = 'jpg' OR extension = 'png') AND size > 1000000 AND modified > '2026-01-01']"```

**Sort** results by size, descending

```fmql sql "[SELECT name, size FROM ~/Downloads ORDER BY size DESC]"```

**Match** filenames with a regular expression

```fmql sql "[SELECT * FROM ~/logs WHERE name REGEXP '^app-[0-9]+\\.log$']"```

**Update** permissions on every shell script under a directory

```fmql sql "[UPDATE ~/scripts SET permissions = '755' WHERE extension = 'sh']"```

# SYNOPSIS

**fmql** **sql** "_QUERY_"

# PARAMETERS

**sql** _QUERY_
> Execute a SQL-like query against the filesystem.

# QUERY LANGUAGE

**SELECT** _columns_ **FROM** _path_ [**WHERE** _condition_] [**ORDER BY** _column_ [ASC|DESC]]
> Match files in _path_ and return selected attributes.

**WITH RECURSIVE SELECT** _columns_ **FROM** _path_ ...
> Same as **SELECT** but descends into subdirectories.

**UPDATE** _path_ **SET** _attribute_ = _value_ **WHERE** _condition_
> Modify file attributes (currently permissions and similar mutable metadata) on every matching file.

# QUERYABLE ATTRIBUTES

**name**
> Filename, including extension.

**extension**
> File extension without the dot.

**size**
> Size in bytes.

**modified**
> Last-modified timestamp; comparable to ISO-8601 date strings.

**permissions**
> Unix permission bits as an octal or symbolic string.

**executable**
> Boolean: whether the file has the executable bit set.

# OPERATORS

```
=    !=    <    >    <=    >=
LIKE        SQL-style wildcard match (% and _)
REGEXP      Regular-expression match
AND   OR   NOT
```

# CAVEATS

**fmql** is a small Rust experiment — its SQL dialect is "sort of" SQL, not a full query engine. Queries that look valid in a real RDBMS may be rejected. Operations are performed serially on the local filesystem, so recursive queries against very large trees can be slow. **UPDATE** modifies real files; test with **SELECT** first and back up before changing permissions in bulk.

# HISTORY

**fmql** was written by **Chris Mann** (**chriswmann**) in **Rust** and published at **github.com/chriswmann/fmql** and on **crates.io** as the **fmql** crate. It was created as a learning exercise around combining SQL parsing with filesystem operations.

# SEE ALSO

[find](/man/find)(1), [fd](/man/fd)(1), [stat](/man/stat)(1), [chmod](/man/chmod)(1), [sqlite3](/man/sqlite3)(1)
