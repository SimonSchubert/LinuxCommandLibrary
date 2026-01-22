# TLDR

**Create new change**

```jj new```

**New change with description**

```jj new -m "[message]"```

**New change on specific parent**

```jj new -r [rev]```

**New merge change**

```jj new [rev1] [rev2]```

**Insert change before current**

```jj new --insert-before```

# SYNOPSIS

**jj new** [_options_] [_revisions_...]

# PARAMETERS

_REVISIONS_
> Parent revisions (creates merge if multiple).

**-m** _MESSAGE_
> Description for new change.

**-r** _REV_
> Parent revision.

**--insert-before**
> Insert before current change.

**--insert-after**
> Insert after specified.

**--help**
> Display help information.

# DESCRIPTION

**jj new** creates a new change in the repository. It starts a fresh working copy state on top of specified parents.

The command enables branching and merge point creation. Multiple parents create a merge change.

jj new creates changes.

# CAVEATS

Subcommand of jj. Current change auto-commits. Different from Git branch.

# HISTORY

jj new is part of **Jujutsu**, central to its workflow of treating all changes as first-class revisions.

# SEE ALSO

[jj](/man/jj)(1), [jj-describe](/man/jj-describe)(1), [jj-next](/man/jj-next)(1)
