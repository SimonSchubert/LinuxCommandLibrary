# TAGLINE

Make the same change across many GitHub repositories

# TLDR

**Run a command** in repos matching a query and open PRs

```git-xargs --branch-name [update] --github-org [org] --commit-message "[msg]" -- [make] [format]```

**Target** repos from a file

```git-xargs --repos [repos.txt] --branch-name [chore] --commit-message "[msg]" -- [./script.sh]```

**Dry run**

```git-xargs --dry-run --github-org [org] -- [true]```

# SYNOPSIS

**git-xargs** [*options*] **--** *command* [*args*...]

# DESCRIPTION

**git-xargs** (Gruntwork) clones selected GitHub repositories, runs an arbitrary command in each, and can commit, push, and open pull requests with the results. Built for platform teams applying mechanical refactors or policy files across an organization.

# PARAMETERS

**--github-org** *org* / **--repos** *file* / repo selectors

> Choose target repositories.

**--branch-name** *name*

> Branch for commits/PRs.

**--commit-message** *msg*

> Commit message when changes exist.

**--pr-title** / **--pr-body**

> Pull request fields.

**--dry-run**

> Print actions without modifying remotes.

**--** *command*

> Command executed inside each clone.

Requires GitHub authentication (token with repo scope).

# CAVEATS

Powerful and potentially destructive—test with **--dry-run** and a single repo first. Respect branch protection and CODEOWNERS. Disk and API rate limits matter at org scale.

# SEE ALSO

[multi-gitter](/man/multi-gitter)(1), [gh](/man/gh)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/gruntwork-io/git-xargs)```

<!-- verified: 2026-07-19 -->
