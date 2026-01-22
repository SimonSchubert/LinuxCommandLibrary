# TLDR

**List my issues**

```jira me```

**My issues in project**

```jira me -p [PROJECT]```

**My open issues**

```jira me --status [Open]```

**My issues with limit**

```jira me -l [20]```

**My issues raw output**

```jira me --plain```

# SYNOPSIS

**jira me** [_options_]

# PARAMETERS

**-p** _PROJECT_
> Filter by project.

**--status** _STATUS_
> Filter by status.

**-l** _LIMIT_
> Maximum results.

**--plain**
> Plain text output.

**--help**
> Display help information.

# DESCRIPTION

**jira me** lists issues assigned to the current user. It provides a quick view of personal workload.

The command filters by default to show open issues. Additional filters narrow results by project or status.

jira me shows assigned issues.

# CAVEATS

Subcommand of jira-cli. Requires authentication. May be aliased in config.

# HISTORY

jira me is a convenience command in **jira-cli** for quickly viewing issues assigned to the authenticated user.

# SEE ALSO

[jira](/man/jira)(1), [jira-sprint](/man/jira-sprint)(1), [jira-open](/man/jira-open)(1)
