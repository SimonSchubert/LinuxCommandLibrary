# TLDR

**Create bundle of entire repository**

```git bundle create [repo.bundle] --all```

**Create bundle of branch**

```git bundle create [branch.bundle] [branch]```

**Create bundle since commit**

```git bundle create [recent.bundle] [commit]..HEAD```

**Verify bundle**

```git bundle verify [repo.bundle]```

**Clone from bundle**

```git clone [repo.bundle] [directory]```

**List bundle contents**

```git bundle list-heads [repo.bundle]```

# SYNOPSIS

**git** **bundle** _command_ [_options_] [_refs_]

# SUBCOMMANDS

**create**
> Create a bundle.

**verify**
> Verify a bundle.

**list-heads**
> List references.

**unbundle**
> Extract objects.

# PARAMETERS

**--all**
> Include all refs.

# DESCRIPTION

**git bundle** creates and manipulates bundle files. Bundles are binary files containing objects and refs that can be transferred offline and used like a remote.

# SEE ALSO

[git-archive](/man/git-archive)(1), [git-clone](/man/git-clone)(1)

