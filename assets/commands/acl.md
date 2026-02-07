# TAGLINE

fine-grained file permission management

# TLDR

**View the ACL** of a file

```getfacl [path/to/file]```

**Set read and write permissions** for a specific user

```setfacl -m u:[username]:rw [path/to/file]```

**Set permissions for a group**

```setfacl -m g:[groupname]:rx [path/to/directory]```

**Remove ACL entry** for a user

```setfacl -x u:[username] [path/to/file]```

**Remove all ACL entries** from a file

```setfacl -b [path/to/file]```

**Set default ACL** for new files in a directory

```setfacl -d -m u:[username]:rwx [path/to/directory]```

**Apply ACL recursively** to a directory

```setfacl -R -m u:[username]:rx [path/to/directory]```

**Copy ACL from one file to another**

```getfacl [source_file] | setfacl --set-file=- [target_file]```

# SYNOPSIS

**getfacl** [_options_] _file_...

**setfacl** [_options_] _acl_spec_ _file_...

# PARAMETERS

**-m** _acl_spec_
> Modify the ACL by adding or updating entries.

**-x** _acl_spec_
> Remove specified ACL entries.

**-b**
> Remove all extended ACL entries.

**-d**
> Apply operations to the default ACL (for directories).

**-R**
> Apply recursively to directories and their contents.

**-k**
> Remove the default ACL.

**--set** _acl_spec_
> Replace the entire ACL with the specified entries.

**--set-file** _file_
> Read ACL entries from a file (use **-** for stdin).

**-n**
> Do not recalculate the effective rights mask.

# DESCRIPTION

**Access Control Lists (ACLs)** extend the traditional Unix permission model, allowing fine-grained permissions for multiple users and groups on a single file or directory. While standard permissions support only owner, group, and others, ACLs can specify distinct access rights for any number of named users and groups.

The **getfacl** command displays ACL entries, while **setfacl** modifies them. ACL entries follow the format **type:name:permissions** where type is **u** (user), **g** (group), **o** (other), or **m** (mask), name identifies the user or group, and permissions are combinations of **r** (read), **w** (write), and **x** (execute).

Default ACLs on directories determine the initial ACL for new files created within. The ACL mask entry limits the effective permissions granted to named users and groups.

# CAVEATS

Not all filesystems support ACLs; ext4, XFS, and Btrfs do when mounted with ACL support. Some backup and archive tools may not preserve ACLs. Files with ACLs show a **+** after the permission bits in **ls -l** output. NFSv4 uses a different ACL model than POSIX ACLs.

# HISTORY

POSIX ACLs were developed in the **1990s** as part of the POSIX 1003.1e draft standard, which was ultimately withdrawn but widely implemented. Linux ACL support was added to the kernel in version **2.6** (2003). The specification aimed to provide a portable ACL interface across Unix systems, though implementation details vary between operating systems.

# SEE ALSO

[chmod](/man/chmod)(1), [chown](/man/chown)(1), [getfacl](/man/getfacl)(1), [setfacl](/man/setfacl)(1), [ls](/man/ls)(1)
