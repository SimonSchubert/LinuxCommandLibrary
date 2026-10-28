# TAGLINE

Podman compute driver for OpenShell sandboxes

# TLDR

Let the **gateway** start the driver (usual path)

```openshell-gateway --compute-driver podman --config [~/.config/openshell/gateway.toml]```

Listen on a **Unix socket** and talk to a Podman API socket

```openshell-driver-podman --bind-socket [/tmp/openshell-podman/compute-driver.sock] --podman-socket [/run/podman/podman.sock] --sandbox-image [nvcr.io/nvidia/base/ubuntu:24.04] --grpc-endpoint [http://127.0.0.1:17670]```

Listen on **loopback TCP** instead of a Unix socket

```openshell-driver-podman --bind-address [127.0.0.1:50061] --podman-socket [/run/podman/podman.sock] --grpc-endpoint [http://127.0.0.1:17670]```

# SYNOPSIS

**openshell-driver-podman** [**--bind-socket** _PATH_] [_options_]

# DESCRIPTION

**openshell-driver-podman** is the Podman compute driver for NVIDIA OpenShell. **openshell-gateway** can run the same driver in-process, or it can connect to this binary. The process serves the ComputeDriver gRPC API and stops on SIGINT or SIGTERM.

With **--bind-socket**, the listener is a private Unix socket (directory mode **0700**, socket mode **0600**) that accepts only a same-user peer. Without that flag, the process listens on **--bind-address** (default **127.0.0.1:50061**) with no peer check.

Each sandbox is two containers. **openshell-sandbox** owns the agent in the workload container. **openshell-supervisor** evaluates policy, holds gateway credentials, and proxies approved egress. Workload networking is **none**. The supervisor uses Podman host networking and joins only the workload's user namespace so shared-volume ownership still matches. The containers dial each other on a private Unix socket volume. Both drop all capabilities.

The driver uses the libpod REST API over **--podman-socket**. When that flag is omitted, the socket path is left unset and Podman selection follows the driver's default. Images are pinned by immutable image id. Account names are read from a stopped workload container; the image is never executed to resolve a user. Root and unresolved identities fail before provisioning.

Caller driver config is off unless **--admission-config-json** turns it on. The default value **{}** disables caller driver config and requires labels. Existing volumes need administrator approval labels. Bind mounts and extra image mounts are denied while admission is enforced. GPU devices are temporarily exempt. **--enable-bind-mounts** defaults to off.

When **--sandbox-image** is omitted, the default image is **nvcr.io/nvidia/base/ubuntu:24.04**. When the runtime and supervisor images are omitted, the driver uses the images compiled into OpenShell (**ghcr.io/nvidia/openshell/sandbox** and **ghcr.io/nvidia/openshell/supervisor**, tagged with this build).

# PARAMETERS

**--bind-socket** _PATH_

> Unix socket for the ComputeDriver service. When set, **--bind-address** is not used.

**--bind-address** _IP:PORT_

> TCP listen address when **--bind-socket** is omitted. Default **127.0.0.1:50061**. No peer authentication.

**--podman-socket** _PATH_

> Podman API Unix socket.

**--admission-config-json** _JSON_

> Operator admission policy. Default **{}** disables caller driver config and requires labels.

**--sandbox-image** _REF_

> Sandbox image when a create request omits one. Default is the OpenShell Ubuntu base image.

**--sandbox-image-pull-policy** _POLICY_

> **always**, **if not present** (the default), **never**, or **newer**.

**--grpc-endpoint** _URL_

> Where the supervisor reaches the gateway. When empty, the driver derives an endpoint from **--gateway-port**.

**--gateway-port** _PORT_

> Gateway port used when **--grpc-endpoint** is omitted. Default **17670**.

**--host-gateway-ip** _ADDR_

> Trusted host address published into sandboxes. On macOS the default is **192.168.127.254** (Podman Machine). On Linux an empty value means loopback.

**--network-name** _NAME_

> Podman network kept for driver-managed resources. Default **openshell**.

**--stop-timeout** _SECONDS_

> Container stop timeout (SIGTERM, then SIGKILL). Default **45**.

