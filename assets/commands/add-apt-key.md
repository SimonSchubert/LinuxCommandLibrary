# TAGLINE

Add GPG keys for APT repository verification

# TLDR

**Add** a GPG key from a URL

```sudo add-apt-key --keyserver [keyserver.ubuntu.com] --keyid [KEY_ID]```

Add key from **local file**

```sudo add-apt-key --keyfile [key.gpg]```

# SYNOPSIS

**add-apt-key** [_--keyserver server_] [_--keyid id_] [_--keyfile file_]

# DESCRIPTION

**add-apt-key** is a helper utility for adding GPG keys used to verify APT repository packages. It provides a safer alternative to the deprecated **apt-key** command by storing keys in the modern /etc/apt/trusted.gpg.d/ directory.

The tool can fetch keys from keyservers or local files and install them in the appropriate location for APT to use during package verification.

# PARAMETERS

**--keyserver** _server_
> GPG keyserver to fetch the key from

**--keyid** _id_
> GPG key ID to fetch

**--keyfile** _file_
> Local GPG key file to add

**--keyring** _file_
> Custom keyring location

# CAVEATS

This tool may not be available on all distributions. The modern approach is to place repository keys in /etc/apt/keyrings/ and reference them directly in source list files with the signed-by option.

# HISTORY

**add-apt-key** was developed as distributions moved away from the centralized /etc/apt/trusted.gpg keyring. This transition began around **2020** when apt-key was deprecated in favor of per-repository keyrings.

# SEE ALSO

[apt-key](/man/apt-key)(8), [gpg](/man/gpg)(1), [apt](/man/apt)(8)
