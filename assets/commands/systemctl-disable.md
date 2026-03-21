# TAGLINE

Disable unit auto-start at boot

# TLDR

**Disable** a service from running on boot

```systemctl disable [unit]```

Disable a service from running on boot **and stop** it immediately

```systemctl disable --now [unit]```

Disable a **user** service from running on login

```systemctl --user disable [unit]```

Disable **multiple** units at once

```systemctl disable [unit1] [unit2]```

Disable a unit **temporarily** until next reboot

```systemctl disable --runtime [unit]```

# SYNOPSIS

**systemctl** [_OPTIONS_...] **disable** _UNIT_...

# PARAMETERS

**--now**
> Also stop the unit after disabling

**--user**
> Disable user service manager units instead of system units

**--no-reload**
> Do not reload systemd configuration after disabling

**--runtime**
> Disable temporarily until next reboot only.

**--force**
> When disabling, remove symlinks even if the unit file does not exist.

**--global**
> Disable for all users (with --user-mode units).

# DESCRIPTION

**systemctl disable** removes the symbolic links that cause units to start automatically at boot or login. This prevents the unit from starting in the future but does not stop a currently running instance unless **--now** is used.

The command reverses the effect of **systemctl enable** by removing symlinks from target.wants directories. The unit file itself is not modified or deleted.

# CAVEATS

Requires root privileges for system units. Disabling does not stop currently running units; use **--now** or **systemctl stop**. Some units are started by other means (socket activation, path triggers) and may need additional steps to fully disable.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-enable](/man/systemctl-enable)(1), [systemctl-stop](/man/systemctl-stop)(1), [systemctl-mask](/man/systemctl-mask)(1), [systemctl-is-enabled](/man/systemctl-is-enabled)(1)
