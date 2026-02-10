# TAGLINE

opens Jira resources in the default web browser

# TLDR

**Open issue in browser**

```jira open [PROJ-123]```

**Open project board**

```jira open -p [PROJECT]```

**Open current sprint**

```jira open --sprint```

**Open backlog**

```jira open --backlog -p [PROJECT]```

# SYNOPSIS

**jira open** [_options_] [_issue_]

# PARAMETERS

_ISSUE_
> Issue key to open.

**-p** _PROJECT_
> Project to open.

**--sprint**
> Open active sprint.

**--backlog**
> Open backlog.

**--help**
> Display help information.

# DESCRIPTION

**jira open** opens Jira resources in the default web browser. It provides quick access to issues, boards, and backlogs.

The command translates issue keys or project identifiers to web URLs. It's faster than navigating through the web interface.

# CAVEATS

Subcommand of jira-cli. Requires configured server. Uses default browser.

# HISTORY

jira open is a convenience command in **jira-cli** for quickly accessing Jira web interface from terminal.

# SEE ALSO

[jira](/man/jira)(1), [jira-me](/man/jira-me)(1), [open](/man/open)(1)
