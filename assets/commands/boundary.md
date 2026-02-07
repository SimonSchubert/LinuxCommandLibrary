# TAGLINE

Secure identity-based remote access to infrastructure.

# TLDR

**Authenticate to Boundary**

```boundary authenticate```

**Connect to a target**

```boundary connect -target-id [ttcp_1234567890]```

**Connect using SSH helper**

```boundary connect ssh -target-id [ttcp_1234567890]```

**List available targets**

```boundary targets list -recursive```

**List active sessions**

```boundary sessions list -recursive```

**Read target details**

```boundary targets read -id [ttcp_1234567890]```

**Cancel a session**

```boundary sessions cancel -id [s_1234567890]```

**Start a local proxy**

```boundary connect -target-id [ttcp_1234567890] -listen-port [2222]```

# SYNOPSIS

**boundary** _command_ [_options_]

# COMMANDS

**authenticate**
> Authenticate to a Boundary controller.

**connect** [_helper_]
> Establish connection to a target. Helpers: ssh, postgres, rdp, http, kube.

**targets** list|read
> List or inspect targets.

**sessions** list|read|cancel
> Manage active sessions.

**hosts** list|read
> View hosts in host catalogs.

**host-catalogs** list|read
> View host catalogs.

**scopes** list|read
> View organizational scopes.

**accounts** list|read|create|update|delete
> Manage accounts.

**auth-methods** list|read
> View authentication methods.

**roles** list|read
> View roles and permissions.

**groups** list|read
> View groups.

**users** list|read
> View users.

**logout**
> Clear stored credentials.

**version**
> Show version information.

# PARAMETERS

**-target-id** _id_
> Target ID to connect to.

**-target-name** _name_
> Target name (requires scope).

**-target-scope-id** _id_
> Scope containing target.

**-target-scope-name** _name_
> Scope name containing target.

**-listen-port** _port_
> Local port for proxy connection.

**-addr** _address_
> Boundary controller address.

**-token** _token_
> Authentication token.

**-token-name** _name_
> Token name for storage.

**-scope-id** _id_
> Scope ID for operations.

**-recursive**
> List resources recursively across scopes.

**-format** _format_
> Output format: table, json.

**-keyring-type** _type_
> Keyring type for credential storage.

# DESCRIPTION

**boundary** is the CLI for HashiCorp Boundary, a tool for secure remote access to infrastructure. It provides identity-based access to hosts and services without exposing networks or managing credentials directly.

The **connect** command establishes sessions to targets. Protocol-specific helpers (ssh, postgres, rdp, http, kube) automatically configure client tools with proper credentials. For SSH, it spawns an ssh process with injected credentials; for databases, it provides connection strings.

Authentication methods include password, OIDC, and LDAP. Credentials are stored in the system keyring or specified location. Use **authenticate** to log in and **logout** to clear credentials.

Boundary uses a hierarchical scope model with global, organization, and project scopes. Use **-recursive** to list resources across all accessible scopes.

Sessions maintain the connection state between client and target. Active sessions can be listed and canceled. Session recordings enable audit and compliance when configured.

# CAVEATS

Requires access to a Boundary controller. Targets must be configured by administrators with proper permissions. Connect helpers require their respective client tools installed (ssh, psql, etc.). Some features require Boundary Enterprise or HCP Boundary.

# HISTORY

Boundary was announced by **HashiCorp** in **October 2020** as part of their security product line alongside Vault. It addresses modern identity-based access patterns, replacing traditional VPNs and bastion hosts. Version 0.1 was released in **October 2020**. The project reached 1.0 GA status in **2022**. Boundary integrates with Vault for credential brokering and injection, providing just-in-time access to infrastructure.

# SEE ALSO

[vault](/man/vault)(1), [ssh](/man/ssh)(1), [tsh](/man/tsh)(1), [kubectl](/man/kubectl)(1)
