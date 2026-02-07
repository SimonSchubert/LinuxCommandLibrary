# TAGLINE

Set AppArmor profiles to enforce mode

# TLDR

**Enable** a profile in enforce mode

```sudo aa-enforce [path/to/profile]```

Enable **multiple profiles** in enforce mode

```sudo aa-enforce [path/to/profile1] [path/to/profile2]```

Enable profiles from a **specific directory**

```sudo aa-enforce -d [path/to/profiles]```

# SYNOPSIS

**aa-enforce** _executable_ [_executable_ ...] [_-d /path/to/profiles_] [_--no-reload_]

# DESCRIPTION

**aa-enforce** sets one or more AppArmor security profiles to enforce mode, which is the default and most secure mode. In enforce mode, security policy is strictly applied and any access violations are blocked and logged.

This command reverses the effects of **aa-complain** (which sets complain mode) and **aa-disable** (which unloads profiles).

# PARAMETERS

**-d, --dir /path/to/profiles**
> Specifies the directory containing AppArmor profiles; defaults to /etc/apparmor.d

**--no-reload**
> Do not reload the profile after modifying it

# CAVEATS

Enabling enforce mode on a profile that hasn't been properly tested may cause applications to malfunction if the profile is too restrictive.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-complain](/man/aa-complain)(8), [aa-disable](/man/aa-disable)(8), [aa-status](/man/aa-status)(8), [apparmor](/man/apparmor)(7)
