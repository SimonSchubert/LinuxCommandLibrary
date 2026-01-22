# TLDR

Install **build dependencies** for a spec file

```dnf builddep [path/to/specification.spec]```

Install dependencies, **ignoring unavailable**

```dnf builddep --skip-unavailable [path/to/specification.spec]```

**Define RPM macro**

```dnf builddep -D '[expression]'```

Specify **.spec file** path

```dnf builddep --spec [argument]```

Specify **.rpm file** path

```dnf builddep --srpm [argument]```

# SYNOPSIS

**dnf builddep** [_options_] _package_

# DESCRIPTION

**dnf builddep** installs all dependencies required to build a package from its spec file or source RPM. Part of dnf-plugins-core.

Essential for building RPM packages from source.

# PARAMETERS

**--skip-unavailable**
> Ignore unavailable packages

**-D, --define** _macro_
> Define RPM macro

**--spec** _file_
> Use spec file

**--srpm** _file_
> Use source RPM

**--help-cmd**
> Display help

# CAVEATS

Requires dnf-plugins-core. Build dependencies may include many packages. Root privileges typically required.

# SEE ALSO

[dnf](/man/dnf)(8), [rpmbuild](/man/rpmbuild)(8), [mock](/man/mock)(1)
