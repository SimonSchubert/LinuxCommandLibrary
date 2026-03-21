# TAGLINE

Open various Jira views in your web browser

# TLDR

**Navigate to the project page**

```jira navigate --project [PROJECT_KEY]```

**Navigate to the active sprint board**

```jira navigate --board```

**Navigate to the backlog view**

```jira navigate --backlog```

# SYNOPSIS

**jira** **navigate** [_options_]

# PARAMETERS

**--project** _key_
> Navigate to the project summary page for the given project key.

**--board**
> Open the active sprint board for the current project.

**--backlog**
> Open the backlog view for the current project.

# DESCRIPTION

**jira navigate** opens various Jira views in your default web browser. Part of **jira-cli** (by Ankit Pokhrel), it provides quick access to boards, backlogs, and project pages without manually constructing URLs. The project defaults to the one configured in your jira-cli settings.

# SEE ALSO

[jira](/man/jira)(1), [jira-open](/man/jira-open)(1), [jira-sprint](/man/jira-sprint)(1)

