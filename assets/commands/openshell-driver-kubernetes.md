# TAGLINE

Kubernetes compute driver for OpenShell sandboxes

# TLDR

Let the **gateway** start the driver (usual path)

```openshell-gateway --compute-driver kubernetes --config [~/.config/openshell/gateway.toml]```

Listen on a **Unix socket** in managed workspace mode

```openshell-driver-kubernetes --bind-socket [/tmp/openshell-k8s/compute-driver.sock] --workspace-mode [managed] --gateway-id [openshell] --grpc-endpoint [https://gateway.example:17670]```

Listen on **loopback TCP** in one shared namespace

```openshell-driver-kubernetes --bind-address [127.0.0.1:50061] --workspace-mode [shared] --sandbox-namespace [openshell]```

# SYNOPSIS

**openshell-driver-kubernetes** [**--bind-socket** _PATH_] [_options_]

# DESCRIPTION

**openshell-driver-kubernetes** is the Kubernetes compute driver for NVIDIA OpenShell. **openshell-gateway** can run the same driver in-process, or it can connect to this binary. The process serves the ComputeDriver gRPC API. It uses the Kubernetes API to create, delete, fetch, and watch sandbox custom resources, and it stops on SIGINT or SIGTERM.

With **--bind-socket**, the listener is a private Unix socket (directory mode **0700**, socket mode **0600**) that accepts only a same-user peer. Without that flag, the process listens on **--bind-address** (default **127.0.0.1:50061**) with no peer check.

**--workspace-mode** chooses where sandboxes land:

- **shared** (the default): every sandbox is rendered into **--sandbox-namespace**. Resource names use the workspace and the sandbox name, joined by a double hyphen, so they do not collide.
- **managed**: the driver creates and deletes a namespace per workspace, named **openshell-**, the gateway id, and the workspace name. It also creates a service account in that namespace. On OpenShift it waits for the namespace's own SELinux and uid-range annotations before provisioning.
- **operator**: workspace names map one-to-one onto namespaces that already exist. Exactly one discovery source is allowed: **--operator-namespace-label** or **--operator-namespace-file**. Creation fails closed when the workspace is not on that list. Deleting a workspace removes gateway state only. It does not delete the namespace.

The workload Pod stages a static musl **openshell-sandbox** from **--sandbox-runtime-image**. A separate Pod runs a glibc **openshell-supervisor** from **--supervisor-image**. When those flags are omitted, the driver uses the images compiled into OpenShell. The workload receives no gateway credential, provider identity socket, or corporate-proxy credential. Caller driver config is off unless **--admission-config-json** turns it on. The default value **{}** disables caller driver config and requires labels. GPU devices are temporarily exempt.

# PARAMETERS

**--bind-socket** _PATH_

> Unix socket for the ComputeDriver service. When set, **--bind-address** is not used.

**--bind-address** _IP:PORT_

> TCP listen address when **--bind-socket** is omitted. Default **127.0.0.1:50061**. No peer authentication.

**--admission-config-json** _JSON_

> Operator admission policy. Default **{}** disables caller driver config and requires labels.

**--workspace-mode** _MODE_

> **shared**, **managed**, or **operator**. Default **shared**.

**--gateway-id** _ID_

> Used in managed-mode namespace names. Default **openshell**.

**--sandbox-namespace** _NAMESPACE_

> Namespace for **shared** mode. Default **default**.

**--operator-namespace-label** _SELECTOR_, **--operator-namespace-file** _PATH_

> The one allowlist source for **operator** mode. A label selector waits up to **10** seconds for the first namespace list after a restart, then returns unavailable.

**--sandbox-service-account** _NAME_

> Service account used by sandbox pods. Default **default**.

**--sandbox-image** _REF_

> Workload image when a create request omits one.

**--sandbox-image-pull-policy** _POLICY_

> **always**, **if not present**, or **never**. There is no default on this flag.

**--sandbox-image-pull-secrets** _NAMES_

> Comma-separated image-pull secret names. These are operator configuration, not caller attachments. Managed mode stages an immutable copy per runtime generation.

**--allowed-pod-annotations** _KEYS_, **--allowed-pod-labels** _KEYS_

> Comma-separated names the driver may copy onto pods.

**--managed-ssh-ingress-enabled**

> Turn on managed SSH ingress. Default is off.

**--managed-ssh-gateway-namespace** _NAMESPACE_

> Namespace of the SSH gateway pods used by managed ingress.

**--managed-ssh-gateway-pod-selector** _PAIRS_

> Comma-separated **key=value** pairs selecting those pods. An entry without an equals sign is an error.

**--grpc-endpoint** _URL_

