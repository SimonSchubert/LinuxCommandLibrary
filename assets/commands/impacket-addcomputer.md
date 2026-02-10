# TAGLINE

tool from the Impacket library that allows adding or removing computer

# TLDR

**Add a computer account** to the domain using default credentials

```impacket-addcomputer -computer-name '[NEWPC$]' -computer-pass '[Password123]' '[domain]/[user]:[password]'```

**Add a computer account** specifying the domain controller IP

```impacket-addcomputer -computer-name '[NEWPC$]' -dc-ip [192.168.1.100] '[domain]/[user]:[password]'```

**Add a computer** using LDAPS (secure connection)

```impacket-addcomputer -computer-name '[NEWPC$]' -use-ldaps '[domain]/[user]:[password]'```

**Add a computer** using Kerberos authentication with a ticket

```impacket-addcomputer -computer-name '[NEWPC$]' -k -no-pass '[domain]/[user]'```

**Delete a computer account** from the domain

```impacket-addcomputer -computer-name '[TARGETPC$]' -delete '[domain]/[user]:[password]'```

# SYNOPSIS

**impacket-addcomputer** [_-h_] [_-computer-name NAME_] [_-computer-pass PASSWORD_] [_-no-add_] [_-delete_] [_-dc-ip IP_] [_-dc-host HOSTNAME_] [_-use-ldaps_] [_-hashes LMHASH:NTHASH_] [_-no-pass_] [_-k_] [_-aesKey KEY_] _target_

# PARAMETERS

**-computer-name** _NAME_
> Name of the computer account to add (should end with $)

**-computer-pass** _PASSWORD_
> Password for the new computer account

**-delete**
> Delete the specified computer account instead of adding

**-no-add**
> Don't add a computer, only set its password (requires existing account)

**-dc-ip** _IP_
> IP address of the domain controller

**-dc-host** _HOSTNAME_
> Hostname of the domain controller

**-use-ldaps**
> Use LDAPS instead of LDAP

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes for authentication instead of password

**-no-pass**
> Don't ask for password (useful with -k)

**-k**
> Use Kerberos authentication from ccache file

**-aesKey** _KEY_
> AES key to use for Kerberos authentication

# DESCRIPTION

**impacket-addcomputer** is a tool from the Impacket library that allows adding or removing computer accounts in an Active Directory domain. By default, domain users can add up to 10 computer accounts (controlled by the ms-DS-MachineAccountQuota attribute), making this useful for penetration testing scenarios.

The tool communicates with the domain controller via LDAP or SAMR protocols to create machine accounts. Created computer accounts can then be used for various attack techniques including resource-based constrained delegation attacks.

# CAVEATS

Requires valid domain credentials with permissions to create computer accounts. The default ms-DS-MachineAccountQuota may be set to 0 in hardened environments. Computer names should follow NetBIOS naming conventions and typically end with a dollar sign ($).

# HISTORY

Impacket was created by **SecureAuth** (formerly Core Security) as a collection of Python classes for working with network protocols. The addcomputer script was added to support Active Directory penetration testing workflows, particularly after research into resource-based constrained delegation attacks became prominent around **2018-2019**.

# SEE ALSO

[impacket-getadusers](/man/impacket-getadusers)(1), [impacket-secretsdump](/man/impacket-secretsdump)(1), [ldapsearch](/man/ldapsearch)(1), [net](/man/net)(1)
