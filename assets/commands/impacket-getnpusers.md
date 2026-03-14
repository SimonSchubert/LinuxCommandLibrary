# TAGLINE

finds Active Directory users with "Do not require Kerberos preauthentication"

# TLDR

**Find AS-REP roastable users** from a users file

```impacket-GetNPUsers [domain]/ -dc-ip [dc-ip] -usersfile [users.txt]```

**Get hash for specific user** without credentials

```impacket-GetNPUsers [domain]/[user] -dc-ip [dc-ip] -no-pass```

**Request hashes** in hashcat format and save to file

```impacket-GetNPUsers [domain]/ -dc-ip [dc-ip] -usersfile [users.txt] -format hashcat -outputfile [hashes.txt]```

**Enumerate via LDAP** with credentials

```impacket-GetNPUsers [domain]/[user]:[password] -dc-ip [dc-ip] -request```

**Use Kerberos authentication** from ccache

```impacket-GetNPUsers [domain]/[user] -dc-ip [dc-ip] -k -no-pass```

# SYNOPSIS

**impacket-GetNPUsers** [_options_] _target_

# PARAMETERS

**-dc-ip** _ip_
> Domain controller IP address.

**-usersfile** _file_
> File with usernames to test (one per line).

**-no-pass**
> Don't ask for password (useful with -k or anonymous queries).

**-request**
> Request TGT hashes for vulnerable users (default: only list them).

**-format** _type_
> Hash output format: hashcat or john (default: hashcat).

**-outputfile** _file_
> Save hashes to file instead of stdout.

**-k**
> Use Kerberos authentication from ccache (KRB5CCNAME).

**-hashes** _LMHASH:NTHASH_
> Authenticate using NTLM hashes instead of password.

**-aesKey** _KEY_
> AES key to use for Kerberos authentication.

**-ts**
> Add timestamp to logging output.

**-debug**
> Turn on debug output.

# DESCRIPTION

**impacket-GetNPUsers** lists and requests TGTs for Active Directory users with "Do not require Kerberos preauthentication" set (UF_DONT_REQUIRE_PREAUTH). This enables AS-REP Roasting: the retrieved hashes can be cracked offline with hashcat or John the Ripper.

Without **-usersfile**, the script queries LDAP to automatically enumerate vulnerable accounts (requires valid credentials). With **-usersfile**, it tests each username without needing domain credentials. Part of the Impacket toolkit. For authorized security testing only.

# SEE ALSO

[impacket-getuserspns](/man/impacket-getuserspns)(1), [hashcat](/man/hashcat)(1)

