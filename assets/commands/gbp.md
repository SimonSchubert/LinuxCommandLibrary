# TLDR

**Convert** an existing Debian package to gbp

```gbp import-dsc [path/to/package.dsc]```

**Build** the package using the default builder (debuild)

```gbp buildpackage -jauto -us -uc```

Build a package in a **pbuilder environment**

```DIST=bullseye ARCH=amd64 gbp buildpackage -jauto -us -uc --git-builder=git-pbuilder```

Specify a package as **source-only upload**

```gbp buildpackage -jauto -us -uc --changes-options=-S```

Import a new **upstream release**

```gbp import-orig --pristine-tar [path/to/package.tar.gz]```

# SYNOPSIS

**gbp** _command_ [_options_]

# PARAMETERS

**buildpackage**
> Build a Debian package from a Git repository

**import-dsc**
> Import an existing Debian source package into Git

**import-orig**
> Import a new upstream tarball

**clone**
> Clone a Git repository and set up gbp tracking branches

**pull**
> Update a repository from remote

**dch**
> Generate debian/changelog entries from Git commits

**pq** (patch queue)
> Manage quilt patches as Git topic branches

**--pristine-tar**
> Use pristine-tar to store/retrieve upstream tarballs

**-jauto**
> Automatic parallel build jobs

**-us**
> Do not sign source package

**-uc**
> Do not sign changes file

# DESCRIPTION

**gbp** (git-buildpackage) integrates Debian package building with Git version control. It maintains separate Git branches for upstream source, Debian packaging, and optionally pristine tarballs, providing a clean workflow for package maintenance.

The typical workflow involves importing upstream releases with **gbp import-orig**, making packaging changes on the debian branch, and building with **gbp buildpackage**. The tool handles merging upstream changes and generating proper Debian source packages.

gbp supports building in clean environments via pbuilder, sbuild, or cowbuilder for reproducible builds.

# CAVEATS

Requires understanding of both Git branching and Debian packaging. Branch naming conventions (upstream, debian, pristine-tar) must be followed. Complex merge scenarios may require manual intervention.

# HISTORY

git-buildpackage was created by Guido Gunther and first released around **2007**. It became a standard tool for Debian developers who wanted to combine the benefits of Git's distributed version control with Debian's packaging system.

# SEE ALSO

[debuild](/man/debuild)(1), [dpkg-buildpackage](/man/dpkg-buildpackage)(1), [pbuilder](/man/pbuilder)(8), [git](/man/git)(1)
