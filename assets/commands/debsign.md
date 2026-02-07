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

**Sign without verifying** checksums

```debsign --no-conf [package.changes]```

# SYNOPSIS

**debsign** [_options_] _changes-or-dsc-file_

# PARAMETERS

_FILE_
> .changes or .dsc file to sign.

**-k** _KEYID_
> GPG key ID to use for signing.

**-m** _MAINTAINER_
> Specify maintainer for signing.

**-e** _EMAIL_
> Email address to match key.

**-p** _COMMAND_
> GPG command to use (default: gpg).

**-S**
> Sign source-only upload.

**--no-conf**
> Skip configuration file.

**--help**
> Display help information.

# CONFIGURATION

**~/.devscripts**
> Configuration file for default GPG key ID and signing behavior.

# DESCRIPTION

**debsign** is used to sign Debian .changes and .dsc (Debian Source Control) files with a GPG key. Signing is required for uploading packages to Debian repositories, as it verifies the package maintainer's identity.

The tool finds the appropriate GPG key based on the maintainer field in the file being signed, or uses an explicitly specified key. It updates the file with GPG signatures that can be verified during package upload and installation.

debsign is typically used after building a Debian package with dpkg-buildpackage or debuild, as the final step before uploading to a repository.

# CAVEATS

Requires a valid GPG key. The signing key must be trusted by the repository. Changing file contents after signing invalidates the signature. Private key must be available for signing.

# HISTORY

debsign is part of the **devscripts** package, developed for Debian package maintenance. It has been a core tool in the Debian upload process since GPG signatures became required for package uploads.

# SEE ALSO

[dpkg-sig](/man/dpkg-sig)(1), [gpg](/man/gpg)(1), [dput](/man/dput)(1), [debuild](/man/debuild)(1)
