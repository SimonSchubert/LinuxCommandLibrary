# TAGLINE

Feature-rich terminal file transfer and explorer

# TLDR

**Launch the interactive file transfer UI**

```termscp```

**Connect to a remote host via SFTP**

```termscp sftp://[user]@[192.168.1.10]:22```

**Browse an S3 bucket**

```termscp s3://[my-bucket]```

# SYNOPSIS

**termscp** [_options_] [_protocol_://_user_@_host_:_port_]

# DESCRIPTION

**termscp** is a terminal UI file transfer tool with support for SCP, SFTP, FTP/FTPS, Kubernetes, S3, SMB, and WebDAV protocols. It provides a dual-pane file explorer for local and remote filesystems, built-in bookmarks, SSH key storage, customizable themes, desktop notifications for large transfers, and an embedded terminal.

# HISTORY

**termscp** was created by **Veeso** (Christian Visintin) and is written in **Rust**.

# SEE ALSO

[scp](/man/scp)(1), [sftp](/man/sftp)(1), [rclone](/man/rclone)(1)
