# TAGLINE

reads files from remote Windows systems via SMB by directly parsing the NTFS

# TLDR

**Read a file from a remote NTFS share**

```impacket-ntfs-read '[domain]/[user]:[password]@[192.168.1.100]' '[C$\Windows\System32\config\SAM]'```

**Read file using NTLM hash** authentication

```impacket-ntfs-read -hashes ':[nthash]' '[domain]/[user]@[192.168.1.100]' '[share\path\to\file]'```

**Read file using Kerberos** authentication

```impacket-ntfs-read -k -no-pass '[domain]/[user]@[target]' '[C$\path\to\file]'```

# SYNOPSIS

**impacket-ntfs-read** [_-h_] [_-hashes LMHASH:NTHASH_] [_-no-pass_] [_-k_] [_-aesKey KEY_] [_-dc-ip IP_] _target_ _path_

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

**impacket-ntfs-read** reads files from remote Windows systems via SMB by directly parsing the NTFS file system structures. This allows reading files that might be locked by the operating system, such as registry hives or other system files.

The tool connects to administrative shares (C$, ADMIN$) and reads files at the raw NTFS level, bypassing Windows file locking mechanisms. This is particularly useful for extracting sensitive files during penetration tests.

# CAVEATS

Requires administrative access to the target system (access to C$ or ADMIN$ shares). Some files may still be inaccessible due to NTFS permissions. The path should use backslashes and reference the share name.

# HISTORY

Part of the **Impacket** library by SecureAuth. The tool implements NTFS parsing over SMB to enable reading locked files, a technique commonly used in credential extraction workflows.

# SEE ALSO

[impacket-secretsdump](/man/impacket-secretsdump)(1), [smbclient](/man/smbclient)(1), [impacket-smbclient](/man/impacket-smbclient)(1)
