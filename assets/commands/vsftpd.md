# TLDR

**Start vsftpd** in standalone mode

```vsftpd```

**Start with a specific configuration file**

```vsftpd [/etc/vsftpd.conf]```

**Start the vsftpd service** via systemd

```sudo systemctl start vsftpd```

**Enable vsftpd on boot**

```sudo systemctl enable vsftpd```

**Check configuration syntax**

```vsftpd -v```

# SYNOPSIS

**vsftpd** [_config_file_]

# DESCRIPTION

**vsftpd** (Very Secure FTP Daemon) is a lightweight, secure FTP server for Unix-like systems. It serves as the default FTP server on many Linux distributions including Ubuntu, Fedora, and RHEL.

The daemon can run standalone (recommended) by setting **listen=YES** in /etc/vsftpd.conf, or be launched via inetd/xinetd. It listens on TCP port 21 by default for control connections.

vsftpd supports anonymous FTP, local user authentication, virtual users via PAM, SSL/TLS encryption (FTPS), and passive mode for NAT environments. Access control is managed through /etc/vsftpd/ftpusers and /etc/vsftpd/user_list.

# CONFIGURATION

Key settings in **/etc/vsftpd.conf**:

**listen=YES**
> Run in standalone mode

**anonymous_enable=NO**
> Disable anonymous access

**local_enable=YES**
> Allow local user logins

**write_enable=YES**
> Allow upload operations

**chroot_local_user=YES**
> Confine users to home directories

**pasv_enable=YES**
> Enable passive mode

**pasv_min_port/pasv_max_port**
> Passive mode port range

# CAVEATS

FTP transmits credentials in cleartext; enable SSL/TLS for security. Passive mode requires firewall rules for the data port range. Consider SFTP (SSH-based) as a more secure alternative to FTP.

# HISTORY

vsftpd was written by **Chris Evans** with a focus on security, becoming the most widely deployed FTP server on Linux. Its design prioritizes security through privilege separation and minimal attack surface.

# SEE ALSO

[sftp](/man/sftp)(1), [ftpd](/man/ftpd)(8), [ftp](/man/ftp)(1), [proftpd](/man/proftpd)(8)
