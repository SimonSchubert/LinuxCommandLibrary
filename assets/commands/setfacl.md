# TAGLINE

Set file access control lists

# TLDR

Set **read/write** access for a user

```setfacl -m u:username:rw path/to/file```

Set **default ACL** for new files in a directory

```setfacl -d -m u::rw path/to/directory```

**Remove** ACL for a specific user

```setfacl -x u:username path/to/file```

Remove **all** extended ACL entries

```setfacl -b path/to/file```

Apply ACL **recursively** to a directory

```setfacl -R -m u:username:rx path/to/directory```

**Copy** ACL from one file to another

```getfacl file1 | setfacl --set-file=- file2```

Set **group** permissions via ACL

```setfacl -m g:groupname:r path/to/file```

# SYNOPSIS

**setfacl** [_-bkndRLPvh_] [{_-m_|_-x_} _acl_spec_] [{_-M_|_-X_} _acl_file_] _file_...

# DESCRIPTION

**setfacl** sets Access Control Lists (ACLs) of files and directories. ACLs provide fine-grained access control beyond the traditional Unix owner/group/other permission model, allowing specific permissions for individual users and groups.

# PARAMETERS

**-m, --modify**
> Modify the ACL with the specified entries.

**-x, --remove**
> Remove specified ACL entries.

**-M, --modify-file**
> Read ACL entries to modify from a file.

**-X, --remove-file**
> Read ACL entries to remove from a file.

**-b, --remove-all**
> Remove all extended ACL entries.

**-k, --remove-default**
> Remove the default ACL.

**-d, --default**
> Apply operations to the default ACL.

**-n, --no-mask**
> Do not recalculate the effective rights mask.

**--mask**
> Force recalculation of the effective rights mask.

**-R, --recursive**
> Apply operations recursively.

**-L, --logical**
> Follow symbolic links to directories (with -R).

**-P, --physical**
> Do not follow symbolic links (with -R).

**--restore=file**
> Restore permissions from a getfacl backup.

**--test**
> Test mode - list resulting ACLs without modifying.

# ACL ENTRY FORMAT

**u[ser]:uid:perms**: Named user or owner permissions
**g[roup]:gid:perms**: Named group or owning group permissions
**m[ask]:perms**: Effective rights mask
**o[ther]:perms**: Permissions for others

Permissions: r (read), w (write), x (execute), or numeric (4, 2, 1).

# CAVEATS

The effective rights mask limits permissions granted to named users/groups. Some filesystems (e.g., FAT, NFS without ACL support) do not support ACLs. Use **getfacl** to backup ACLs before modifying. Default ACLs only apply to newly created files within a directory.

# HISTORY

**setfacl** is part of the **acl** package implementing POSIX Access Control Lists (POSIX 1003.1e draft 17). ACLs extend the standard Unix permission model.

# SEE ALSO

[getfacl](/man/getfacl)(1), [chmod](/man/chmod)(1), [umask](/man/umask)(1), [acl](/man/acl)(5)
