# TAGLINE

Re-enable masked units

# TLDR

**Unmask** a service

```systemctl unmask service_name```

Unmask and **start** immediately

```systemctl unmask --now service_name```

Unmask a **user** service

```systemctl unmask --user service_name```

# SYNOPSIS

**systemctl unmask** [_OPTIONS_] _UNIT_...

# DESCRIPTION

**systemctl unmask** removes the mask from units, making them startable again. This undoes the effect of "systemctl mask" which completely disables units by linking them to /dev/null.

# PARAMETERS

**UNIT**
> One or more unit names to unmask

**--now**
> Also start the unit after unmasking

**--user**
> Operate on user units instead of system units

**--runtime**
> Only unmask temporarily until next reboot

# CAVEATS

Unmasking a unit does not automatically start it unless --now is used. If a unit was masked at runtime, it can only be unmasked at runtime. Masked units cannot be started even manually.

# HISTORY

**systemctl unmask** is part of **systemd**, providing unit masking/unmasking to completely disable or re-enable services.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-mask](/man/systemctl-mask)(1), [systemctl-enable](/man/systemctl-enable)(1)
