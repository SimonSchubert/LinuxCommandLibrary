# TAGLINE

Create, list, or delete object replacement refs

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

**git replace** creates, lists, or deletes refs that substitute one object for another. This allows temporarily changing how objects are viewed without modifying the original objects themselves.

Replacements are useful for fixing published history, grafting histories together, or replacing large blobs. The `--graft` option simplifies rewriting commit parentage.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-tag](/man/git-tag)(1)
