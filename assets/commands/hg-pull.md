# TAGLINE

fetches changesets from a remote repository into the local repository

# TLDR

**Pull from default remote**

```hg pull```

**Pull and update working directory**

```hg pull -u```

**Pull from specific source**

```hg pull [https://example.com/repo]```

**Pull specific revision**

```hg pull -r [revision]```

**Pull specific branch**

```hg pull -b [branch]```

**Pull from source and force even if unrelated**

```hg pull -f [https://example.com/repo]```

# SYNOPSIS

**hg** **pull** [_options_] [_source_]

# PARAMETERS

**-u**, **--update**
> Update to new branch head after pulling.

**-r**, **--rev** _rev_
> Pull specific revision.

**-b**, **--branch** _branch_
> Pull specific branch.

**-B**, **--bookmark** _bookmark_
> Pull a specific bookmark from the remote repository.

**-f**, **--force**
> Pull even from unrelated repository.

**--insecure**
> Do not verify server certificate (for HTTPS connections).

# DESCRIPTION

**hg pull** fetches changesets from a remote repository into the local repository. Unlike Git's pull, it does not automatically update the working directory. Use **-u** to update, or run **hg update** separately after pulling. The source defaults to the repository from which this repository was cloned.

# SEE ALSO

[hg](/man/hg)(1), [hg-update](/man/hg-update)(1), [hg-push](/man/hg-push)(1), [hg-clone](/man/hg-clone)(1), [hg-log](/man/hg-log)(1)

