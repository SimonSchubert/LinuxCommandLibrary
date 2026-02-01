# TLDR

**Log in to Teleport cluster**

```tsh login --proxy=[teleport.example.com] --user=[username]```

**List available SSH servers**

```tsh ls```

**SSH to a server**

```tsh ssh [user]@[hostname]```

**List Kubernetes clusters**

```tsh kube ls```

**Connect to Kubernetes cluster**

```tsh kube login [cluster-name]```

**List available databases**

```tsh db ls```

**Connect to a database**

```tsh db connect [database-name]```

**List active sessions**

```tsh sessions ls```

**Log out from cluster**

```tsh logout```

# SYNOPSIS

**tsh** [_global-options_] _command_ [_command-options_] [_args_...]

# COMMANDS

**login**
> Authenticate to Teleport cluster.

**logout**
> End session and remove credentials.

**status**
> Show current login status.

**ls**
> List available SSH servers.

**ssh** _[user@]host_
> Start SSH session to a server.

**scp** _src_ _dest_
> Secure copy files.

**join** _session-id_
> Join an active session.

**play** _session-id_
> Replay a recorded session.

**sessions ls**
> List active sessions.

**kube** ls|login|credentials
> Manage Kubernetes access.

**db** ls|login|connect|logout
> Manage database access.

**apps** ls|login|logout
> Manage application access.

**request** create|ls|show|review
> Manage access requests.

**config**
> Generate SSH config for native SSH client.

**version**
> Show version information.

# PARAMETERS

**--proxy** _address_
> Teleport proxy service address.

**--user** _username_
> Teleport username.

**--login** _os-user_
> Remote OS username for SSH.

**--ttl** _duration_
> Session credential TTL. Default: 12h.

**--identity** _file_
> Path to identity file.

**--auth** _connector_
> Authentication connector name.

**--insecure**
> Skip TLS certificate verification.

**--debug**
> Enable verbose debug logging.

**--jumphost**, **-J** _host_
> SSH jump host.

**--cert-format** _format_
> Certificate format: standard or kubernetes.

**--skip-version-check**
> Skip client/server version compatibility check.

# DESCRIPTION

**tsh** is the Teleport client CLI for accessing infrastructure protected by Teleport. It provides unified access to SSH servers, Kubernetes clusters, databases, and web applications with built-in audit logging and access controls.

Authentication via **login** stores credentials in **~/.tsh** with automatic expiration (default 12 hours). Certificates support short-lived access aligned with zero-trust principles.

For SSH access, use **ssh** command or generate native SSH config with **tsh config** for use with standard ssh clients. Session recording enables **play** for audit review.

Kubernetes access with **kube login** configures kubectl credentials. Database access via **db connect** provides authenticated connections to PostgreSQL, MySQL, MongoDB, and other databases.

Access requests enable just-in-time privilege escalation with approval workflows. Create requests with **request create** for resources requiring elevated permissions.

# CAVEATS

Requires Teleport cluster access configured by administrator. Some resources require role-based access or approval. Certificate TTL limits session duration. The --insecure flag should not be used in production.

# HISTORY

Teleport was created by **Gravitational** (now Teleport) in **2016** to provide secure access to infrastructure with audit logging and identity-based access controls. The project implements certificate-based authentication following BeyondCorp/zero-trust principles. Teleport open-sourced the core product and has since expanded to cover Kubernetes, databases, and applications.

# SEE ALSO

[ssh](/man/ssh)(1), [kubectl](/man/kubectl)(1), [tctl](/man/tctl)(1)
