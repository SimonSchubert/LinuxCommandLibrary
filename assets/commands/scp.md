# TLDR

**Copy a local file to a remote host**

```scp [path/to/file] [user]@[host]:[path/to/destination]```

**Copy a file from a remote host** to local

```scp [user]@[host]:[path/to/file] [path/to/destination]```

**Copy a directory recursively**

```scp -r [path/to/directory] [user]@[host]:[path/to/destination]```

**Use a specific SSH port**

```scp -P [2222] [path/to/file] [user]@[host]:[path/to/destination]```

**Use a specific identity file** (SSH key)

```scp -i [~/.ssh/id_rsa] [path/to/file] [user]@[host]:[path/to/destination]```

**Copy with compression enabled**

```scp -C [path/to/file] [user]@[host]:[path/to/destination]```

**Preserve file attributes**

```scp -p [path/to/file] [user]@[host]:[path/to/destination]```

**Copy between two remote hosts** via local

```scp -3 [user1]@[host1]:[file] [user2]@[host2]:[destination]```

# SYNOPSIS

**scp** [_options_] _source_ _destination_

**scp** [_options_] [[_user_@]_host_:]_file_ [[_user_@]_host_:]_file_

# PARAMETERS

**-r**
> Recursively copy directories

**-P** _PORT_
> Connect to specified port on remote host

**-p**
> Preserve modification times, access times, and modes

**-C**
> Enable compression

**-c** _CIPHER_
> Select encryption cipher

**-i** _FILE_
> Identity file (private key) for authentication

**-l** _KBITS_
> Limit bandwidth in Kbit/s

**-o** _OPTION_
> Pass options to ssh (ssh_config format)

**-F** _FILE_
> Use specified ssh config file

**-q**
> Quiet mode; suppress progress meter and warnings

**-v**
> Verbose mode; show debugging messages

**-B**
> Batch mode; disable password prompts

**-3**
> Copy between remote hosts through local host

**-4**
> Force IPv4 only

**-6**
> Force IPv6 only

**-S** _PROGRAM_
> Use specified program for encrypted connection

# DESCRIPTION

**scp** (secure copy) transfers files between hosts over SSH. It uses SSH for authentication and encryption, providing the same security as an SSH session. The colon (**:**) distinguishes remote paths from local paths.

Files can be copied from local to remote, remote to local, or between two remote hosts. When copying directories, use **-r** for recursive transfer. The remote path syntax is **[user@]host:path**, where user defaults to the current username.

Authentication uses SSH keys or passwords, configured through ssh_config or command-line options. Transfer progress is shown unless **-q** is specified. The command exits 0 on success or >0 on error.

# CAVEATS

scp uses an older protocol (SCP/RCP) that has security limitations. The OpenSSH project recommends **sftp** or **rsync** over SSH for new scripts. Wildcards in remote paths must be quoted to prevent local shell expansion. When copying between two remote hosts without **-3**, the hosts connect directly, which may fail if they cannot reach each other.

# HISTORY

scp originated as part of the **SSH** protocol suite developed by **Tatu Ylönen** in **1995** at Helsinki University of Technology. It was designed as a secure replacement for the insecure **rcp** (remote copy) command. The OpenSSH project, started in **1999**, provides the most widely used implementation. While still functional, scp's underlying protocol has known issues, leading to recommendations to use sftp for new deployments.

# SEE ALSO

[sftp](/man/sftp)(1), [rsync](/man/rsync)(1), [ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1)
