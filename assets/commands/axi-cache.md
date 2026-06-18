# TAGLINE

Fast indexed package search for Debian

# TLDR

**Search** package names and descriptions

```axi-cache search [keyword]```

**Show** more results from the last search

```axi-cache more```

Refine the **last search** with extra terms

```axi-cache again [keyword]```

**Show** package details

```axi-cache show [package-name]```

# SYNOPSIS

**axi-cache** [_options_] _command_ [_args_]

# DESCRIPTION

**axi-cache** is a fast package search tool for Debian-based systems using the apt-xapian-index. It provides quick full-text searching of package names and descriptions using a pre-built Xapian index, with relevance ranking and debtags support.

The tool is significantly faster than apt-cache for full-text searches and also wraps several apt-cache front-ends.

# PARAMETERS

**search** _terms_
> Start a new search across package names and descriptions.

**again** _terms_
> Repeat the last search, optionally adding query terms.

**last**
> Show the results of the last search again.

**more** [_count_]
> Show more terms or results from the last search.

**info**
> Print information about the apt-xapian-index environment.

**show** _package_
> Front-end to apt-cache show; display package records.

**showpkg** _package_
> Front-end to apt-cache showpkg.

**depends** _package_
> Front-end to apt-cache depends.

**rdepends** _package_
> Front-end to apt-cache rdepends; show reverse dependencies.

**policy** _package_
> Front-end to apt-cache policy.

**madison** _package_
> Front-end to apt-cache madison.

# FEATURES

- Indexed full-text search
- Debtags-aware filtering
- Relevance ranking
- Fast query response
- apt-cache front-end commands

# CAVEATS

Requires apt-xapian-index installed and updated. The index must be rebuilt (update-apt-xapian-index) to reflect new packages. It does not search file contents; use apt-file for that. Not available on all Debian-based distributions.

# HISTORY

**axi-cache** was developed as part of the apt-xapian-index project by Enrico Zini around **2007** to provide faster package searching using Xapian full-text search engine.

# SEE ALSO

[apt-cache](/man/apt-cache)(1), [apt-file](/man/apt-file)(1), [aptitude](/man/aptitude)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/apt-xapian-index)```

```[Homepage](https://tracker.debian.org/pkg/apt-xapian-index)```

<!-- verified: 2026-06-18 -->
