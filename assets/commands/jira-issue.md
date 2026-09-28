# TAGLINE

manages Jira issues from the command line

# TLDR

**List issues** in an interactive table

```jira issue list```

**List issues assigned to you** in a given status

```jira issue list -a$(jira me) -s"[In Progress]"```

**Filter with raw JQL** and print plain output for scripts

```jira issue list -q "[priority = High]" --plain --no-headers```

**Create an issue** without interactive prompts

```jira issue create -t[Bug] -s"[Summary]" -b"[Description]" --no-input```

**View issue details**

```jira issue view [ISSUE-123]```

**Move issue to a status**

```jira issue move [ISSUE-123] "[Done]"```

**Assign issue** to yourself

```jira issue assign [ISSUE-123] $(jira me)```

**Add a comment**

```jira issue comment add [ISSUE-123] "[Comment text]"```

# SYNOPSIS

**jira** **issue** _subcommand_ [_options_]

# PARAMETERS

**list** [_text_]
> List issues matching filters (aliases **ls**, **search**).

**create**
> Create a new issue, interactively or with flags.

**view** _key_
> View issue details (alias **show**).

**edit** _key_
> Edit an issue (aliases **update**, **modify**).

**move** _key_ _state_
> Transition issue to a new state (aliases **transition**, **mv**).

**assign** _key_ _user_
> Assign issue to a user; use **default** for the default assignee or **x** to unassign.

**comment add** _key_ [_body_]
> Add a comment to an issue.

**link** _inward_ _outward_ _type_, **unlink** _inward_ _outward_
> Link or unlink two issues.

**clone** _key_
> Duplicate an issue.

**delete** _key_
> Delete an issue.

**watch** _key_ _user_
> Add a watcher to an issue.

**worklog add** _key_ _time_
> Log time spent on an issue (e.g. "2h 30m").

**-a**, **-r**, **-s**, **-t**, **-y**, **-l**
> List filters: assignee, reporter, status, type, priority, label.

**-q**, **--jql** _query_
> Filter issues with a raw JQL query in the project context.

**--plain**, **--no-headers**, **--columns** _list_, **--csv**, **--raw**
> Output modes for scripting.

**-p**, **--project** _key_
> Override the configured project.

# DESCRIPTION

**jira issue** manages Jira issues from the command line. Part of **jira-cli** (ankitpokhrel/jira-cli), it allows creating, viewing, editing, commenting on and transitioning issues without using the web interface. Lists open in an interactive TUI by default, with plain, CSV and JSON output for scripting. **jira issues** is an alias.

# CAVEATS

Numeric keys are expanded with the configured project (e.g. **123** becomes **PROJ-123**). Assignee names must match exactly. Status names in **move** must match an available transition for the issue.

# SEE ALSO

[jira](/man/jira)(1), [jira-issues](/man/jira-issues)(1), [jira-open](/man/jira-open)(1), [jira-sprint](/man/jira-sprint)(1), [jira-me](/man/jira-me)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

```[Documentation](https://github.com/ankitpokhrel/jira-cli/wiki)```

<!-- verified: 2026-09-29 -->
