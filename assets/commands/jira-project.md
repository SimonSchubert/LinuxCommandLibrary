# TAGLINE

manages Jira projects from the command line

# TLDR

**List all projects**

```jira project list```

**View project details**

```jira project view [PROJECT_KEY]```

**List projects in plain table format**

```jira project list --plain```

# SYNOPSIS

**jira** **project** _subcommand_ [_options_]

# PARAMETERS

**list**
> List all accessible projects.

**view** _key_
> View project details by key (e.g., PROJ).

**--plain**
> Display output in plain table format without borders.

# DESCRIPTION

**jira project** manages Jira projects from the command line. Part of **jira-cli** (by ankitpokhrel), it allows listing and viewing project information including project keys, names, leads, and project types.

# SEE ALSO

[jira](/man/jira)(1), [jira-issue](/man/jira-issue)(1), [jira-sprint](/man/jira-sprint)(1)

