# TAGLINE

Translate Windows SIDs to Linux UIDs/GIDs for CIFS mounts

# TLDR

**Display help information**

```cifs.idmap --help```

**Display version information**

```cifs.idmap --version```

# SYNOPSIS

**cifs.idmap** [**-h**] [**-t** _timeout_] [**-v**] _key_id_

# DESCRIPTION

**cifs.idmap** is a userspace helper program for the Linux CIFS client filesystem. It translates Windows Security Identifiers (SIDs) to Linux UIDs/GIDs and vice versa, ensuring correct file ownership and permissions when mounting CIFS/SMB shares.

This program is not intended to be run directly from the command line. The kernel calls it via **request-key**(8) when a share is mounted with the **cifsacl** mount option.

The utility relies on a plugin at **/etc/cifs-utils/idmap-plugin** to perform actual ID mapping. Supported backends include sfu, rid, nss, and tdb, often using services like **sssd** or **winbind**.

# PARAMETERS

**-h, --help**
> Print usage message and exit

**-t, --timeout** _seconds_
> Set key expiration timer in seconds (default: 600). Use 0 for no expiration

**-v, --version**
> Print version number and exit

**key_id**
> The key identifier provided by the kernel upcall

# CONFIGURATION

**/etc/cifs-utils/idmap-plugin**
> Symlink or plugin that performs the actual SID-to-UID/GID mapping. Must point to a supported backend (sfu, rid, nss, or tdb).

**/etc/request-key.conf**
> Kernel keyring configuration that directs upcalls to cifs.idmap.

# CAVEATS

If cifs.idmap or its plugin is unavailable, file objects are assigned the UID/GID of the process that mounted the share. Use the **uid** and **gid** mount options to specify defaults in this case.

A plugin (or symlink) must exist at **/etc/cifs-utils/idmap-plugin** for the utility to function.

# HISTORY

Support for upcalls to cifs.idmap was introduced in **Linux kernel 3.0**. The program was written by Shirish Pargaonkar as part of the **cifs-utils** suite.

# SEE ALSO

[mount.cifs](/man/mount.cifs)(8), [cifscreds](/man/cifscreds)(1), [request-key](/man/request-key)(8)
