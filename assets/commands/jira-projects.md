# TAGLINE

lists all accessible Jira projects

# TLDR

**List all projects**

```jira projects```

**List projects in plain format**

```jira projects --plain```

**List with no headers**

```jira projects --no-headers```

**List recently viewed projects**

```jira projects --recent```

# SYNOPSIS

**jira** **projects** [_options_]

# PARAMETERS

**--plain**
> Output without formatting.

**--no-headers**
> Omit column headers.

**--recent**
> List recently viewed projects.

**--paginate**
> Fetch all pages of results.

**--json**
> Generate JSON output.

# DESCRIPTION

**jira projects** lists all accessible Jira projects. Part of jira-cli, it displays project keys, names, and types. An alias for `jira project list` with convenient output options.

# SEE ALSO

[jira](/man/jira)(1), [jira-project](/man/jira-project)(1), [jira-issue](/man/jira-issue)(1)

