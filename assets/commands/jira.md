# TAGLINE

Command-line client for Atlassian Jira

# TLDR

**Initialize configuration**

```jira init```

**List recent issues**

```jira issue list```

**List issues** assigned to you that are in progress

```jira issue list -a$(jira me) -s"[In Progress]"```

**Filter issues** by raw JQL within the project

```jira issue list -q "[summary ~ cli]"```

**Print** issues as plain text for scripting

```jira issue list --plain --no-headers```

**Create an issue** interactively

```jira issue create```

**Create an issue** non-interactively

```jira issue create -t[Bug] -s"[Summary]" -b"[Description]" --no-input```

**View an issue**

```jira issue view [PROJ-123]```

**Move an issue** to a status

```jira issue move [PROJ-123] "[In Progress]"```

**Assign an issue** to yourself

```jira issue assign [PROJ-123] $(jira me)```

**Add a comment**

```jira issue comment add [PROJ-123] "[comment body]"```

**List issues** in the current sprint

```jira sprint list --current```

**Open issue in browser**

```jira open [PROJ-123]```

# SYNOPSIS

**jira** _command_ [_subcommand_] [_options_]

# COMMANDS

**init**
> Initialize the configuration file with server URL, login, and default project.

**issue**
> Issue management: create, view, list, edit, assign, move, comment, link, watch, etc.

**project**
> List and inspect projects.

**sprint**
> Manage sprints (Jira Cloud / Software).

**epic**
> Manage epics and their child issues.

**board**
> List boards in a project.

**release**
> List project versions (releases).

**me**
> Show the currently authenticated user.

**open**
> Open an issue in the default web browser.

**completion**
> Generate shell completion scripts.

# PARAMETERS

**-p**, **--project** _key_
> Override the default project key for the current invocation.

**-c**, **--config** _file_
> Path to a config file other than the default.

**--debug**
> Enable verbose debug logging.

**--help**
> Display help information.

# DESCRIPTION

**jira** (jira-cli) is an open-source command-line client for Atlassian Jira Cloud and Data Center. It provides interactive TUI flows for the common workflow operations (create, transition, comment) and JQL-driven listings suitable for piping into shell scripts.

Connection settings are stored in **~/.config/.jira/.config.yml** and the API token is read from **JIRA_API_TOKEN**. The tool supports multiple Jira instances, custom fields, and templates for issue creation.

# CONFIGURATION

**~/.config/.jira/.config.yml**
> Stores server URL, installation type, login, default project, board and custom field metadata.

**JIRA_API_TOKEN**
> API token (Cloud), password (basic auth) or personal access token; can alternatively be supplied via **.netrc** or the system keychain.

**JIRA_AUTH_TYPE**
> Set to **bearer** to authenticate with a personal access token on Data Center/Server.

**JIRA_CONFIG_FILE**
> Alternative configuration file, like **--config**.

# CAVEATS

Requires a Jira account and API token (Atlassian Cloud) or personal access token (Data Center). This is the third-party **jira-cli** tool by **ankitpokhrel**, not an official Atlassian product. Some features (e.g. sprint operations) require Jira Software, not just Jira Core/Work Management.

# HISTORY

**jira-cli** was created by **Ankit Pokhrel** in **2020** to provide a fast, scriptable interface to Jira from the terminal. It is written in **Go**.

# SEE ALSO

[gh](/man/gh)(1), [glab](/man/glab)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

<!-- verified: 2026-11-23 -->
