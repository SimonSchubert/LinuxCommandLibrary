# TAGLINE

Show recent commits for standup meetings

# TLDR

**Show recent commits by you**

```git standup```

**Show for specific days**

```git standup -d [3]```

**Show for all authors**

```git standup -a all```

**Show for specific author**

```git standup -a "[author]"```

**Show with date range**

```git standup -D "[2024-01-01]" -U "[2024-01-07]"```

# SYNOPSIS

**git** **standup** [_options_]

# PARAMETERS

**-d** _DAYS_
> Show commits from the past _DAYS_ days (default: _1_, with Monday-aware look-back of 3 days).

**-a** _AUTHOR_
> Limit to a specific author. Pass _all_ for every author.

**-D** _DATE_
> Start of the date range (overrides **-d**).

**-U** _DATE_
> End of the date range.

**-m** _DEPTH_
> Recursively scan directories up to _DEPTH_ levels deep for git repositories.

**-L**
> Toggle inclusion of git diff stat for each commit.

**-B** _BRANCH_
> Restrict to commits on _BRANCH_.

**-f**
> Fetch from the remote before scanning.

**-g**
> Show GPG signature info for each commit.

# DESCRIPTION

**git standup** displays your recent commits, designed for daily standup meetings. Part of git-extras, it shows what you worked on recently and can scan across multiple repositories.

The command defaults to showing your commits from the last working day, making it easy to recall what you accomplished.

# INSTALL

```brew: brew install git-standup```

```nix: nix profile install nixpkgs#git-standup```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-log](/man/git-log)(1), [git-extras](/man/git-extras)(1)
