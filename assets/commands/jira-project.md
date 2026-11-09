# TAGLINE

manages Jira projects from the command line

# TLDR

**List all accessible projects**

```jira project list```

**List projects using a specific configuration file**

```jira project list -c [path/to/config.yml]```

**List projects using the short aliases**

```jira projects ls```

# SYNOPSIS

**jira** **project** **list** [_options_]

# PARAMETERS

**list**, **lists**, **ls**
> List the Jira projects the current user has access to.

**-c**, **--config** _FILE_
> Use the given configuration file.

**--debug**
> Turn on debug output.

# DESCRIPTION

**jira project** manages Jira projects from the command line. Part of **jira-cli** (by ankitpokhrel), it currently offers the **list** subcommand, which prints a table with each project's key, name, type and lead through the configured pager.

The command is also available under the alias **jira projects**.

# CAVEATS

There is no subcommand for viewing a single project; **list** is the only one available. Requires a configured jira-cli (**jira init**).

# SEE ALSO

[jira](/man/jira)(1), [jira-issue](/man/jira-issue)(1), [jira-sprint](/man/jira-sprint)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

<!-- verified: 2026-11-09 -->
