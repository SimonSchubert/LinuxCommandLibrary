# TAGLINE

manages Jira sprints from the command line

# TLDR

**List sprints for a project**

```jira sprint list -p [PROJECT]```

**View current sprint issues**

```jira sprint list --current -p [PROJECT]```

**View previous sprint issues**

```jira sprint list --prev -p [PROJECT]```

**List future and active sprints**

```jira sprint list --state future,active -p [PROJECT]```

**List issues in a specific sprint as plain text**

```jira sprint list [SPRINT_ID] --plain```

**Add one or more issues to a sprint**

```jira sprint add [SPRINT_ID] [PROJ-123] [PROJ-456]```

**Close a sprint**

```jira sprint close [SPRINT_ID]```

**List current sprint issues assigned to you**

```jira sprint list --current -a$(jira me) -p [PROJECT]```

# SYNOPSIS

**jira sprint** _command_ [_options_]

# PARAMETERS

**list** [_SPRINT_ID_]
> List sprints and sprint issues in an interactive explorer view. With a sprint ID, list that sprint's issues. Aliases: **lists**, **ls**.

**add** _SPRINT_ID_ _ISSUE_...
> Add one or more issues to a sprint. Alias: **assign**.

**close** _SPRINT_ID_
> Close a sprint. Alias: **complete**.

**--current**
> Show issues in the current active sprint.

**--prev**
> Show issues in the previous sprint.

**--next**
> Show issues in the next planned sprint.

**--state** _STATES_
> Filter sprints by state (comma-separated: future, active, closed). Defaults to active,closed.

**--show-all-issues**
> Show sprint issues from all projects.

**-a** _ASSIGNEE_
> Filter issues by assignee.

**-p**, **--project** _PROJECT_
> Project key. Defaults to the project in the jira-cli config file.

**--table**
> Display results in table view instead of explorer view.

**--plain**
> Output plain text (useful for scripting).

**--no-headers**
> Omit column headers (useful with --plain for scripting).

**--columns** _COLUMNS_
> Comma-separated list of columns to display in plain mode.

**--fixed-columns** _N_
> Number of fixed columns in the interactive mode (default 1).

**--no-truncate**
> Show all fields in plain mode.

**--help**
> Display help information.

# DESCRIPTION

**jira sprint** manages Jira sprints from the command line. It lists sprints, views sprint issues, and adds issues to sprints. Results are displayed in an interactive explorer view by default, with optional table and plain text output modes.

The command supports all filtering flags from the issue list command, allowing filtering by assignee, status, priority, and other issue fields within a sprint context.

# CAVEATS

Subcommand of **jira-cli** (ankitpokhrel/jira-cli). Requires a Scrum board configured for the project. Needs appropriate Jira project permissions.

# HISTORY

jira sprint is part of **jira-cli**, an open-source Go-based tool by **Ankit Pokhrel** providing Agile sprint management capabilities from the terminal.

# SEE ALSO

[jira](/man/jira)(1), [jira-issue](/man/jira-issue)(1), [jira-sprints](/man/jira-sprints)(1), [jira-me](/man/jira-me)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

<!-- verified: 2026-11-09 -->
