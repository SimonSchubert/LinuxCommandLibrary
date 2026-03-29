# TAGLINE

List commits since a date

# TLDR

**Show commits since yesterday**

```git commits-since yesterday```

**Show commits since last week** (default when no date is given)

```git commits-since "last week"```

**Show commits since a specific date**

```git commits-since "[2024-01-01]"```

**Show commits since a relative time**

```git commits-since "2 hours ago"```

# SYNOPSIS

**git** **commits-since** [_date_]

# DESCRIPTION

**git commits-since** is a convenience command from git-extras that displays commits made since a specified date. When invoked without arguments, it defaults to showing commits since "last week".

It accepts natural language date expressions like "yesterday", "last week", "2 hours ago", "3 o clock pm", or specific dates like "2024-01-01". The command wraps git log with appropriate date filtering, providing more readable output than manually constructing git log --since commands.

This is particularly useful for stand-ups, weekly reviews, generating changelogs, or checking what changed since deploying a release.

# SEE ALSO

[git-log](/man/git-log)(1), [git-extras](/man/git-extras)(1)

