# TAGLINE

Feature-rich interactive Jira command line tool

# TLDR

**Initialize configuration**

```jira init```

**Create an issue**

```jira issue create```

**List issues** assigned to you

```jira issue list -a$(jira me)```

**View an issue**

```jira issue view [ISSUE-123]```

**Move an issue** to a different status

```jira issue move [ISSUE-123] "[In Progress]"```

**Open an issue** in the browser

```jira open [ISSUE-123]```

**List sprints**

```jira sprint list```

**Add a comment**

```jira issue comment add [ISSUE-123]```

# SYNOPSIS

**jira** _command_ [_options_] [_arguments_]

# DESCRIPTION

**jira-cli** is an interactive command-line tool for **Atlassian Jira** that helps you manage issues, sprints, and projects without leaving the terminal. It supports issue creation, cloning, linking, transitions, comments, sprint management, and an interactive issue search with TUI selection.

The tool uses Jira's REST API and supports both Jira Cloud and Jira Server. Configuration is stored locally with API token authentication.

# PARAMETERS

**init**
> Configure Jira server and authentication

**issue create**
> Create a new issue interactively

**issue list**
> List issues with filters

**issue view** _KEY_
> View issue details

**issue move** _KEY_ _STATUS_
> Transition an issue

**issue comment add** _KEY_
> Add a comment

**sprint list**
> List sprints

**open** _KEY_
> Open issue in browser

**me**
> Print current user

# CAVEATS

Requires a Jira API token for authentication. Some features may not be available on older Jira Server versions. Rate limiting may apply for heavy usage.

# HISTORY

**jira-cli** was created by **Ankit Pokhrel** and is written in **Go**. It was designed as the missing command-line tool for Atlassian Jira, providing a fast and interactive terminal workflow.

# SEE ALSO

[gh](/man/gh)(1)
