# TAGLINE

Manage Uncomplicated Firewall application profiles

# TLDR

List available **application profiles**

```sudo ufw app list```

Show **ports and protocols** for a profile (or all profiles)

```sudo ufw app info [profile_name|all]```

**Allow** traffic using a profile (quote names that contain spaces)

```sudo ufw allow "[profile_name]"```

**Deny** traffic using a profile

```sudo ufw deny "[profile_name]"```

Allow a profile only from a **subnet** (extended syntax uses **app**, not **port**)

```sudo ufw allow from 192.168.0.0/16 to any app [profile_name]```

**Update** firewall rules after a profile file changed

```sudo ufw app update [profile_name|all]```

Update a profile and **add a new rule** if none exists yet

```sudo ufw app update --add-new [profile_name]```

Set the default policy for **update --add-new** (installation default is **skip**)

```sudo ufw app default [allow|deny|reject|skip]```

# SYNOPSIS

**ufw** [_--dry-run_] **app** **list** | **info** _PROFILE_|**all** | **update** [_--add-new_] _PROFILE_|**all** | **default** _allow_|_deny_|_reject_|_skip_

# PARAMETERS

**app list**
> Print the names of profiles found under `/etc/ufw/applications.d/`

**app info** _PROFILE_|**all**
> Show title, description, and ports/protocols for one profile, or for every known profile

**app update** _PROFILE_|**all**
> Refresh firewall rules that already use that profile after its definition changed

**app update --add-new** _PROFILE_
> Same as **update**, and also add a rule for the profile when none exists. **all** is not valid with **--add-new**

**app default** _allow_|_deny_|_reject_|_skip_
> Policy used by **update --add-new**. Installation default is **skip** (do nothing). **allow**, **deny**, and **reject** add a matching rule automatically

**allow** / **deny** / **reject** / **limit** _PROFILE_
> Add a rule from a profile (simple syntax). Quote names that contain spaces

**from** _address_ **to any app** _PROFILE_
> Extended syntax: use **app** in place of **port**. Do not specify a protocol alongside a profile

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw app** manages Uncomplicated Firewall application profiles: named port/protocol sets that packages and administrators drop in `/etc/ufw/applications.d/`. It is a **ufw** subcommand, not a separate binary.

**list** names every profile ufw currently knows. **info** prints the INI fields for one name (or **all**): title, description, and the ports that a later `ufw allow OpenSSH` (or similar) will expand into real rules.

Profiles use a simple INI format:

```
[SomeService]
title=Some title
description=Some description
ports=12/udp|34|56,78:90/tcp
```

The **ports** field is a `|`-separated list. Protocol is optional on a single port. A comma-separated list or `start:end` range requires an explicit protocol. In the example, SomeService is UDP 12, TCP and UDP 34, and TCP 56 plus 78–90 inclusive.

After creating or editing a profile file, **app update** rewrites existing rules that used that profile. **app update --add-new** also inserts a rule when none exists; that extra insert follows **app default**. The default is **skip**. Setting **allow** as the application default is a security risk: a newly installed package profile would open its ports without a separate `ufw allow`.

# CONFIGURATION

**/etc/ufw/applications.d/**
> Directory of INI application profiles. Packages such as OpenSSH, nginx, and Apache commonly install files here.

**/etc/default/ufw**
> `DEFAULT_APPLICATION_POLICY` stores the **app default** value (`SKIP`, `ACCEPT`, `DROP`, or `REJECT`).

# CAVEATS

Requires root or sudo. Quote profile names that contain spaces (`"Nginx Full"`). Do not combine a profile with a protocol in either syntax; in the extended form, use **app** instead of **port**. **--add-new** cannot take **all**. Once a profile is turned into a rule, ufw stores ports and protocols, not the profile name, so later edits need **app update**. Do not confuse **ufw app default** with **ufw default**, which sets unmatched traffic policy for incoming, outgoing, and routed traffic.

# HISTORY

Application profiles have been part of **ufw** (Uncomplicated Firewall) since Ubuntu 8.10. **ufw** itself was developed by Canonical as a frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-10-15 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-deny](/man/ufw-deny)(8), [ufw-default](/man/ufw-default)(8), [ufw-status](/man/ufw-status)(8), [ufw-enable](/man/ufw-enable)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-10-15 -->
