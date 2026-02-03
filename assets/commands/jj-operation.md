# TLDR

**List operations**

```jj operation log```

**Undo last operation**

```jj operation undo```

**Restore to specific operation**

```jj operation restore [operation-id]```

**Show operation details**

```jj operation show [operation-id]```

# SYNOPSIS

**jj** **operation** _subcommand_ [_options_]

# PARAMETERS

**log**
> List operation history.

**undo**
> Undo the last operation.

**restore** _id_
> Restore repository to operation state.

**show** _id_
> Show operation details.

**abandon** _id_
> Abandon old operations.

# DESCRIPTION

**jj operation** manages Jujutsu's operation log. Every change to the repository is recorded as an operation, enabling undo and time travel. Operations track what commands were run and their effects.

# SEE ALSO

[jj](/man/jj)(1), [jj-undo](/man/jj-undo)(1)

