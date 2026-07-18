# TAGLINE

Show contextual GitHub/GitLab info for the current repo

# TLDR

**Show** issues, PRs, and CI for this repository

```gitty```

**Open** in a specific directory

```gitty -p [path/to/repo]```

# SYNOPSIS

**gitty** [*options*]

# DESCRIPTION

**gitty** prints a concise dashboard of remote project context—open issues, pull requests, and pipeline/CI hints—based on the git remote of the current repository. Built by Christian Muehlhaeuser (muesli); pairs well with **gh** for deeper actions.

# PARAMETERS

**-p**, **--path** *dir*

> Repository path (default: current directory).

Other flags control provider tokens and output—see **gitty --help**. Uses **GITHUB_TOKEN** / host config when required for API access.

# CAVEATS

Needs network access and API credentials for private repos. Output depends on remote hosting (GitHub/GitLab support varies by version).

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1), [glab](/man/glab)(1)

# RESOURCES

```[Source code](https://github.com/muesli/gitty)```

<!-- verified: 2026-07-19 -->
