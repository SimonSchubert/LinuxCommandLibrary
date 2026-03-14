# TAGLINE

print tag information from a Koji build system

# TLDR

**Print information about a tag**

```koji taginfo [tag]```

**Print info for multiple tags**

```koji taginfo [tag1] [tag2]```

**Display help**

```koji taginfo --help```

# SYNOPSIS

**koji taginfo** [_options_] _tag_ [_tag_...]

# DESCRIPTION

**koji taginfo** prints basic information about one or more tags from a Koji build system, including the tag ID, permissions, arches, locked status, inheritance chain, and associated build targets. This is useful for inspecting how tags are configured in Fedora, CentOS, and other RPM-based distribution build systems.

# PARAMETERS

**tag**
> Tag name to query (can specify multiple).

**-h**, **--help**
> Display help information.

# SEE ALSO

[koji](/man/koji)(1), [koji-tag-build](/man/koji-tag-build)(1)
