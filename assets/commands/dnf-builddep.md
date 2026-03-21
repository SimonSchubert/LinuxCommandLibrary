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

Install dependencies **without confirmation** prompts

```dnf builddep -y [path/to/specification.spec]```

# SYNOPSIS

**dnf builddep** [_options_] _package_

# DESCRIPTION

**dnf builddep** installs all dependencies required to build a package from its spec file or source RPM. Part of dnf-plugins-core.

Essential for building RPM packages from source.

# PARAMETERS

**--skip-unavailable**
> Skip build dependencies not available in repositories.

**-D**, **--define** _macro_
> Define RPM macro when parsing spec files (not applied to SRPMs).

**--spec**
> Treat arguments as .spec files.

**--srpm**
> Treat arguments as source RPM files.

**--nobest**
> Do not limit packages to the best available versions.

**-y**, **--assumeyes**
> Automatically answer yes for all questions.

**--help-cmd**
> Display help for this command.

# CAVEATS

Requires dnf-plugins-core. Build dependencies may include many packages. Root privileges typically required. The --skip-broken option is not honored by builddep.

# SEE ALSO

[dnf](/man/dnf)(8), [rpmbuild](/man/rpmbuild)(8), [rpm](/man/rpm)(8), [mock](/man/mock)(1)
