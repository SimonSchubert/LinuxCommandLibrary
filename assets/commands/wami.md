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

# SYNOPSIS

**wami** [_OPTIONS_] [_SEARCH_...]

# PARAMETERS

**-a, --show-all**
> Show expanded results

**-S, --sort** _ORDER_
> Sort results (asc or desc)

**-s, --search-all**
> Search all categories

**--github**
> Search GitHub

**--list-topics**
> List matching topics

# DESCRIPTION

**wami** is an open-source tool that recommends suitable programs for tasks. It searches a curated database and GitHub to find tools matching specified criteria.

The tool is particularly useful for finding security and pentesting tools but works for general software discovery.

# CAVEATS

Requires internet connection for GitHub searches. Results depend on database coverage. Search quality varies by term specificity.

# SEE ALSO

[apt-cache](/man/apt-cache)(8)
