# TLDR

**Add** a computer account to Active Directory

```add-computer.py [domain]/[user]:[password] -computer-name [hostname]```

Add with **specific attributes**

```add-computer.py [domain]/[user]:[password] -computer-name [hostname] -computer-pass [password]```

Use **Kerberos** authentication

```add-computer.py -k [domain]/[user] -computer-name [hostname]```

# SYNOPSIS

**add-computer.py** [_-dc-ip ip_] _domain_/_user_:_password_ -computer-name _name_ [_options_]

# DESCRIPTION

**add-computer.py** is an Impacket tool for adding computer accounts to Active Directory domains. It exploits the default AD configuration that allows authenticated users to add up to 10 computer accounts to the domain.

This is commonly used in penetration testing for resource-based constrained delegation attacks, as controlling a computer account provides additional attack vectors within an AD environment.

# PARAMETERS

**-dc-ip** _ip_
> Domain controller IP address

**-computer-name** _name_
> Name for the new computer account

**-computer-pass** _password_
> Password for the computer account (auto-generated if not specified)

**-method** _method_
> Method to add computer: SAMR or LDAP

**-k**
> Use Kerberos authentication (requires ccache)

**-no-pass**
> Don't prompt for password (use with -k)

**-hashes** _LMHASH:NTHASH_
> Use NTLM hash for authentication

# CAVEATS

This tool is intended for authorized penetration testing only. By default, AD allows users to create up to 10 computer accounts (ms-DS-MachineAccountQuota). This limit may be modified by administrators.

# HISTORY

**add-computer.py** is part of the Impacket library, developed by SecureAuth (formerly Core Security). Impacket has been actively developed since the early **2000s** as a collection of Python classes for network protocols.

# SEE ALSO

[impacket](/man/impacket)(1), [adcli](/man/adcli)(8), [addcomputer.py](/man/addcomputer.py)(1)
