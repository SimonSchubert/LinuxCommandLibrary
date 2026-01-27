# TLDR

**Copy the default public key** to a remote host

```ssh-copy-id [user@host]```

**Copy a specific public key**

```ssh-copy-id -i [~/.ssh/id_ed25519.pub] [user@host]```

**Copy to a host on a non-standard port**

```ssh-copy-id -p [2222] [user@host]```

**Dry run** to see which keys would be installed

```ssh-copy-id -n [user@host]```

**Force copy** without checking for existing keys

```ssh-copy-id -f -i [~/.ssh/id_rsa.pub] [user@host]```

# SYNOPSIS

**ssh-copy-id** [_-f_] [_-n_] [_-s_] [_-i identity_file_] [_-p port_] [_-o ssh_option_] [_user@_]_hostname_

# PARAMETERS

**-i** _identity_file_
> Use the specified identity file (public key)

**-p** _port_
> Connect to the specified port on the remote host

**-f**
> Force mode; don't check if keys already exist on remote

**-n**
> Dry run; print keys that would be installed without installing

**-s**
> Use sftp instead of cat for copying (useful for restricted shells)

**-o** _ssh_option_
> Pass options to the underlying ssh command

# DESCRIPTION

**ssh-copy-id** installs SSH public keys on a remote server's authorized_keys file, enabling passwordless authentication. It connects via SSH (usually with password authentication), creates the ~/.ssh directory and authorized_keys file if needed, and appends your public key.

The script ensures correct permissions are set: ~/.ssh directory at 700 and authorized_keys at 600, which SSH requires for security. Incorrect permissions cause authentication failures.

By default, ssh-copy-id uses keys from ssh-add -L or the most recent ~/.ssh/id*.pub file. Use **-i** to specify a different key.

# CAVEATS

Password authentication must be enabled on the remote host for the initial copy. After installation, you may want to disable password authentication in sshd_config. The script is a shell wrapper around ssh, so all ssh options apply.

# HISTORY

ssh-copy-id is a convenience script included with **OpenSSH** to simplify the public key installation process. It automates what would otherwise require manually copying keys and setting permissions correctly.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1), [ssh-add](/man/ssh-add)(1), [sshd_config](/man/sshd_config)(5)
