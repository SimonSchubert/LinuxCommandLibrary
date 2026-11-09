# TAGLINE

TUI host picker and parallel SSH client

# TLDR

**Pick hosts** from a list and open a shell

```lssh```

Connect to a **specific host** without the picker

```lssh -H [server]```

**Run a command** on the selected hosts

```lssh [command]```

Run a command on the selected hosts **in parallel**

```lssh -p tail -f [/var/log/syslog]```

Open the selected hosts in the **multi-pane mux UI**

```lssh -P```

**Forward a local port**

```lssh -L [8080]:[localhost]:[80]```

**List hosts** from the configuration

```lssh -l```

**Generate an lssh config** from the OpenSSH config

```lssh --generate-lssh-conf > ~/.lssh.toml```

**Launch the SCP client**

```lscp```

**Launch the SFTP client**

```lsftp```

# SYNOPSIS

**lssh** [_options_] [_command_...]

# PARAMETERS

**-H** _NAME_, **--host** _NAME_
> Connect to the named server.

**-F** _FILE_, **--file** _FILE_
> Configuration file to use.

**--generate-lssh-conf** [_FILE_]
> Print an lssh config generated from an OpenSSH config (~/.ssh/config by default) to stdout.

**-l**, **--list**
> Print the server list from the configuration.

**-p**, **--parallel**
> Run the command in parallel on the selected hosts.

**-P**
> Run a shell or command in the mux UI.

**-t**, **--term**
> Run the specified command at a terminal.

**-L** [_bind_:]_port_:_remote_:_port_
> Local port forward. Works with a single connection only.

**-R** [_bind_:]_port_:_remote_:_port_
> Remote port forward. With only a port, acts as a reverse dynamic forward.

**-D** _PORT_
> Dynamic SOCKS5 port forward.

**-d** _PORT_
> HTTP dynamic port forward.

**-r** _PORT_
> HTTP reverse dynamic port forward.

**-M** _PORT_:_REMOTE_PATH_
> NFS dynamic forward. **-m** is the reverse form with a local path.

**-S** _PORT_:_REMOTE_PATH_
> SMB dynamic forward. **-s** is the reverse form with a local path.

**-N**, **--not-execute**
> Do not execute a remote command or shell.

**-X**, **--X11**
> Enable X11 forwarding. **-Y** enables trusted X11 forwarding.

**-f**
> Run in the background after connecting.

**--localrc**
> Use the local bashrc at the destination. **--not-localrc** disables it.

**-h**, **--help**
> Print help.

**-v**, **--version**
> Print the version.

# DESCRIPTION

**lssh** is a TUI client that lists hosts from your OpenSSH config, its own config file or provider inventories, lets you select one or more, and opens a shell or runs a command on them.

It is part of a suite of separate commands: **lscp** and **lsftp** for file transfer, **lssync** for tree sync, **lsshell** for a parallel interactive shell, **lsmux** for a pane-based workspace, **lsmon** for monitoring, **lsdiff** for comparing remote files, **lspipe** for reusable sessions and **lsshfs** for mounting remote directories.

Providers can pull hosts from cloud inventories such as AWS EC2, Azure, GCP and Proxmox, resolve secrets, and connect through backends such as AWS SSM, WinRM and Telnet. Provider binaries are separate from the main command.

# CONFIGURATION

Works with **~/.ssh/config** as is. An lssh config is searched in the order **~/.lssh.toml**, **~/.lssh.yaml**, **~/.lssh.yml**, **~/.lssh.conf**.

# CAVEATS

Port forwarding modes work with a single connection only. Provider-backed inventory is beta and connector backends beyond native SSH are experimental as of v0.10.0.

# HISTORY

**lssh** was created by **blacknon** and is written in **Go**. It runs on Linux, macOS, and Windows.

# SEE ALSO

[ssh](/man/ssh)(1), [scp](/man/scp)(1), [sftp](/man/sftp)(1), [lazyssh](/man/lazyssh)(1), [sshs](/man/sshs)(1), [pssh](/man/pssh)(1)

# RESOURCES

```[Source code](https://github.com/blacknon/lssh)```

```[Documentation](https://github.com/blacknon/lssh/blob/master/docs/README.md)```

<!-- verified: 2026-11-09 -->
