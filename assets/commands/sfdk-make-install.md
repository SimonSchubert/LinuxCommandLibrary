# TAGLINE

Run the %install step of a Sailfish OS package build

# TLDR

**Run the %install section** of the spec file to populate the RPM buildroot

```sfdk make-install```

**Run it for a specific build target**

```sfdk -c target=[target_name] make-install```

**Use a specific spec file**

```sfdk -c specfile=[rpm/myapp.spec] make-install```

**Typical step-by-step build** (prepare, configure, build, install, package)

```sfdk prepare && sfdk qmake && sfdk make && sfdk make-install && sfdk package```

# SYNOPSIS

**sfdk** [**-c** _option_=_value_]... **make-install**

# DESCRIPTION

**sfdk make-install** runs **rpmbuild** inside the Sailfish SDK build engine and executes just the **%install** section of the project's RPM spec file, populating the RPM buildroot. It is one of the individual build steps that **sfdk build** otherwise runs all at once, useful when iterating on a single step.

This is not the same as running **make install**: whatever commands the spec file's **%install** section contains are executed, typically **make install DESTDIR=%{buildroot}** or the CMake equivalent. The command takes no arguments of its own.

# CONFIGURATION

Relevant options are set with **sfdk config** or per invocation with **-c**:

**target**
> Build target to use (required).

**specfile**
> Path to the RPM spec file, if not found automatically.

**build-shell.args**
> Extra arguments for the build shell.

**[no-]snapshot**, **[no-]fix-version**, **dirty-version-suffix**
> Target snapshot and version handling, as for the other build steps.

# CAVEATS

Requires a configured build target. The project must already be built with **sfdk make** (or **sfdk build**); **make-install** does not compile anything. Behavior depends entirely on the spec file's **%install** section.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-make](/man/sfdk-make)(1), [sfdk-config](/man/sfdk-config)(1), [sfdk-build-shell](/man/sfdk-build-shell)(1), [rpmbuild](/man/rpmbuild)(8)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-23 -->
