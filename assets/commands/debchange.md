# TAGLINE

Debian changelog maintenance tool

# TLDR

Add a new version for **non-maintainer upload**

```debchange -n```

**Append** entry to current version

```debchange -a```

Add entry to **close a bug**

```debchange --closes [bug_id]```

# SYNOPSIS

**debchange** [_options_] [_text_]

# DESCRIPTION

**debchange** (also known as dch) maintains the debian/changelog file of a Debian source package. It handles version numbering, timestamps, and changelog entry formatting according to Debian policy.

Essential for Debian package maintainers to track changes between package versions.

# PARAMETERS

**-n, --nmu**
> Increment version for non-maintainer upload

**-a, --append**
> Append to current changelog entry

**--closes** _bug_
> Add entry to close specified bug

**-i, --increment**
> Increment version and add new entry

**-v** _version_
> Set specific version number

**-D** _distribution_
> Set distribution (stable, unstable, etc.)

# CONFIGURATION

**~/.devscripts**
> Default configuration options for debchange behavior, including maintainer name and email.

**/etc/devscripts.conf**
> System-wide devscripts configuration file.

# CAVEATS

Must be run from a Debian source package directory. Requires proper debian/changelog format. Part of devscripts package.

# SEE ALSO

[dch](/man/dch)(1), [dpkg-buildpackage](/man/dpkg-buildpackage)(1), [debuild](/man/debuild)(1)
