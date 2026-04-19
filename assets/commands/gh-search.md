# TAGLINE

Search GitHub for repositories, code, issues, and more

# TLDR

**Search repositories**

```gh search repos [query]```

**Search issues**

```gh search issues [query]```

**Search pull requests**

```gh search prs [query]```

**Search code**

```gh search code [query]```

**Search commits**

```gh search commits [query]```

**Search with filters**

```gh search repos [query] --language [python] --stars "[>100]"```

# SYNOPSIS

**gh** **search** _type_ _query_ [_options_]

# SUBCOMMANDS

**repos**
> Search repositories.

**issues**
> Search issues.

**prs**
> Search pull requests.

**code**
> Search code.

**commits**
> Search commits.

# PARAMETERS

**--language** _lang_
> Filter by programming language (repos, code, issues, prs).

**--stars** _range_
> Filter by star count (repos only; e.g. `>100`).

**--owner** _user_
> Filter by repository owner.

**--repo** _owner/repo_
> Filter by repository (code, issues, prs, commits).

**--topic** _topic_
> Filter on topic (repos).

**--license** _key_
> Filter based on license type (repos).

**--sort** _field_
> Sort fetched results (e.g. stars, forks, updated).

**--order** _asc|desc_
> Order of results (with --sort).

**-L**, **--limit** _num_
> Maximum number of results (default 30).

**--json** _fields_
> Output JSON with the specified fields.

**-w**, **--web**
> Open search results in a browser.

# DESCRIPTION

**gh search** provides command-line access to GitHub's powerful search capabilities across repositories, code, issues, pull requests, and commits. It supports GitHub's full search syntax including qualifiers, filters, and boolean operators.

Repository search enables finding projects by language, stars, topics, and other metadata. Code search indexes file contents across public repositories, useful for finding implementation examples. Issue and PR search support filtering by state, author, labels, and mentions.

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1)
