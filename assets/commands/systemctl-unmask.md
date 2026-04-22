# TAGLINE

re-enable a masked systemd unit

# TLDR

**Unmask** a service

```systemctl unmask [service_name]```

**Unmask and start** it immediately

```systemctl unmask --now [service_name]```

**Unmask a user** unit

```systemctl --user unmask [service_name]```

**Unmask only until reboot** (runtime mask)

```systemctl unmask --runtime [service_name]```

**Unmask several units** at once

```systemctl unmask [unit1] [unit2] [unit3]```

# SYNOPSIS

**systemctl unmask** [_OPTIONS_] _UNIT_...

# DESCRIPTION

**systemctl unmask** removes the mask from one or more systemd units, making them startable again. Masking a unit links its unit file to `/dev/null`, which makes the unit completely unstartable (manually or as a dependency); unmasking removes that symlink and restores the original unit file.

If the unit was previously masked at runtime (with `--runtime`), it can only be unmasked at runtime. Unmasking does not automatically start the unit — pair with `--now` to start immediately after unmasking.

# PARAMETERS

_UNIT_
> One or more unit names (e.g. `nginx.service`, `getty@tty1.service`) to unmask.

**--now**
> Also start the unit(s) after unmasking.

**--user**
> Operate on the calling user's units instead of system units.

**--system**
> Operate on system units (default).

**--global**
> Unmask for all users (enabled in `/etc/systemd/user/`).

**--runtime**
> Apply changes only for the current boot; reset on reboot.

**--no-block**
> Do not wait for the start job (with `--now`) to finish before returning.

**-q**, **--quiet**
> Suppress informational messages.

# CAVEATS

Unmasking a unit does not start it unless `--now` is given. If a unit was masked at runtime it can only be unmasked with `--runtime`; persistent masks require unmasking without `--runtime`. After unmasking, `systemctl daemon-reload` may be needed for the manager to pick up the restored unit file. Units masked via drop-in files instead of symlinks must be unmasked by editing or removing those files.

# HISTORY

**systemctl unmask** is part of **systemd**, introduced by **Lennart Poettering** and others. Mask/unmask semantics were added to replace the older `/dev/null` symlink trick used with SysV init scripts.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-mask](/man/systemctl-mask)(1), [systemctl-enable](/man/systemctl-enable)(1), [systemctl-disable](/man/systemctl-disable)(1)
