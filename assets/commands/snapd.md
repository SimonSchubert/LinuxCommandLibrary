# TAGLINE

Background service for snap package management

# TLDR

**Start the snapd service**

```sudo systemctl start snapd```

**Enable snapd to start on boot**

```sudo systemctl enable snapd```

**Check snapd service status**

```systemctl status snapd```

**Restart the snapd service**

```sudo systemctl restart snapd```

**Enable classic snap support** (create symlink)

```sudo ln -s /var/lib/snapd/snap /snap```

# SYNOPSIS

**snapd** [_--version_]

# DESCRIPTION

**snapd** is the background service that manages snap packages on Linux systems. It handles installation, updates, removal, and security confinement of snaps through a REST API interface.

Snaps are self-contained application packages bundling all dependencies, enabling cross-distribution compatibility. The daemon automatically checks for updates four times daily and applies them in the background.

snapd enforces application sandboxing using AppArmor and seccomp, mediating access between snaps and the host system. Users interact with snapd through the **snap** command-line client.

The service must be running before any snap operations can be performed.

# CAVEATS

Classic snap support requires a symlink from /snap to /var/lib/snapd/snap. On SELinux-enabled systems (like Fedora), snap sandboxing is degraded since AppArmor and SELinux cannot both be fully active. Snaps may consume more disk space than traditional packages due to bundled dependencies.

# HISTORY

Snap was developed by **Canonical** as part of Ubuntu, first introduced in **Ubuntu 16.04** (2016). Originally called Snappy, it was designed to provide universal Linux packages that work across distributions with consistent behavior and automatic updates.

# SEE ALSO

[snap](/man/snap)(8), [snapcraft](/man/snapcraft)(1), [flatpak](/man/flatpak)(1), [apparmor](/man/apparmor)(7)
