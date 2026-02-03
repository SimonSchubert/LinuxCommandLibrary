# TLDR

**Replace object**

```git replace [object] [replacement]```

**List replacements**

```git replace -l```

**Delete replacement**

```git replace -d [object]```

**Graft commit parents**

```git replace --graft [commit] [parent1] [parent2]```

# SYNOPSIS

**git** **replace** [_options_] _object_ _replacement_

# PARAMETERS

**-l**, **--list**
> List replacements.

**-d**, **--delete**
> Delete replacement.

**-f**, **--force**
> Force replacement.

**--graft**
> Create graft commit.

**--edit**
> Edit replacement.

# DESCRIPTION

**git replace** creates, lists, or deletes refs to replace objects. Allows temporarily changing how objects are viewed without modifying the objects themselves.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-tag](/man/git-tag)(1)

