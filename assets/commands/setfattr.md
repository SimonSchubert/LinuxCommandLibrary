# TLDR

Set a **user-defined attribute** on a file

```setfattr -n user.[attribute_name] -v "[value]" [path/to/file]```

Set an **attribute name** without a value

```setfattr -n user.[attribute_name] [path/to/file]```

**Remove** a specific attribute from a file

```setfattr -x user.[attribute_name] [path/to/file]```

**Restore** attributes from a dump file

```setfattr --restore=[dumpfile]```

Modify attributes on a **symbolic link** itself (not target)

```setfattr -h -n user.[attribute_name] -v "[value]" [path/to/symlink]```

# SYNOPSIS

**setfattr** [**-h**] **-n** _name_ [**-v** _value_] _pathname_...

**setfattr** [**-h**] **-x** _name_ _pathname_...

**setfattr** [**-h**] **--restore**=_file_

# PARAMETERS

**-n, --name** _name_
> Specifies the name of the extended attribute to set

**-v, --value** _value_
> Specifies the new value of the extended attribute. Value can be a string, hex (0x prefix), or base64 (0s prefix)

**-x, --remove** _name_
> Remove the named extended attribute entirely

**-h, --no-dereference**
> Do not follow symbolic links; operate on the link itself

**--restore** _file_
> Restore extended attributes from a file created by getfattr --dump

**--raw**
> Do not decode the attribute value

**--version**
> Print version and exit

**--help**
> Print help message

# DESCRIPTION

**setfattr** sets or modifies extended attributes on files and directories. Extended attributes are name-value pairs permanently associated with files, similar to environment variables but stored in the filesystem. Attribute names must be in the format **namespace.name** where namespace is typically **user**, **system**, **security**, or **trusted**.

The **user** namespace is available to regular users for arbitrary data storage. System namespaces require appropriate capabilities or root privileges. Values can be specified as quoted strings with escape sequences, hexadecimal with **0x** prefix, or base64 with **0s** prefix.

# CAVEATS

Not all filesystems support extended attributes; common supported filesystems include ext2/3/4, XFS, Btrfs, and JFS. The **user** namespace may be disabled on some mount configurations. Attribute names have a maximum length of 255 bytes. Total attribute storage per file is filesystem-dependent (often 4KB-64KB).

# HISTORY

Extended attributes support was added to Linux kernel **2.4** and became fully integrated in **2.6**. The **setfattr** command is part of the **attr** package, developed as part of the XFS project at SGI and later adopted for general Linux filesystem use.

# SEE ALSO

[getfattr](/man/getfattr)(1), [attr](/man/attr)(1), [setfacl](/man/setfacl)(1), [getfacl](/man/getfacl)(1)
