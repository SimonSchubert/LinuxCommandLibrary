# TAGLINE

Display CI check status on pull requests

# TLDR

**View PR checks**

```gh pr checks```

**View specific PR checks**

```gh pr checks [pr-number]```

**Watch checks until complete**

```gh pr checks --watch```

**Fail on check failure**

```gh pr checks --fail-fast```

**Require specific check**

```gh pr checks --required```

# SYNOPSIS

**gh pr checks** [_pr-number_] [_options_]

# PARAMETERS

_PR-NUMBER_
> Pull request number (defaults to current branch).

**--watch**
> Wait and watch for checks to complete.

**--interval** _SECONDS_
> Refresh interval when watching (default 10s).

**--fail-fast**
> Exit immediately if any check fails.

**--required**
> Only show required checks.

**--help**
> Display help information.

# DESCRIPTION

**gh pr checks** displays the status of CI checks and status checks on a pull request. It shows each check's name, status (pending, passing, failing), and conclusion.

The watch mode enables waiting for checks to complete, useful in scripts that need to proceed only after successful CI runs. The command integrates with GitHub Actions and third-party CI services.

# CAVEATS

Only shows checks reported to GitHub. Some CI systems may have delays in reporting. Watch mode subject to API rate limits.

# HISTORY

gh pr checks is part of **GitHub CLI's** pull request commands, reflecting the importance of CI/CD in modern development workflows.

# SEE ALSO

[gh-pr](/man/gh-pr)(1), [gh-pr-merge](/man/gh-pr-merge)(1), [gh-run](/man/gh-run)(1)
