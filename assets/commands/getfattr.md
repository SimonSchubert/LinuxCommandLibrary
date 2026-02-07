# TAGLINE

extended attribute retrieval tool

# TLDR

Retrieve **all extended attributes** of a file in detailed format

```getfattr -d [path/to/file]```

Get a **specific attribute** of a file

```getfattr -n user.[attribute_name] [path/to/file]```

# SYNOPSIS

**getfattr** [_options_] _file_...

# PARAMETERS

**-d**, **--dump**
> Dump all extended attribute names and values

**-n**, **--name** _NAME_
> Get the value of a specific attribute

**-m**, **--match** _PATTERN_
> Only show attributes matching regex pattern

**-e**, **--encoding** _ENC_
> Encode values as text, hex, or base64

**-R**, **--recursive**
> List attributes recursively

**-L**, **--logical**
> Follow symbolic links (default)

**-P**, **--physical**
> Do not follow symbolic links

**--only-values**
> Print only attribute values, not names

# DESCRIPTION

**getfattr** retrieves extended attributes (xattrs) from files and directories. Extended attributes are name:value pairs associated with files, stored separately from the normal file data.

Common namespaces include **user.** for user-defined attributes, **security.** for security labels (like SELinux), **system.** for system attributes (like ACLs), and **trusted.** for trusted attributes (root only).

Extended attributes are useful for storing metadata like checksums, tags, origins, or application-specific data without modifying the file contents.

# CAVEATS

Extended attribute support depends on the filesystem (ext4, XFS, Btrfs support them; FAT does not). The user namespace is the only one writable by non-root users. Attributes may not be preserved when copying files without special options.

# HISTORY

Extended attributes became widely available in Linux with kernel 2.6 in the early 2000s. The getfattr and setfattr commands are part of the attr package, providing command-line access to the xattr system calls.

# SEE ALSO

[setfattr](/man/setfattr)(1), [attr](/man/attr)(1), [getfacl](/man/getfacl)(1), [xattr](/man/xattr)(7)
