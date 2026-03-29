# TAGLINE

Create, list, or delete object replacement refs

# TLDR

**Replace an object with another object**

```git replace [object] [replacement]```

**Force replace an object, overwriting an existing replacement**

```git replace -f [object] [replacement]```

**List all replacement refs**

```git replace --list```

**List replacement refs matching a pattern**

```git replace --list 'refs/replace/abc*'```

**Delete a replacement ref**

```git replace -d [object]```

**Edit an object interactively and create a replacement**

```git replace --edit [object]```

**Graft a commit to have different parents**

```git replace --graft [commit] [parent1] [parent2]```

**Convert legacy grafts file to replacement refs**

```git replace --convert-graft-file```

# SYNOPSIS

**git** **replace** [-f] _object_ _replacement_
**git** **replace** [-f] **--edit** _object_
**git** **replace** [-f] **--graft** _commit_ [_parent_...]
**git** **replace** [-f] **--convert-graft-file**
**git** **replace** **-d** _object_...
**git** **replace** [**--format**=_format_] **-l** [_pattern_]

# PARAMETERS

**-l** [_pattern_], **--list** [_pattern_]
> List replacement refs. If a pattern is given via glob(7), only matching replacements are listed.

**-d**, **--delete**
> Delete existing replacement refs for the given objects.

**-f**, **--force**
> Overwrite an existing replace ref for the same object instead of failing.

**--graft** _commit_ [_parent_...]
> Create a graft commit. A new commit is created with the same content as the given commit but with the specified parents, then a replacement ref is created to replace the original commit.

**--convert-graft-file**
> Convert all entries in `$GIT_DIR/info/grafts` to replace refs and delete the grafts file. This is a one-time migration from the legacy grafts mechanism.

**--edit** _object_
> Edit an object's content interactively. The existing content is pretty-printed into a temporary file, an editor is launched, and the result is used to create a replacement object.

**--raw**
> When used with `--edit`, provide the raw object contents rather than pretty-printed ones. Useful for editing corrupted objects.

**--format**=_format_
> Format for `--list` output: `short` (replaced SHA only), `medium` (replaced -> replacement), or `long` (includes object types). Default: `short`.

# DESCRIPTION

**git replace** creates, lists, or deletes refs in the `refs/replace/` namespace that substitute one object for another. This allows changing how objects are viewed without modifying the original objects themselves.

Replacements are used by default in all Git commands except reachability traversal (prune, pack transfer, fsck). To bypass replacements, use `git --no-replace-objects` or set the `GIT_NO_REPLACE_OBJECTS` environment variable.

Common use cases include fixing published history, grafting histories together, or replacing large blobs. The `--graft` option simplifies rewriting commit parentage, replacing the legacy `$GIT_DIR/info/grafts` mechanism.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-tag](/man/git-tag)(1), [git-filter-branch](/man/git-filter-branch)(1), [git-fsck](/man/git-fsck)(1)
