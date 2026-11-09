# TAGLINE

Git integration for Debian package building

# TLDR

**Import an existing Debian source package into Git**

```gbp import-dsc [path/to/package.dsc]```

**Build the package using the default builder**

```gbp buildpackage -jauto -us -uc```

**Build a package in a pbuilder environment**

```DIST=bullseye ARCH=amd64 gbp buildpackage -jauto -us -uc --git-builder=git-pbuilder```

**Import a new upstream release**

```gbp import-orig --pristine-tar [path/to/package.tar.gz]```

**Clone a repository with gbp branch tracking**

```gbp clone [url]```

**Generate changelog entries from Git commits**

```gbp dch --auto```

**Tag the current Debian release in Git**

```gbp tag```

**Push packaging branches and tags to remote**

```gbp push```

# SYNOPSIS

**gbp** _command_ [_options_]

# PARAMETERS

**buildpackage**
> Build Debian source and binary packages from a Git repository.

**import-dsc**
> Import an existing Debian source package into a Git repository.

**import-orig**
> Import a new upstream source from a tarball, or from a Git tag and tarball, into a Git repository.

**import-ref**
> Merge upstream Git commits onto the Debian branch.

**export-orig**
> Recreate upstream tarballs from a Git repository.

**clone**
> Clone a Git repository and set up gbp tracking branches.

**pull**
> Update a repository from remote, aware of packaging branch tracking.

**push**
> Push to a remote repository, aware of packaging branch tracking.

**dch**
> Generate debian/changelog entries from Git commit history.

**tag**
> Tag a Debian release in a Git repository.

**pq**
> Manage debian/patches as Git topic branches (patch queue).

**create-remote-repo**
> Create a remote Git repository.

**import-dscs**
> Import several Debian source packages into a Git repository, sorted by version.

**--list-cmds**
> List all available commands.

**--version**
> Print the program version.

**--help**
> Print help.

# CONFIGURATION

**/etc/git-buildpackage/gbp.conf**
> System-wide defaults.

**~/.gbp.conf**
> User-level defaults for gbp behavior across all projects.

**.gbp.conf**, **debian/gbp.conf**
> Project-specific settings for branch names, build options, and pristine-tar configuration.

**.git/gbp.conf**
> Per-clone settings that are not committed.

# DESCRIPTION

**gbp** (git-buildpackage) integrates Debian package building with Git version control. It maintains separate Git branches for upstream source, Debian packaging, and optionally pristine tarballs, providing a clean workflow for package maintenance.

The typical workflow involves importing upstream releases with **gbp import-orig**, making packaging changes on the debian branch, and building with **gbp buildpackage**. The tool handles merging upstream changes and generating proper Debian source packages.

gbp supports building in clean environments via pbuilder, sbuild, or cowbuilder for reproducible builds.

# CAVEATS

Requires understanding of both Git branching and Debian packaging. By default the packaging branch is **master** and the upstream branch is **upstream**; other names must be set in gbp.conf or on the command line. Complex merge scenarios may require manual intervention. In **gbp buildpackage**, options prefixed with **--git-** are for gbp itself; other options are passed through to the underlying build command.

# HISTORY

git-buildpackage was created by Guido Günther and first released in **2006**. It became a standard tool for Debian developers who wanted to combine the benefits of Git's distributed version control with Debian's packaging system.

# SEE ALSO

[debuild](/man/debuild)(1), [dpkg-buildpackage](/man/dpkg-buildpackage)(1), [pbuilder](/man/pbuilder)(8), [sbuild](/man/sbuild)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/agx/git-buildpackage)```

```[Homepage](https://honk.sigxcpu.org/piki/projects/git-buildpackage/)```

```[Documentation](https://honk.sigxcpu.org/projects/git-buildpackage/manual-html/gbp.html)```

<!-- verified: 2026-11-09 -->
