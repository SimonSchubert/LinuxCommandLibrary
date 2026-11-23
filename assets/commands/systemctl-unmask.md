# TAGLINE

re-enable a masked systemd unit

# TLDR

**Unmask** a service

```systemctl unmask [service_name]```

**Unmask and start** it immediately (systemd 263+)

```systemctl unmask --now [service_name]```

**Unmask a user** unit

```systemctl --user unmask [service_name]```

**Remove a runtime mask** (one created with `mask --runtime`)

```systemctl unmask --runtime [service_name]```

**Check** whether a unit is still masked

```systemctl is-enabled [service_name]```

**Unmask several units** at once

```systemctl unmask [unit1] [unit2] [unit3]```

# SYNOPSIS

**systemctl unmask** [_OPTIONS_] _UNIT_...

# DESCRIPTION

**systemctl unmask** removes the mask from one or more systemd units, making them startable again. Masking a unit links its unit file to `/dev/null`, which makes the unit completely unstartable (manually or as a dependency); unmasking removes that symlink and restores the original unit file.

If the unit was previously masked at runtime (with `--runtime`, symlink under `/run`), it must be unmasked with `--runtime` as well. Unmasking does not start the unit; since systemd 263 `--now` can be added to start it right after unmasking. The manager configuration is reloaded automatically afterwards (equivalent to `daemon-reload`) unless `--no-reload` is given.

# PARAMETERS

_UNIT_
> One or more unit names (e.g. `nginx.service`, `getty@tty1.service`) to unmask.

**--now**
> Also start the unit(s) after unmasking (systemd 263 and later).

**--user**
> Operate on the calling user's units instead of system units.

**--system**
> Operate on system units (default).

**--global**
> Operate on the global user configuration directory (`/etc/systemd/user/`), affecting all users.

**--runtime**
> Remove a runtime mask (under `/run`) instead of a persistent one.

**--no-block**
> Do not wait for the start job (with `--now`) to finish before returning.

**--no-reload**
> Do not implicitly reload the manager configuration after unmasking.

**--root** _PATH_
> Operate on unit files below an alternate root directory (e.g. a mounted image).

**-q**, **--quiet**
> Suppress informational messages.

# CAVEATS

Unmasking a unit does not start or enable it; use `--now`, or run `systemctl enable` / `systemctl start` separately. A runtime mask is only removed with `--runtime`, a persistent mask only without it. On systemd versions older than 263, `--now` is rejected for unmask. Requires root for system units.

# HISTORY

**systemctl** is part of **systemd**, started by **Lennart Poettering** and **Kay Sievers** in **2010**. Support for combining **unmask** with **--now** was added in **systemd 263**.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-mask](/man/systemctl-mask)(1), [systemctl-enable](/man/systemctl-enable)(1), [systemctl-disable](/man/systemctl-disable)(1), [systemctl-start](/man/systemctl-start)(1), [systemctl-daemon-reload](/man/systemctl-daemon-reload)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-23 -->
