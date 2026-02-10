# TAGLINE

searches bibliographic databases

# TLDR

**Search bibliographic databases**

```lkbib [keyword]```

**Search specific database**

```lkbib -p [database] [keyword]```

**Search multiple keywords**

```lkbib [keyword1] [keyword2]```

**Case insensitive search**

```lkbib -i [keyword]```

# SYNOPSIS

**lkbib** [_options_] _keys_

# PARAMETERS

_KEYS_
> Search keywords.

**-p** _DATABASE_
> Bibliographic database file.

**-i**
> Case insensitive search.

**-n** _NUM_
> Maximum number of results.

**--help**
> Display help information.

# DESCRIPTION

**lkbib** searches bibliographic databases. It finds references matching keywords in refer-style databases.

The tool is part of groff and works with refer for formatting citations in documents.

# CAVEATS

Part of groff package. Uses refer database format. Academic use mainly.

# HISTORY

lkbib is part of the **groff** text formatting system, providing bibliography lookup for the refer preprocessor.

# SEE ALSO

[refer](/man/refer)(1), [lookbib](/man/lookbib)(1), [groff](/man/groff)(1)

