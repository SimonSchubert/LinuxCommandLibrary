# TAGLINE

Manage RPM package signing keys

# TLDR

**List** all imported RPM keys

```sudo rpmkeys --list```

**Import** an RPM key from a repository

```sudo rpmkeys --import [path/to/rpm_key]```

**Delete** a previously imported RPM key by its Key ID

```sudo rpmkeys --delete [5a278d9c-5bbc73cb]```

# SYNOPSIS

**rpmkeys** {**--import**|**--delete**|**--list**|**--checksig**} [_options_] [_keyfile_|_package_]

# PARAMETERS

**--import**
> Import a public key from a file

**--delete**
> Delete an imported key by its Key ID

**--list**
> List all imported RPM keys with their Key IDs

**--checksig, -K**
> Verify package signatures

**-v, --verbose**
> Provide more detailed output

# DESCRIPTION

**rpmkeys** manages GPG keys used to verify RPM package signatures. When adding an RPM repository, you should also import its corresponding signing key to enable signature verification and ensure packages are authentic.

Keys are stored in the RPM database and used automatically during package installation to verify that packages haven't been tampered with. The **--list** option displays Key IDs needed when removing keys.

# CAVEATS

Requires root privileges for importing or deleting keys. The Key ID format is a 16-character hexadecimal string. Deleting repository keys will cause signature verification failures for packages from that repository.

# SEE ALSO

[rpm](/man/rpm)(8), [rpm2cpio](/man/rpm2cpio)(8), [gpg](/man/gpg)(1)
