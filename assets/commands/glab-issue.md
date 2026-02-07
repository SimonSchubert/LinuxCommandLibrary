# TAGLINE

Manage GitLab issues from the command line

# TLDR

**List issues**

```glab issue list```

**Create issue**

```glab issue create```

**View issue**

```glab issue view [number]```

**Close issue**

```glab issue close [number]```

**Reopen issue**

```glab issue reopen [number]```

**Create with title**

```glab issue create -t "[title]" -d "[description]"```

# SYNOPSIS

**glab** **issue** _command_ [_options_]

# SUBCOMMANDS

**list**
> List issues.

**create**
> Create an issue.

**view**
> View an issue.

**close**
> Close an issue.

**reopen**
> Reopen an issue.

**note**
> Add comment.

**delete**
> Delete an issue.

# PARAMETERS

**-t**, **--title** _title_
> Issue title.

**-d**, **--description** _text_
> Issue description.

**-l**, **--label** _labels_
> Add labels.

**-a**, **--assignee** _users_
> Assign users.

# DESCRIPTION

**glab issue** manages GitLab issues from the command line. It provides subcommands for creating, viewing, listing, closing, and commenting on issues without leaving the terminal.

# SEE ALSO

[glab](/man/glab)(1), [glab-mr](/man/glab-mr)(1)
