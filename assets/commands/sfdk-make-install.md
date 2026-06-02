# TAGLINE

Install built files in Sailfish OS build target

# TLDR

**Install** the previously built project into the build target sysroot

```sfdk make-install```

**Install to a custom destination** directory

```sfdk make-install DESTDIR=[path]```

**Install in parallel** using N jobs

```sfdk make-install -j[N]```

**Install verbosely**

```sfdk make-install V=1```

# SYNOPSIS

**sfdk make-install** [_make_arguments_...]

# DESCRIPTION

**sfdk make-install** runs the `install` target of the underlying build system (typically **make**, **cmake**, or **qmake**-generated Makefiles) inside the Sailfish OS build target. It is a thin wrapper around **sfdk make** that selects the install target and forwards any additional arguments to the build tool.

The command is normally executed after **sfdk build** or **sfdk make** as part of the development workflow when staging files for inclusion in an RPM package, or when deploying built artifacts to the build target sysroot for testing.

# PARAMETERS

**DESTDIR=**_path_
> Stage installation into _path_ rather than the default sysroot prefix. Standard make/autotools convention.

**-j**_N_
> Run up to _N_ install jobs in parallel.

**V=1**
> Enable verbose build output.

# CAVEATS

Requires an initialized Sailfish SDK build engine and an active build target configured via **sfdk config**. The project must already be built; **sfdk make-install** does not trigger compilation. Behavior depends on the project's own install rules.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-make](/man/sfdk-make)(1)
