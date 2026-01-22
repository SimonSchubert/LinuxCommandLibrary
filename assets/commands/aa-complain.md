# TLDR

Set a profile to **complain mode**

```sudo aa-complain [path/to/profile]```

Set **multiple profiles** to complain mode

```sudo aa-complain [path/to/profile1] [path/to/profile2]```

Set profiles in a **directory** to complain mode

```sudo aa-complain -d [path/to/profiles]```

Set a profile to complain mode **without reloading**

```sudo aa-complain --no-reload [path/to/profile]```

# SYNOPSIS

**aa-complain** _executable_ [_executable_ ...] [_-d /path/to/profiles_] [_--no-reload_]

# DESCRIPTION

**aa-complain** switches AppArmor security profiles into complain mode. In this mode, security policy is **not enforced** but access violations are logged to the system log. This is useful for testing and developing new profiles without blocking application functionality.

# PARAMETERS

**-d, --dir /path/to/profiles**
> Specifies the directory containing AppArmor profiles; defaults to /etc/apparmor.d

**--no-reload**
> Prevents automatic profile reloading after modifications

# CAVEATS

**Deny rules remain active** even when complain mode is enabled. Complain mode only affects allow rules, so explicit denials will still block access.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-enforce](/man/aa-enforce)(8), [aa-disable](/man/aa-disable)(8), [aa-status](/man/aa-status)(8), [aa-audit](/man/aa-audit)(8), [apparmor](/man/apparmor)(7)
