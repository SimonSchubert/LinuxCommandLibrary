# TLDR

**List all sprints**

```jira sprints -p [PROJECT]```

**List active sprints**

```jira sprints --state active -p [PROJECT]```

**List closed sprints**

```jira sprints --state closed -p [PROJECT]```

**List with limit**

```jira sprints -l [10] -p [PROJECT]```

# SYNOPSIS

**jira sprints** [_options_]

# PARAMETERS

**-p** _PROJECT_
> Project key.

**--state** _STATE_
> Sprint state (active, closed, future).

**-l** _LIMIT_
> Maximum results.

**--plain**
> Plain text output.

**--help**
> Display help information.

# DESCRIPTION

**jira sprints** lists sprints for a Jira project. It shows sprint names, states, and dates.

The command provides an overview of sprint history and planning. It filters by state to focus on relevant sprints.

jira sprints lists project sprints.

# CAVEATS

Subcommand of jira-cli. Requires Scrum board configured. Project permissions needed.

# HISTORY

jira sprints is part of **jira-cli**, providing sprint listing functionality for Agile project management.

# SEE ALSO

[jira](/man/jira)(1), [jira-sprint](/man/jira-sprint)(1), [jira-me](/man/jira-me)(1)
