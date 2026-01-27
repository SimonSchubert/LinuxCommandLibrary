# TLDR

**Start the Samba AD DC daemon** in the foreground

```samba -i```

**Start with a specific configuration file**

```samba -s [/etc/samba/smb.conf]```

**Start with debug logging**

```samba -d [3]```

**Check Samba version**

```samba --version```

**Start as a classic NT4-style domain controller**

```samba --option="server role=classic primary domain controller"```

# SYNOPSIS

**samba** [_-D_] [_-i_] [_-M model_] [_--no-process-group_] [_-d debuglevel_] [_-s configfile_]

# PARAMETERS

**-D**, **--daemon**
> Run as a daemon (background process)

**-i**, **--interactive**
> Run interactively in the foreground

**-M** _model_, **--model**=_model_
> Select process model: single, standard, prefork, thread

**-d** _level_, **--debuglevel**=_level_
> Set debug logging level (0-10)

**-s** _file_, **--configfile**=_file_
> Use alternate configuration file

**--no-process-group**
> Don't create a new process group

**-V**, **--version**
> Print version information

# DESCRIPTION

**Samba** is a software suite that implements the SMB/CIFS protocol, allowing Unix systems to share files and printers with Windows clients. The samba daemon provides Active Directory Domain Controller services.

The suite consists of several components: **smbd** handles file and print services, **nmbd** provides NetBIOS name resolution and browsing, **winbindd** handles user and group lookups, and **samba** itself acts as an AD domain controller when configured.

Configuration is managed through **/etc/samba/smb.conf**, which defines shares, authentication, and network settings. Samba can integrate with existing Windows domains or serve as a complete replacement for Windows Server AD infrastructure.

# CAVEATS

Running Samba as an AD DC requires careful DNS and Kerberos configuration. The samba daemon (AD DC mode) and smbd/nmbd (file server mode) are mutually exclusive configurations. Firewall rules must allow ports 139, 445 for SMB, and 88, 389, 636 for AD services.

# HISTORY

Samba was created by **Andrew Tridgell** in **1992** as a reverse-engineered implementation of SMB. Originally named "smbserver," it was renamed Samba after trademark concerns. Active Directory support was added in version 4.0 (**2012**), enabling full domain controller functionality.

# SEE ALSO

[smbd](/man/smbd)(8), [nmbd](/man/nmbd)(8), [smbclient](/man/smbclient)(1), [testparm](/man/testparm)(1)
