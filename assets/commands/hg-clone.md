# TLDR

**Clone repository**

```hg clone [url]```

**Clone to specific directory**

```hg clone [url] [directory]```

**Clone specific branch**

```hg clone -b [branch] [url]```

**Clone with specific revision**

```hg clone -r [revision] [url]```

**Clone without working directory**

```hg clone -U [url]```

# SYNOPSIS

**hg clone** [_options_] _source_ [_dest_]

# PARAMETERS

_SOURCE_
> Repository URL or path.

_DEST_
> Destination directory.

**-b**, **--branch** _BRANCH_
> Clone specific branch.

**-r**, **--rev** _REV_
> Clone up to revision.

**-U**, **--noupdate**
> Clone without working directory.

**--pull**
> Use pull protocol.

**--help**
> Display help information.

# DESCRIPTION

**hg clone** creates a copy of a Mercurial repository. It downloads the entire history and creates a working directory.

The command supports various protocols including SSH, HTTP, and local paths. It can clone specific branches or revisions.

hg clone copies Mercurial repositories.

# CAVEATS

Full history downloaded by default. Large repos take time. Network required for remote repos.

# HISTORY

Clone is a core **Mercurial** command since version 1.0, providing distributed repository copying.

# SEE ALSO

[hg](/man/hg)(1), [hg-pull](/man/hg-pull)(1), [hg-push](/man/hg-push)(1)
