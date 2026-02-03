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

**-v**, **--verbose**
> Show detailed status for each check.

**-f**, **--format** _fmt_
> Output format string.

# DESCRIPTION

**hub ci-status** displays the combined CI status for a commit or branch on GitHub. Shows whether checks are pending, passing, or failing. Returns exit code 0 for success, 1 for failure, 2 for pending.

# CAVEATS

Hub is deprecated. Consider using **gh run list** or **gh pr checks** instead.

# SEE ALSO

[hub](/man/hub)(1), [gh-run](/man/gh-run)(1)

