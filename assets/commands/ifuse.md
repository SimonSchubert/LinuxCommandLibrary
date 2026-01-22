# TLDR

**Mount iOS device**

```ifuse [/mnt/iphone]```

**Mount app documents**

```ifuse --documents [com.app.id] [/mnt/app]```

**Mount specific device**

```ifuse -u [udid] [/mnt/device]```

**Unmount**

```fusermount -u [/mnt/iphone]```

# SYNOPSIS

**ifuse** [_options_] _mountpoint_

# PARAMETERS

_MOUNTPOINT_
> Directory to mount on.

**-u** _UDID_
> Target device.

**--documents** _APPID_
> Mount app documents.

**--container** _APPID_
> Mount app container.

**-o** _OPTIONS_
> FUSE options.

**--help**
> Display help information.

# DESCRIPTION

**ifuse** mounts iOS device filesystems via FUSE. It provides access to device storage, app documents, and containers.

The tool requires device pairing and uses AFC protocol. It enables file transfer without iTunes or third-party apps.

ifuse mounts iOS devices via FUSE.

# CAVEATS

Part of libimobiledevice. Device must be paired. Limited to accessible areas.

# HISTORY

ifuse is part of **libimobiledevice** for iOS filesystem access on Linux.

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [idevicepair](/man/idevicepair)(1), [fusermount](/man/fusermount)(1)
