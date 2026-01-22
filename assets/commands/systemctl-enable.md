# TLDR

**Enable** a service to run on boot

```systemctl enable [unit]```

Enable a service to run on boot **and start it now**

```systemctl enable [unit] --now```

Enable a **user** unit to run on login

```systemctl enable [unit] --user```

# SYNOPSIS

**systemctl** [_OPTIONS_...] **enable** _UNIT_...

# PARAMETERS

**--now**
> Also start the unit after enabling

**--user**
> Enable user service manager units instead of system units

**--no-reload**
> Do not reload systemd configuration after enabling

**--force**
> Enable units even if they are masked

**--runtime**
> Enable temporarily until next reboot only

# DESCRIPTION

**systemctl enable** creates symbolic links in systemd directories to enable units to start automatically at boot (for system units) or at login (for user units). This does not start the unit immediately; use **--now** to both enable and start.

The symlinks are created based on the [Install] section of the unit file, typically linking into target.wants directories. Enabling is idempotent; enabling an already-enabled unit has no effect.

# CAVEATS

Requires root privileges for system units. Enabling does not start the unit; combine with **--now** or use **systemctl start** separately. Masked units cannot be enabled without **--force**.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-disable](/man/systemctl-disable)(1), [systemctl-start](/man/systemctl-start)(1)
