# TAGLINE

Dump TeX Live package database

# TLDR

**Dump local database**

```tlmgr dump-tlpdb --local```

**Dump remote database**

```tlmgr dump-tlpdb --remote```

**Output in JSON**

```tlmgr dump-tlpdb --local --json```

**Dump the database of a specific repository**

```tlmgr --repository [url] dump-tlpdb --remote```

# SYNOPSIS

**tlmgr dump-tlpdb** **--local**|**--remote** [**--json**]

# PARAMETERS

**--local**
> Dump local installation database.

**--remote**
> Dump remote repository database.

**--json**
> Output in JSON format.

# DESCRIPTION

**tlmgr dump-tlpdb** writes the complete TeX Live package database (TLPDB) to standard output. Useful for scripting, debugging, and comparing installations. Part of TeX Live Manager.

Exactly one of **--local** and **--remote** must be given. The first line of the output is the field name **location-url**, a tab, and the location of the repository.

# SEE ALSO

[tlmgr-info](/man/tlmgr-info)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
