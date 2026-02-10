# TAGLINE

wrapper around GnuPG for managing the keyring used by pacman to verify package

# TLDR

**Initialize** the pacman keyring

```sudo pacman-key --init```

Add the **default Arch Linux keys**

```sudo pacman-key --populate```

**List keys** from the public keyring

```pacman-key -l```

**Add** the specified keys

```sudo pacman-key -a [path/to/keyfile.gpg]```

**Receive a key** from a key server

```sudo pacman-key -r "[uid|name|email]"```

Print the **fingerprint** of a specific key

```pacman-key -f "[uid|name|email]"```

**Sign** an imported key locally

```sudo pacman-key --lsign-key "[uid|name|email]"```

**Remove** a specific key

```sudo pacman-key -d "[uid|name|email]"```

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

# SEE ALSO

[pacman](/man/pacman)(8), [gpg](/man/gpg)(1), [makepkg](/man/makepkg)(8)