**--sandbox-pids-limit** _N_

> cgroup PID limit for sandbox containers. Default **2048**. Explicit zero is invalid.

**--health-check-interval-secs** _N_

> Podman health-check interval for this standalone process. Default **10**. Explicit zero is invalid. The gateway table can omit the key to disable the check; this binary's default does not.

**--sandbox-runtime-image** _REF_, **--supervisor-image** _REF_

> Images that contain **openshell-sandbox** (static musl) and **openshell-supervisor** (glibc).

**--podman-tls-ca** _PATH_

> Host CA for supervisor-to-gateway TLS.

**--podman-tls-cert** _PATH_, **--podman-tls-key** _PATH_

> Deprecated. Client certificates and private keys are rejected.

**--provider-spiffe-workload-api-socket** _PATH_

> Host Unix socket projected into supervisors for provider SPIFFE token exchange.

**--app-armor-profile** _PROFILE_

> AppArmor model for the workload: runtime default, unconfined, or a localhost profile name.

**--sandbox-https-proxy** _URL_

> Corporate forward proxy for supervisor TLS egress. Form **http://host:port** or **https://host:port**. Do not put credentials in the URL.

**--sandbox-no-proxy** _LIST_

> Comma-separated bypass list for that proxy.

**--sandbox-proxy-auth-file** _PATH_

> File containing **user:pass**, delivered through a root-only secret mount.

**--sandbox-proxy-auth-allow-insecure** _true|false_

> Required acknowledgement when the auth file is used with an **http** proxy.

**--sandbox-proxy-connect-by-hostname** _true|false_

> Send hostnames instead of checked IP addresses in CONNECT. Default is off. The proxy then resolves the name itself.

**--sandbox-proxy-ca-bundle** _PATH_

> PEM CA bundle for the corporate proxy and for certificates re-signed by a TLS-intercepting proxy. Requires the proxy URL.

**--sandbox-additional-ca-bundle** _PATH_

> PEM CA bundle for direct (non-proxied) HTTPS egress signed by a private CA. Applied whether or not a corporate proxy is set.

**--userns** _MODE_

> User namespace mode for sandbox containers, for example **auto**. Unset keeps Podman's default.

**--uidmap** _SPEC_, **--gidmap** _SPEC_

> Repeatable id maps for a private user namespace. Each entry is a container id, a host id, and a size, separated by colons.

**--enable-bind-mounts**

> Allow sandbox requests to attach host bind mounts. Default is off. Still denied while label admission is enforced.

**--sandbox-ssh-socket-path** _PATH_

> Interactive SSH socket inside the sandbox. Default **/run/openshell/ssh.sock**.

**--log-level** _LEVEL_

> Driver log level. Default **info**.

**--otlp-endpoint** _URL_, **--gateway-name** _NAME_

> OTLP/gRPC collector and the gateway name attached to exported traces.

**--otlp-ocsf-endpoint** _URL_, **--otlp-ocsf-schema-version** _VERSION_

> OTLP/gRPC collector for supervisor OCSF events, and the schema version those events are downgraded to. The schema flag requires the endpoint flag.

# CONFIGURATION

Select this driver from the gateway with **--compute-driver podman**. Podman settings live in the Podman driver table. The gateway turns that table into this process's flags when it launches an external driver. A minimal file:

```
[openshell]
version = 2

[openshell.gateway]
compute_driver = "podman"

[openshell.drivers.podman]
default_image = "nvcr.io/nvidia/base/ubuntu:24.04"
grpc_endpoint = "http://127.0.0.1:17670"
```

Flags also read environment variables (the id-map flags do not):

