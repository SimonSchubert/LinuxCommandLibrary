# TAGLINE

restore a Jujutsu repository to an earlier operation

# TLDR

**Restore the repo** to a specific operation

```jj operation restore [operation-id]```

**Inspect that operation first** without changing the current state

```jj --at-op=[operation-id] log```

**Restore only repo state and local bookmarks** (leave remote-tracking bookmarks)

```jj op restore --what repo [operation-id]```

**Find an operation ID**

```jj op log```

**Then drop the discarded recent operations** from the log

```jj op abandon [operation-id]..@-```

# SYNOPSIS

**jj** **operation** **restore** [_options_] _operation_

# PARAMETERS

_OPERATION_
> The operation to restore to. Copy an ID from **jj op log**. Any unambiguous prefix is enough. Use **jj --at-op=**_id_ **log** (or **st**) to preview the repo at that operation before restoring.

**--what** _WHAT_
> Experimental. Which portions of the local state to restore (repeatable). Default: `repo` and `remote-tracking`. `repo` is the jj repo state and local bookmarks. `remote-tracking` is remote-tracking bookmarks — omit it if you want to push after the restore without resetting those refs.

**--help**
> Display help information.

# DESCRIPTION

**jj operation restore** (alias **jj op restore**) creates a **new** operation whose view matches an earlier operation. The working copy, bookmarks, and other recorded repo state go back to how they looked then, which effectively undoes every later operation. Later operations remain in the log until you abandon them.

This is time travel for the whole repository, not a commit-level restore. **jj restore** copies file contents between revisions; **jj op restore** replaces the current operation's view. **jj undo** walks back one (or a few) operations at a time; **jj op revert** applies the inverse of one operation. **jj op restore** jumps to a chosen snapshot.

Because restore records a new operation, you can undo the restore itself with **jj undo**. To actually delete the skipped recent history, follow with **jj op abandon <operation ID>..@-**.

# CAVEATS

Subcommand of **jj**. Operation IDs come from **jj op log**, not from **jj log**. Restore does not delete later operations; it adds one that points at the older view. **--what** is experimental. Skipping `remote-tracking` is the usual choice when you still want to push. Preview with **--at-op** before restoring a large jump.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-11 -->

# SEE ALSO

[jj-operation](/man/jj-operation)(1), [jj-operation-log](/man/jj-operation-log)(1), [jj-operation-revert](/man/jj-operation-revert)(1), [jj-operation-abandon](/man/jj-operation-abandon)(1), [jj-undo](/man/jj-undo)(1), [jj-restore](/man/jj-restore)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-operation-restore)```

<!-- verified: 2026-09-11 -->
