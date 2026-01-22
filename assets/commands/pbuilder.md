# TLDR

**Create base tarball**

```pbuilder create```

**Build package**

```pbuilder build [package.dsc]```

**Update base tarball**

```pbuilder update```

**Login to chroot**

```pbuilder login```

**Build with distribution**

```pbuilder build --distribution [sid] [package.dsc]```

# SYNOPSIS

**pbuilder** [_command_] [_options_]

# PARAMETERS

**create**
> Create base tarball.

**build** _DSC_
> Build package from .dsc.

**update**
> Update base tarball.

**login**
> Enter chroot shell.

**--distribution** _DIST_
> Target distribution.

**--basetgz** _FILE_
> Base tarball path.

# DESCRIPTION

**pbuilder** builds Debian packages in chroot. Clean build environment.

The tool ensures reproducible builds. Isolated from host system.

pbuilder builds packages cleanly.

# CAVEATS

Root required. Debian/Ubuntu specific. Network access configurable.

# HISTORY

pbuilder was created for **clean Debian package** building in isolated chroots.

# SEE ALSO

[dpkg-buildpackage](/man/dpkg-buildpackage)(1), [sbuild](/man/sbuild)(1), [cowbuilder](/man/cowbuilder)(1)

