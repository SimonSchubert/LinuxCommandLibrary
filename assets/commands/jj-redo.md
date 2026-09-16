# TAGLINE

redoes the most recently undone Jujutsu operation

# TLDR

**Redo** the last undone operation

```jj redo```

**Undo**, then **redo** (editor-style)

```jj undo && jj redo```

**Inspect** undo and redo operations in the log

```jj op log```

**Jump** to a specific earlier operation instead of redoing

```jj op restore [operation-id]```

# SYNOPSIS

**jj redo**

# DESCRIPTION

**jj redo** restores the repository to the operation that the most recent **jj undo** undid. It is the counterpart of `jj undo`. Repeated `jj undo` and `jj redo` walk backward and forward through that undo/redo stack, similar to Undo/Redo in a text editor.

The command records a new operation whose description starts with `redo: restore to operation`. `jj undo` and `jj redo` keep separate stacks. If the current operation is not an undo (and not already a redo of an undo), `jj redo` fails with `Nothing to redo`.

`jj op revert` is not treated as an undo, so it does not create something `jj redo` can replay. Use `jj op log` to see undo and redo entries. Use `jj op restore` when you want a specific operation by ID rather than the next redo step.

# CAVEATS

Subcommand of **jj**. There is nothing to redo until at least one `jj undo` has been recorded. Redo does not reverse side effects outside the repo (for example a `jj git push`). Cannot redo a merge of concurrent operations.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-undo](/man/jj-undo)(1), [jj-operation-log](/man/jj-operation-log)(1), [jj-operation-restore](/man/jj-operation-restore)(1), [jj-operation-revert](/man/jj-operation-revert)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-redo)```

<!-- verified: 2026-09-16 -->
