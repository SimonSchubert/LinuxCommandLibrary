# TAGLINE

alias of jira sprint for listing and managing sprints

# TLDR

**List sprints** of the configured board

```jira sprints list```

**List only active and future sprints**

```jira sprints list --state active,future```

**List closed sprints** in a plain table

```jira sprints list --state closed --table --plain```

**Show issues in the current sprint**

```jira sprints list --current```

**Show issues of a specific sprint**

```jira sprints list [SPRINT_ID] --plain```

**Add issues to a sprint**

```jira sprints add [SPRINT_ID] [PROJ-123] [PROJ-124]```

**Close a sprint**

```jira sprints close [SPRINT_ID]```

# SYNOPSIS

**jira sprints** _subcommand_ [_options_]

# PARAMETERS

**list** [_SPRINT_ID_]
> List sprints, or the issues of a sprint.

**add** _SPRINT_ID_ _ISSUE_...
> Add issues to a sprint.

**close** _SPRINT_ID_
> Close (complete) a sprint.

**--state** _STATE_
> Comma-separated sprint states: active, closed, future (default: active,closed).

**--current**, **--prev**, **--next**
> Show issues in the current, previous or next sprint.

**--table**
> Show sprints in a table instead of the explorer view.

**--plain**, **--no-headers**, **--columns** _list_
> Plain text output for scripting.

**-p** _PROJECT_
> Project key.

**--help**
> Display help information.

# DESCRIPTION

**jira sprints** is an alias of **jira sprint** in **jira-cli** (ankitpokhrel/jira-cli). Without a subcommand it only prints help. **list** shows up to 50 sprints of the configured board in an interactive explorer view, with table and plain modes for scripting.

# CAVEATS

Requires a Scrum board configured for the project (set during **jira init**). There is no limit flag; the Jira API returns at most 50 sprints at once.

# SEE ALSO

[jira](/man/jira)(1), [jira-sprint](/man/jira-sprint)(1), [jira-issue](/man/jira-issue)(1), [jira-me](/man/jira-me)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

```[Documentation](https://github.com/ankitpokhrel/jira-cli/wiki)```

<!-- verified: 2026-09-29 -->
