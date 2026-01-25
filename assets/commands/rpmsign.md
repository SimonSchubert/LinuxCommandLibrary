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

**rpmsign** [_options_] _package_...

# PARAMETERS

**--addsign**
> Add signature to package.

**--resign**
> Replace existing signature.

**--delsign**
> Delete signature.

**--key-id** _id_
> GPG key ID.

**-D** _macro_
> Define macro.

# DESCRIPTION

**rpmsign** adds or manages GPG signatures on RPM packages. Signing packages allows verification of authenticity and integrity.

Part of the RPM package manager.

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

# Define signing options
rpmsign --define "_gpg_name Your Name" --addsign package.rpm

# Verify signature
rpm -K package.rpm
```

# CONFIGURATION

```bash
# ~/.rpmmacros
%_gpg_name Your Name <email@example.com>
%_gpg_path /home/user/.gnupg
```

# CAVEATS

Requires GPG key. Passphrase needed (or gpg-agent). Signature added to header.

# HISTORY

rpmsign is part of **RPM** package manager, originally developed at **Red Hat** for package authentication.

# SEE ALSO

[rpm](/man/rpm)(8), [gpg](/man/gpg)(1), [rpmkeys](/man/rpmkeys)(8)
