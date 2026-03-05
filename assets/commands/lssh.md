# TAGLINE

TUI list-based SSH, SCP, and SFTP client

# TLDR

**Launch the SSH connection list**

```lssh```

**Launch the SCP client**

```lscp```

**Launch the SFTP client**

```lsftp```

# SYNOPSIS

**lssh** [_options_]

# DESCRIPTION

**lssh** is a TUI list-select client for SSH, SCP, and SFTP connections. It reads your OpenSSH config (~/.ssh/config) and presents servers in a selectable list for quick connection.

Features include support for password, public key, certificate, and PKCS11 (Yubikey) authentication, the ability to use the local machine's bashrc at the SSH destination, and NFS forward/reverse forwarding support.

# CAVEATS

Requires an OpenSSH configuration file. Authentication methods depend on the server-side configuration.

# HISTORY

**lssh** was created by **blacknon** and is written in **Go**. It runs on Linux, macOS, and Windows.

# SEE ALSO

[ssh](/man/ssh)(1), [scp](/man/scp)(1), [sftp](/man/sftp)(1), [lazyssh](/man/lazyssh)(1)
