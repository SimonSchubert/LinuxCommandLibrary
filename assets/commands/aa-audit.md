# TAGLINE

Set AppArmor profiles to audit mode

# TLDR

Set a profile to **audit mode**

```sudo aa-audit [profile_name]```

Set **multiple profiles** to audit mode

```sudo aa-audit [profile1] [profile2]```

Set a profile to audit mode from a **specific directory**

```sudo aa-audit -d /path/to/profiles [profile_name]```

**Remove** audit mode for a profile

```sudo aa-audit -r [profile_name]```

Set a profile to audit mode **without reloading** it

```sudo aa-audit --no-reload [profile_name]```

# SYNOPSIS

**aa-audit** _executable_ [_executable_ ...] [_-d /path/to/profiles_] [_--no-reload_] [_-r_]

# DESCRIPTION

**aa-audit** configures AppArmor security profiles to operate in audit mode. In this mode, security policy is enforced and **all access attempts** (both successes and failures) are logged to the system log. This allows administrators to monitor application behavior while still enforcing security policies.

# PARAMETERS

**-d, --dir /path/to/profiles**
> Specifies the directory containing AppArmor profiles; defaults to /etc/apparmor.d

**--no-reload**
> Prevents automatic profile reloading after modifications

**-r, --remove**
> Deactivates audit mode for the specified profile(s)

**-h, --help**
> Display help information

# CAVEATS

Audit mode generates significant log output as it records all access attempts. This can impact system performance and fill up log files quickly on busy systems.

# HISTORY

Part of the **AppArmor** application security framework, developed as an alternative to SELinux for Linux systems. AppArmor was originally developed by **Immunix** and later acquired by **Novell** in 2005.

# SEE ALSO

[aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-disable](/man/aa-disable)(8), [aa-status](/man/aa-status)(8), [apparmor](/man/apparmor)(7)
