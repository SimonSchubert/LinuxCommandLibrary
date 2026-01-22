# TLDR

**Set** a boolean temporarily

```sudo setsebool [boolean_name] on```

**Unset** a boolean temporarily

```sudo setsebool [boolean_name] off```

**Set** a boolean persistently across reboots

```sudo setsebool -P [boolean_name] on```

**Set** multiple booleans persistently

```sudo setsebool -P [key1] [1] [key2] [0]```

# SYNOPSIS

**setsebool** [_-PNV_] _boolean_ _value_ | _bool1=val1 bool2=val2..._

# PARAMETERS

**-P**
> Make changes persistent across reboots

**-N**
> Don't reload policy after change

**-V**
> Verbose output

# DESCRIPTION

**setsebool** sets the current state of SELinux booleans. Booleans allow runtime customization of SELinux policy without requiring policy modification or recompilation.

Values can be specified as 1, true, on for enabled or 0, false, off for disabled.

# CAVEATS

Requires root privileges. Without -P flag, changes are lost on reboot. Use **getsebool** to view current boolean values. SELinux must be enabled for this command to work.

# SEE ALSO

[getsebool](/man/getsebool)(8), [semanage-boolean](/man/semanage-boolean)(8), [setenforce](/man/setenforce)(8)
