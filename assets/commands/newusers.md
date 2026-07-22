# TAGLINE

creates multiple users at once

# TLDR

**Create users from file**

```newusers [users.txt]```

**Read from stdin**

```echo "[user:password:uid:gid:gecos:home:shell]" | newusers```

**Crypt method**

```newusers -c [SHA512] [users.txt]```

**System defaults**

```newusers -r [users.txt]```

# SYNOPSIS

**newusers** [_options_] [_file_]

# PARAMETERS

_FILE_
> File with user entries.

**-c** _METHOD_
> Encryption method.

**-r**
> Create system accounts.

**--help**
> Display help information.

# DESCRIPTION

**newusers** creates multiple users at once. It reads user data from a file.

The tool processes passwd-format entries. Batch user creation for administrators.

# CAVEATS

Requires root. Specific file format. Passwords in plaintext during input.

# HISTORY

newusers is part of **shadow-utils**, providing batch user creation on Unix systems.

# INSTALL

```apt: sudo apt install passwd```

```pacman: sudo pacman -S shadow```

```apk: sudo apk add shadow```

```zypper: sudo zypper install shadow```

```nix: nix profile install nixpkgs#shadow```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[useradd](/man/useradd)(1), [passwd](/man/passwd)(1), [chpasswd](/man/chpasswd)(1)

