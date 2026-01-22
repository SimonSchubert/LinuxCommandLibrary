# TLDR

**List issues**

```jira issue list```

**Create issue**

```jira issue create```

**View issue**

```jira issue view [PROJ-123]```

**Move issue**

```jira issue move [PROJ-123] [Done]```

**Assign issue**

```jira issue assign [PROJ-123] [username]```

**Add comment**

```jira issue comment add [PROJ-123]```

# SYNOPSIS

**jira** _command_ [_subcommand_] [_options_]

# PARAMETERS

**issue** _CMD_
> Issue management commands.

**project** _CMD_
> Project commands.

**sprint** _CMD_
> Sprint management.

**init**
> Initialize configuration.

**-p** _PROJECT_
> Project key.

**--help**
> Display help information.

# DESCRIPTION

**jira** is a command-line client for Atlassian Jira. It provides interactive and scriptable access to issues and projects.

The tool supports creating, viewing, and managing issues. It integrates with shell workflows for automation.

jira manages Jira from terminal.

# CAVEATS

Requires Jira account. API token needed. Third-party tool (jira-cli).

# HISTORY

jira-cli was created as an open-source CLI tool for interacting with **Atlassian Jira** from the command line.

# SEE ALSO

[gh](/man/gh)(1), [gitlab](/man/gitlab)(1), [trello](/man/trello)(1)
