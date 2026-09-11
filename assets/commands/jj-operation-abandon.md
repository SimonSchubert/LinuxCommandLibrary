# TAGLINE

abandon operations from Jujutsu's operation log

# TLDR

**Abandon a specific operation**

```jj operation abandon [operation-id]```

**Abandon an operation and all of its ancestors** (discard old history)

```jj op abandon ..[operation-id]```

**Discard recent operations** after restoring to an earlier state

```jj op restore [operation-id] && jj op abandon [operation-id]..@-```

**List operations** before choosing what to abandon

```jj op log```

**Garbage-collect** objects made unreachable by abandon

```jj util gc```

# SYNOPSIS

**jj** **operation** **abandon** _operation_

# PARAMETERS

_OPERATION_
> The operation or operation range to abandon. Range syntax such as `..<id>` (ancestors through that operation) and `<id>..@-` (from that operation up to the parent of the current operation) is accepted.

**--help**
> Display help information.

# DESCRIPTION

**jj operation abandon** (alias **jj op abandon**) removes operations from Jujutsu's operation log. Every mutating **jj** command records an operation; abandoning those records is how you shrink the log and make old commits, views, and predecessors eligible for garbage collection.

To discard **old** history, pass a range ending at the last operation you want gone: **jj op abandon ..<operation ID>** abandons that operation and all of its ancestors. Descendants of the abandoned operations are reparented onto the root operation so the remaining log stays connected.

To discard **recent** history after a restore, first run **jj op restore <operation ID>**, then **jj op abandon <operation ID>..@-**. Restore creates a new operation that points the repo at the earlier view; abandon then drops the now-unwanted later operations from the log.

Previous versions of a change (predecessors) are also discarded when they become unreachable from the operation history. The abandoned operations, commits, and other unreachable objects can later be collected with **jj util gc**. This is not **jj abandon**, which hides revisions in the commit graph rather than operations in the operation log.

# CAVEATS

Subcommand of **jj**. Operation IDs come from **jj op log**, not from **jj log**. Abandoning is not the same as **jj undo** or **jj op restore**: those create new operations; this removes operations. After a large abandon, run **jj util gc** if you want the on-disk objects reclaimed. Do not confuse this with **jj abandon**, which abandons revisions.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-11 -->

# SEE ALSO

[jj-operation](/man/jj-operation)(1), [jj-operation-log](/man/jj-operation-log)(1), [jj-operation-restore](/man/jj-operation-restore)(1), [jj-operation-revert](/man/jj-operation-revert)(1), [jj-abandon](/man/jj-abandon)(1), [jj-undo](/man/jj-undo)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-operation-abandon)```

<!-- verified: 2026-09-11 -->
