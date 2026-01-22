# TLDR

**Disable** a profile

```sudo aa-disable [path/to/profile]```

Disable **multiple profiles**

```sudo aa-disable [path/to/profile1] [path/to/profile2]```

Disable profiles in a **directory**

```sudo aa-disable --dir [path/to/profiles]```

# SYNOPSIS

**aa-disable** _executable_ [_executable_ ...] [_-d /path/to/profiles_] [_--no-reload_]

# DESCRIPTION

**aa-disable** is used to disable one or more AppArmor profiles. This command will unload the profile from the kernel and prevent the profile from being loaded on AppArmor startup.

Disabled profiles remain in **/etc/apparmor.d** but are not active. Use **aa-enforce** to re-enable a disabled profile.

# PARAMETERS

**-d, --dir /path/to/profiles**
> Specifies the directory containing AppArmor profiles; defaults to /etc/apparmor.d

**--no-reload**
> Do not unreload the profile after modifying it

# CAVEATS

Disabling a profile removes security protections for the associated application. The application will run without AppArmor confinement until the profile is re-enabled.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-status](/man/aa-status)(8), [apparmor](/man/apparmor)(7)
