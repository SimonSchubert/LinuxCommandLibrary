# TLDR

**Check Debian package**

```lintian [package.deb]```

**Check changes file**

```lintian [package.changes]```

**Verbose output**

```lintian -v [package.deb]```

**Show info tags**

```lintian -I [package.deb]```

**Show all tags**

```lintian -iI [package.deb]```

**Check specific tag**

```lintian --tags [tag-name] [package.deb]```

# SYNOPSIS

**lintian** [_options_] _packages_

# PARAMETERS

_PACKAGES_
> Debian packages, changes, or dsc files.

**-v**
> Verbose output.

**-I**
> Display info tags.

**-i**
> Display tag descriptions.

**--tags** _TAG_
> Check specific tags only.

**--suppress-tags** _TAG_
> Suppress specific tags.

**--help**
> Display help information.

# DESCRIPTION

**lintian** checks Debian packages for policy compliance. It identifies bugs, policy violations, and issues.

The tool is essential for Debian maintainers. It checks both binary and source packages.

lintian validates Debian packages.

# CAVEATS

Debian/Ubuntu focused. Large tag database. Some checks need installed packages.

# HISTORY

Lintian was created by **Christian Schwarz** in 1998 to help Debian maintainers produce quality packages.

# SEE ALSO

[lintian-info](/man/lintian-info)(1), [dpkg](/man/dpkg)(1), [debuild](/man/debuild)(1)

