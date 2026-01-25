# TLDR

**Start keyring daemon**

```gnome-keyring-daemon --start```

**Start with specific components**

```gnome-keyring-daemon --start --components=secrets,ssh```

**Replace running daemon**

```gnome-keyring-daemon --replace```

**Unlock keyring via CLI**

```secret-tool store --label="My Secret" service myapp```

**Lookup secret**

```secret-tool lookup service myapp```

# SYNOPSIS

**gnome-keyring-daemon** [_options_]

# PARAMETERS

**--start**
> Start daemon if not running.

**--replace**
> Replace running daemon.

**--components** _list_
> Components: secrets, pkcs11, ssh.

**--daemonize**
> Run as daemon.

**-f**, **--foreground**
> Run in foreground.

**-l**, **--login**
> Read login password from stdin.

# DESCRIPTION

**GNOME Keyring** is a daemon that stores secrets, passwords, and keys. It provides secure storage for applications and handles SSH key management.

The keyring is typically started at login and unlocked with the user's password. Applications access it through libsecret or the Secret Service D-Bus API.

# COMPONENTS

- **secrets**: Password/secret storage
- **ssh**: SSH agent (replaces ssh-agent)
- **pkcs11**: PKCS#11 smart card support

# COMMAND-LINE ACCESS

```bash
# Store a secret
secret-tool store --label="GitHub Token" service github account token

# Retrieve a secret
secret-tool lookup service github

# Clear a secret
secret-tool clear service github
```

# CAVEATS

Usually started by desktop session. SSH component may conflict with ssh-agent. Keyring locked when session locks. Non-GNOME desktops may need manual setup.

# HISTORY

GNOME Keyring was created for the GNOME desktop to provide secure credential storage. It implements the freedesktop.org Secret Service specification for cross-desktop compatibility.

# SEE ALSO

[secret-tool](/man/secret-tool)(1), [ssh-agent](/man/ssh-agent)(1), [seahorse](/man/seahorse)(1)
