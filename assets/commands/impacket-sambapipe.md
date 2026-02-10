# TAGLINE

connects to named pipes on remote Windows systems via SMB

# TLDR

**Access named pipe** on a remote SMB share

```impacket-sambapipe '[domain]/[user]:[password]@[192.168.1.100]' '[pipename]'```

**Connect to pipe using NTLM hash**

```impacket-sambapipe -hashes ':[nthash]' '[domain]/[user]@[192.168.1.100]' '[pipename]'```

**Access pipe via Kerberos authentication**

```impacket-sambapipe -k -no-pass '[domain]/[user]@[target]' '[pipename]'```

# SYNOPSIS

**impacket-sambapipe** [_-h_] [_-hashes LMHASH:NTHASH_] [_-no-pass_] [_-k_] [_-aesKey KEY_] [_-dc-ip IP_] _target_ _pipe_

# PARAMETERS

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes for authentication instead of password

**-no-pass**
> Don't ask for password (useful with -k)

**-k**
> Use Kerberos authentication from ccache file

**-aesKey** _KEY_
> AES key to use for Kerberos authentication

**-dc-ip** _IP_
> IP address of the domain controller (for Kerberos)

# DESCRIPTION

**impacket-sambapipe** connects to named pipes on remote Windows systems via SMB. Named pipes are used for inter-process communication in Windows and many services expose functionality through pipes.

This tool is useful for interacting with services that communicate through named pipes, testing pipe accessibility, or as part of more complex attack chains involving pipe communication.

# CAVEATS

Requires appropriate permissions to access the named pipe. Some pipes require administrative access. The pipe must exist and be accessible on the target system.

# HISTORY

Part of the **Impacket** library by SecureAuth. Named pipe access is fundamental to many Windows protocols and services, making this tool useful for various testing scenarios.

# SEE ALSO

[impacket-smbclient](/man/impacket-smbclient)(1), [smbclient](/man/smbclient)(1), [rpcclient](/man/rpcclient)(1)
