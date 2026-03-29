# TAGLINE

Build RPM packages from spec files

# TLDR

Build **binary and source** packages

```rpmbuild -ba path/to/spec_file```

Build **binary package** only

```rpmbuild -bb path/to/spec_file```

Build **source package** only

```rpmbuild -bs path/to/spec_file```

Build with **custom macro** definitions

```rpmbuild -bb --define "version 1.0" path/to/spec_file```

**Prepare** sources only (unpack and patch)

```rpmbuild -bp path/to/spec_file```

Build for **specific architecture**

```rpmbuild -bb --target x86_64 path/to/spec_file```

**Rebuild** from an existing **source package**

```rpmbuild --rebuild path/to/package.src.rpm```

# SYNOPSIS

**rpmbuild** {**-ba**|**-bb**|**-bp**|**-bc**|**-bi**|**-bl**|**-bs**|**-br**|**-bd**} [_options_] _SPECFILE_

# DESCRIPTION

**rpmbuild** builds both binary and source software packages from spec files. A package consists of an archive of files and metadata used to install and erase the archive files. The tool processes spec files through multiple build stages.

# PARAMETERS

**-ba**
> Build binary and source packages

**-bb**
> Build binary packages only

**-bp**
> Unpack sources and apply patches only (%prep stage)

**-bf**
> Configure the sources (%conf stage, equivalent to ./configure)

**-bc**
> Compile sources (%build stage)

**-bi**
> Install binaries into the build root and run %check

**-bl**
> Verify that all files listed in %files exist

**-bs**
> Build source package only

**-br**
> Build source package with dynamic build dependency resolution

**-bd**
> Check dynamic build dependencies and generate build requirements

**-D**, **--define** _'MACRO EXPR'_
> Define a macro with value

**--target** _PLATFORM_
> Set build target architecture (e.g. `x86_64`, `aarch64`)

**--buildroot** _DIRECTORY_
> Override the build root directory

**--clean**
> Remove build tree after completion

**--nobuild**
> Skip all build stages (spec file syntax check only)

**--noprep**
> Skip the %prep stage

**--noclean**
> Skip the %clean stage

**--nocheck**
> Skip the %check stage

**--nodeps**
> Do not verify build dependencies

**--short-circuit**
> Skip directly to the specified stage (usable with -bc, -bi, -bb only)

**--rebuild** _SOURCEPKG_
> Install the source package, build binary packages, then clean up

**--recompile** _SOURCEPKG_
> Like --rebuild but stops after the install stage without creating binary packages

**--rmsource**
> Remove source files after build

**--rmspec**
> Remove spec file after build

**--with** _OPTION_
> Enable a conditional build option defined in the spec file

**--without** _OPTION_
> Disable a conditional build option defined in the spec file

# CONFIGURATION

**~/.rpmmacros**
> User-level macro definitions overriding system defaults, commonly used to set **%_topdir** for the build tree location.

**/etc/rpm/macros**
> System-wide macro overrides for all users on the machine.

**/usr/lib/rpm/macros**
> Default RPM macro definitions shipped with the rpm package, defining build paths, compiler flags, and platform defaults.

# CAVEATS

The spec file defines how to build a package. Macros are defined in /usr/lib/rpm/macros, /etc/rpm/macros, and ~/.rpmmacros. Build dependencies must be installed before building unless --nodeps is used.

# HISTORY

**rpmbuild** is part of the **RPM** (RPM Package Manager) system, originally developed by Red Hat for managing software packages on Linux systems.

# SEE ALSO

[rpm](/man/rpm)(8), [rpmspec](/man/rpmspec)(8), [rpmsign](/man/rpmsign)(8), [mock](/man/mock)(1)
