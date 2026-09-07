# TAGLINE

compare repository state between two Jujutsu operations

# TLDR

**Diff the current operation** against its parent

```jj operation diff```

**Diff a specific operation** against its parent

```jj op diff --op [operation-id]```

**Diff two operations**

```jj op diff --from [from-op] --to [to-op]```

**Include patches** of modified changes

```jj op diff --op [operation-id] --patch```

**Show a histogram** of path changes

```jj op diff --op [operation-id] --stat```

**Flat list** without the operation graph

```jj op diff --op [operation-id] --no-graph```

# SYNOPSIS

**jj** **operation** **diff** [_options_]

# PARAMETERS

**--operation**, **--op** _OPERATION_
> Show repository changes in this operation compared to its parent.

**-f**, **--from** _OPERATION_
> Start operation of the comparison.

**-t**, **--to** _OPERATION_
> End operation of the comparison.

**-p**, **--patch**
> Show a patch of modifications to changes.

**-s**, **--summary**
> For each path, show only whether it was modified, added, or deleted.

**--stat**
> Show a histogram of the changes.

**-G**, **--no-graph**
> Show a flat list of modified changes instead of a graph.

**--git**
> Show a Git-format diff.

**--name-only**
> Print only changed paths.

**--show-changes-in** _REVSETS_
> Restrict to changed revisions matching the revset. Defaults to `revsets.op-diff-changes-in`.

**--tool** _TOOL_
> Generate the diff with an external command, or a builtin such as `:git`.

**--help**
> Display help information.

# DESCRIPTION

**jj operation diff** (alias **jj op diff**) compares repository state between two operations in Jujutsu's operation log. Every **jj** command that mutates the repo records an operation, so this is the analog of a commit diff but for the operation history.

With **--operation**, the comparison is that operation versus its parent. With **--from** and **--to**, you pick both ends. Diff formatting flags (**--patch**, **--stat**, **--summary**, **--git**, **--no-graph**) match **jj diff** / **jj operation show**.

Use **jj operation log** to find operation IDs. To inspect a single operation (default `@`), **jj operation show** is usually shorter.

# CAVEATS

Subcommand of **jj**. Operation IDs are not Git commit IDs; copy them from **jj op log**. Comparing operations that rewrote many revisions can be large. **--patch** temporarily rebases an older version onto the new parents so the patch is not mixed with unrelated parent changes.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-07 -->

# SEE ALSO

[jj-operation](/man/jj-operation)(1), [jj-operation-log](/man/jj-operation-log)(1), [jj-operation-show](/man/jj-operation-show)(1), [jj-diff](/man/jj-diff)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-operation-diff)```

<!-- verified: 2026-09-07 -->
