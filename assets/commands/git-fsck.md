# TAGLINE

Verify connectivity and validity of repository objects

# TLDR

**Check repository integrity**

```git fsck```

**Check with unreachable objects**

```git fsck --unreachable```

**Check connectivity only** (faster, skips blob content)

```git fsck --connectivity-only```

**Write dangling objects** to .git/lost-found for recovery

```git fsck --lost-found```

**Verbose check with named objects**

```git fsck --verbose --name-objects```

**Check without reflog references**

```git fsck --no-reflogs```

**Strict check** for stricter validation

```git fsck --strict```

# SYNOPSIS

**git** **fsck** [_options_] [_objects_...]

# PARAMETERS

**--unreachable**
> Print objects that exist but are not reachable from any reference node.

**--dangling**
> Print objects that exist but are never directly used (default).

**--no-dangling**
> Omit dangling object information from output.

**--full**
> Check objects in alternate object pools and pack files. This is now the default.

**--connectivity-only**
> Check only connectivity of reachable objects, skipping blob content. Faster but cannot detect corrupt blobs.

**--strict**
> Enable stricter checking, e.g. catching file modes with g+w bit set.

**--lost-found**
> Write dangling objects to .git/lost-found/commit/ or .git/lost-found/other/.

**--no-reflogs**
> Do not consider reflog entries when determining reachability.

**--cache**
> Consider objects in the index as head nodes for reachability traces.

**--root**
> Report root nodes.

**--tags**
> Report tags.

**--name-objects**
> Display a descriptive name showing how objects are reachable (e.g. HEAD~25^2:src/).

**--verbose**
> Be chatty.

**--progress**, **--no-progress**
> Force or suppress progress status reporting.

# DESCRIPTION

**git fsck** (file system check) performs integrity verification on all objects in the Git object database. It validates that objects are well-formed, correctly connected, and that the repository structure is consistent and uncorrupted.

The command checks for corrupted objects, broken links, invalid object types, and unreachable objects that exist but are not referenced by any branch or tag. Unreachable objects are often the result of rebases, amended commits, or deleted branches, and can be useful for recovering accidentally deleted work via the --lost-found option.

Regular fsck runs are recommended after suspected repository corruption, disk errors, or hardware failures. The --full option (now default) extends checking to objects inside pack files. Use --connectivity-only for faster checks that skip blob content validation.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-prune](/man/git-prune)(1), [git-reflog](/man/git-reflog)(1)
