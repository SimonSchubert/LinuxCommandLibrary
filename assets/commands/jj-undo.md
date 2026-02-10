# TAGLINE

reverses the last repository operation

# TLDR

**Undo last operation**

```jj undo```

**Undo multiple operations**

```jj undo [2]```

**Show operation log**

```jj op log```

**Restore to operation**

```jj op restore [op_id]```

# SYNOPSIS

**jj undo** [_options_] [_count_]

# PARAMETERS

_COUNT_
> Number of operations to undo.

**--help**
> Display help information.

# DESCRIPTION

**jj undo** reverses the last repository operation. It restores the previous state from the operation log.

The command enables safe experimentation with history. Any jj operation can be undone.

# CAVEATS

Subcommand of jj. Undoes jj operations only. Operation log has retention limit.

# HISTORY

jj undo is part of **Jujutsu**, leveraging its operation log for powerful undo capabilities.

# SEE ALSO

[jj](/man/jj)(1), [jj-op](/man/jj-op)(1), [jj-op-log](/man/jj-op-log)(1)
