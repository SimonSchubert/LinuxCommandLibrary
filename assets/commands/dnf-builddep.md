# TAGLINE

install build dependencies for RPM packages

# TLDR

Install **build dependencies** for a spec file

```dnf builddep [path/to/specification.spec]```

Install dependencies from a **source RPM**

```dnf builddep [path/to/package.src.rpm]```

Install dependencies, **skipping unavailable** packages

```dnf builddep --skip-unavailable [path/to/specification.spec]```

**Define RPM macro** during dependency resolution

```dnf builddep -D '[macro expression]' [path/to/specification.spec]```

Install dependencies for a **package name** from repositories

```dnf builddep [package_name]```

Treat a differently named file **as a spec file**

```dnf builddep --spec [path/to/specification.spec.in]```

Install dependencies **without confirmation** prompts

```dnf builddep -y [path/to/specification.spec]```

# SYNOPSIS

**dnf builddep** [_options_] _package_...

# PARAMETERS

_PACKAGE_
> Path to a .src.rpm, .nosrc.rpm or .spec file, or the name of a package available in a repository.

**--skip-unavailable**
> Skip build dependencies not available in repositories. All available build dependencies are installed.

**-D**, **--define** _'macro expr'_
> Define the RPM macro when parsing spec files (not applied to source RPMs).

**--spec**
> Treat arguments as .spec files.

**--srpm**
> Treat arguments as source RPM files.

**--with** _option_
> Enable a conditional build option when parsing spec files (dnf5 only).

**--without** _option_
> Disable a conditional build option when parsing spec files (dnf5 only).

**--allowerasing**
> Allow removing installed packages to resolve dependencies (dnf5 builddep option; a general option in dnf4).

**--nobest**
> Do not limit packages to the best available versions (general dnf4 option).

**-y**, **--assumeyes**
> Automatically answer yes for all questions.

**--help-cmd**
> Display help for this command (dnf4 plugin).

# DESCRIPTION

**dnf builddep** installs all dependencies required to build a package from its spec file or source RPM. Under dnf4 it is part of dnf-plugins-core; on dnf5 systems it is provided by the dnf5 builddep plugin.

Build dependencies in a source RPM may differ from what you expect, because they were evaluated according to macros set on the package build host.

# CAVEATS

Requires dnf-plugins-core on dnf4 systems. Build dependencies may include many packages. Root privileges typically required. The --skip-broken option is not honored by builddep, so uninstallable packages cannot be skipped.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf5](/man/dnf5)(8), [rpmbuild](/man/rpmbuild)(8), [rpm](/man/rpm)(8), [mock](/man/mock)(1)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/dnf-plugins-core)```

```[Documentation](https://dnf-plugins-core.readthedocs.io/en/latest/builddep.html)```

<!-- verified: 2026-11-09 -->
