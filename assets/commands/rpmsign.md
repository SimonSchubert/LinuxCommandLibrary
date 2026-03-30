# TAGLINE

Sign RPM packages with GPG keys

# TLDR

**Sign RPM package**

```rpmsign --addsign [package.rpm]```

**Sign with specific key**

```rpmsign --addsign --key-id [KEYID] [package.rpm]```

**Re-sign package**

```rpmsign --resign [package.rpm]```

**Delete signature**

```rpmsign --delsign [package.rpm]```

**Sign multiple packages**

```rpmsign --addsign [*.rpm]```

# SYNOPSIS

**rpmsign** **--addsign**|**--resign** [_options_] _PACKAGE_FILE_...

**rpmsign** **--delsign** _PACKAGE_FILE_...

**rpmsign** **--delfilesign** _PACKAGE_FILE_...

# PARAMETERS

**--addsign**
> Add signature to package.

**--resign**
> Replace existing signature.

**--delsign**
> Delete all OpenPGP signatures.

**--delfilesign**
> Delete all IMA and fsverity file signatures.

**--key-id** _KEYID_
> GPG key ID, overriding %_openpgp_sign_id configuration.

**--signfiles**
> Sign package files using the configured digest algorithm and RSA key.

**--fskpath** _KEY_
> File signing key path, used with --signfiles.

**--signverity**
> Sign package files with fsverity signatures.

**--certpath** _CERT_
> Certificate for use with --signverity.

**--rpmv3**
> Add RPM V3 header+payload signature on V4 packages for compatibility with rpm < 4.14.

**--rpmv4**
> Add RPM V4 header signature on V6 packages for rpm 4.x compatibility.

**-D** _"MACRO EXPR"_
> Define RPM macro.

# DESCRIPTION

**rpmsign** adds or manages OpenPGP signatures on RPM packages. Signing packages allows verification of authenticity and integrity. It supports both traditional package signing and file-level IMA/fsverity signing.

Part of the RPM package manager. The signing key is configured via the **%_openpgp_sign_id** macro (or legacy **%_gpg_name**).

# EXAMPLES

```bash
# Sign package
rpmsign --addsign mypackage-1.0-1.x86_64.rpm

# Sign with specific key
rpmsign --addsign --key-id ABCD1234 package.rpm

# Re-sign (replace signature)
rpmsign --resign package.rpm

# Sign all RPMs
rpmsign --addsign *.rpm

# Define signing identity via macro
rpmsign -D "_gpg_name Your Name" --addsign package.rpm

# Delete file signatures
rpmsign --delfilesign package.rpm

# Verify signature
rpm -K package.rpm
```

# CONFIGURATION

**~/.rpmmacros**
> User-level RPM macro file where **%_openpgp_sign_id** (or legacy **%_gpg_name**) sets the default signing identity and **%_gpg_path** specifies the GnuPG keyring directory.

**/etc/rpm/macros**
> System-wide RPM macro overrides for signing defaults shared across all users.

# CAVEATS

Requires GPG key. Passphrase needed (or gpg-agent). Signature added to header.

# HISTORY

rpmsign is part of **RPM** package manager, originally developed at **Red Hat** for package authentication.

# SEE ALSO

[rpm](/man/rpm)(8), [rpmbuild](/man/rpmbuild)(8), [rpmkeys](/man/rpmkeys)(8), [gpg](/man/gpg)(1)
