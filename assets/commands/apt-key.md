# TLDR

**List** trusted keys

```apt-key list```

**Add** a key to the trusted keystore

```apt-key add [public_key_file.asc]```

**Delete** a key from the trusted keystore

```apt-key del [key_id]```

Add a **remote key** to the trusted keystore

```wget -qO - [https://host.tld/filename.key] | apt-key add -```

Add a key from **keyserver** with only key ID

```apt-key adv --keyserver pgp.mit.edu --recv [KEYID]```

# SYNOPSIS

**apt-key** [_command_] [_arguments_]

# DESCRIPTION

**apt-key** is a key management utility for the APT Package Manager on Debian and Ubuntu. It manages the list of keys used by apt to authenticate packages.

**Note:** apt-key is now deprecated. Keys should be stored in /etc/apt/trusted.gpg.d/ or /usr/share/keyrings/ and referenced via signed-by in sources.list.

# PARAMETERS

**list**
> List all trusted keys with fingerprints

**add file**
> Add a new key to the list of trusted keys

**del keyid**
> Remove a key from the list of trusted keys

**adv**
> Pass advanced options to gpg

**update**
> Update the local keyring with the archive keyring

**net-update**
> Update the local keyring, fetching missing keys from a keyserver

**export keyid**
> Output the key to standard output

**exportall**
> Output all trusted keys to standard output

**finger**
> List fingerprints of trusted keys

# CAVEATS

**Deprecated** in favor of placing keyring files directly in /etc/apt/trusted.gpg.d/ or using signed-by in apt sources. Only apt-key del should be used in maintainer scripts.

# HISTORY

Part of the **APT** (Advanced Package Tool) suite. Deprecated starting with Debian 11 and Ubuntu 22.04 in favor of trusted.gpg.d directory.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [gpg](/man/gpg)(1)
