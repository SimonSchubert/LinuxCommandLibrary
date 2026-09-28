# TAGLINE

downloads built packages from the Koji build system

# TLDR

Download **all RPMs** from a build

```koji download-build [build_id|nvr]```

Download RPMs for **specific architecture**

```koji download-build [build_id] --arch x86_64```

Download RPMs signed with **specific key**

```koji download-build [build_id] --key [key_id]```

Download only the **source RPM**

```koji download-build --arch src [nvr]```

Download a **specific RPM**

```koji download-build --rpm [name-version-release.arch]```

Also download **debuginfo** RPMs

```koji download-build --debuginfo [nvr]```

Download the **latest build** of a package from a tag

```koji download-build --latestfrom [tag] [package]```

Download **image archives** instead of RPMs

```koji download-build --type image [nvr]```

Display **help**

```koji download-build --help```

# SYNOPSIS

**koji download-build** [_options_] _nvr_|_build_id_

# DESCRIPTION

**koji download-build** downloads built packages from the Koji build system. You can specify a build by its ID or NVR (Name-Version-Release), or download a single RPM with **--rpm**. Files are saved to the current directory. Scratch builds have no build entry; use **koji download-task** for those.

# PARAMETERS

**nvr|build_id**
> Build identifier or NVR string (or an RPM NVRA with --rpm, or a package name with --latestfrom)

**-a, --arch** _ARCH_
> Only download RPMs for the given architecture (e.g., x86_64, aarch64, noarch, src); may be repeated

**--debuginfo**
> Also download -debuginfo RPMs

**--rpm**
> Interpret the argument as an RPM and download only that file

**--key** _KEY_
> Download RPMs signed with the given key

**--fallback-unsigned**
> With --key: download unsigned RPMs if signed copies are not found

**--type** _TYPE_
> Download archives of the given type instead of RPMs: maven, win, image, remote-sources

**--latestfrom** _TAG_
> Download the latest build of the package from the given tag

**--task-id**
> Interpret the ID as a task ID

**--topurl** _URL_
> URL under which Koji files are accessible

**--nofailarch**
> Do not fail if a package is not available for the requested architectures

**--noprogress**
> Do not display the progress meter

**-q, --quiet**
> Suppress output

**-h, --help**
> Display help information

# CAVEATS

Large builds with many subpackages may take significant time and bandwidth. Signed copies only exist if the build was signed with that key in Koji; otherwise use **--fallback-unsigned**.

# INSTALL

```dnf: sudo dnf install koji```

```brew: brew install koji```

```nix: nix profile install nixpkgs#koji```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[koji](/man/koji)(1), [koji-build](/man/koji-build)(1), [dnf](/man/dnf)(8)

# RESOURCES

```[Source code](https://forge.fedoraproject.org/koji/koji)```

```[Homepage](https://koji.build/)```

```[Documentation](https://docs.pagure.org/koji/)```

<!-- verified: 2026-09-29 -->
