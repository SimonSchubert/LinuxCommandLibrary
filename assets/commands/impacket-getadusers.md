# TAGLINE

queries Active Directory via LDAP to enumerate user accounts and their

# TLDR

**Enumerate all domain users** with their details

```impacket-getadusers -all '[domain]/[user]:[password]'```

**Query users** specifying the domain controller IP

```impacket-getadusers -all -dc-ip [192.168.1.100] '[domain]/[user]:[password]'```

**Get users using NTLM hash** authentication

```impacket-getadusers -all -hashes ':[nthash]' '[domain]/[user]'```

**Enumerate users via Kerberos** authentication

```impacket-getadusers -all -k -no-pass '[domain]/[user]'```

**Output user information** in a specific format

```impacket-getadusers -all -dc-ip [192.168.1.100] '[domain]/[user]:[password]' 2>/dev/null```

# SYNOPSIS

**impacket-getadusers** [_-h_] [_-user USERNAME_] [_-all_] [_-dc-ip IP_] [_-dc-host HOSTNAME_] [_-hashes LMHASH:NTHASH_] [_-no-pass_] [_-k_] [_-aesKey KEY_] _target_

# PARAMETERS

**-all**
> Return all users in the domain

**-user** _USERNAME_
> Query information for a specific user only

**-dc-ip** _IP_
> IP address of the domain controller

**-dc-host** _HOSTNAME_
> Hostname of the domain controller (used for Kerberos)

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes for authentication instead of password

**-no-pass**
> Don't ask for password (useful with -k or -hashes)

**-k**
> Use Kerberos authentication from ccache file

**-aesKey** _KEY_
> AES key to use for Kerberos authentication

# DESCRIPTION

**impacket-getadusers** queries Active Directory via LDAP to enumerate user accounts and their attributes. It retrieves information such as usernames, last logon times, password last set dates, and account status flags.

The tool is useful for reconnaissance during penetration tests to identify potential targets, find accounts with old passwords, or discover service accounts. Output includes the SAM account name, badPwdCount, and other relevant security attributes.

# CAVEATS

Requires valid domain credentials. Output may be verbose; consider redirecting stderr to /dev/null for cleaner output. The -all flag is typically required to see results for more than just the authenticated user.

# HISTORY

Part of the **Impacket** library developed by SecureAuth. The tool leverages LDAP queries against Active Directory, implementing Microsoft's directory service protocols in Python for cross-platform compatibility.

# SEE ALSO

[impacket-addcomputer](/man/impacket-addcomputer)(1), [impacket-secretsdump](/man/impacket-secretsdump)(1), [ldapsearch](/man/ldapsearch)(1), [net](/man/net)(1)
