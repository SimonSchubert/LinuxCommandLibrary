# TAGLINE

Interactive conflict-handling rebase

# TLDR

**Rebase with conflict resolution**

```git psykorebase [branch]```

**Rebase in merge mode**

```git psykorebase --merge [branch]```

# SYNOPSIS

**git** **psykorebase** [_options_] _branch_

# PARAMETERS

**--merge**
> Use merge mode.

# DESCRIPTION

**git psykorebase** performs a rebase that pauses at conflicts with enhanced guidance for resolution. This git-extras command wraps the standard `git rebase` workflow with more interactive conflict handling and clearer prompts.

The command makes the rebase process more user-friendly, especially for those less familiar with Git's rebase mechanics. It provides better feedback and control at each step of the conflict resolution process.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-extras](/man/git-extras)(1)
