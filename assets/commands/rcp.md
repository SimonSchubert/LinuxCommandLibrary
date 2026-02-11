# TAGLINE

Copy files between hosts over the network

# TLDR

Copy a **file** to a remote host

```rcp path/to/local_file username@remote_host:/path/to/destination/```

Copy a **directory** recursively

```rcp -r path/to/local_directory username@remote_host:/path/to/destination/```

**Preserve** file attributes

```rcp -p path/to/local_file username@remote_host:/path/to/destination/```

**Force** copy without confirmation

```rcp -f path/to/local_file username@remote_host:/path/to/destination/```

# SYNOPSIS

**rcp** [_options_] _source_ _destination_

# PARAMETERS

**-r**, **--recursive**
> Copy directories recursively

**-p**, **--preserve**
> Preserve file attributes (mode, ownership, timestamps)

**-f**, **--from**
> Force copy without confirmation

# DESCRIPTION

**rcp** copies files between local and remote systems. It mimics the behavior of the cp command but operates across different machines using the RSH protocol.

The source or destination can be specified as user@host:path for remote locations.

# CAVEATS

rcp transmits data unencrypted and is considered insecure. Use scp or rsync over SSH for secure file transfers instead.

# HISTORY

Part of **GNU inetutils**, providing classic Unix networking utilities. Largely replaced by secure alternatives like scp and rsync.

# SEE ALSO

[scp](/man/scp)(1), [rsync](/man/rsync)(1), [cp](/man/cp)(1), [rsh](/man/rsh)(1)
