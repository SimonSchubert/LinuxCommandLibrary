# TAGLINE

generic SMB client for listing shares and files, uploading

# TLDR

**Connect to SMB server**

```impacket-smbclient [domain]/[user]:[password]@[target]```

**Connect with NTLM hash**

```impacket-smbclient -hashes :[hash] [domain]/[user]@[target]```

**Use Kerberos authentication**

```impacket-smbclient -k [domain]/[user]@[target]```

# SYNOPSIS

**impacket-smbclient** [_options_] _target_

# PARAMETERS

**-hashes** _lm:nt_
> Use NTLM hashes.

**-k**
> Use Kerberos authentication.

**-dc-ip** _ip_
> Domain controller IP.

**-target-ip** _ip_
> Target IP (if different from hostname).

# DESCRIPTION

**impacket-smbclient** is a generic SMB client for listing shares and files, uploading, downloading, renaming, and managing directories on Windows systems. Part of the Impacket toolkit. Supports password, NTLM hash, and Kerberos authentication.

# SEE ALSO

[smbclient](/man/smbclient)(1), [impacket-psexec](/man/impacket-psexec)(1)

