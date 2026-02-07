# TAGLINE

record changes to repository

# TLDR

**Commit with message**

```fossil commit -m "[message]"```

**Commit interactively**

```fossil commit```

**Commit specific files**

```fossil commit [file1] [file2] -m "[message]"```

**Commit to new branch**

```fossil commit --branch [branch_name] -m "[message]"```

**Amend last commit**

```fossil amend [checkin] -m "[new message]"```

# SYNOPSIS

**fossil** **commit** [_options_] [_files_...]

# PARAMETERS

**-m**, **--comment** _text_
> Commit message.

**--branch** _name_
> Create new branch.

**--tag** _name_
> Add tag.

**--private**
> Make commit private.

**--allow-empty**
> Allow empty commit.

**--close**
> Close branch after commit.

# DESCRIPTION

**fossil commit** records changes in the working copy to the repository, creating a new check-in with the specified comment. All files previously added or modified are included in the commit.

The command opens an editor for the commit message if **-m** is not provided. Unlike Git, Fossil uses autosync by default, potentially pushing changes to configured remotes immediately after commit.

Commits can create new branches, add tags, and include metadata like timestamps and user information. The **--private** option creates commits that won't be pushed to public repositories.

# SEE ALSO

[fossil-add](/man/fossil-add)(1), [fossil-status](/man/fossil-status)(1)

