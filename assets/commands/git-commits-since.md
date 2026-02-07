# TAGLINE

List commits since a date

# TLDR

**Show commits since yesterday**

```git commits-since yesterday```

**Show commits since last week**

```git commits-since "last week"```

**Show commits since date**

```git commits-since "[2024-01-01]"```

# SYNOPSIS

**git** **commits-since** _date_

# DESCRIPTION

**git commits-since** is a convenience command from git-extras that displays commits made since a specified date. It simplifies the common task of reviewing recent activity by accepting natural language date expressions like "yesterday", "last week", "2 days ago", or specific dates like "2024-01-01".

The command wraps git log with appropriate date filtering, providing more readable output than manually constructing git log --since commands. It shows commit hashes, authors, dates, and messages for all commits in the current branch since the specified time.

This is particularly useful for stand-ups, weekly reviews, generating changelogs, or checking what changed since deploying a release. The natural language date parsing makes it more intuitive than remembering git log's date format syntax.

# SEE ALSO

[git-log](/man/git-log)(1), [git-extras](/man/git-extras)(1)

