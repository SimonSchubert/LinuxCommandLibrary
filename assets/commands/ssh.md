# TLDR

**Connect to a remote server**

```ssh [user]@[hostname]```

**Connect on a specific port**

```ssh -p [port] [user]@[hostname]```

**Connect with a specific identity file** (private key)

```ssh -i [~/.ssh/id_rsa] [user]@[hostname]```

**Run a command on remote server**

```ssh [user]@[hostname] "[command]"```

**Create a local port forward** (tunnel)

```ssh -L [local_port]:[target_host]:[target_port] [user]@[hostname]```

**Create a remote port forward**

```ssh -R [remote_port]:localhost:[local_port] [user]@[hostname]```

**Create a SOCKS proxy**

```ssh -D [port] [user]@[hostname]```

**Enable X11 forwarding**

```ssh -X [user]@[hostname]```

**Copy SSH key to server** for passwordless login

```ssh-copy-id [user]@[hostname]```

# SYNOPSIS

**ssh** [**-p** _port_] [**-i** _identity_file_] [**-L** _forward_] [_user_**@**]_hostname_ [_command_]

# PARAMETERS

**-p** _port_
> Connect to specified port (default: 22)

**-i** _identity_file_
> Use specified private key file

**-l** _login_name_
> Specify username (alternative to user@host)

**-L** [_bind_:]_port_:_host_:_port_
> Local port forwarding

**-R** [_bind_:]_port_:_host_:_port_
> Remote port forwarding

**-D** [_bind_:]_port_
> Dynamic port forwarding (SOCKS proxy)

**-N**
> Do not execute remote command (for tunnels)

**-f**
> Go to background after authentication

**-X**
> Enable X11 forwarding

**-Y**
> Enable trusted X11 forwarding

**-A**
> Enable agent forwarding

**-C**
> Enable compression

**-v**
> Verbose mode (use -vvv for more detail)

**-o** _option_
> Set configuration option

**-J** _jump_host_
> Connect via jump host (ProxyJump)

**-t**
> Force pseudo-terminal allocation

# DESCRIPTION

**ssh** (Secure Shell) provides secure encrypted communication between hosts over an insecure network. It's the primary tool for remote server administration and secure file transfer.

Authentication can use passwords or public key cryptography. Key-based authentication is more secure and convenient; generate keys with **ssh-keygen** and copy public keys to servers with **ssh-copy-id**.

Port forwarding creates encrypted tunnels for other traffic. Local forwarding (**-L**) makes a remote service available locally. Remote forwarding (**-R**) exposes a local service on the remote host. Dynamic forwarding (**-D**) creates a SOCKS proxy.

Configuration in **~/.ssh/config** can define hosts with custom settings (port, user, identity file, proxy), making complex connections simple.

# CONFIGURATION

**~/.ssh/config**
> Per-user configuration file defining host aliases, default ports, usernames, identity files, proxy settings, and other connection options.

**~/.ssh/known_hosts**
> Database of previously verified host keys, used to detect server impersonation.

**/etc/ssh/ssh_config**
> System-wide SSH client configuration applied to all users.

# CAVEATS

First connection to a new host shows a fingerprint warning. Verify the fingerprint through a trusted channel before accepting.

Agent forwarding (**-A**) is convenient but risky on untrusted servers. Consider **ProxyJump** instead.

Keep private keys secure with permissions 600. Protect keys with passphrases and use ssh-agent to avoid repeated passphrase entry.

Firewall rules may block SSH. Port 22 is commonly filtered; consider running SSH on alternate ports for such networks.

# SEE ALSO

[scp](/man/scp)(1), [sftp](/man/sftp)(1), [ssh-keygen](/man/ssh-keygen)(1), [ssh-copy-id](/man/ssh-copy-id)(1), [ssh-agent](/man/ssh-agent)(1)
