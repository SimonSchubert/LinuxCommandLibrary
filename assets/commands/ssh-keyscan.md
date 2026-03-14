# TAGLINE

Gather SSH public host keys from servers

# TLDR

**Scan host for keys**

```ssh-keyscan [hostname]```

**Scan specific port**

```ssh-keyscan -p [port] [hostname]```

**Scan for specific key type**

```ssh-keyscan -t ed25519 [hostname]```

**Scan multiple hosts from file**

```ssh-keyscan -f [hosts_file]```

**Append to known_hosts with hashed hostnames**

```ssh-keyscan -H [hostname] >> ~/.ssh/known_hosts```

**Print keys as SSHFP DNS records**

```ssh-keyscan -D [hostname]```

# SYNOPSIS

**ssh-keyscan** [_options_] [_host_...]

# PARAMETERS

**-4**
> Force IPv4 addresses only.

**-6**
> Force IPv6 addresses only.

**-c**
> Request certificates from target hosts instead of plain keys.

**-D**
> Print keys found as SSHFP DNS records.

**-f** _file_
> Read hosts from file (use `-` for stdin).

**-H**
> Hash hostnames and addresses in output.

**-p** _port_
> Connect to specified port on the remote host.

**-q**
> Quiet mode; suppress comments in output.

**-t** _type_
> Key type to fetch: rsa, ed25519, ecdsa, ecdsa-sk, or ed25519-sk. Multiple types can be separated by commas.

**-T** _timeout_
> Connection timeout in seconds (default 5).

**-v**
> Verbose mode; print debugging messages.

# DESCRIPTION

**ssh-keyscan** is a utility for gathering SSH public host keys from remote servers. It connects to each specified host and retrieves the server's public keys, outputting them in a format suitable for appending to **~/.ssh/known_hosts** or **/etc/ssh/ssh_known_hosts** files.

The tool is primarily used for automating host key distribution in environments where manually accepting host keys during first connection is impractical. It can scan multiple hosts in parallel, read host lists from files, and filter by key type (RSA, Ed25519, ECDSA). The **-H** option hashes hostnames in the output for additional privacy.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1)

