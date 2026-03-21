# TAGLINE

reverses the last repository operation

# TLDR

**Undo last operation**

```jj undo```

**Undo the last two operations**

```jj undo 2```

**Show the operation log to find operation IDs**

```jj operation log```

**Restore to a specific operation by ID**

```jj operation restore [op_id]```

# SYNOPSIS

**jj undo** [_options_] [_count_]

# PARAMETERS

_COUNT_
> Number of operations to undo.

**-R**, **--repository** _path_
> Path to the repository to operate on.

**--what** _what_
> What portions of the local state to restore (can be `repo` or `remote-tracking`).

**--help**
> Display help information.

# DESCRIPTION

**jj undo** reverses the last repository operation by creating a new operation that restores the previous state from the operation log. Unlike `jj operation restore`, which discards intermediate operations, `jj undo` preserves the full operation history.

The command enables safe experimentation with history. Any jj operation can be undone, including merges, rebases, and bookmark changes.

# CAVEATS

Subcommand of jj. Undoes jj operations only. Operation log has retention limit.

# HISTORY

jj undo is part of **Jujutsu**, leveraging its operation log for powerful undo capabilities.

# SEE ALSO

[jj](/man/jj)(1), [jj-operation](/man/jj-operation)(1), [jj-restore](/man/jj-restore)(1)
