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

**git fsck** verifies the connectivity and validity of objects in the database. Useful for finding corruption or recovering lost commits.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-prune](/man/git-prune)(1)

