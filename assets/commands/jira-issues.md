# TLDR

**List all issues**

```jira issues```

**List issues with JQL query**

```jira issues --jql "[project = PROJ AND status = Open]"```

**List issues assigned to me**

```jira issues --assignee me```

**List issues in JSON format**

```jira issues --plain --no-headers```

# SYNOPSIS

**jira** **issues** [_options_]

# PARAMETERS

**--jql** _query_
> Filter issues using JQL query.

**--assignee** _user_
> Filter by assignee.

**--status** _status_
> Filter by status.

**--project** _key_
> Filter by project.

**--plain**
> Output without formatting.

**--no-headers**
> Omit column headers.

# DESCRIPTION

**jira issues** lists Jira issues from the command line. Part of jira-cli, it supports JQL filtering to find specific issues. An alias for `jira issue list` with convenient defaults for common queries.

# SEE ALSO

[jira](/man/jira)(1), [jira-issue](/man/jira-issue)(1)

