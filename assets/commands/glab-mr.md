# TAGLINE

Manage GitLab merge requests from the command line

# TLDR

**List merge requests**

```glab mr list```

**Create merge request**

```glab mr create```

**View merge request**

```glab mr view [number]```

**Checkout merge request**

```glab mr checkout [number]```

**Merge a merge request**

```glab mr merge [number]```

**Approve merge request**

```glab mr approve [number]```

# SYNOPSIS

**glab** **mr** _command_ [_options_]

# SUBCOMMANDS

**list**
> List merge requests.

**create**
> Create merge request.

**view**
> View merge request.

**checkout**
> Checkout MR branch.

**merge**
> Merge a MR.

**approve**
> Approve MR.

**close**
> Close MR.

**reopen**
> Reopen MR.

**diff**
> Show MR diff.

# PARAMETERS

**-t**, **--title** _title_
> MR title.

**-d**, **--description** _text_
> MR description.

**--draft**
> Create as draft.

**-a**, **--assignee** _users_
> Assign users.

# DESCRIPTION

**glab mr** manages GitLab merge requests from the command line. It provides subcommands for creating, viewing, reviewing, approving, and merging MRs without leaving the terminal.

# SEE ALSO

[glab](/man/glab)(1), [glab-mr-create](/man/glab-mr-create)(1)
