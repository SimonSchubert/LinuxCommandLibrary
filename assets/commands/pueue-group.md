# TLDR

**List groups**

```pueue group```

**Create group**

```pueue group add [name]```

**Remove group**

```pueue group remove [name]```

**Set parallel tasks**

```pueue parallel [N] --group [name]```

# SYNOPSIS

**pueue group** [_subcommand_] [_options_]

# PARAMETERS

**add** _NAME_
> Create group.

**remove** _NAME_
> Delete group.

# DESCRIPTION

**pueue group** manages task groups. Organizes parallel execution.

The tool creates execution groups. Separates workflows.

pueue group organizes tasks.

# CAVEATS

Default group exists. Part of pueue.

# HISTORY

pueue group provides **task grouping** functionality.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-parallel](/man/pueue-parallel)(1)

