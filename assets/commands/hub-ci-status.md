# TAGLINE

displays the combined CI status for a commit or branch on GitHub

# TLDR

**Show CI status for current branch**

```hub ci-status```

**Show CI status for specific ref**

```hub ci-status [branch-name]```

**Show verbose output**

```hub ci-status -v```

**Format output**

```hub ci-status -f "[%S %U]"```

# SYNOPSIS

**hub** **ci-status** [_options_] [_ref_]

# PARAMETERS

_COMMIT_
> A commit SHA or branch name to check. Defaults to **HEAD**.

**-v**, **--verbose**
> Print a detailed report of all status checks and their URLs, instead of just the combined status.

**-f**, **--format** _FORMAT_
> Pretty-print all status checks using a format string (implies **--verbose**). Supports placeholders: **%U** (check URL), **%S** (check state), **%sC** (color by state), **%t** (check name). See the "PRETTY FORMATS" section of git-log(1) for placeholder syntax.

**--color**[=_WHEN_]
> Enable colored output even when stdout isn't a terminal. _WHEN_ is one of **always**, **never**, or **auto** (default).

# DESCRIPTION

**hub ci-status** displays the combined status of GitHub checks (Actions runs, status checks, etc.) for a commit or branch, without needing to open the repository in a browser.

Exit status reflects the outcome: **0** for success or neutral, **1** for failure, error, action_required, cancelled, or timed_out, and **2** for pending. This makes it convenient to use in scripts and shell prompts.

# CAVEATS

Hub is no longer actively maintained and has been superseded by the official GitHub CLI (**gh**); the closest equivalents are **gh pr checks** or **gh run list**.

# SEE ALSO

[hub](/man/hub)(1), [gh-run](/man/gh-run)(1)

# RESOURCES

```[Source code](https://github.com/mislav/hub)```

<!-- verified: 2026-07-19 -->

