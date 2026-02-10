# TAGLINE

provides information about lintian tags

# TLDR

**Show tag information**

```lintian-info [tag-name]```

**List all tags**

```lintian-info --list-tags```

**Show tag description**

```lintian-info -t [tag-name]```

**Search tags**

```lintian-info --tags [pattern]```

**Show check info**

```lintian-info --check [check-name]```

# SYNOPSIS

**lintian-info** [_options_] [_tag_]

# PARAMETERS

_TAG_
> Lintian tag name.

**-t** _TAG_
> Show tag description.

**--list-tags**
> List all available tags.

**--tags** _PATTERN_
> Search for matching tags.

**--check** _NAME_
> Show check information.

**--help**
> Display help information.

# DESCRIPTION

**lintian-info** provides information about lintian tags. Tags identify specific issues in Debian packages.

The tool explains what each tag means and how to fix the issue it represents.

# CAVEATS

Part of lintian package. Tag database may differ between versions. Debian focused.

# HISTORY

lintian-info is part of the **lintian** package, providing documentation for its extensive tag collection.

# SEE ALSO

[lintian](/man/lintian)(1), [debuild](/man/debuild)(1)

