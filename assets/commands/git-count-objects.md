# TAGLINE

Report repository object counts and sizes

# TLDR

**Count objects**

```git count-objects```

**Verbose count**

```git count-objects -v```

**Human readable sizes**

```git count-objects -vH```

# SYNOPSIS

**git count-objects** [_options_]

# PARAMETERS

**-v**, **--verbose**
> Show detailed breakdown.

**-H**, **--human-readable**
> Human-readable sizes.

**--help**
> Display help information.

# DESCRIPTION

**git count-objects** reports the number of unpacked object files and their disk consumption, to help decide when it is a good time to repack.

The verbose mode (**-v**) shows a detailed breakdown: count (loose objects), size (disk space of loose objects in KiB), in-pack (number of packed objects), packs (number of pack files), size-pack (disk space of packs in KiB), prune-packable (loose objects also present in packs), and garbage (files in the object directory that are neither valid loose objects nor valid packs).

The **-H** flag presents sizes in human-readable format (KiB, MiB, GiB), making it easier to assess storage at a glance without manual unit conversion.

# CAVEATS

Core git command. Unpacked objects indicate recent activity. Large counts may indicate need for gc.

# HISTORY

git count-objects is a core **Git** command for repository maintenance, helping administrators understand storage usage.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-prune](/man/git-prune)(1), [git-fsck](/man/git-fsck)(1)
