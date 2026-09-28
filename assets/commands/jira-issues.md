# TAGLINE

alias of jira issue for managing Jira issues

# TLDR

**List recent issues** in the configured project

```jira issues list```

**List issues with a JQL query**

```jira issues list -q "[status = Open AND priority = High]"```

**List issues assigned to me**

```jira issues list -a$(jira me)```

**List issues in a status** in another project

```jira issues list -s"[To Do]" -p [PROJECT]```

**Plain tab-separated output** for scripting

```jira issues list --plain --no-headers --columns key,summary,status```

**JSON output**

```jira issues list --raw```

# SYNOPSIS

**jira** **issues** _subcommand_ [_options_]

# PARAMETERS

**-q**, **--jql** _query_
> Filter issues using a JQL query (combined with the project context).

**-a**, **--assignee** _user_
> Filter by assignee (email or display name).

**-s**, **--status** _status_
> Filter by status (repeatable).

**-t**, **--type** _type_
> Filter by issue type.

**-l**, **--label** _label_
> Filter by label (repeatable).

**-p**, **--project** _key_
> Project to look into.

**--order-by** _field_, **--reverse**
> Sort order (default: created, descending).

**--paginate** _from_:_limit_
> Paginate results (max 100 at a time, default 0:100).

**--plain**
> Output a plain table instead of the interactive view.

**--no-headers**
> Omit column headers (with **--plain**).

**--csv**, **--raw**
> Print CSV or raw JSON.

# DESCRIPTION

**jira issues** is an alias of **jira issue** in **jira-cli** (ankitpokhrel/jira-cli). Running it without a subcommand only prints help; use **jira issues list** to list issues. All subcommands of **jira issue** (list, create, view, move, assign, comment and more) work through the alias.

# SEE ALSO

[jira](/man/jira)(1), [jira-issue](/man/jira-issue)(1), [jira-me](/man/jira-me)(1)

# RESOURCES

```[Source code](https://github.com/ankitpokhrel/jira-cli)```

```[Documentation](https://github.com/ankitpokhrel/jira-cli/wiki)```

<!-- verified: 2026-09-29 -->
