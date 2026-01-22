# TLDR

**Search** package descriptions

```axi-cache search [keyword]```

**Search** package names only

```axi-cache searchpkg [package-name]```

**Show** package details

```axi-cache show [package-name]```

**Search** by file path

```axi-cache searchfile [/usr/bin/command]```

# SYNOPSIS

**axi-cache** _command_ [_options_] _query_

# DESCRIPTION

**axi-cache** is a fast package search tool for Debian-based systems using the apt-xapian-index. It provides quick searching of package names, descriptions, and file contents using a pre-built index.

The tool is significantly faster than apt-cache for full-text searches.

# PARAMETERS

**search** _term_
> Search package names and descriptions

**searchpkg** _term_
> Search package names only

**show** _package_
> Show package information

**searchfile** _path_
> Find package containing file

**more-like-this** _package_
> Find similar packages

**policy** _package_
> Show package policy

# FEATURES

- Indexed full-text search
- File content searching
- Package similarity detection
- Fast query response
- Relevance ranking

# CAVEATS

Requires apt-xapian-index installed and updated. Index must be rebuilt to reflect new packages. Less accurate than apt-file for file searches. Not available on all Debian-based distributions.

# HISTORY

**axi-cache** was developed as part of the apt-xapian-index project by Enrico Zini around **2007** to provide faster package searching using Xapian full-text search engine.

# SEE ALSO

[apt-cache](/man/apt-cache)(1), [apt-file](/man/apt-file)(1), [aptitude](/man/aptitude)(8)
