# TAGLINE

Search manual page descriptions by keyword

# TLDR

**Search** man pages by keyword

```apropos [keyword]```

Search with **exact match**

```apropos -e [keyword]```

Search in **specific sections**

```apropos -s [1,8] [keyword]```

Search with **regex**

```apropos -r "[network.*config]"```

Show **long descriptions**

```apropos -l [keyword]```

# SYNOPSIS

**apropos** [_-e_] [_-r_] [_-s sections_] [_-l_] _keyword_

# DESCRIPTION

**apropos** searches the manual page names and short descriptions for keywords, helping you find relevant commands when you don't know the exact name.

The search queries the whatis database built by mandb. Multiple keywords are OR'd together; use regex for AND behavior.

# PARAMETERS

**-e**, **--exact**
> Search for exact keyword match

**-r**, **--regex**
> Interpret keyword as regular expression

**-w**, **--wildcard**
> Interpret keyword as shell wildcard

**-s** _list_, **--sections** _list_
> Search only specified manual sections

**-l**, **--long**
> Don't truncate output lines

**-a**, **--and**
> Require all keywords to match

# CAVEATS

Results depend on the whatis database being up to date. Run **mandb** to update if new packages were installed. Some man pages may have poor descriptions.

# HISTORY

**apropos** has been part of Unix systems since early versions, helping users discover relevant commands. It's equivalent to **man -k**.

# SEE ALSO

[man](/man/man)(1), [whatis](/man/whatis)(1), [mandb](/man/mandb)(8)
