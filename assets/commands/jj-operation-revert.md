# TAGLINE

revert a single Jujutsu operation by applying its inverse

# TLDR

**Revert the current operation**

```jj operation revert```

**Revert a specific operation** (not necessarily the latest)

```jj op revert [operation-id]```

**Revert only repo state and local bookmarks**

```jj op revert --what repo [operation-id]```

**Find an operation ID**

```jj op log```

**Undo the last operation** (top-level equivalent for the latest)

```jj undo```

# SYNOPSIS

**jj** **operation** **revert** [_options_] [_operation_]

# PARAMETERS

_OPERATION_
> The operation to revert. Default: `@` (the current operation). Copy an ID from **jj op log**.

**--what** _WHAT_
> Experimental. Which portions of the local state to restore (repeatable). Default: `repo` and `remote-tracking`. `repo` is the jj repo state and local bookmarks. `remote-tracking` is remote-tracking bookmarks — omit it if you want to push after the revert without resetting those refs.

**--help**
> Display help information.

# DESCRIPTION

**jj operation revert** (alias **jj op revert**) creates a new operation that applies the **inverse** of an earlier operation. The original operation stays in the log; the new one undoes its effect on the recorded repo view.

This is the operation-log analog of **jj revert** (which inverts a commit). Use it when you want to undo one command that is not necessarily the most recent. **jj undo** is the usual way to walk back the latest operation(s) one-by-one. **jj op restore** instead replaces the current view with a whole earlier snapshot, undoing every operation after that point rather than inverting a single one.

Default **@** means "revert the current operation", which is close to **jj undo** for a single step. To invert something older, pass its ID from **jj op log**.

# CAVEATS

Subcommand of **jj**. Operation IDs come from **jj op log**, not from **jj log**. Revert adds a new operation; it does not delete history. **--what** is experimental. This is not **jj revert**, which creates a new **commit** that undoes a revision. Inverting an operation that had effects outside the repo (for example a **jj git push**) does not un-push.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-11 -->

# SEE ALSO

[jj-operation](/man/jj-operation)(1), [jj-operation-log](/man/jj-operation-log)(1), [jj-operation-restore](/man/jj-operation-restore)(1), [jj-undo](/man/jj-undo)(1), [jj-revert](/man/jj-revert)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-operation-revert)```

<!-- verified: 2026-09-11 -->
