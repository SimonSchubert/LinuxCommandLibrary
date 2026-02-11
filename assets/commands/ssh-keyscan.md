# TLDR

**Scan host for keys**

```ssh-keyscan [hostname]```

**Scan specific port**

```ssh-keyscan -p [port] [hostname]```

**Scan for specific key type**

```ssh-keyscan -t ed25519 [hostname]```

**Scan multiple hosts from file**

```ssh-keyscan -f [hosts_file]```

**Append to known_hosts**

```ssh-keyscan [hostname] >> ~/.ssh/known_hosts```

# SYNOPSIS

**ssh-keyscan** [_options_] [_host_...]

# PARAMETERS

**-t** _type_
> Key type (rsa, ed25519, ecdsa).

**-p** _port_
> SSH port.

**-f** _file_
> Read hosts from file.

**-H**
> Hash hostnames in output.

**-T** _timeout_
> Connection timeout.

# DESCRIPTION

**ssh-keyscan** is a utility for gathering SSH public host keys from remote servers. It connects to each specified host and retrieves the server's public keys, outputting them in a format suitable for appending to **~/.ssh/known_hosts** or **/etc/ssh/ssh_known_hosts** files.

The tool is primarily used for automating host key distribution in environments where manually accepting host keys during first connection is impractical. It can scan multiple hosts in parallel, read host lists from files, and filter by key type (RSA, Ed25519, ECDSA). The **-H** option hashes hostnames in the output for additional privacy.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1)

