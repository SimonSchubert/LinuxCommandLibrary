# TLDR

**Create MR interactively**

```glab mr create```

**Create with title**

```glab mr create -t "[title]"```

**Create as draft**

```glab mr create --draft -t "[title]"```

**Create with reviewers**

```glab mr create -t "[title]" --reviewer [user1],[user2]```

**Create to specific branch**

```glab mr create --target-branch [main]```

**Fill from commits**

```glab mr create --fill```

# SYNOPSIS

**glab** **mr** **create** [_options_]

# PARAMETERS

**-t**, **--title** _title_
> MR title.

**-d**, **--description** _text_
> MR description.

**--draft**
> Create as draft.

**-a**, **--assignee** _users_
> Assign users.

**--reviewer** _users_
> Request reviewers.

**--target-branch** _branch_
> Target branch.

**--source-branch** _branch_
> Source branch.

**--fill**
> Fill from commits.

**-l**, **--label** _labels_
> Add labels.

**--web**
> Open in browser.

# DESCRIPTION

**glab mr create** creates a new GitLab merge request. Supports drafts, reviewers, and auto-fill from commit messages.

# SEE ALSO

[glab-mr](/man/glab-mr)(1), [glab](/man/glab)(1)

