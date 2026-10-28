# TAGLINE

Kubernetes Secrets credential driver for OpenShell

# TLDR

Listen on a **Unix socket** and store credentials in one namespace

```openshell-driver-kubernetes-secrets --bind-socket [/tmp/openshell-secrets/credential-driver.sock] --namespace [openshell]```

Use the **in-cluster** namespace (omit **--namespace** inside a pod)

```openshell-driver-kubernetes-secrets --bind-socket [/tmp/openshell-secrets/credential-driver.sock]```

Raise the log level

```openshell-driver-kubernetes-secrets --bind-socket [/tmp/openshell-secrets/credential-driver.sock] --namespace [openshell] --log-level [debug]```

# SYNOPSIS

**openshell-driver-kubernetes-secrets** **--bind-socket** _PATH_ [_options_]

# DESCRIPTION

**openshell-driver-kubernetes-secrets** is the Kubernetes Secrets credential driver for NVIDIA OpenShell. It serves the CredentialDriver gRPC API on a Unix socket. **openshell-gateway** uses that API to store and resolve provider credentials as Secret objects. The process removes the socket when it exits.

**--bind-socket** is required. The parent directory is created if needed. An existing socket is removed and replaced. Any other file at that path is an error. The new socket is mode **0600**. The listener does not check the peer pid; access is the file mode.

The Kubernetes client is the default client: in-cluster configuration when it is present, otherwise the local kubeconfig. A client that cannot be built fails at startup.

**--namespace** selects the only namespace this process will read or write. When the flag is omitted, the driver reads the namespace from the in-cluster service-account file and, if that file is missing or not a namespace name, uses **default**. A handle that names a different namespace is rejected. Secrets this driver creates are labeled as managed by OpenShell. It will not overwrite a Secret it did not create for that provider credential. Listing credentials is not implemented.

The gateway table that carries the same field is **[openshell.credential_drivers.kubernetes-secrets]**. Unknown keys are rejected. This binary does not read that file itself; the flags are the standalone configuration.

# PARAMETERS

**--bind-socket** _PATH_

> Required. Unix socket for the CredentialDriver service.

**--namespace** _NAME_

> Namespace for Secret objects. Must be a DNS label. Default is the in-cluster namespace file, then **default**.

**--log-level** _LEVEL_

> Log level. Default **info**. Used when the process environment does not already set a tracing filter.

# CONFIGURATION

A gateway table with the same field:

```
[openshell.credential_drivers.kubernetes-secrets]
namespace = "openshell"
```

Flags also read environment variables:

```
--bind-socket   OPENSHELL_CREDENTIAL_DRIVER_SOCKET
--namespace     OPENSHELL_KUBERNETES_SECRETS_NAMESPACE
--log-level     OPENSHELL_LOG_LEVEL
```

# CAVEATS

This is not the compute driver. Sandbox pods are created by **openshell-driver-kubernetes**. This process only stores provider credential bytes in Secret objects.

The socket is unlinked after the server stops. A crash can leave a stale socket; the next start removes it only when it is still a socket.

Concurrent updates of the same Secret are retried a few times and then fail. A Secret that is not labeled as managed by OpenShell for this credential is left in place.

# HISTORY

**openshell-driver-kubernetes-secrets** ships in NVIDIA **OpenShell** (Apache License 2.0). OpenShell was first published in **March 2026**. The **0.1.x** line is the stable release cadence.

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-driver-kubernetes](/man/openshell-driver-kubernetes)(1), [openshell-driver-vault](/man/openshell-driver-vault)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

<!-- verified: 2026-10-28 -->
