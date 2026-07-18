# TAGLINE

Run scripted changes across many Git repositories

# TLDR

**Run a script** and open PRs on matching repos

```multi-gitter run [./script.sh] --org [my-org] --branch [chore/update] --pr-title "[title]"```

**Merge** open multi-gitter PRs

```multi-gitter merge --org [my-org]```

**Status** of previous runs

```multi-gitter status --org [my-org]```

**Close** PRs

```multi-gitter close --org [my-org]```

# SYNOPSIS

**multi-gitter** *command* [*options*]

# DESCRIPTION

**multi-gitter** clones many repositories (by org, user, or explicit list), runs a script in each, commits changes, pushes a branch, and opens pull requests. Ideal for fleet-wide dependency bumps, renames, or CI file updates across dozens of repos. Supports GitHub and GitLab with tokens.

# PARAMETERS

**run** *script*

> Execute the script in each repo; create commits/PRs when files change.

**merge** / **close** / **status** / **print**

> Manage resulting pull requests.

**--org** / **--user** / **--repo**

> Repository selection.

**--branch** / **--pr-title** / **--pr-body**

> PR metadata.

**--dry-run**

> Preview without pushing.

Auth via **GITHUB_TOKEN** or provider flags—see **multi-gitter --help**.

# CAVEATS

Scripts run with your credentials; audit them carefully. Rate limits and branch protection can block merges. Clone disk usage grows with org size.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1), [git-xargs](/man/git-xargs)(1)

# RESOURCES

```[Source code](https://github.com/lindell/multi-gitter)```

<!-- verified: 2026-07-19 -->
