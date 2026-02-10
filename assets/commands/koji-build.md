# TAGLINE

builds an RPM package using the Koji build system

# TLDR

Build from **src.rpm**

```koji build target path/to/package.src.rpm```

Build from **SCM URL**

```koji build target git+https://src.fedoraproject.org/rpms/pkg.git#commit```

Perform **scratch** build

```koji build target path/to/package.src.rpm --scratch```

Build and **wait** for completion

```koji build target path/to/package.src.rpm --wait```

Build without **waiting**

```koji build target path/to/package.src.rpm --nowait```

Display **help**

```koji build --help```

# SYNOPSIS

**koji build** [_options_] _target_ _srpm_|_scm_url_

# DESCRIPTION

**koji build** builds an RPM package using the Koji build system. It can build from a source RPM or from a SCM (Source Code Management) URL pointing to a package repository.

# PARAMETERS

**target**
> Build target defining the build environment

**--scratch**
> Perform a scratch build (not imported into repos)

**--wait**
> Wait for build completion even if running in background

**--nowait**
> Submit build and return immediately

**--arch-override ARCHES**
> Override architectures to build for

**--repo-id REPO**
> Use a specific repo for the build

**--background**
> Run build at a lower priority

**-h, --help**
> Display help information

# CAVEATS

Scratch builds are temporary and not imported into Koji's package database. SCM URLs must use a specific format including the commit hash. Requires proper Koji credentials and permissions.

# HISTORY

**koji** is Fedora's build system, used for building and tracking packages across multiple architectures and releases.

# SEE ALSO

[koji](/man/koji)(1), [rpmbuild](/man/rpmbuild)(8), [mock](/man/mock)(1)
