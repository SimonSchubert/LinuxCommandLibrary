# TLDR

**Garbage collect untagged images**

```gcrane gc [gcr.io/project/repo]```

**Dry run**

```gcrane gc --dry-run [gcr.io/project/repo]```

**Garbage collect with grace period**

```gcrane gc --grace [24h] [gcr.io/project/repo]```

# SYNOPSIS

**gcrane** **gc** [_options_] _repository_

# PARAMETERS

**--dry-run**
> Show what would be deleted.

**--grace** _duration_
> Keep images newer than duration.

# DESCRIPTION

**gcrane gc** garbage collects untagged images in a container registry. Helps clean up old images and reduce storage costs.

# SEE ALSO

[gcrane](/man/gcrane)(1), [gcrane-ls](/man/gcrane-ls)(1)