> Where supervisors reach the gateway. Empty when omitted.

**--client-tls-secret-name** _NAME_

> Kubernetes Secret that holds the gateway client TLS material.

**--host-gateway-ip** _ADDR_

> Host address published to sandboxes, when set.

**--sandbox-runtime-image** _REF_, **--sandbox-runtime-image-pull-policy** _POLICY_

> Image that contains **openshell-sandbox**, and its pull policy (**always**, **if not present**, or **never**).

**--supervisor-image** _REF_, **--supervisor-image-pull-policy** _POLICY_

> Image that contains **openshell-supervisor**, and its pull policy.

**--sandbox-runtime-boundary-port** _PORT_

> TCP port of the sandbox protocol listener. Default **5500**.

**--https-proxy** _URL_, **--no-proxy** _LIST_

> Corporate HTTP forward proxy for policy-approved TLS CONNECT egress, and a comma-separated bypass list.

**--proxy-auth-secret-name** _NAME_, **--proxy-auth-secret-key** _KEY_

> Kubernetes Secret name and key that hold the upstream proxy credential.

**--proxy-auth-allow-insecure**

> Acknowledge cleartext Basic authentication to an **http** proxy. Default is off.

**--proxy-connect-by-hostname**

> Send destination hostnames rather than validated IP addresses in CONNECT. Default is off.

**--proxy-ca-bundle** _PATH_

> PEM CA bundle trusted for the corporate proxy. This process reads it and stages it into each sandbox supervisor bootstrap Secret.

**--enable-user-namespaces**

> Enable user namespaces for sandbox pods. Default is off.

**--sa-token-ttl-secs** _SECONDS_

> Lifetime of the projected service-account token kubelet writes for the sandbox bootstrap exchange. Default **3600**. Kubelet enforces a minimum of **600**. The gateway clamps values to the range **600** through **86400**.

**--provider-spiffe-workload-api-socket** _PATH_

> Workload API socket path projected for provider token exchange.

**--sandbox-uid** _UID_, **--sandbox-gid** _GID_

> Run sandbox pods as this uid and gid, when set. Otherwise the namespace-resolved non-root ids are used.

**--sandbox-ssh-socket-path** _PATH_

> Interactive SSH socket inside the sandbox. Default **/run/openshell/ssh.sock**.

**--log-level** _LEVEL_

> Driver log level. Default **info**.

**--otlp-endpoint** _URL_, **--gateway-name** _NAME_

> OTLP/gRPC collector and the gateway name attached to exported traces. The trace service name is **openshell-driver-kubernetes**.

**--otlp-ocsf-endpoint** _URL_, **--otlp-ocsf-schema-version** _VERSION_

> OTLP/gRPC collector for supervisor OCSF events, and the schema version those events are downgraded to. The schema flag requires the endpoint flag.

# CONFIGURATION

Select this driver from the gateway with **--compute-driver kubernetes**. A minimal file:

```
[openshell]
version = 2

[openshell.gateway]
compute_driver = "kubernetes"

[openshell.drivers.kubernetes]
workspace_mode = "shared"
namespace = "openshell"
grpc_endpoint = "https://gateway.example:17670"
```

Caller PVC mounts cannot overlap the driver-managed **/.openshell** tree or **/run**, including nested subpaths. Use a data path such as **/data** or a directory below **/sandbox**.

In shared and managed modes, only this driver and its Agent Sandbox controller should administer the sandbox namespace, sandbox custom resources, sandbox pods, and the configured service account. In operator mode the platform owns namespace lifecycle, and the allowlist is not a tenant boundary.

Every long flag also reads an environment variable:

