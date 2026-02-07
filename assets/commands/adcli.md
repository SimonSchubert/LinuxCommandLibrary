# TAGLINE

Active Directory domain client tool

# TLDR

**Join** a domain

```sudo adcli join [domain.com]```

Join with **specific credentials**

```sudo adcli join -U [administrator] [domain.com]```

**Info** about a domain

```adcli info [domain.com]```

**Test** connection to domain controller

```adcli testjoin```

# SYNOPSIS

**adcli** _command_ [_options_] [_domain_]

# DESCRIPTION

**adcli** is a command-line tool for performing actions on an Active Directory domain. It can join Linux machines to AD domains, manage computer accounts, and query domain information without requiring Samba.

The tool uses standard Kerberos and LDAP protocols to communicate with domain controllers, making it lightweight and suitable for automated deployments.

# PARAMETERS

**join**
> Join the local machine to the domain

**preset-computer**
> Pre-create a computer account in the domain

**reset-computer**
> Reset the computer account password

**delete-computer**
> Delete a computer account from the domain

**update**
> Update machine account attributes

**testjoin**
> Test if machine is joined to domain

**info**
> Display domain information

**-U** _user_
> Administrator username for joining

**-D** _domain_
> Domain to join

**-O** _ou_
> Organizational unit for computer account

**-H** _hostname_
> Override local hostname

**--stdin-password**
> Read password from stdin

# CAVEATS

Requires appropriate permissions in AD to create computer accounts. Firewall rules must allow LDAP (389) and Kerberos (88) traffic. For full AD integration, combine with SSSD for user authentication.

# HISTORY

**adcli** was developed by Stef Walter at Red Hat, first released around **2012**. It was created to provide a lightweight alternative to Samba for AD domain joining, suitable for modern Linux enterprise deployments.

# SEE ALSO

[realm](/man/realm)(8), [sssd](/man/sssd)(8), [kinit](/man/kinit)(1), [net](/man/net)(8)
