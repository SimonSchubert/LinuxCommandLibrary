# TAGLINE

lists all accessible Jira projects

# TLDR

**List all projects**

```jira project list```

**List projects** using the alias form

```jira projects ls```

**List projects** with a specific config file

```jira project list -c [path/to/config.yml]```

**Show debug output** while listing

```jira project list --debug```

# SYNOPSIS

**jira** **project** **list** [_options_]

# PARAMETERS

**list**, **lists**, **ls**
> List Jira projects the user has access to.

**-c**, **--config** _FILE_
> Config file to use. Can also be set with the JIRA_CONFIG_FILE environment variable.

**--debug**
> Turn on debug output.

# DESCRIPTION

**jira projects** is an alias for the `jira project` command group of jira-cli. Its **list** subcommand displays each accessible project as a table with the columns KEY, NAME, TYPE, and LEAD.

# CAVEATS

Running `jira projects` on its own only prints help; the **list** subcommand is required. The command has no output-format flags such as --plain or --json. Requires a configured jira-cli (`jira init`).

# SEE ALSO

[jira](/man/jira)(1), [jira-project](/man/jira-project)(1), [jira-issue](/man/jira-issue)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

<!-- verified: 2026-11-09 -->
