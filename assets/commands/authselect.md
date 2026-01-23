# TLDR

**List available profiles**

```authselect list```

**Show current configuration**

```authselect current```

**Select the SSSD profile** for LDAP/FreeIPA authentication

```sudo authselect select sssd --force```

**Select SSSD profile** with fingerprint authentication

```sudo authselect select sssd with-fingerprint --force```

**Select the Winbind profile** for Active Directory

```sudo authselect select winbind --force```

**Enable a feature** on current profile

```sudo authselect enable-feature with-mkhomedir```

**Backup current configuration**

```sudo authselect backup [backup-name]```

**Restore from backup**

```sudo authselect backup-restore [backup-name]```

# SYNOPSIS

**authselect** _command_ [_options_]

# PARAMETERS

**list**
> List available profiles

**show** _profile_
> Display information about a profile

**current**
> Show currently selected profile and features

**select** _profile_ [_features_]
> Activate a profile with optional features

**enable-feature** _feature_
> Enable a feature on the current profile

**disable-feature** _feature_
> Disable a feature on the current profile

**backup** [_name_]
> Backup current system configuration

**backup-restore** _name_
> Restore configuration from backup

**backup-list**
> List available backups

**opt-out**
> Remove authselect management of configuration

**--force**
> Overwrite existing non-authselect configuration

**-b**, **--backup**
> Create backup before making changes

**-q**, **--quiet**
> Suppress output messages

# PROFILES

**sssd**
> System Security Services Daemon for LDAP, FreeIPA, Active Directory

**winbind**
> Samba Winbind for direct Active Directory integration

**nis**
> Legacy Network Information Service compatibility

**minimal**
> Local users and groups only (system files)

# COMMON FEATURES

**with-mkhomedir**
> Automatically create home directories on first login

**with-fingerprint**
> Enable fingerprint authentication

**with-smartcard**
> Enable smart card authentication

**with-faillock**
> Enable account lockout after failed attempts

**with-sudo**
> Enable SSSD as source for sudo rules

# DESCRIPTION

**authselect** configures system authentication sources by managing PAM stack and nsswitch.conf files through predefined profiles. It replaced **authconfig** starting with Fedora 28 and RHEL 8.

Profiles define how users are authenticated and where identity information is retrieved. The **sssd** profile is most common for enterprise environments using LDAP, FreeIPA, or Active Directory. The **winbind** profile provides an alternative for Active Directory integration.

Authselect only configures PAM and nsswitch; it does not configure the underlying daemons (SSSD, Winbind). Use tools like **realm join** or **ipa-client-install** to set up domain membership, which automatically configure authselect.

Custom profiles can be created by copying and modifying existing profiles in **/etc/authselect/custom/**.

# CAVEATS

Using **--force** is required when switching from manually configured systems. Do not modify authselect profiles configured by **ipa-client-install** or **realm join**. Changes to nsswitch.conf or PAM files outside authselect will be overwritten on profile changes.

# HISTORY

**authselect** was developed by Red Hat and introduced in **Fedora 28** (2018) as a replacement for authconfig. It was designed to provide a simpler, more maintainable approach to authentication configuration using predefined profiles rather than individual option flags. By **Fedora 35**, authconfig was fully removed, making authselect the standard tool.

# SEE ALSO

[sssd](/man/sssd)(8), [pam](/man/pam)(8), [nsswitch.conf](/man/nsswitch.conf)(5), [realm](/man/realm)(8)
