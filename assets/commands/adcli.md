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
> Display discovered information about a domain or domain controller

**-U** _user_, **--login-user** _user_
> User account used to authenticate when creating the computer account

**-D** _domain_, **--domain** _domain_
> Domain to connect to

**-R** _realm_, **--domain-realm** _realm_
> Kerberos realm for the domain, if it differs from the domain name

**-S** _server_, **--domain-server** _server_
> Connect to a specific domain controller

**-O** _ou_, **--domain-ou** _ou_
> Distinguished name of the organizational unit for the computer account

**-N** _name_, **--computer-name** _name_
> Short (sAMAccountName) name for the computer account

**-H** _fqdn_, **--host-fqdn** _fqdn_
> Override the fully qualified domain name of the local machine

**--stdin-password**
> Read the password from stdin instead of prompting

**-v**, **--verbose**
> Print verbose, debug-level progress information

# CAVEATS

Requires appropriate permissions in AD to create computer accounts. Firewall rules must allow LDAP (389) and Kerberos (88) traffic. For full AD integration, combine with SSSD for user authentication. **adcli** is normally invoked indirectly by **realm** (realmd), which calls it to perform the actual join.

# HISTORY

**adcli** was developed by Stef Walter at Red Hat, first released around **2012**. It was created to provide a lightweight alternative to Samba for AD domain joining, suitable for modern Linux enterprise deployments.

# INSTALL

```apt: sudo apt install adcli```

```dnf: sudo dnf install adcli```

```aur: yay -S adcli```

```zypper: sudo zypper install adcli```

```nix: nix profile install nixpkgs#adcli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[kinit](/man/kinit)(1), [net](/man/net)(8)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/realmd/adcli)```

```[Documentation](https://www.freedesktop.org/software/realmd/adcli/adcli.html)```

<!-- verified: 2026-06-11 -->
