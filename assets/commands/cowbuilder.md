# TAGLINE

Copy-on-write Debian package builder

# TLDR

**Create a new cowbuilder environment**

```sudo cowbuilder --create --distribution [bookworm]```

**Update the cowbuilder environment**

```sudo cowbuilder --update```

**Build a package**

```sudo cowbuilder --build [package.dsc]```

**Login to the cowbuilder environment**

```sudo cowbuilder --login```

**Build for specific architecture**

```sudo cowbuilder --build --architecture [i386] [package.dsc]```

**Use specific base.cow location**

```sudo cowbuilder --basepath [/var/cache/pbuilder/base-bookworm.cow] --build [package.dsc]```

# SYNOPSIS

**cowbuilder** **--create** | **--update** | **--build** | **--login** [_options_]

# PARAMETERS

**--create**
> Create a new base.cow environment.

**--update**
> Update packages in the cowbuilder environment.

**--build** _dsc_
> Build a package from .dsc file.

**--login**
> Start a shell in the chroot environment.

**--distribution** _dist_
> Debian/Ubuntu distribution (bookworm, jammy, etc.).

**--architecture** _arch_
> Target architecture (amd64, i386, arm64).

**--basepath** _path_
> Path to base.cow directory.

**--buildresult** _path_
> Directory for build results.

**--mirror** _url_
> Package mirror URL.

**--save-after-login**
> Save changes made during login session.

# DESCRIPTION

**cowbuilder** is a wrapper around pbuilder that uses copy-on-write (COW) semantics for faster Debian package builds. Instead of creating a new chroot tarball for each build, it uses hard links to create a working copy, significantly reducing setup time.

The tool creates clean, reproducible build environments for Debian packages. Each build starts from a pristine base system, ensuring packages build correctly without hidden dependencies on the developer's system.

cowbuilder is commonly used for verifying package builds before upload to Debian archives, testing packages across different distributions, and CI/CD pipelines for Debian packaging.

# CAVEATS

Requires root privileges for chroot operations. The base.cow directory must be on a filesystem supporting hard links (not across filesystems). First build after update may be slower due to cache warming. COW benefits are lost if base.cow is on different filesystem than build directory.

# HISTORY

cowbuilder was created as an enhancement to **pbuilder** (Personal Builder) by using COW filesystem techniques. Pbuilder itself was created by **Junichi Uekawa** in the early **2000s** for building Debian packages in clean environments. Cowbuilder addressed pbuilder's main performance bottleneck: extracting the base tarball for each build.

# SEE ALSO

[pbuilder](/man/pbuilder)(8), [sbuild](/man/sbuild)(1), [debuild](/man/debuild)(1), [dpkg-buildpackage](/man/dpkg-buildpackage)(1)
