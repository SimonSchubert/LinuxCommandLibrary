# TLDR

**Commit staged changes**

```git commit -m "[message]"```

**Commit all tracked changes**

```git commit -am "[message]"```

**Amend last commit**

```git commit --amend```

**Commit with editor**

```git commit```

**Empty commit**

```git commit --allow-empty -m "[message]"```

**Commit with signoff**

```git commit -s -m "[message]"```

**Fixup commit**

```git commit --fixup [commit]```

**Squash commit**

```git commit --squash [commit]```

# SYNOPSIS

**git** **commit** [_options_] [_--_] [_files_...]

# PARAMETERS

**-m**, **--message** _msg_
> Commit message.

**-a**, **--all**
> Stage all modified files.

**--amend**
> Amend previous commit.

**--no-edit**
> Use previous message.

**-s**, **--signoff**
> Add Signed-off-by.

**--allow-empty**
> Allow empty commits.

**--fixup** _commit_
> Fixup for commit.

**--squash** _commit_
> Squash into commit.

**-v**, **--verbose**
> Show diff in editor.

**--author** _author_
> Override author.

# DESCRIPTION

**git commit** records changes to the repository. Creates a new commit containing the staged changes with a commit message.

# SEE ALSO

[git-add](/man/git-add)(1), [git-status](/man/git-status)(1)

