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

Enable **local** authorization

```authconfig --update --enablelocauthorize```

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

**--enableldapauth**
> Enable LDAP authentication

**--disableldapauth**
> Disable LDAP authentication

**--enablenis**
> Enable Network Information Service

**--enablekrb5**
> Enable Kerberos 5 authentication

**--enablewinbindauth**
> Enable Winbind (Active Directory) authentication

**--enablelocauthorize**
> Enable local authorization

**--enableshadow**
> Enable shadow password file

# CONFIGURATION

**/etc/sysconfig/authconfig**
> Stores the current authconfig settings as key-value pairs.

**/etc/pam.d/**
> PAM configuration directory modified by authconfig to enable authentication modules.

**/etc/nsswitch.conf**
> Name service switch configuration, updated to reflect identity source changes.

# CAVEATS

This tool is specific to Red Hat-based distributions (RHEL, CentOS, Fedora). It has been deprecated in favor of **authselect** on newer systems. Changes require root privileges.

# HISTORY

**authconfig** was the standard authentication configuration tool for Red Hat Enterprise Linux and related distributions before being replaced by **authselect**.

# SEE ALSO

[authselect](/man/authselect)(8), [pam](/man/pam)(8)
