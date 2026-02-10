# TAGLINE

manages Jira sprints from the command line

# TLDR

**List sprints**

```jira sprint list -p [PROJECT]```

**View current sprint**

```jira sprint list --current -p [PROJECT]```

**Add issue to sprint**

```jira sprint add [SPRINT_ID] [PROJ-123]```

**View sprint issues**

```jira sprint issues [SPRINT_ID]```

# SYNOPSIS

**jira sprint** _command_ [_options_]

# PARAMETERS

**list**
> List sprints.

**add** _SPRINT_ _ISSUE_
> Add issue to sprint.

**issues** _SPRINT_
> List sprint issues.

**--current**
> Filter to current sprint.

**-p** _PROJECT_
> Project key.

**--help**
> Display help information.

# DESCRIPTION

**jira sprint** manages Jira sprints from the command line. It lists, views, and modifies sprint contents.

The command integrates with Scrum boards. It enables sprint management without the web interface.

# CAVEATS

Subcommand of jira-cli. Requires Scrum board. Needs project permissions.

# HISTORY

jira sprint is part of **jira-cli**, providing Agile sprint management capabilities from the terminal.

# SEE ALSO

[jira](/man/jira)(1), [jira-sprints](/man/jira-sprints)(1), [jira-me](/man/jira-me)(1)
