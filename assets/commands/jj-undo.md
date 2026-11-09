# TAGLINE

reverses the last repository operation

# TLDR

**Undo the last operation**

```jj undo```

**Undo the operation before that** (run again)

```jj undo```

**Redo an undone operation**

```jj redo```

**Show the operation log to find operation IDs**

```jj op log```

**Restore the repo to a specific operation**

```jj op restore [op_id]```

**Revert one specific older operation**

```jj op revert [op_id]```

**Undo an operation performed in another workspace**

```jj undo --allow-cross-workspace```

# SYNOPSIS

**jj undo** [_options_]

# PARAMETERS

**--allow-cross-workspace**
> Allow undoing an operation that was performed in another workspace.

**-R**, **--repository** _path_
> Path to the repository to operate on.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**jj undo** undoes the last operation by restoring the state of its parent from the operation log. Run repeatedly, it restores increasingly older operations, and **jj redo** moves forward again. Each undo is recorded as a new operation, so the log keeps the full history.

Almost every jj operation can be undone, including rebases, merges and bookmark changes. To revert a specific operation other than the most recent, use **jj op revert**; to return the whole repo to an earlier state, use **jj op restore**.

# CAVEATS

By default, **jj undo** refuses to undo an operation from another workspace. It only restores jj's own view of the repo: a fetch or push already sent to a remote is not undone there. The numeric or operation argument and the **--what** flag are deprecated or gone; use **jj op revert** and **jj op restore --what** instead.

# HISTORY

Since **jj 0.33.0** (September 2025) **jj undo** is sequential and repeated invocations step further back. Before that release, running it twice was effectively a no-op, and **jj redo** did not exist.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-redo](/man/jj-redo)(1), [jj-operation](/man/jj-operation)(1), [jj-operation-log](/man/jj-operation-log)(1), [jj-operation-restore](/man/jj-operation-restore)(1), [jj-operation-revert](/man/jj-operation-revert)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Documentation](https://docs.jj-vcs.dev/latest/operation-log/)```

<!-- verified: 2026-11-09 -->
