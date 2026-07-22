# TAGLINE

creates a copy of a Mercurial repository

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

**-u**, **--updaterev** _REV_
> Check out the given revision, tag, or branch instead of the tip.

**--pull**
> Use pull protocol to copy metadata.

**--stream**
> Clone with minimal data processing (faster, but skips revlog delta reconstruction).

**-e**, **--ssh** _CMD_
> Specify ssh command to use.

**--insecure**
> Do not verify the server certificate.

**--help**
> Display help information.

# DESCRIPTION

**hg clone** creates a copy of a Mercurial repository. It downloads the entire history and creates a working directory.

The command supports various protocols including SSH, HTTP, and local paths. It can clone specific branches or revisions.

# CAVEATS

Full history downloaded by default. Large repos take time. Network required for remote repos.

# HISTORY

Clone is a core **Mercurial** command since version 1.0, providing distributed repository copying.

# INSTALL

```apt: sudo apt install mercurial```

```dnf: sudo dnf install mercurial```

```pacman: sudo pacman -S mercurial```

```apk: sudo apk add mercurial```

```zypper: sudo zypper install mercurial```

```brew: brew install mercurial```

```nix: nix profile install nixpkgs#mercurial```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[hg](/man/hg)(1), [hg-pull](/man/hg-pull)(1), [hg-push](/man/hg-push)(1), [hg-init](/man/hg-init)(1)

# RESOURCES

```[Source code](https://foss.heptapod.net/mercurial/mercurial-devel)```

```[Documentation](https://wiki.mercurial-scm.org/)```

<!-- verified: 2026-07-19 -->
