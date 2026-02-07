# TAGLINE

Manipulate extended attributes on filesystem objects

# TLDR

**Set an extended attribute on a file**

```attr -s [attribute_name] -V [value] [path/to/file]```

**Get the value of an extended attribute**

```attr -g [attribute_name] [path/to/file]```

**Remove an extended attribute**

```attr -r [attribute_name] [path/to/file]```

**List all extended attributes on a file**

```attr -l [path/to/file]```

**Set attribute in the user namespace**

```setfattr -n user.[attribute_name] -v [value] [path/to/file]```

**Get all attributes with getfattr**

```getfattr -d [path/to/file]```

# SYNOPSIS

**attr** [**-LRSq**] **-s** _attrname_ [**-V** _attrvalue_] _pathname_

**attr** [**-LRSq**] **-g** _attrname_ _pathname_

**attr** [**-LRSq**] **-r** _attrname_ _pathname_

**attr** [**-LRSq**] **-l** _pathname_

# PARAMETERS

**-s** _attrname_
> Set the named attribute.

**-g** _attrname_
> Get and display the value of the named attribute.

**-r** _attrname_
> Remove the named attribute.

**-l**
> List all extended attributes on the file.

**-V** _attrvalue_
> Specify the value when setting an attribute.

**-L**
> Follow symbolic links.

**-R**
> Operate on attributes in the root namespace (requires privileges).

**-S**
> Operate on attributes in the security namespace.

**-q**
> Quiet mode; suppress most error messages.

# DESCRIPTION

**attr** manipulates extended attributes on filesystem objects. Extended attributes are name-value pairs permanently associated with files and directories, providing metadata storage beyond traditional Unix permissions.

Attributes exist in namespaces: **user** for arbitrary user data, **system** for OS features like ACLs, **security** for SELinux labels, and **trusted** for privileged applications. The attr command primarily works with the user namespace.

Extended attributes persist across copy and backup operations when tools support them. Common uses include storing file metadata, checksums, capabilities, and application-specific data without modifying file content.

The related commands **getfattr** and **setfattr** provide more detailed control and are preferred for scripting.

# CAVEATS

Not all filesystems support extended attributes; ext4, XFS, and Btrfs do when mounted with user_xattr. Attribute size limits vary by filesystem (typically 64KB). Many backup and file transfer tools do not preserve extended attributes by default. The user namespace is limited to processes with read/write access to the file.

# HISTORY

Extended attributes were added to Linux in kernel **2.6** (2003), inspired by similar features in IRIX and other Unix systems. The implementation followed the POSIX 1003.1e draft standard for extended security attributes. The **attr** package providing these utilities has been the standard interface for managing extended attributes since their introduction.

# SEE ALSO

[getfattr](/man/getfattr)(1), [setfattr](/man/setfattr)(1), [getfacl](/man/getfacl)(1), [setfacl](/man/setfacl)(1)
