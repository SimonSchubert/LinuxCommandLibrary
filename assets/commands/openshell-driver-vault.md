# TAGLINE

Vault credential driver for OpenShell

# TLDR

Store provider credentials in **Vault** with a token file

```openshell-driver-vault --bind-socket [/tmp/openshell-vault/credential-driver.sock] --address [https://vault.example:8200] --auth-method [token_file] --token-path [/etc/openshell/vault-token]```

Log in with the pod **service account** (the default auth method)

```openshell-driver-vault --bind-socket [/tmp/openshell-vault/credential-driver.sock] --address [https://vault.example:8200] --role [openshell]```

Use **KV version 1** on a loopback Vault

```openshell-driver-vault --bind-socket [/tmp/openshell-vault/credential-driver.sock] --address [http://127.0.0.1:8200] --auth-method [token_file] --token-path [/etc/openshell/vault-token] --kv-version [1] --mount [secret]```

# SYNOPSIS

**openshell-driver-vault** **--bind-socket** _PATH_ **--address** _URL_ [_options_]

# DESCRIPTION

**openshell-driver-vault** is the Vault credential driver for NVIDIA OpenShell. It serves the CredentialDriver gRPC API on a Unix socket. **openshell-gateway** uses that API to store and resolve provider credentials. The process removes the socket when it exits.

**--bind-socket** is required. The parent directory is created if needed. An existing socket is removed and replaced. Any other file at that path is an error. The new socket is mode **0600**. The listener does not check the peer pid; access is the file mode.

**--address** is required. It must be an absolute **http** or **https** URL with a host, no userinfo, and no query or fragment. **http** is accepted only for a loopback host (an IP or the name **localhost**). A CA bundle requires **https**. Requests go directly to that host: HTTP proxies are disabled, and redirects are refused.

The default auth method is **kubernetes**. That method requires **--role**. The Kubernetes auth mount defaults to **kubernetes**, and the service-account token path defaults to the standard in-cluster token file. **token_file** requires **--token-path** and rejects the Kubernetes auth flags.

The KV mount defaults to **secret**. The KV version defaults to **2** (version **1** is the other accepted value). The HTTP timeout defaults to **10** seconds. Listing credentials is not implemented.

The gateway table that carries the same fields is **[openshell.credential_drivers.vault]**. Unknown keys are rejected. This binary does not read that file itself; the flags are the standalone configuration.

# PARAMETERS

**--bind-socket** _PATH_

> Required. Unix socket for the CredentialDriver service.

**--address** _URL_

> Required. Vault API address.

**--ca-bundle** _PATH_

> PEM CA bundle. Requires an **https** address. An empty bundle is an error.

**--mount** _PATH_

> KV mount path. Default **secret**.

**--kv-version** _1|2_

> KV engine version. Default **2**.

**--auth-method** _METHOD_

> **kubernetes** (the default) or **token_file**.

**--role** _NAME_

> Vault role. Required for **kubernetes**. Rejected for **token_file**.

**--kubernetes-auth-mount** _PATH_

> Auth mount for the Kubernetes login. Default **kubernetes**. Only valid with **kubernetes**.

**--service-account-token-path** _PATH_

> JWT presented to the Kubernetes auth method. Default is the in-cluster service-account token file. Only valid with **kubernetes**.

**--token-path** _PATH_

> File containing a Vault token. Required for **token_file**. Rejected for **kubernetes**.

**--timeout-secs** _SECONDS_

> HTTP client timeout. Default **10**. Must be a positive integer.

**--log-level** _LEVEL_

> Log level. Default **info**. Used when the process environment does not already set a tracing filter.

# CONFIGURATION

A gateway table with the same fields:

```
[openshell.credential_drivers.vault]
address = "https://vault.example:8200"
auth_method = "token_file"
token_path = "/etc/openshell/vault-token"
mount = "secret"
kv_version = "2"
timeout_secs = 10
```

Flags also read environment variables:

```
--bind-socket                    OPENSHELL_CREDENTIAL_DRIVER_SOCKET
--address                        OPENSHELL_VAULT_ADDRESS
--ca-bundle                      OPENSHELL_VAULT_CA_BUNDLE
--mount                          OPENSHELL_VAULT_MOUNT
--kv-version                     OPENSHELL_VAULT_KV_VERSION
--auth-method                    OPENSHELL_VAULT_AUTH_METHOD
--role                           OPENSHELL_VAULT_ROLE
--kubernetes-auth-mount          OPENSHELL_VAULT_KUBERNETES_AUTH_MOUNT
--service-account-token-path     OPENSHELL_VAULT_SERVICE_ACCOUNT_TOKEN_PATH
--token-path                     OPENSHELL_VAULT_TOKEN_PATH
--timeout-secs                   OPENSHELL_VAULT_TIMEOUT_SECS
--log-level                      OPENSHELL_LOG_LEVEL
```

# CAVEATS

The default auth method is **kubernetes**, so a command line that sets only **--address** fails until **--role** is set or the auth method is switched to **token_file**.

Tokens and secret values are not written to logs by this process. The HTTP client never follows a redirect and never uses a proxy.

A KV version other than **1** or **2**, or an auth method other than the two names above, is a startup error.

The socket is unlinked after the server stops. A crash can leave a stale socket; the next start removes it only when it is still a socket.

# HISTORY

**openshell-driver-vault** ships in NVIDIA **OpenShell** (Apache License 2.0). OpenShell was first published in **March 2026**. The **0.1.x** line is the stable release cadence.

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-driver-kubernetes-secrets](/man/openshell-driver-kubernetes-secrets)(1), [vault](/man/vault)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

<!-- verified: 2026-10-28 -->
