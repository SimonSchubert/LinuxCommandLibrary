# TAGLINE

garbage collects untagged images

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

**gcrane gc** identifies untagged container images in Google Container Registry or Artifact Registry that are candidates for garbage collection. These orphaned images typically result from retagging or deleting tags, leaving unreferenced manifests that consume storage.

The command lists image digests that have no associated tags. It does not delete images directly; output should be piped to gcrane delete for actual removal. The grace period option protects recently created images from accidental deletion. Dry run mode shows what would be deleted without making changes, allowing safe preview before cleanup operations.

# SEE ALSO

[gcrane](/man/gcrane)(1), [gcrane-ls](/man/gcrane-ls)(1)

