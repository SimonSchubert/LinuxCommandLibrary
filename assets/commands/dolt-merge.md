# TAGLINE

join branch histories and table changes

# TLDR

**Merge branch into** current branch

```dolt merge [branch_name]```

**Merge with commit** message

```dolt merge [branch_name] -m "[Merge message]"```

**Abort in-progress merge**

```dolt merge --abort```

**Squash merge** into the working set, without a merge commit

```dolt merge --squash [branch_name]```

**Always create a merge commit**, even for a fast-forward

```dolt merge --no-ff -m "[Merge message]" [branch_name]```

**Refuse the merge** unless it fast-forwards

```dolt merge --ff-only [branch_name]```

**Inspect conflicts** left behind by a merge

```dolt sql -q "SELECT * FROM dolt_conflicts"```

# SYNOPSIS

**dolt merge** [**--squash**] _branch_

**dolt merge** **--no-ff** [**-m** _message_] _branch_

**dolt merge** **--ff-only** _branch_

**dolt merge** **--abort**

# PARAMETERS

**-m**, **--message** _MSG_
> Use _MSG_ as the commit message for the merge commit.

**--squash**
> Merge the changes into the working set without updating the commit history.

**--no-ff**
> Create a merge commit even when the merge resolves as a fast-forward.

**--ff-only**
> Refuse to merge unless HEAD is already up to date or the merge resolves as a fast-forward.

**--commit**
> Perform the merge and commit the result. This is the default.

**--no-commit**
> Perform the merge but stop just before creating the merge commit.

**--no-edit**
> Use an auto-generated commit message instead of opening an editor.

**--author** _NAME_ <_EMAIL_>
> Record an explicit author for the merge commit.

**--abort**
> Abort an in-progress merge and return the working set to its pre-merge state.

# DESCRIPTION

**dolt merge** joins two histories by incorporating the changes from another branch into the current one. Because Dolt's unit of change is a row rather than a line of text, the merge is a three-way merge over table data and schema: rows touched on only one side are taken directly, and rows changed on both sides are compared cell by cell, so two branches that edit different columns of the same row still merge cleanly.

A conflict is raised when both branches change the *same cell* to different values, or when the schemas diverge incompatibly. Unlike Git, Dolt does not write markers into your data. Conflicts are recorded in the `dolt_conflicts` and `dolt_conflicts_<table>` system tables, which you query and resolve with SQL before committing. Schema and constraint violations land in `dolt_schema_conflicts` and `dolt_constraint_violations`.

# CAVEATS

Conflicts must be resolved through the system tables, not by editing files; a merge cannot be committed while rows remain in `dolt_conflicts`. **--squash** applies the changes but leaves no link to the merged branch's history, so a later merge of the same branch will reconsider the same commits. The working set must be clean before merging. Merges may also succeed at the row level yet break a foreign key or unique constraint, which surfaces as a constraint violation rather than a conflict.

# HISTORY

dolt merge implements **git merge** semantics for relational data, which is the whole point of the project: making database changes reviewable and mergeable the way code is. Cell-wise three-way merge, schema merge, and the conflict system tables were built out over successive releases as Dolt matured from a data-sharing tool into a MySQL-compatible database.

# INSTALL

```pacman: sudo pacman -S dolt```

```brew: brew install dolt```

```nix: nix profile install nixpkgs#dolt```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-checkout](/man/dolt-checkout)(1), [dolt-branch](/man/dolt-branch)(1), [dolt-commit](/man/dolt-commit)(1), [git-merge](/man/git-merge)(1)

# RESOURCES

```[Source code](https://github.com/dolthub/dolt)```

```[Documentation](https://www.dolthub.com/docs/cli-reference/cli/)```

<!-- verified: 2026-07-14 -->

