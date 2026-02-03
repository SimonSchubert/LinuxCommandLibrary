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

**-d** _days_
> Number of days back.

**-a** _author_
> Filter by author (or "all").

**-D** _date_
> Start date.

**-U** _date_
> End date.

**-m** _depth_
> Recursion depth.

# DESCRIPTION

**git standup** shows commits for standup meetings. Part of git-extras. Displays your recent commits across repositories, useful for daily standups.

# SEE ALSO

[git-log](/man/git-log)(1), [git-extras](/man/git-extras)(1)

