# TAGLINE

Create and manipulate portable bundle files

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

**git bundle** creates and manipulates bundle files for transferring repository data offline. Bundles are portable binary archives containing Git objects and references, functioning as standalone repository snapshots.

The primary use case is sharing repository data without network access, such as air-gapped environments or slow connections. Bundles can contain entire repositories or specific branches and commit ranges. They act as read-only remotes when cloned or fetched from.

Unlike archives, bundles preserve Git history and can be incrementally fetched from. They're verified cryptographically to ensure data integrity. Common workflows include creating bundles on one machine, physically transferring them, and cloning or fetching on another machine.

# SEE ALSO

[git-archive](/man/git-archive)(1), [git-clone](/man/git-clone)(1)

