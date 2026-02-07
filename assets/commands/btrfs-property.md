# TAGLINE

Get and set properties on btrfs filesystem objects

# TLDR

**List** available properties for a btrfs object

```sudo btrfs property list [path/to/btrfs_object]```

**Get** all properties for a btrfs object

```sudo btrfs property get [path/to/btrfs_object]```

Get the **label** property for a filesystem

```sudo btrfs property get [path/to/btrfs_filesystem] label```

Get properties for a **specific object type**

```sudo btrfs property get -t [subvol|filesystem|inode|device] [path/to/btrfs_filesystem]```

**Set compression** for a file or directory

```sudo btrfs property set [path/to/btrfs_inode] compression [zstd|zlib|lzo|none]```

# SYNOPSIS

**btrfs property** _subcommand_ [_options_] _path_ [_property_ [_value_]]

# DESCRIPTION

**btrfs property** manages properties on btrfs filesystem objects including files, directories, subvolumes, filesystems, and devices. Properties control behavior like compression, read-only status, and labels.

Different object types support different properties. The list command shows what properties are available for each object.

# SUBCOMMANDS

**list**
> List available properties and descriptions

**get**
> Get property values

**set**
> Set a property value

# PARAMETERS

**-t** _type_
> Object type: subvol, filesystem, inode, or device

# PROPERTIES

**compression**
> Compression algorithm for files: zstd, zlib, lzo, none

**label**
> Filesystem label (filesystem property)

**ro**
> Read-only status (subvolume property)

# CAVEATS

Setting compression on a directory only affects new files; existing files need explicit recompression. Not all properties are writable. Some operations require root privileges.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-subvolume](/man/btrfs-subvolume)(8), [chattr](/man/chattr)(1)
