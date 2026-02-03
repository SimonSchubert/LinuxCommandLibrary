# TLDR

**Create commit from tree**

```echo "[message]" | git commit-tree [tree_hash]```

**Create with parent**

```echo "[message]" | git commit-tree [tree] -p [parent]```

**Create with message file**

```git commit-tree [tree] -F [message.txt]```

**Create merge commit**

```git commit-tree [tree] -p [parent1] -p [parent2] -m "[message]"```

# SYNOPSIS

**git** **commit-tree** _tree_ [_options_]

# PARAMETERS

**-p** _parent_
> Parent commit.

**-m** _message_
> Commit message.

**-F** _file_
> Read message from file.

**-S**
> GPG sign commit.

# DESCRIPTION

**git commit-tree** creates a new commit object based on a tree object. A low-level command used internally by git commit.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-write-tree](/man/git-write-tree)(1)

