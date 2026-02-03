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

**ssh-keyscan** gathers SSH public host keys. Collects keys for adding to known_hosts. Useful for automating SSH host key distribution and verification.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1)

