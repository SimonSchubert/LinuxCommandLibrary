# TLDR

**Tag** a build

```koji tag-build [tag] [nvr]```

Tag **multiple builds**

```koji tag-build [tag] [nvr1] [nvr2]```

Tag without **waiting**

```koji tag-build [tag] [nvr] --nowait```

**Force** tag operation

```koji tag-build [tag] [nvr] --force```

Display **help**

```koji tag-build --help```

# SYNOPSIS

**koji tag-build** [_options_] _tag_ _nvr_ [_nvr_...]

# DESCRIPTION

**koji tag-build** applies a tag to one or more builds. Tags in Koji are used to organize builds and control which packages appear in repositories.

# PARAMETERS

**tag**
> The tag name to apply

**nvr**
> Build specified by Name-Version-Release (can specify multiple)

**--nowait**
> Do not wait for task completion

**--force**
> Force tagging even if policy would prevent it

**-h, --help**
> Display help information

# CAVEATS

Tagging requires appropriate permissions. Some tags have policies that restrict which packages can be tagged.

# SEE ALSO

[koji](/man/koji)(1), [koji-untag-build](/man/koji-untag-build)(1), [koji-taginfo](/man/koji-taginfo)(1)