```
--admission-config-json              OPENSHELL_DRIVER_ADMISSION_CONFIG_JSON
--bind-socket                        OPENSHELL_COMPUTE_DRIVER_SOCKET
--bind-address                       OPENSHELL_COMPUTE_DRIVER_BIND
--workspace-mode                     OPENSHELL_WORKSPACE_MODE
--gateway-id                         OPENSHELL_GATEWAY_ID
--sandbox-namespace                  OPENSHELL_SANDBOX_NAMESPACE
--operator-namespace-label           OPENSHELL_OPERATOR_NAMESPACE_LABEL
--operator-namespace-file            OPENSHELL_OPERATOR_NAMESPACE_FILE
--sandbox-service-account            OPENSHELL_K8S_SANDBOX_SERVICE_ACCOUNT
--sandbox-image                      OPENSHELL_SANDBOX_IMAGE
--sandbox-image-pull-policy          OPENSHELL_SANDBOX_IMAGE_PULL_POLICY
--sandbox-image-pull-secrets         OPENSHELL_SANDBOX_IMAGE_PULL_SECRETS
--allowed-pod-annotations            OPENSHELL_K8S_ALLOWED_POD_ANNOTATIONS
--allowed-pod-labels                 OPENSHELL_K8S_ALLOWED_POD_LABELS
--managed-ssh-ingress-enabled        OPENSHELL_MANAGED_SSH_INGRESS_ENABLED
--managed-ssh-gateway-namespace      OPENSHELL_MANAGED_SSH_GATEWAY_NAMESPACE
--managed-ssh-gateway-pod-selector   OPENSHELL_MANAGED_SSH_GATEWAY_POD_SELECTOR
--grpc-endpoint                      OPENSHELL_GRPC_ENDPOINT
--client-tls-secret-name             OPENSHELL_CLIENT_TLS_SECRET_NAME
--host-gateway-ip                    OPENSHELL_HOST_GATEWAY_IP
--sandbox-runtime-image              OPENSHELL_SANDBOX_RUNTIME_IMAGE
--sandbox-runtime-image-pull-policy  OPENSHELL_SANDBOX_RUNTIME_IMAGE_PULL_POLICY
--supervisor-image                   OPENSHELL_SUPERVISOR_IMAGE
--supervisor-image-pull-policy       OPENSHELL_SUPERVISOR_IMAGE_PULL_POLICY
--sandbox-runtime-boundary-port      OPENSHELL_K8S_SANDBOX_RUNTIME_BOUNDARY_PORT
--https-proxy                        OPENSHELL_UPSTREAM_PROXY
--no-proxy                           OPENSHELL_UPSTREAM_NO_PROXY
--proxy-auth-secret-name             OPENSHELL_UPSTREAM_PROXY_AUTH_SECRET_NAME
--proxy-auth-secret-key              OPENSHELL_UPSTREAM_PROXY_AUTH_SECRET_KEY
--proxy-auth-allow-insecure          OPENSHELL_UPSTREAM_PROXY_AUTH_ALLOW_INSECURE
--proxy-connect-by-hostname          OPENSHELL_UPSTREAM_PROXY_CONNECT_BY_HOSTNAME
--proxy-ca-bundle                    OPENSHELL_UPSTREAM_PROXY_CA_BUNDLE
--enable-user-namespaces             OPENSHELL_ENABLE_USER_NAMESPACES
--sa-token-ttl-secs                  OPENSHELL_K8S_SA_TOKEN_TTL_SECS
--provider-spiffe-workload-api-socket OPENSHELL_PROVIDER_SPIFFE_WORKLOAD_API_SOCKET
--sandbox-uid                        OPENSHELL_K8S_SANDBOX_UID
--sandbox-gid                        OPENSHELL_K8S_SANDBOX_GID
--sandbox-ssh-socket-path            OPENSHELL_SANDBOX_SSH_SOCKET_PATH
--log-level                          OPENSHELL_LOG_LEVEL
--otlp-endpoint                      OPENSHELL_OTLP_ENDPOINT
--otlp-ocsf-endpoint                 OPENSHELL_OTLP_OCSF_ENDPOINT
--otlp-ocsf-schema-version           OPENSHELL_OTLP_OCSF_SCHEMA_VERSION
--gateway-name                       OPENSHELL_GATEWAY_NAME
```

Pull-policy tokens accepted by those flags:

```
always
if_not_present
never
```

# CAVEATS

TCP listen mode has no peer check. Do not expose **--bind-address**.

**--sandbox-namespace** defaults to **default** on this binary. That is not the same string as the managed-mode namespace prefix.

A runtime class name can be supplied only by the process environment. There is no flag for it:

```
OPENSHELL_K8S_DEFAULT_RUNTIME_CLASS_NAME
```

Image-pull policy **newer** is a Podman value. This driver rejects it.

The client is the default Kubernetes client (in-cluster configuration or the local kubeconfig). A missing configuration fails at startup.

# HISTORY

**openshell-driver-kubernetes** ships in NVIDIA **OpenShell** (Apache License 2.0). OpenShell was first published in **March 2026**. The **0.1.x** line is the stable release cadence.

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-gateway](/man/openshell-gateway)(1), [openshell-supervisor](/man/openshell-supervisor)(1), [openshell-driver-docker](/man/openshell-driver-docker)(1), [openshell-driver-podman](/man/openshell-driver-podman)(1), [openshell-driver-kubernetes-secrets](/man/openshell-driver-kubernetes-secrets)(1), [openshell-driver-vm](/man/openshell-driver-vm)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://github.com/NVIDIA/OpenShell/blob/main/crates/openshell-driver-kubernetes/README.md)```

<!-- verified: 2026-10-28 -->
