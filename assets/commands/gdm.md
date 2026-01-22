# TLDR

**Start GDM**

```systemctl start gdm```

**Stop GDM**

```systemctl stop gdm```

**Enable at boot**

```systemctl enable gdm```

**Restart GDM**

```systemctl restart gdm```

**Check status**

```systemctl status gdm```

# SYNOPSIS

**gdm** [_options_]

# PARAMETERS

**--version**
> Display version.

**--help**
> Display help information.

# DESCRIPTION

**gdm** (GNOME Display Manager) is the graphical login manager for GNOME. It provides the login screen, user authentication, and session management for desktop environments.

GDM handles user selection, password authentication, and starting desktop sessions. It supports multiple sessions, accessibility features, and user switching.

gdm is typically started by systemd and runs as a system service.

# CAVEATS

Requires X11 or Wayland. Configuration through dconf. Managed by systemd on modern systems.

# HISTORY

GDM was created as part of the **GNOME project** to provide a display manager integrated with the GNOME desktop environment. It replaced xdm for GNOME users.

# SEE ALSO

[lightdm](/man/lightdm)(1), [sddm](/man/sddm)(1), [xinit](/man/xinit)(1)
