# TAGLINE

Add GPG keys to the APT keyring

# TLDR

**Add** a GPG key by key ID from the default keyserver

```sudo add-apt-key [KEY_ID]```

**Add** a GPG key from a specific **keyserver**

```sudo add-apt-key -k [keyserver.ubuntu.com] [KEY_ID]```

**Add** a key with **verbose** output

```sudo add-apt-key -v [KEY_ID]```

# SYNOPSIS

**add-apt-key** [_options_] _keyid_

# DESCRIPTION

**add-apt-key** requests the specified GPG key from a public keyserver and inserts it into the APT keyring so that archives signed with that key will be trusted. The default keyserver can be configured in /etc/default/add-apt-key.

# PARAMETERS

**-h**, **--help**
> Show usage information.

**-v**, **--verbose**
> Verbose mode; show each command before it is executed.

**-k**, **--keyserver** _name_
> Select a specific keyserver to use.

_keyid_
> The GPG key identifier to add.

# EXIT STATUS

**0** - Key was added successfully.

**1** - Invalid arguments.

**2** - GPG key ID cannot be retrieved or is malformed.

**3** - Failure inserting key into APT keyring.

# CAVEATS

This tool may not be available on all distributions. The modern approach is to place repository keys in /etc/apt/keyrings/ and reference them directly in source list files with the signed-by option.

# SEE ALSO

[apt-key](/man/apt-key)(8), [gpg](/man/gpg)(1), [apt](/man/apt)(8)
