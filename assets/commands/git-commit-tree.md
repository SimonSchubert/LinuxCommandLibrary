# TAGLINE

Create a commit object from a tree

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

**git commit-tree** is a low-level plumbing command that creates a new commit object directly from a tree object hash. Unlike git commit (a porcelain command), this bypasses the index and working directory, operating directly on Git's internal object database.

This command is used internally by git commit but is also available for advanced scenarios like repository surgery, history reconstruction, or programmatic commit creation. It requires providing a tree hash (typically created by git write-tree or extracted from existing commits) and accepts optional parent commit hashes to establish lineage.

Multiple -p options create merge commits with multiple parents. The commit message can be provided inline with -m, read from a file with -F, or piped to stdin. Author and committer information come from git config unless overridden with environment variables (GIT_AUTHOR_NAME, GIT_COMMITTER_DATE, etc.).

This command outputs the SHA-1 hash of the newly created commit object. To make the commit visible, you typically need to update a branch reference using git update-ref or git reset. Most users never need this command directly, but it's essential for understanding Git's internal architecture and for advanced repository manipulation.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-write-tree](/man/git-write-tree)(1)

