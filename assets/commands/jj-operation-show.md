# TAGLINE

show repository changes made by a Jujutsu operation

# TLDR

**Show the current operation** versus its parent

```jj operation show```

**Show a specific operation**

```jj op show [operation-id]```

**Include patches** of modified changes

```jj op show --patch [operation-id]```

**Summary of changed paths**

```jj op show --summary [operation-id]```

**Histogram of changes**

```jj op show --stat [operation-id]```

**Flat list** without the graph

```jj op show --no-graph [operation-id]```

# SYNOPSIS

**jj** **operation** **show** [_options_] [_operation_]

# PARAMETERS

_OPERATION_
> Operation to inspect, compared to its parent(s). Default: `@` (the current operation).

**-p**, **--patch**
> Show a patch of modifications to changes.

**-s**, **--summary**
> For each path, show only whether it was modified, added, or deleted.

**--stat**
> Show a histogram of the changes.

**-G**, **--no-graph**
> Flat list of modified changes instead of a graph.

**-T**, **--template** _TEMPLATE_
> Render the operation with a template expression.

**--no-op-diff**
> Do not show the operation diff.

**--git**
> Show a Git-format diff.

**--name-only**
> Print only changed paths.

**--show-changes-in** _REVSETS_
> Restrict to changed revisions matching the revset.

**--tool** _TOOL_
> Generate the diff with an external command, or a builtin such as `:git`.

**--help**
> Display help information.

# DESCRIPTION

**jj operation show** (alias **jj op show**) displays what one operation changed relative to its parent(s). The default operation is `@`, the operation that produced the current repo state.

This is the usual way to review the last command (**jj op show -p**) or to inspect an ID copied from **jj operation log**. **jj absorb**, **jj fix**, and **jj converge** point at **jj op show -p** as the way to review their result.

To compare two arbitrary operations rather than one operation and its parent, use **jj operation diff --from** / **--to**.

# CAVEATS

Subcommand of **jj**. Operation IDs come from **jj op log**, not from **jj log**. **--patch** may temporarily rebase an older change onto new parents so the patch is isolated. **--no-op-diff** still prints operation metadata.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-07 -->

# SEE ALSO

[jj-operation](/man/jj-operation)(1), [jj-operation-log](/man/jj-operation-log)(1), [jj-operation-diff](/man/jj-operation-diff)(1), [jj-show](/man/jj-show)(1), [jj-undo](/man/jj-undo)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-operation-show)```

<!-- verified: 2026-09-07 -->
