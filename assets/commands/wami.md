# TAGLINE

Search and recommend software tools

# TLDR

Search **all** categories sorted

```wami -a -S [asc|desc] -s [search_string]```

Search **GitHub** sorted

```wami -a -S desc --github [search_string]```

List **topics**

```wami --list-topics [search_string]```

Search for **pentest** tools

```wami -S desc -s pentest credential default```

Limit the **number of results**

```wami -M [2] -S desc -s [search_string]```

**Update** the local tool database

```wami -u```

# SYNOPSIS

**wami** [_OPTIONS_] [_STRING_...]

# PARAMETERS

**-a, --show-all**
> Show expanded results

**-S, --sort** _ORDER_
> Sort results (asc or desc). Default desc

**-s, --search-all** _TERMS_
> Search all fields

**-n, --search-unique-name** _TERMS_
> Search unique names

**-t, --search-title** _TERMS_
> Search titles

**-T, --search-tags** _TERMS_
> Search tags

**-d, --search-description** _TERMS_
> Search descriptions

**-r, --search-references** _TERMS_
> Search references

**-M, --max** _N_
> Maximum number of listed programs. Default 10

**--github**
> Search GitHub instead of the local database

**--list-topics** _TERMS_
> List matching GitHub topics

**--min-stars** _N_
> Minimum GitHub stars. Default 100

**--max-stars** _N_
> Maximum GitHub stars. Default 0 (no limit)

**--github-fork**
> Include forks in the GitHub search

**-u, --update**
> Update the local database (the lake)

**-o, --offline**
> Skip the online check for an updated database

**-U, --url** _URL_
> Alternative URL for the database download

# DESCRIPTION

**wami** is an open-source tool that recommends suitable programs for tasks. It searches a curated database built from the wami-templates repository, or GitHub, to find tools matching specified criteria.

The tool is particularly useful for finding security and pentesting tools but works for general software discovery.

# CAVEATS

Requires internet connection for GitHub searches. Results depend on database coverage. Search quality varies by term specificity.

# SEE ALSO

[apt-cache](/man/apt-cache)(8)

# RESOURCES

```[Source code](https://github.com/evait-security/wami)```

<!-- verified: 2026-11-09 -->
