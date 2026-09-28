# TAGLINE

prints the configured Jira user

# TLDR

**Show the configured login**

```jira me```

**List issues assigned to me**

```jira issue list -a$(jira me)```

**My issues in progress**

```jira issue list -a$(jira me) -s"[In Progress]"```

**Assign an issue to myself**

```jira issue assign [PROJ-123] $(jira me)```

**My issues in the current sprint**

```jira sprint list --current -a$(jira me)```

# SYNOPSIS

**jira me** [_options_]

# PARAMETERS

**-c**, **--config** _FILE_
> Read the login from an alternative config file.

**--help**
> Display help information.

# DESCRIPTION

**jira me** prints the login (username or email) stored in the jira-cli configuration. It does not query the server or list issues itself; it is meant for command substitution, so other commands can filter or assign by the current user.

# CAVEATS

Subcommand of **jira-cli** (ankitpokhrel/jira-cli). Prints the **login** value from the config file created by **jira init**, so it returns nothing useful before configuration.

# SEE ALSO

[jira](/man/jira)(1), [jira-issue](/man/jira-issue)(1), [jira-sprint](/man/jira-sprint)(1), [jira-open](/man/jira-open)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

```[Documentation](https://github.com/ankitpokhrel/jira-cli/wiki)```

<!-- verified: 2026-09-29 -->
