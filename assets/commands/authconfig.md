# TAGLINE

Configure system authentication on Red Hat-based distributions

# TLDR

Show **current** configuration

```authconfig --test```

Change **password** algorithm

```authconfig --update --passalgo=sha512```

Enable **LDAP** authentication

```authconfig --update --enableldapauth```

Disable **LDAP** authentication

```authconfig --update --disableldapauth```

Enable **NIS**

```authconfig --update --enablenis```

Enable **Kerberos**

```authconfig --update --enablekrb5```

Enable **Winbind** (Active Directory)

```authconfig --update --enablewinbindauth```

Enable **SSSD** for identity and authentication

```authconfig --update --enablesssd --enablesssdauth```

**Create home directories** on first login

```authconfig --update --enablemkhomedir```

Save a **named backup** of the configuration files

```authconfig --savebackup=[name]```

# SYNOPSIS

**authconfig** [_OPTIONS_]

# DESCRIPTION

**authconfig** configures system authentication resources on Red Hat-based Linux distributions. It manages PAM stack configuration, nsswitch.conf settings, and related authentication files to enable or disable mechanisms including LDAP, NIS, Kerberos, Winbind, and local authentication.

The tool modifies system files to integrate centralized identity providers with the local authentication stack. Use **--test** to inspect the current configuration before making changes with **--update**.

# PARAMETERS

**--test**
> Display the current configuration without making changes

**--update**
> Apply configuration changes

**--passalgo** _algorithm_
> Set password hashing algorithm (sha256, sha512)

**--probe**
> Probe the network via DNS for defaults and print them, without changing anything

**--enableldap**
> Use LDAP for user information lookups (modifies nsswitch.conf)

**--enableldapauth**
> Use LDAP for authentication (modifies the PAM stack)

**--disableldapauth**
> Disable LDAP authentication

**--enablesssd**
> Use SSSD for user information lookups

**--enablesssdauth**
> Use SSSD for authentication

**--enablenis**
> Enable Network Information Service

**--enablekrb5**
> Enable Kerberos 5 authentication

**--enablewinbindauth**
> Enable Winbind (Active Directory) authentication

**--enablelocauthorize**
> Enable local authorization

**--enablemkhomedir**
> Create a user home directory automatically on first login

**--enableshadow**
> Enable shadow password file

**--savebackup** _name_
> Save a named backup of the files authconfig modifies

**--restorebackup** _name_
> Restore a previously saved named backup

**--restorelastbackup**
> Restore the automatic backup taken before the last change

# CONFIGURATION

**/etc/sysconfig/authconfig**
> Stores the current authconfig settings as key-value pairs.

**/etc/pam.d/**
> PAM configuration directory modified by authconfig to enable authentication modules.

**/etc/nsswitch.conf**
> Name service switch configuration, updated to reflect identity source changes.

# CAVEATS

This tool is specific to Red Hat-based distributions (RHEL, CentOS, Fedora). It was deprecated in favor of **authselect** starting with RHEL 8 and Fedora 28, and removed entirely from Fedora 35 onward. On those systems, use **authselect** instead. Changes require root privileges, and **--update** must be run to persist them.

# HISTORY

**authconfig** was the standard authentication configuration tool for Red Hat Enterprise Linux and related distributions for many years. It was superseded by **authselect**, which uses predefined profiles to manage the PAM stack and nsswitch.conf. See the authselect-migration(7) man page for equivalent commands.

# SEE ALSO

[authselect](/man/authselect)(8), [pam](/man/pam)(8)
