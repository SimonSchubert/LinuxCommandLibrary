# TAGLINE

show Jujutsu's operation log

# TLDR

**Show the operation log**

```jj operation log```

**Limit how many operations** are listed

```jj op log --limit [20]```

**Oldest first**

```jj op log --reversed```

**Show without the graph**

```jj op log --no-graph```

**Include the repository diff** at each operation

```jj op log --op-diff```

**Custom template**

```jj op log --template [template]```

# SYNOPSIS

**jj** **operation** **log** [_options_]

# PARAMETERS

**-n**, **--limit** _N_
> Maximum number of operations to show (after topological order, before reverse).

**--reversed**
> Show older operations first.

**-G**, **--no-graph**
> Flat list instead of a graph.

**-T**, **--template** _TEMPLATE_
> Render each operation with a template expression.

**-d**, **--op-diff**
> Show repository changes at each operation.

**-p**, **--patch**
> Show patches of modified changes (implies **--op-diff**).

**-s**, **--summary**
> For each path, show only whether it was modified, added, or deleted.

**--stat**
> Show a histogram of the changes.

**--show-changes-in** _REVSETS_
> Restrict operation diffs to matching revisions.

**--help**
> Display help information.

# DESCRIPTION

**jj operation log** (alias **jj op log**) lists the operation log. Jujutsu records every mutating command as an operation, which is what **jj undo**, **jj operation restore**, and **jj operation revert** walk.

Like other **jj** commands, **jj op log** snapshots the working copy and reconciles divergent operations. To inspect the log without that mutation, use **jj --at-op=@ --ignore-working-copy op log**.

IDs from this log are the arguments to **jj operation show**, **jj operation diff**, **jj operation restore**, and **jj --at-operation**.

# CAVEATS

Subcommand of **jj**. The log is retained according to repo gc settings; old operations can disappear after **jj util gc** or **jj operation abandon**. Default output is newest-first. **--patch** on a long log is expensive.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-07 -->

# SEE ALSO

[jj-operation](/man/jj-operation)(1), [jj-operation-show](/man/jj-operation-show)(1), [jj-operation-diff](/man/jj-operation-diff)(1), [jj-undo](/man/jj-undo)(1), [jj-log](/man/jj-log)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-operation-log)```

<!-- verified: 2026-09-07 -->
