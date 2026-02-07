# TAGLINE

Create machine accounts in Active Directory

# TLDR

**Add** computer to Active Directory

```addcomputer.py [domain]/[user]:[password] -computer-name [hostname]```

Specify **domain controller**

```addcomputer.py [domain]/[user]:[password] -dc-ip [192.168.1.1] -computer-name [hostname]```

Use **pass-the-hash**

```addcomputer.py [domain]/[user] -hashes :[NTHASH] -computer-name [hostname]```

# SYNOPSIS

**addcomputer.py** _domain_/_user_:_password_ -computer-name _name_ [_options_]

# DESCRIPTION

**addcomputer.py** (also known as add-computer.py) is an Impacket script for creating machine accounts in Active Directory. It leverages the default AD permission that allows any authenticated user to add computer accounts to the domain.

This capability is useful in penetration testing for setting up resource-based constrained delegation attacks or gaining additional footholds in the domain.

# PARAMETERS

**-dc-ip** _ip_
> IP address of the domain controller

**-computer-name** _name_
> Name of the computer account to create

**-computer-pass** _password_
> Password for the computer account

**-method** _SAMR|LDAP_
> Protocol to use for adding the computer

**-hashes** _LMHASH:NTHASH_
> Authenticate using NT hash

**-k**, **--kerberos**
> Use Kerberos authentication

**-no-pass**
> Don't prompt for password

# CAVEATS

For authorized security testing only. The default ms-DS-MachineAccountQuota of 10 can be modified or set to 0 by administrators. Computer accounts created this way are visible to domain administrators.

# HISTORY

Part of the Impacket suite maintained by SecureAuth, this tool gained prominence in security testing as resource-based constrained delegation attacks became more widely understood after **2018**.

# SEE ALSO

[add-computer.py](/man/add-computer.py)(1), [rbcd.py](/man/rbcd.py)(1), [getST.py](/man/getST.py)(1)
