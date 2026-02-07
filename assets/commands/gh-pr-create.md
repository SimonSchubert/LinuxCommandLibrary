# TAGLINE

Create new pull requests on GitHub

# TLDR

**Create PR interactively**

```gh pr create```

**Create with title and body**

```gh pr create -t "[title]" -b "[body]"```

**Create as draft**

```gh pr create --draft -t "[title]"```

**Create with reviewers**

```gh pr create -t "[title]" -r [reviewer1],[reviewer2]```

**Create to specific base branch**

```gh pr create --base [main] --head [feature]```

**Create and fill from commits**

```gh pr create --fill```

**Open in browser to create**

```gh pr create -w```

# SYNOPSIS

**gh** **pr** **create** [_options_]

# PARAMETERS

**-t**, **--title** _title_
> PR title.

**-b**, **--body** _body_
> PR body.

**-d**, **--draft**
> Create as draft.

**-r**, **--reviewer** _users_
> Request reviewers.

**-a**, **--assignee** _users_
> Assign users.

**-l**, **--label** _labels_
> Add labels.

**--base** _branch_
> Base branch.

**--head** _branch_
> Head branch.

**--fill**
> Fill from commits.

**-w**, **--web**
> Open in browser.

**-R**, **--repo** _owner/repo_
> Repository.

# DESCRIPTION

**gh pr create** creates pull requests on GitHub from the command line. It streamlines the PR creation workflow by detecting the current branch context and offering multiple input modes.

When run without arguments, the command prompts interactively for title, body, and metadata. The --fill flag auto-populates the title from the first commit message and the body from all commit messages since branching. Draft PRs (--draft) allow pushing work-in-progress changes for early feedback without formal review requests.

# SEE ALSO

[gh-pr](/man/gh-pr)(1), [gh-pr-list](/man/gh-pr-list)(1)
