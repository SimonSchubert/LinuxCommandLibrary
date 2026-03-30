# TAGLINE

GPG signing tool for Debian packages

# TLDR

**Sign a .changes file**

```debsign [package.changes]```

**Sign with specific key**

```debsign -k [KEYID] [package.changes]```

**Sign .dsc file only**

```debsign [package.dsc]```

**Sign using specified** maintainer identity

```debsign -m "[Name <email@example.com>]" [package.changes]```

**Re-sign with** different key

```debsign -e "[newemail@example.com]" [package.changes]```

**Sign files on a remote host**

```debsign -r [user@remotehost] [package.changes]```

# SYNOPSIS

**debsign** [_options_] _changes-or-dsc-file_

# PARAMETERS

_FILE_
> .changes or .dsc file to sign.

**-k** _KEYID_
> GPG key ID to use for signing.

**-m** _MAINTAINER_
> Specify maintainer for signing.

**-e** _MAINTAINER_
> Same as -m but takes precedence over it.

**-r** [_username@_]_remotehost_
> Sign files on specified remote host using scp for transfer.

**-p** _PROGNAME_
> Use specified GPG program instead of the default gpg.

**-S**
> Search for source-only .changes file instead of binary-build .changes file.

**-a** _ARCH_
> Specify the Debian architecture for .changes file search.

**--re-sign**
> Recreate signature if file has been signed already.

**--no-re-sign**
> Use existing signature if file has been signed already.

**--debs-dir** _DIR_
> Look for files to sign in specified directory instead of parent directory.

**--no-conf**
> Do not read any configuration files. Must be the first option.

**-h**, **--help**
> Display help message and exit.

**--version**
> Display version and copyright information.

# CONFIGURATION

**~/.devscripts**
> Configuration file for default GPG key ID and signing behavior.

# DESCRIPTION

**debsign** mimics the signing aspects of dpkg-buildpackage(1). It takes a .dsc, .buildinfo, or .changes file and signs it, and any child .dsc, .buildinfo, or .changes files referenced by it, using GPG. Signing is required for uploading packages to Debian repositories, as it verifies the package maintainer's identity.

The tool finds the appropriate GPG key based on the maintainer field in the file being signed, or uses an explicitly specified key. It updates the file with GPG signatures that can be verified during package upload and installation.

debsign is typically used after building a Debian package with dpkg-buildpackage or debuild, as the final step before uploading to a repository.

# CAVEATS

Requires a valid GPG key. The signing key must be trusted by the repository. Changing file contents after signing invalidates the signature. Private key must be available for signing.

# HISTORY

debsign is part of the **devscripts** package, developed for Debian package maintenance. It has been a core tool in the Debian upload process since GPG signatures became required for package uploads.

# SEE ALSO

[gpg](/man/gpg)(1), [debuild](/man/debuild)(1), [dpkg-buildpackage](/man/dpkg-buildpackage)(1)
