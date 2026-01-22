# TLDR

**Display ACLs** for a file on SMB share

```smbcacls //[server]/[share] [path/to/file] --user [domain\\username]%[password]```

**Set** a new ACL

```smbcacls //[server]/[share] [path/to/file] --user [username]%[password] "ACL:[DACL]"```

**Reset** ACLs and set new ones

```smbcacls //[server]/[share] [path/to/file] --user [username]%[password] "RESET" "ACL:[DACL]"```

**Change owner** of file

```smbcacls //[server]/[share] [path/to/file] --chown [domain\\user] --user [username]```

**Recursive** ACL operation

```smbcacls //[server]/[share] [path/to/dir] --recurse --user [username]```

# SYNOPSIS

**smbcacls** _//server/share_ _filename_ [_OPTIONS_]

# PARAMETERS

**-a, --add** _acl_
> Add ACE entries without modifying existing ones

**-M, --modify** _acl_
> Modify permission masks for specified ACEs

**-D, --delete** _acl_
> Delete specified ACE entries

**-S, --set** _acl_
> Replace entire ACL with new entries

**-C, --chown** _name_
> Change file/directory owner

**-G, --chgrp** _name_
> Change group ownership

**-I, --inherit** _allow|remove|copy_
> Enable, remove, or copy inherited permissions

**--recurse**
> Apply operations recursively to directories

**--numeric**
> Display ACLs in numeric format

**--sddl**
> Use SDDL format for input/output

**--save** _file_
> Save DACLs to file for later restoration

**--restore** _file_
> Restore DACLs from saved file

**-U, --user** _username_
> SMB username (format: user%password or domain\\user%password)

**-W, --workgroup** _domain_
> Set SMB workgroup/domain

**-d, --debuglevel** _level_
> Debug verbosity (0-10)

# DESCRIPTION

**smbcacls** manipulates Windows NT Access Control Lists (ACLs) on SMB/CIFS file shares. It allows viewing, modifying, and managing file permissions on remote Windows or Samba shares from the Linux command line.

An ACL consists of Access Control Entries (ACEs) that define permissions for specific users or groups. The tool supports standard Windows permission operations including ownership changes and inheritance management.

# CAVEATS

Requires appropriate permissions on the share to modify ACLs. ACL format follows Windows SDDL (Security Descriptor Definition Language) conventions. Some operations require administrative privileges on the target share. Kerberos authentication may be needed for domain environments.

# HISTORY

**smbcacls** is part of the **Samba** suite, originally developed by **Andrew Tridgell** starting in **1992**. Samba provides Windows interoperability for Unix/Linux systems. The smbcacls utility enables Unix administrators to manage Windows-style permissions without requiring a Windows workstation.

# SEE ALSO

[smbclient](/man/smbclient)(1), [mount.cifs](/man/mount.cifs)(8), [getfacl](/man/getfacl)(1), [setfacl](/man/setfacl)(1)
