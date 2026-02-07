# TAGLINE

Verify connectivity and validity of repository objects

# TLDR

**Check repository integrity**

```git fsck```

**Check with unreachable objects**

```git fsck --unreachable```

**Full check**

```git fsck --full```

**Check specific object**

```git fsck [object]```

**Show dangling objects**

```git fsck --dangling```

**Check connectivity only**

```git fsck --connectivity-only```

# SYNOPSIS

**git** **fsck** [_options_] [_objects_...]

# PARAMETERS

**--unreachable**
> Show unreachable objects.

**--dangling**
> Show dangling objects.

**--full**
> Check objects in packs.

**--connectivity-only**
> Check connectivity only.

**--strict**
> Enable strict checking.

**--lost-found**
> Write dangling objects to .git/lost-found.

# DESCRIPTION

**git fsck** (file system check) performs integrity verification on all objects in the Git object database. It validates that objects are well-formed, correctly connected, and that the repository structure is consistent and uncorrupted.

The command checks for corrupted objects, broken links, invalid object types, and unreachable objects that exist but are not referenced by any branch or tag. Unreachable objects are often the result of rebases, amended commits, or deleted branches, and can be useful for recovering accidentally deleted work via the --lost-found option.

Regular fsck runs are recommended after suspected repository corruption, disk errors, or hardware failures. The --full option extends checking to objects inside pack files rather than just checking pack file integrity.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-prune](/man/git-prune)(1)
