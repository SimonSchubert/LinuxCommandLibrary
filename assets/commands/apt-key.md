# TAGLINE

Deprecated APT key management utility for package authentication

# TLDR

List the keys apt currently **trusts**

```apt-key list```

Show the **fingerprints** of those keys

```apt-key finger```

Add a key **from a file**

```sudo apt-key add [path/to/key.asc]```

Add a key **read from a pipe**

```curl -fsSL [https://example.com/key.asc] | sudo apt-key add -```

Fetch a key from a **keyserver** by ID

```sudo apt-key adv --keyserver [keyserver.ubuntu.com] --recv-keys [key_id]```

**Delete** a key

```sudo apt-key del [key_id]```

**Export** a single key

```apt-key export [key_id]```

Export **every** trusted key

```apt-key exportall```

Preferred today: give the repository **its own keyring file**

```curl -fsSL [https://example.com/key.gpg] | sudo gpg --dearmor -o /usr/share/keyrings/[example].gpg```

Preferred today: bind one repository to that keyring with **signed-by**

```echo "deb [signed-by=/usr/share/keyrings/[example].gpg] [https://repo.example.com] [stable] main" | sudo tee /etc/apt/sources.list.d/[example].list```

# SYNOPSIS

**apt-key** [_command_] [_arguments_]

# DESCRIPTION

**apt-key** is a deprecated key management utility for the APT Package Manager on Debian and Ubuntu. It manages the list of keys used by apt to authenticate packages.

**Note:** apt-key is deprecated since Debian 11 (Bullseye) and Ubuntu 22.04 (Jammy). The recommended approach is to place keyring files directly in /etc/apt/trusted.gpg.d/ (with .gpg or .asc extension) or in /usr/share/keyrings/ and reference them via the `signed-by` option in sources.list entries. Only `apt-key del` remains supported for use in maintainer scripts.

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
> List fingerprints of trusted keys (deprecated)

**--keyring** _filename_
> Operate on a specific keyring file (deprecated)

# CONFIGURATION

**/etc/apt/trusted.gpg.d/**
> Directory for trusted keyring files in GPG format.

**/usr/share/keyrings/**
> System-wide keyrings referenced via signed-by in sources.list.

# CAVEATS

**Deprecated** in favor of placing keyring files directly in /etc/apt/trusted.gpg.d/ or using signed-by in apt sources. Only apt-key del should be used in maintainer scripts.

# HISTORY

Part of the **APT** (Advanced Package Tool) suite. Deprecated starting with Debian 11 and Ubuntu 22.04 in favor of trusted.gpg.d directory.

# INSTALL

```apt: sudo apt install apt```

```dnf: sudo dnf install apt```

```pacman: sudo pacman -S apt```

```apk: sudo apk add apt```

```brew: brew install apt```

```nix: nix profile install nixpkgs#apt```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [gpg](/man/gpg)(1), [apt-secure](/man/apt-secure)(8)
