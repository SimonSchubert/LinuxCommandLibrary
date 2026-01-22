# TLDR

Build **binary and source** packages

```rpmbuild -ba path/to/spec_file```

Build **binary package** only

```rpmbuild -bb path/to/spec_file```

Build **source package** only

```rpmbuild -bs path/to/spec_file```

Build with **custom macro** definitions

```rpmbuild -bb path/to/spec_file --define "version 1.0"```

**Prepare** sources only (unpack and patch)

```rpmbuild -bp path/to/spec_file```

Build for **specific architecture**

```rpmbuild -bb --target x86_64 path/to/spec_file```

# SYNOPSIS

**rpmbuild** {**-ba**|**-bb**|**-bp**|**-bc**|**-bi**|**-bl**|**-bs**} [_options_] _SPECFILE_

# DESCRIPTION

**rpmbuild** builds both binary and source software packages from spec files. A package consists of an archive of files and metadata used to install and erase the archive files. The tool processes spec files through multiple build stages.

# PARAMETERS

**-ba**
> Build binary and source packages

**-bb**
> Build binary packages only

**-bp**
> Unpack sources and apply patches only

**-bc**
> Compile sources

**-bi**
> Install binaries and run checks

**-bl**
> Verify files exist

**-bs**
> Build source package only

**-D, --define='MACRO EXPR'**
> Define a macro with value

**--target PLATFORM**
> Set build target architecture

**--buildroot DIRECTORY**
> Override the build root directory

**--clean**
> Remove build tree after completion

**--nobuild**
> Skip all build stages (syntax check only)

**--nodeps**
> Do not verify build dependencies

**--rmsource**
> Remove source files after build

**--with/--without OPTION**
> Enable or disable configure options

# CAVEATS

The spec file defines how to build a package. Macros are defined in /usr/lib/rpm/macros, /etc/rpm/macros, and ~/.rpmmacros. Build dependencies must be installed before building unless --nodeps is used.

# HISTORY

**rpmbuild** is part of the **RPM** (RPM Package Manager) system, originally developed by Red Hat for managing software packages on Linux systems.

# SEE ALSO

[rpm](/man/rpm)(8), [rpmspec](/man/rpmspec)(8), [rpmsign](/man/rpmsign)(8)
