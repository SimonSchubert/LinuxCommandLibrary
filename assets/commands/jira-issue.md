# TAGLINE

manages Jira issues from the command line

# TLDR

**List issues**

```jira issue list```

**Create new issue**

```jira issue create```

**View issue details**

```jira issue view [ISSUE-123]```

**Move issue to status**

```jira issue move [ISSUE-123] "[Done]"```

**Assign issue**

```jira issue assign [ISSUE-123] [username]```

# SYNOPSIS

**jira** **issue** _subcommand_ [_options_]

# PARAMETERS

**list**
> List issues matching filters.

**create**
> Create a new issue interactively.

**view** _key_
> View issue details.

**move** _key_ _status_
> Transition issue to new status.

**assign** _key_ _user_
> Assign issue to user.

**comment** _key_
> Add comment to issue.

# DESCRIPTION

**jira issue** manages Jira issues from the command line. Part of jira-cli, it allows creating, viewing, updating, and transitioning issues without using the web interface. Supports filtering, JQL queries, and batch operations.

# SEE ALSO

[jira](/man/jira)(1), [jira-browse](/man/jira-browse)(1), [jira-sprint](/man/jira-sprint)(1)

