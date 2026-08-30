# TAGLINE

Gentoo package build interface

# TLDR

Run the **whole build and install** in one go

```ebuild [path/to/package.ebuild] merge```

Only **download** the source archives

```ebuild [path/to/package.ebuild] fetch```

**Regenerate the Manifest**, which a local overlay needs after any edit

```ebuild [path/to/package.ebuild] manifest```

Skip the Manifest check while testing a **work-in-progress** ebuild

```ebuild --skip-manifest [path/to/package.ebuild] compile```

Unpack the sources and apply **patches and prepare steps**

```ebuild [path/to/package.ebuild] prepare```

Run the package's **configure** phase

```ebuild [path/to/package.ebuild] configure```

Run the upstream **test suite**

```ebuild [path/to/package.ebuild] test```

Build a **binary package** without merging it

```ebuild [path/to/package.ebuild] package```

Merge the staged image into the **live filesystem**

```ebuild [path/to/package.ebuild] qmerge```

**Uninstall** the package again

```ebuild [path/to/package.ebuild] unmerge```

Delete the **temporary build tree**

```ebuild [path/to/package.ebuild] clean```

Trace a failing phase with **debug output**

```ebuild --debug [path/to/package.ebuild] compile```

# SYNOPSIS

**ebuild** _file_ _command_...

# DESCRIPTION

**ebuild** is a low-level interface to the Gentoo Portage system. It processes ebuild files, which are Bash scripts describing how to build and install packages.

The tool provides direct access to individual build phases (fetch, unpack, compile, install, merge), allowing developers to test and debug packages step-by-step. This is essential for package maintainers creating or modifying ebuilds.

While emerge is used for normal package management, ebuild gives fine-grained control over the build process. It's particularly useful for testing new packages before adding them to the portage tree or for manually installing custom ebuilds.

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

**unmerge**
> Remove from live filesystem

**setup**
> Run pre-build setup phase

**prepare**
> Run source preparation (patches, etc.)

**configure**
> Run configure phase

**test**
> Run package tests

**prerm**
> Execute pre-removal tasks

**postrm**
> Execute post-removal tasks

**postinst**
> Execute post-installation tasks

**digest**
> Create manifest (legacy alias for manifest)

# CAVEATS

Gentoo-specific. For normal package management, use **emerge**. Ebuild files require specific directory structure in portage tree. By default, ebuild executes all phases in order up to the specified one, skipping phases already completed in a previous invocation.

# SEE ALSO

[emerge](/man/emerge)(1), [equery](/man/equery)(1)
