# TLDR

**Upload file to VM**

```vagrant upload [source] [destination]```

**Upload to specific VM**

```vagrant upload [source] [destination] [name]```

**Upload with compression**

```vagrant upload --compress [source] [destination]```

# SYNOPSIS

**vagrant** **upload** [_options_] _source_ [_destination_] [_name_]

# PARAMETERS

**--compress**
> Compress before upload.

**--temporary**
> Upload to temp directory.

# DESCRIPTION

**vagrant upload** copies files from host to guest machine. Supports compression for large files. Destination defaults to home directory if not specified.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-ssh](/man/vagrant-ssh)(1), [scp](/man/scp)(1)

