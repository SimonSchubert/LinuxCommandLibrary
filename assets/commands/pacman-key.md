# TAGLINE

wrapper around GnuPG for managing the keyring used by pacman to verify package

# TLDR

Create the keyring for the first time

```sudo pacman-key --init```

Load the distribution's **bundled trusted keys**

```sudo pacman-key --populate archlinux```

**Rebuild the trust database** after changing trust levels

```sudo pacman-key --updatedb```

**Refresh every key** from the keyservers, picking up revocations

```sudo pacman-key --refresh-keys```

List the keys the system currently **trusts**

```pacman-key --list-keys```

Show a key's **fingerprint** before deciding to trust it

```pacman-key --finger [key_id]```

**Fetch** a key from a keyserver by ID

```sudo pacman-key --recv-keys [key_id]```

**Locally sign** a fetched key to mark it trusted

```sudo pacman-key --lsign-key [key_id]```

Import a key **from a file**

```sudo pacman-key --add [path/to/key.gpg]```

**Export** a key so it can be shared

```pacman-key --export [key_id]```

**Delete** a key from the keyring

```sudo pacman-key --delete [key_id]```

**Verify** a detached signature against the keyring

```pacman-key --verify [path/to/file.sig]```

# SYNOPSIS

**pacman-key** [_options_] [_operation_]

# PARAMETERS

**--init**
> Initialize the pacman keyring

**--populate**
> Reload the default keys from the archlinux-keyring package

**-l, --list-keys**
> List keys from the public keyring

**-a, --add _file_**
> Add keys from a file

**-r, --recv-keys _keyid_**
> Fetch keys from a keyserver

**-f, --finger _keyid_**
> Show key fingerprint

**--lsign-key _keyid_**
> Locally sign a key (trust it)

**-d, --delete _keyid_**
> Remove a key from the keyring

**--refresh-keys**
> Update keys from the keyserver

# DESCRIPTION

**pacman-key** is a wrapper around GnuPG for managing the keyring used by pacman to verify package signatures. It handles key initialization, importing, signing, and trust management.

On a fresh Arch Linux installation, run **--init** to create the keyring, then **--populate** to add the official Arch Linux packager keys. For third-party repositories (like AUR helpers or custom repos), manually add and sign their keys.

Key signing (**--lsign-key**) marks a key as trusted, allowing pacman to install packages signed by that key without warnings.

# CAVEATS

Requires root privileges for most operations. Key initialization needs sufficient entropy; if it hangs, generate activity (disk I/O, network, typing). The keyring is stored in **/etc/pacman.d/gnupg/**. Corrupted keyrings can be reset by removing this directory and reinitializing.

# HISTORY

Introduced with pacman 4.0 in 2011 to support package signing, enhancing security by cryptographically verifying package integrity and authenticity.

# INSTALL

```apt: sudo apt install pacman-package-manager```

```dnf: sudo dnf install pacman```

```pacman: sudo pacman -S pacman```

```apk: sudo apk add pacman```

```nix: nix profile install nixpkgs#pacman```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pacman](/man/pacman)(8), [gpg](/man/gpg)(1), [makepkg](/man/makepkg)(8)
