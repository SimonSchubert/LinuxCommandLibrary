# TLDR

**View current PR**

```gh pr view```

**View specific PR**

```gh pr view [pr-number]```

**Open PR in browser**

```gh pr view --web```

**View as JSON**

```gh pr view --json [title,body,state]```

**View PR comments**

```gh pr view --comments```

# SYNOPSIS

**gh pr view** [_pr-number_] [_options_]

# PARAMETERS

_PR-NUMBER_
> Pull request number (defaults to current branch).

**--web**
> Open in browser instead of terminal.

**--comments**
> Show PR comments.

**--json** _FIELDS_
> Output specific fields as JSON.

**-q** _QUERY_, **--jq** _QUERY_
> Filter JSON output with jq syntax.

**--help**
> Display help information.

# DESCRIPTION

**gh pr view** displays detailed information about a pull request including title, body, state, reviewers, labels, and merge status. It renders markdown content in the terminal.

The command defaults to the pull request for the current branch if no number is specified. JSON output enables scripted access to PR data with optional jq filtering.

gh pr view provides quick PR inspection without leaving the terminal.

# CAVEATS

Markdown rendering is simplified for terminal. Large PRs may be truncated. JSON fields vary by PR state.

# HISTORY

gh pr view is part of **GitHub CLI's** pull request commands, providing terminal-based PR inspection as an alternative to the web interface.

# SEE ALSO

[gh-pr](/man/gh-pr)(1), [gh-pr-checks](/man/gh-pr-checks)(1), [gh-issue](/man/gh-issue)(1)
