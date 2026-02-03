# TLDR

**List issues**

```gh issue list```

**Create an issue**

```gh issue create```

**View an issue**

```gh issue view [number]```

**Close an issue**

```gh issue close [number]```

**Reopen an issue**

```gh issue reopen [number]```

**Edit an issue**

```gh issue edit [number]```

**Search issues**

```gh issue list --search "[query]"```

**List your issues**

```gh issue list --assignee @me```

# SYNOPSIS

**gh** **issue** _command_ [_options_]

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

**edit**
> Edit an issue.

**comment**
> Add comment.

**delete**
> Delete an issue.

**status**
> Show status.

# PARAMETERS

**-R**, **--repo** _owner/repo_
> Repository.

**-a**, **--assignee** _user_
> Filter by assignee.

**-l**, **--label** _label_
> Filter by label.

**-s**, **--state** _state_
> Filter by state.

# DESCRIPTION

**gh issue** manages GitHub issues. Create, view, edit, and track issues for bug reports, feature requests, and tasks.

# SEE ALSO

[gh](/man/gh)(1), [gh-pr](/man/gh-pr)(1)

