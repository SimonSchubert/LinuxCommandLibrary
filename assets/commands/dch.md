# TAGLINE

Debian package changelog editor

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

**Finalize the entry** for release

```dch -r ""```

**Close a bug** in the changelog

```dch --closes [123456]```

**Create a new changelog**

```dch --create -v [1.0-1] --package [name]```

# SYNOPSIS

**dch** [_options_] [_message_]

# PARAMETERS

_MESSAGE_
> Changelog entry text to add.

**-i**, **--increment**
> Increment the Debian release number (or the version of a native package).

**-v**, **--newversion** _VERSION_
> Use the given version, including the Debian release part.

**-a**, **--append**
> Add an entry at the end of the current version's entries.

**-e**, **--edit**
> Open changelog in editor.

**-D**, **--distribution** _DIST_
> Set target distribution.

**-u**, **--urgency** _URGENCY_
> Set urgency: low, medium (default), high, critical, emergency.

**-c**, **--changelog** _FILE_
> Edit the given file instead of debian/changelog.

**--closes** _BUG_[,_BUG_...]
> Add entries closing the given bug numbers and open the editor.

**-R**, **--rebuild**
> Increment the Debian release number for a no-change rebuild.

**-l**, **--local** _SUFFIX_
> Add a suffix to the Debian version number for a local build.

**-n**, **--nmu**
> Non-maintainer upload increment.

**-b**, **--force-bad-version**
> Force a version lower than the current one (e.g. when backporting).

**-p**, **--preserve**
> Preserve the source tree directory name when the version changes.

**-r**, **--release**
> Finalize the changelog for release: update the timestamp and replace UNRELEASED with the target distribution.

**--create**
> Create a new debian/changelog (or NEWS) file. Use **--package** and **-v** to set the name and version.

**--help**
> Display help information.

# DESCRIPTION

**dch** (Debian changelog) is a tool for editing Debian package changelog files (debian/changelog). It automates version incrementing, entry formatting, and maintains the strict changelog format required by Debian packaging.

The tool handles the tedious formatting requirements of Debian changelogs, including proper date formats, maintainer information from DEBEMAIL/DEBFULLNAME environment variables, and version string manipulation.

With text on the command line, dch runs in batch mode; without text it opens the editor. If no action option is given, it behaves like **-i** when the package has been released (the distribution is not UNRELEASED), and like **-a** otherwise.

dch is essential for Debian package maintainers, automating the changelog workflow during package updates, security fixes, and new upstream releases.

# CAVEATS

Must be run inside the source tree: dch climbs the directory tree to find debian/changelog and checks that the directory name matches the package. Setting DEBEMAIL and DEBFULLNAME is recommended, otherwise the identity falls back to NAME, EMAIL and system defaults. Version string format must follow Debian conventions.

# HISTORY

dch is an alias of **debchange**, part of **devscripts**, a collection of tools for Debian package maintainers. It was originally written by Christoph Lameter and later extensively modified by Julian Gilbey.

# SEE ALSO

[debchange](/man/debchange)(1), [debuild](/man/debuild)(1), [dpkg-buildpackage](/man/dpkg-buildpackage)(1), [dpkg](/man/dpkg)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/devscripts)```

```[Documentation](https://manpages.debian.org/unstable/devscripts/debchange.1.en.html)```

<!-- verified: 2026-11-09 -->
