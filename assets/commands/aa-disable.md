# TAGLINE

Disable AppArmor security profiles

# TLDR

**Disable** a profile

```sudo aa-disable [path/to/profile]```

Disable **multiple profiles**

```sudo aa-disable [path/to/profile1] [path/to/profile2]```

Disable profiles in a **directory**

```sudo aa-disable --dir [path/to/profiles]```

Disable a profile **without reloading** the policy

```sudo aa-disable --no-reload [path/to/profile]```

# SYNOPSIS

**aa-disable** _executable_ [_executable_ ...] [_-d /path/to/profiles_] [_--no-reload_]

# DESCRIPTION

**aa-disable** is used to disable one or more AppArmor profiles. This command will unload the profile from the kernel and prevent the profile from being loaded on AppArmor startup.

A symbolic link to the profile is created in **/etc/apparmor.d/disable/**, which keeps the profile from being loaded automatically when AppArmor is restarted. The profile file itself remains in **/etc/apparmor.d** but is not active. Use **aa-enforce** or **aa-complain** to re-enable a disabled profile.

# PARAMETERS

**-d, --dir /path/to/profiles**
> Specifies the directory containing AppArmor profiles; defaults to /etc/apparmor.d

**--no-reload**
> Do not reload the profile after modifying it

# CAVEATS

Disabling a profile removes security protections for the associated application. The application will run without AppArmor confinement until the profile is re-enabled.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-remove-unknown](/man/aa-remove-unknown)(8), [aa-status](/man/aa-status)(8), [apparmor](/man/apparmor)(7)

# RESOURCES

```[Source code](https://gitlab.com/apparmor/apparmor)```

```[Homepage](https://apparmor.net/)```

```[Documentation](https://gitlab.com/apparmor/apparmor/-/wikis/home)```

<!-- verified: 2026-06-10 -->
