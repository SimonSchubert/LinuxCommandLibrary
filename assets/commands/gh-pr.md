# TLDR

**Create a pull request**

```gh pr create```

**List open pull requests**

```gh pr list```

**Check out a PR branch**

```gh pr checkout [pr-number]```

**View PR in browser**

```gh pr view --web```

**Merge a pull request**

```gh pr merge [pr-number]```

# SYNOPSIS

**gh pr** _command_ [_options_]

# PARAMETERS

**create**
> Create a new pull request.

**list**
> List pull requests.

**checkout**
> Check out a PR branch locally.

**view**
> View pull request details.

**merge**
> Merge a pull request.

**close**
> Close a pull request.

**reopen**
> Reopen a pull request.

**ready**
> Mark PR as ready for review.

**checks**
> Show CI status checks.

**review**
> Add a review to a PR.

**--help**
> Display help information.

# DESCRIPTION

**gh pr** manages GitHub pull requests from the command line. It provides full pull request lifecycle management including creation, review, merging, and CI status monitoring.

The command integrates with git workflows, automatically detecting the current branch's pull request context. It supports interactive creation with editor integration and automated creation for scripted workflows.

gh pr enables complete pull request workflows without leaving the terminal.

# CAVEATS

Requires repository write access for most operations. PR creation needs branch pushed to remote. Merge may require approvals or passing checks.

# HISTORY

gh pr is a core command in the **GitHub CLI**, providing the pull request workflows that are central to GitHub's collaboration model.

# SEE ALSO

[gh](/man/gh)(1), [gh-pr-merge](/man/gh-pr-merge)(1), [gh-pr-checks](/man/gh-pr-checks)(1)
