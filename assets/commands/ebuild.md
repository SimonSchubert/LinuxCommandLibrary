# TLDR

Create/update package **manifest**

```ebuild [path/to/file.ebuild] manifest```

**Clean** temporary build directories

```ebuild [path/to/file.ebuild] clean```

**Fetch** sources

```ebuild [path/to/file.ebuild] fetch```

**Extract** sources

```ebuild [path/to/file.ebuild] unpack```

**Compile** sources

```ebuild [path/to/file.ebuild] compile```

**Install** to temporary directory

```ebuild [path/to/file.ebuild] install```

Install to **live filesystem**

```ebuild [path/to/file.ebuild] qmerge```

**Full build** (fetch, unpack, compile, install, merge)

```ebuild [path/to/file.ebuild] merge```

# SYNOPSIS

**ebuild** _file_ _command_...

# DESCRIPTION

**ebuild** is a low-level interface to the Gentoo Portage system. It processes ebuild files, which are Bash scripts describing how to build and install packages.

Used for package development and manual package operations.

# PARAMETERS

**manifest**
> Create/update package manifest

**clean**
> Remove temporary build files

**fetch**
> Download source files

**unpack**
> Extract sources

**compile**
> Build the package

**install**
> Install to temp directory

**qmerge**
> Merge to live filesystem

**merge**
> All steps combined

# CAVEATS

Gentoo-specific. For normal package management, use emerge. Ebuild files require specific directory structure in portage tree.

# SEE ALSO

[emerge](/man/emerge)(1), [equery](/man/equery)(1)
