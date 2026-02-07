# TAGLINE

collection of programs automating Debian package building

# TLDR

**Clean build artifacts**

```dh_clean```

**Install files to package directory**

```dh_install```

**Generate package dependencies**

```dh_shlibdeps```

**Compress documentation**

```dh_compress```

**Generate md5sums**

```dh_md5sums```

**Build package using dh sequencer**

```dh binary```

**Execute full build sequence**

```debian/rules binary```

# SYNOPSIS

**dh_**_command_ [_options_] [**--** _args_]

**dh** _target_ [_options_]

# COMMON COMMANDS

**dh_auto_configure**
> Run upstream configure script.

**dh_auto_build**
> Build upstream source.

**dh_auto_install**
> Install into debian/tmp.

**dh_auto_test**
> Run upstream test suite.

**dh_auto_clean**
> Clean upstream build.

**dh_install**
> Install files into package directories.

**dh_installdocs**
> Install documentation.

**dh_installman**
> Install man pages.

**dh_compress**
> Compress files in packages.

**dh_fixperms**
> Fix file permissions.

**dh_shlibdeps**
> Calculate shared library dependencies.

**dh_gencontrol**
> Generate control file.

**dh_builddeb**
> Build the .deb file.

# DESCRIPTION

**debhelper** is a collection of programs (dh_*) that automate common tasks when building Debian packages. Instead of writing shell commands in debian/rules, maintainers call debhelper commands that handle standard operations correctly.

The **dh** command is a sequencer that runs appropriate debhelper commands in the correct order. A minimal debian/rules can be just three lines using dh, with overrides for customization.

Debhelper reads configuration from debian/ directory files: install, docs, manpages, etc. This declarative approach simplifies packaging while maintaining flexibility for complex packages.

# MINIMAL RULES FILE

```makefile
#!/usr/bin/make -f
%:
	dh $@
```

# CAVEATS

Debhelper is Debian-specific; other distributions have different packaging systems. Compatibility levels (debhelper-compat) affect behavior; always specify the level. Some dh commands have many options; consult man pages for details. Override targets in debian/rules customize dh behavior.

# HISTORY

Debhelper was created by **Joey Hess** in **1997** to simplify Debian packaging. Before debhelper, each package reimplemented common tasks in shell scripts, leading to inconsistency and bugs. The dh sequencer was added in debhelper 7 (2008), dramatically simplifying debian/rules files. Debhelper has become the standard way to build Debian packages.

# SEE ALSO

[dh](/man/dh)(1), [dpkg-buildpackage](/man/dpkg-buildpackage)(1), [dh_make](/man/dh_make)(1), [debuild](/man/debuild)(1)
