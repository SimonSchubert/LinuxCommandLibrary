# TLDR

**Add new changelog entry**

```dch "[changelog message]"```

**Increment version** for new release

```dch -i```

**Create new changelog** entry with version

```dch -v [1.0.0-1]```

**Edit changelog** in editor

```dch -e```

**Append to current** entry

```dch -a "[additional message]"```

**Create entry for** specific distribution

```dch -D [unstable] "[message]"```

**Set urgency level**

```dch -u [high] "[message]"```

# SYNOPSIS

**dch** [_options_] [_message_]

# PARAMETERS

_MESSAGE_
> Changelog entry text to add.

**-i**, **--increment**
> Increment version for new upstream release.

**-v** _VERSION_
> Create entry with specific version.

**-a**, **--append**
> Append to current changelog entry.

**-e**, **--edit**
> Open changelog in editor.

**-D** _DIST_
> Set target distribution.

**-u** _URGENCY_
> Set urgency: low, medium, high, emergency, critical.

**-n**, **--nmu**
> Non-maintainer upload increment.

**--help**
> Display help information.

# DESCRIPTION

**dch** (Debian changelog) is a tool for editing Debian package changelog files (debian/changelog). It automates version incrementing, entry formatting, and maintains the strict changelog format required by Debian packaging.

The tool handles the tedious formatting requirements of Debian changelogs, including proper date formats, maintainer information from DEBEMAIL/DEBFULLNAME environment variables, and version string manipulation.

dch is essential for Debian package maintainers, automating the changelog workflow during package updates, security fixes, and new upstream releases.

# CAVEATS

Requires properly configured DEBEMAIL and DEBFULLNAME environment variables. Must be run in a directory containing debian/changelog. Version string format must follow Debian conventions.

# HISTORY

dch is part of **devscripts**, a collection of tools for Debian package maintainers. It has been a core Debian development tool since the mid-1990s, evolving alongside Debian's packaging standards.

# SEE ALSO

[debchange](/man/debchange)(1), [dpkg-buildpackage](/man/dpkg-buildpackage)(1), [dput](/man/dput)(1)