```
--admission-config-json              OPENSHELL_DRIVER_ADMISSION_CONFIG_JSON
--bind-socket                        OPENSHELL_COMPUTE_DRIVER_SOCKET
--bind-address                       OPENSHELL_COMPUTE_DRIVER_BIND
--podman-socket                      OPENSHELL_PODMAN_SOCKET
--sandbox-image                      OPENSHELL_SANDBOX_IMAGE
--sandbox-image-pull-policy          OPENSHELL_SANDBOX_IMAGE_PULL_POLICY
--grpc-endpoint                      OPENSHELL_GRPC_ENDPOINT
--gateway-port                       OPENSHELL_GATEWAY_PORT
--host-gateway-ip                    OPENSHELL_PODMAN_HOST_GATEWAY_IP
--network-name                       OPENSHELL_NETWORK_NAME
--stop-timeout                       OPENSHELL_STOP_TIMEOUT
--sandbox-pids-limit                 OPENSHELL_SANDBOX_PIDS_LIMIT
--health-check-interval-secs         OPENSHELL_HEALTH_CHECK_INTERVAL_SECS
--sandbox-runtime-image              OPENSHELL_SANDBOX_RUNTIME_IMAGE
--supervisor-image                   OPENSHELL_SUPERVISOR_IMAGE
--podman-tls-ca                      OPENSHELL_PODMAN_TLS_CA
--podman-tls-cert                    OPENSHELL_PODMAN_TLS_CERT
--podman-tls-key                     OPENSHELL_PODMAN_TLS_KEY
--provider-spiffe-workload-api-socket OPENSHELL_PROVIDER_SPIFFE_WORKLOAD_API_SOCKET
--app-armor-profile                  OPENSHELL_APP_ARMOR_PROFILE
--sandbox-https-proxy                OPENSHELL_SANDBOX_HTTPS_PROXY
--sandbox-no-proxy                   OPENSHELL_SANDBOX_NO_PROXY
--sandbox-proxy-auth-file            OPENSHELL_SANDBOX_PROXY_AUTH_FILE
--sandbox-proxy-auth-allow-insecure  OPENSHELL_SANDBOX_PROXY_AUTH_ALLOW_INSECURE
--sandbox-proxy-connect-by-hostname  OPENSHELL_SANDBOX_PROXY_CONNECT_BY_HOSTNAME
--sandbox-proxy-ca-bundle            OPENSHELL_SANDBOX_PROXY_CA_BUNDLE
--sandbox-additional-ca-bundle       OPENSHELL_SANDBOX_ADDITIONAL_CA_BUNDLE
--userns                             OPENSHELL_PODMAN_USERNS
--enable-bind-mounts                 OPENSHELL_ENABLE_BIND_MOUNTS
--sandbox-ssh-socket-path            OPENSHELL_SANDBOX_SSH_SOCKET_PATH
--log-level                          OPENSHELL_LOG_LEVEL
--otlp-endpoint                      OPENSHELL_OTLP_ENDPOINT
--otlp-ocsf-endpoint                 OPENSHELL_OTLP_OCSF_ENDPOINT
--otlp-ocsf-schema-version           OPENSHELL_OTLP_OCSF_SCHEMA_VERSION
--gateway-name                       OPENSHELL_GATEWAY_NAME
```

# CAVEATS

TCP listen mode has no peer check. Do not expose **--bind-address**.

The runtime must pass the sandbox's unprivileged probe, including nested seccomp notification and Landlock. Do not switch the workload to an unconfined profile or add capabilities to make a failing probe pass.

Only the gateway CA is delivered to the supervisor. User client certificates are not mounted. The sandbox-to-supervisor channel uses its own per-sandbox TLS material.

User-owned volumes are never created or deleted by this driver. Delete removes driver-owned containers, the channel, the workspace, and driver-owned secrets.

General UDP is unsupported. DNS stays on the supervisor-mediated path.

# HISTORY

**openshell-driver-podman** ships in NVIDIA **OpenShell** (Apache License 2.0). OpenShell was first published in **March 2026**. The **0.1.x** line is the stable release cadence.

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-supervisor](/man/openshell-supervisor)(1), [openshell-sandbox](/man/openshell-sandbox)(1), [openshell-driver-docker](/man/openshell-driver-docker)(1), [openshell-driver-kubernetes](/man/openshell-driver-kubernetes)(1), [openshell-driver-vm](/man/openshell-driver-vm)(1), [podman](/man/podman)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://github.com/NVIDIA/OpenShell/blob/main/crates/openshell-driver-podman/README.md)```

<!-- verified: 2026-10-28 -->
