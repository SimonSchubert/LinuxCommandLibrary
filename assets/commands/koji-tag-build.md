# TAGLINE

applies a tag to one or more builds

# TLDR

**Tag** a build

```koji tag-build [tag] [nvr]```

Tag **multiple builds**

```koji tag-build [tag] [nvr1] [nvr2]```

Tag without **waiting**

```koji tag-build [tag] [nvr] --nowait```

**Wait** for completion even when running in the background

```koji tag-build [tag] [nvr] --wait```

**Force** tag operation

```koji tag-build [tag] [nvr] --force```

Display **help**

```koji tag-build --help```

# SYNOPSIS

**koji tag-build** [_options_] _tag_ _nvr_ [_nvr_...]

# DESCRIPTION

**koji tag-build** applies a tag to one or more builds. One tagging task is created per build and, when run in the foreground, the command waits for the tasks to finish. Tags in Koji are used to organize builds and control which packages appear in repositories.

# PARAMETERS

**tag**
> The tag name to apply

**nvr**
> Build specified by Name-Version-Release (can specify multiple)

**--wait**
> Wait on the tag tasks, even when running in the background

**--nowait**
> Do not wait for task completion

**--force**
> Force the operation (e.g. tag a package not in the tag's package list or override policy; typically needs admin rights)

**-h, --help**
> Display help information

# CAVEATS

Tagging requires appropriate permissions. Some tags have policies that restrict which packages can be tagged, and the package must normally be in the tag's package list (see **koji add-pkg**).

# INSTALL

```dnf: sudo dnf install koji```

```brew: brew install koji```

```nix: nix profile install nixpkgs#koji```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[koji](/man/koji)(1), [koji-untag-build](/man/koji-untag-build)(1), [koji-taginfo](/man/koji-taginfo)(1)

# RESOURCES

```[Source code](https://forge.fedoraproject.org/koji/koji)```

```[Homepage](https://koji.build/)```

```[Documentation](https://docs.pagure.org/koji/)```

<!-- verified: 2026-09-29 -->
