# TLDR

**Connect to a remote server**

```sftp [user]@[hostname]```

**Connect using a specific port**

```sftp -P [port] [user]@[hostname]```

**Upload a file**

```sftp> put [local_file] [remote_path]```

**Download a file**

```sftp> get [remote_file] [local_path]```

**Upload a directory recursively**

```sftp> put -r [local_directory]```

**Download a directory recursively**

```sftp> get -r [remote_directory]```

**List remote directory**

```sftp> ls```

**Change remote directory**

```sftp> cd [remote_path]```

# SYNOPSIS

**sftp** [**-P** _port_] [**-i** _identity_file_] [_user_**@**]_host_[**:**_path_]

# PARAMETERS

**-P** _port_
> Connect to specified port (note: uppercase P, unlike ssh)

**-i** _identity_file_
> Use specified private key file

**-b** _batchfile_
> Batch mode; read commands from file

**-C**
> Enable compression

**-r**
> Recursively copy directories (with get/put)

**-v**
> Verbose mode

**-o** _option_
> Pass option to SSH (e.g., -o "ProxyJump=jump-host")

# INTERACTIVE COMMANDS

**ls** [_path_]: List remote directory
**lls** [_path_]: List local directory
**cd** _path_: Change remote directory
**lcd** _path_: Change local directory
**pwd**: Print remote working directory
**lpwd**: Print local working directory
**get** [**-r**] _remote_ [_local_]: Download file/directory
**put** [**-r**] _local_ [_remote_]: Upload file/directory
**mkdir** _path_: Create remote directory
**rmdir** _path_: Remove remote directory
**rm** _file_: Delete remote file
**rename** _old_ _new_: Rename remote file
**chmod** _mode_ _file_: Change remote file permissions
**chown** _uid_ _file_: Change remote file owner
**!** _command_: Execute local shell command
**exit** or **quit**: Close connection

# DESCRIPTION

**sftp** is the SSH File Transfer Protocol client, providing secure interactive file transfer over SSH connections. It offers a familiar FTP-like interface while using SSH for authentication and encryption.

Unlike FTP, SFTP encrypts all data including credentials and file contents. It uses a single connection (no separate data channel) making it firewall-friendly.

The interface supports both interactive use and batch mode (**-b**) for scripting. Tab completion works for both local and remote paths in most implementations.

SFTP can transfer binary and text files without mode switches and preserves file attributes like permissions and timestamps.

# CAVEATS

Port is specified with uppercase **-P**, not lowercase **-p** like SSH. This is a common source of confusion.

SFTP is different from FTPS (FTP over SSL/TLS). SFTP uses SSH; FTPS uses the FTP protocol with TLS encryption.

For automated transfers, use batch mode (**-b**) or consider **rsync** over SSH for more sophisticated synchronization.

Symbolic links are followed by default. Use **get -P** or **put -P** to preserve symlinks as symlinks.

# SEE ALSO

[scp](/man/scp)(1), [ssh](/man/ssh)(1), [rsync](/man/rsync)(1), [ftp](/man/ftp)(1)
