# TAGLINE

Completely prevent unit from starting

# TLDR

**Mask** a service (prevent it from being started)

```systemctl mask [service_name]```

Mask a service and **stop** it if running

```systemctl mask [service_name] --now```

Mask a **user** service

```systemctl mask [service_name] --user```

Mask only until the next **reboot**

```systemctl mask [service_name] --runtime```

# SYNOPSIS

**systemctl** [_OPTIONS_...] **mask** _UNIT_...

# PARAMETERS

**--now**
> Also stop the unit after masking

**--user**
> Mask user service manager units instead of system units

**--runtime**
> Mask temporarily until next reboot only

# DESCRIPTION

**systemctl mask** links a unit to /dev/null, using a symlink in `/etc/systemd/system/` (or `/run/systemd/system/` with `--runtime`), completely preventing it from being started by any means. This is stronger than **disable**, which only prevents automatic startup. Masked units cannot be started manually, by dependencies, or by any trigger.

Masking is useful for units that conflict with your setup or that you want to ensure never run. Use **systemctl unmask** to reverse the operation.

# CAVEATS

Requires root privileges for system units. Takes unit names only, not paths. Fails if a unit file of the same name already exists in the target directory, so it mainly works for vendor units in `/usr/lib/systemd/system/`, not locally created ones. Masked units are impossible to start until unmasked. Use carefully; masking essential units can break system functionality. Check for dependencies before masking to avoid breaking other services.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-unmask](/man/systemctl-unmask)(1), [systemctl-disable](/man/systemctl-disable)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
