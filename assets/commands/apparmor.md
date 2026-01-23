# TLDR

**Display AppArmor status** and loaded profiles

```sudo aa-status```

**Set a profile** to enforce mode

```sudo aa-enforce [/etc/apparmor.d/usr.bin.firefox]```

**Set a profile** to complain mode (log only)

```sudo aa-complain [/etc/apparmor.d/usr.bin.firefox]```

**Disable a profile**

```sudo aa-disable [/etc/apparmor.d/usr.bin.firefox]```

**Reload all AppArmor profiles**

```sudo systemctl reload apparmor```

**Generate a new profile** interactively

```sudo aa-genprof [/usr/bin/application]```

**Update profiles** based on log events

```sudo aa-logprof```

# SYNOPSIS

**aa-status** [_options_]

**aa-enforce** _profile_

**aa-complain** _profile_

**aa-disable** _profile_

**aa-genprof** _executable_

**aa-logprof**

# PARAMETERS

**aa-status**
> Display the current state of AppArmor, including loaded profiles and their modes

**aa-enforce** _profile_
> Set a profile to enforce mode (blocks policy violations)

**aa-complain** _profile_
> Set a profile to complain mode (logs violations without blocking)

**aa-disable** _profile_
> Disable a profile entirely

**aa-genprof** _executable_
> Generate a new profile for an application interactively

**aa-logprof**
> Update profiles based on events logged in complain mode

**aa-unconfined**
> List processes running without AppArmor confinement

**--verbose**
> Display detailed information (aa-status)

**--enforced**
> Show only enforced profile count (aa-status)

**--complaining**
> Show only complaining profile count (aa-status)

# DESCRIPTION

**AppArmor** (Application Armor) is a Linux Security Module that provides Mandatory Access Control (MAC) for programs. It confines applications using per-program security profiles that restrict file access, network capabilities, and other system resources.

Profiles operate in two modes: **enforce** mode blocks and logs violations, while **complain** mode only logs without blocking, useful for developing and testing new profiles.

The **aa-status** command displays loaded profiles and their modes. Use **aa-enforce** and **aa-complain** to switch profile modes. The **aa-genprof** tool generates new profiles by running an application and learning its behavior, while **aa-logprof** refines existing profiles based on logged events.

Profiles are stored in **/etc/apparmor.d/** and loaded at boot. The AppArmor service manages profile loading via systemd on modern distributions.

# EXIT CODES

**aa-status** returns: **0** = AppArmor enabled with policy loaded, **1** = AppArmor not enabled, **2** = AppArmor enabled but no policy loaded, **3** = AppArmor control files not available, **4** = insufficient privileges.

# CAVEATS

Most AppArmor commands require root privileges. Profiles in enforce mode can break application functionality if the policy is too restrictive. Test new profiles in complain mode first. The **apparmor-utils** package must be installed for profile management tools.

# HISTORY

AppArmor was developed by **Immunix Inc.** in the late **1990s** and acquired by **Novell** in **2005**. It became part of the mainline Linux kernel in version **2.6.36** (2010). Ubuntu has included AppArmor by default since version **7.10** (2007), and it is also available on Debian, SUSE, and other distributions as an alternative to SELinux.

# SEE ALSO

[aa-status](/man/aa-status)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-notify](/man/aa-notify)(8), [selinux](/man/selinux)(8)
