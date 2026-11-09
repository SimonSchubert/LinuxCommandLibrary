# TAGLINE

Upload files to Vagrant guest machines

# TLDR

**Upload file to VM**

```vagrant upload [source] [destination]```

**Upload to specific VM**

```vagrant upload [source] [destination] [name|id]```

**Upload with compression**

```vagrant upload --compress [source] [destination]```

**Upload a directory compressed as zip**

```vagrant upload --compression-type zip [path/to/directory] [destination]```

**Upload to a temporary location on the guest**

```vagrant upload --temporary [source]```

# SYNOPSIS

**vagrant** **upload** [_options_] _source_ [_destination_] [_name_|_id_]

# PARAMETERS

**-c**, **--compress**
> Compress the file or directory before uploading.

**-C**, **--compression-type** _type_
> Compression type: **tgz** (default for non-Windows guests) or **zip** (default for Windows guests). Implies **--compress**.

**-t**, **--temporary**
> Create a temporary location on the guest and upload there, ignoring _destination_.

# DESCRIPTION

**vagrant upload** copies files and directories from host to guest machine. Supports compression for large files. If _destination_ is omitted, the base name of _source_ is used as the destination path on the guest.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-ssh](/man/vagrant-ssh)(1), [scp](/man/scp)(1)

# RESOURCES

```[Source code](https://github.com/hashicorp/vagrant)```

```[Documentation](https://developer.hashicorp.com/vagrant/docs/cli/upload)```

<!-- verified: 2026-11-09 -->
