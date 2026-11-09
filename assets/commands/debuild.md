# TAGLINE

build Debian packages from source

# TLDR

**Build package in current directory**

```debuild```

**Build binary package only**

```debuild -b```

**Build source package only**

```debuild -S```

**Build without signing**

```debuild -us -uc```

**Build with parallel jobs**

```debuild -j[4]```

**Build without running lintian** (debuild options go before dpkg-buildpackage options)

```debuild --no-lintian -us -uc```

**Skip the build dependency check**

```debuild -d```

**Build a source package for upload**, including the upstream tarball

```debuild -S -sa```

**Keep an environment variable** through the sanitised build

```debuild -e [VARIABLE]```

**Pass options to lintian**

```debuild --lintian-opts -i -I```

**Run a debian/rules target** under fakeroot

```debuild -- [binary]```

# SYNOPSIS

**debuild** [_debuild options_] [_dpkg-buildpackage options_] [**--lintian-opts** _lintian options_]

**debuild** [_debuild options_] **--** **binary**|**binary-arch**|**binary-indep**|**clean** ...

# DESCRIPTION

**debuild** creates all the files needed to upload a Debian package. It runs **dpkg-buildpackage**, then **lintian** on the resulting .changes file, and finally signs the files with **debsign**. A build log is saved to _../package_version_arch.build_.

The environment is sanitised before building: all variables are removed except a short list such as TERM, HOME, LOGNAME, DEB_*, the compiler FLAGS variables and the locale variables, and PATH is reset. Use **-e** or **--preserve-env** to keep others.

debuild climbs the directory tree until it finds _debian/changelog_, so it can be started from a subdirectory of the source package.

# PARAMETERS

**--no-conf**, **--noconf**
> Do not read configuration files. Must be the first option.

**--lintian**
> Run lintian after the build (default).

**--no-lintian**
> Skip lintian checks after build.

**--lintian-opts** _options_
> Pass all following options to lintian.

**-e** _var_, **--preserve-envvar**=_var_
> Keep _var_ in the environment. A trailing * matches a prefix.

**-e** _var_=_value_, **--set-envvar**=_var_=_value_
> Set _var_ and keep it in the environment.

**--preserve-env**
> Do not clean the environment, except for PATH.

**--prepend-path**=_value_
> Prepend _value_ to the normalised PATH, useful for ccache or distcc.

**-r**_command_, **--rootcmd**=_command_
> Command used to gain root (default: fakeroot).

**-d**
> Do not run dpkg-checkbuilddeps.

**-D**
> Run dpkg-checkbuilddeps.

**--no-tgz-check**
> Do not check that the .orig.tar.gz exists before building.

**--check-dirname-level** _N_
> When to check the directory name against the package name: 0 never, 1 only after changing directory (default), 2 always.

**--clear-hooks**
> Clear all configured hooks.

The following are passed through to **dpkg-buildpackage**:

**-b**
> Build binary package only.

**-S**
> Build source package only.

**-sa**
> Always include the upstream tarball in the upload.

**-us**
> Don't sign the source package.

**-uc**
> Don't sign the changes file.

**-k**_keyid_
> Key used for signing.

**-j**_n_
> Parallel build with n jobs.

# CONFIGURATION

**/etc/devscripts.conf**, **~/.devscripts**
> Shell fragments sourced in that order, setting variables such as DEBUILD_DPKG_BUILDPACKAGE_OPTS, DEBUILD_LINTIAN, DEBUILD_PRESERVE_ENV and hooks like DEBUILD_SIGNING_HOOK.

# CAVEATS

Must be run inside a Debian source tree. Build dependencies must be installed unless **-d** is used. Signing is skipped when the changelog distribution is UNRELEASED, unless dpkg-buildpackage's **--force-sign** is given. Lintian aborts when run as root. Part of the devscripts package.

# SEE ALSO

[dpkg-buildpackage](/man/dpkg-buildpackage)(1), [lintian](/man/lintian)(1), [dch](/man/dch)(1), [debsign](/man/debsign)(1), [fakeroot](/man/fakeroot)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/devscripts)```

```[Documentation](https://manpages.debian.org/unstable/devscripts/debuild.1.en.html)```

<!-- verified: 2026-11-09 -->
