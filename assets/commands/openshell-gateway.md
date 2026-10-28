# TAGLINE

OpenShell control-plane daemon for sandboxes, policy, and credentials

# TLDR

Check a **gateway TOML file** without starting the service

```openshell-gateway config preflight --path ~/.config/openshell/gateway.toml```

Replay **daemon flags** through preflight

```openshell-gateway config preflight -- --port [17670] --compute-driver [docker]```

Start the gateway on **loopback** (default port **17670**)

```openshell-gateway```

Start with an explicit **config file** and **compute driver**

```openshell-gateway --config ~/.config/openshell/gateway.toml --compute-driver [docker]```

Listen in **plaintext** behind a TLS-terminating proxy

```openshell-gateway --disable-tls --bind-address [127.0.0.1] --port [17670]```

Write local **mTLS PEMs** instead of Kubernetes Secrets

```openshell-gateway generate-certs --output-dir [./tls] --server-san [localhost]```

# SYNOPSIS

**openshell-gateway** [_options_]

**openshell-gateway** **config** **preflight** [**--path** _FILE_] [**--** _gateway-args_...]

**openshell-gateway** **generate-certs** [_options_]

# DESCRIPTION

**openshell-gateway** is the control-plane process of NVIDIA OpenShell. The **openshell** CLI talks to it over gRPC (and, on loopback, optional plaintext HTTP for sandbox service URLs). The gateway creates and tracks sandboxes, stores provider credentials, delivers policy, and exposes the tunnel used to attach to a sandbox. Enforcement itself runs inside each sandbox.

With no subcommand, the binary starts the server. Desktop packages usually run it as a systemd user unit named **openshell-gateway**, a Homebrew service, or a snap daemon, bound to **https://127.0.0.1:17670**. Kubernetes installs run the same binary in a pod; **generate-certs** is the Helm pre-install hook that bootstraps mTLS Secrets.

**config preflight** loads the same configuration the daemon would use, reports the selected compute driver, and never writes the file. If the gateway reports a legacy schema, follow the schema version 2 migration in the official docs.

Compute drivers compiled into a typical Linux build include Docker, Podman, Kubernetes, and MicroVM. When **--compute-driver** is omitted, the gateway probes those drivers and picks one that is available.

# PARAMETERS

**--config** _FILE_

> TOML configuration file (RFC 0003). Also **OPENSHELL_GATEWAY_CONFIG**. When neither this flag nor the environment variable is set, the gateway reads **$XDG_CONFIG_HOME/openshell/gateway.toml** if that file exists.

**--name** _NAME_

> Operator-facing name for this installation (default **openshell**). Also **OPENSHELL_GATEWAY_NAME**.

**--bind-address** _ADDR_

> Address for the server, health, and metrics listeners (default **127.0.0.1**). Also **OPENSHELL_BIND_ADDRESS**.

**--port** _N_

> Server port (default **17670**). Also **OPENSHELL_SERVER_PORT**.

**--health-port** _N_

> Unauthenticated **healthz** / **readyz** listener. **0** disables it (default). Also **OPENSHELL_HEALTH_PORT**.

**--metrics-port** _N_

> Prometheus **/metrics** listener. **0** disables it (default). Also **OPENSHELL_METRICS_PORT**.

**--log-level** _LEVEL_

> **trace**, **debug**, **info** (default), **warn**, or **error**. Also **OPENSHELL_LOG_LEVEL**.

**--tls-cert** _FILE_, **--tls-key** _FILE_, **--tls-client-ca** _FILE_

> Server certificate, private key, and client CA for mTLS. Required unless **--disable-tls**. Also **OPENSHELL_TLS_CERT**, **OPENSHELL_TLS_KEY**, **OPENSHELL_TLS_CLIENT_CA**.

**--db-url** _URL_

> Persistence URL. When unset, SQLite under **$XDG_STATE_HOME/openshell/gateway/openshell.db**. Also **OPENSHELL_DB_URL**. This value is environment- and flag-only; a **database_url** key in the TOML file is rejected.

**--db-max-connections** _N_, **--db-lock-max-connections** _N_

> Database pool size and, on Postgres, mutation-lock pool size. Defaults are **10** (Postgres) or **5** (on-disk SQLite) for the main pool, and **4** for the lock pool. SQLite ignores the lock pool. Also **OPENSHELL_DB_MAX_CONNECTIONS** and **OPENSHELL_DB_LOCK_MAX_CONNECTIONS**.

**--compute-driver** _NAME_

> One registered driver. When unset, the gateway probes compiled-in drivers. Also **OPENSHELL_COMPUTE_DRIVER**. The legacy **OPENSHELL_DRIVERS** variable must contain exactly one name.

**--compute-driver-socket** _PATH_

> Unix socket of a remote driver implementing **compute_driver.proto**. Replaces in-process construction for the selected driver name. Also **OPENSHELL_COMPUTE_DRIVER_SOCKET**.

**--disable-tls**

> Listen on plaintext HTTP. Use when a reverse proxy or tunnel terminates TLS. Also **OPENSHELL_DISABLE_TLS**.

**--server-san** _SAN_

> Subject Alternative Names on the gateway certificate. Repeatable; comma-separated in **OPENSHELL_SERVER_SAN**. A wildcard DNS SAN enables HTTPS sandbox service URLs under that domain.

**--enable-loopback-service-http**

> Allow plaintext HTTP from loopback clients to **openshell.localhost** sandbox service hostnames (default **true**). Also **OPENSHELL_ENABLE_LOOPBACK_SERVICE_HTTP**.

**--enable-websocket-tunnel**

> WebSocket tunnel for an authenticated edge proxy (default **false**). Also **OPENSHELL_ENABLE_WEBSOCKET_TUNNEL**.

**--oidc-issuer** _URL_

> Validate **Authorization: Bearer** tokens against this issuer's JWKS. Related flags set audience (default **openshell-cli**), roles claim, admin/user role names, and JWKS TTL. Matching **OPENSHELL_OIDC_** environment variables exist for those flags.

**--enable-mtls-auth**, **--enable-operator-auth**

> mTLS user authentication, and gateway-wide operators (trusted certificate **OU=operator**). mTLS auth defaults on when a client CA is configured and no OIDC issuer is set.

**--grpc-rate-limit-requests** _N_, **--grpc-rate-limit-window-seconds** _N_

> gRPC rate limit. **0** disables. Also **OPENSHELL_GRPC_RATE_LIMIT_REQUESTS** and **OPENSHELL_GRPC_RATE_LIMIT_WINDOW_SECONDS**.

**--config-delivery-mode** _MODE_

> Supervisor configuration delivery: **poll** (default) or **push**. Also **OPENSHELL_CONFIG_DELIVERY_MODE**.

**config preflight** [**--path** _FILE_] [**--** _gateway-args_...]

> Validate configuration without starting the service. **--path** selects a TOML file and overrides **OPENSHELL_GATEWAY_CONFIG** and XDG discovery. Arguments after **--** are replayed as daemon flags. **--path** cannot be combined with those extra arguments.

**generate-certs** [**--output-dir** _DIR_] [**--server-san** _SAN_] [**--dry-run**] [_k8s-options_]

> Build mTLS PKI. **--output-dir** writes PEMs to a directory (kube flags are then optional). **--dry-run** prints PEMs. Without **--output-dir**, the command writes Kubernetes Secrets (**--namespace** from **POD_NAMESPACE**, **--server-secret-name**, **--client-secret-name**, **--jwt-secret-name**). **--jwt-only** creates only the sandbox-JWT signing Secret.

**-V**, **--version**

> Print the version.

# CONFIGURATION

Precedence is gateway CLI flag, then a gateway **OPENSHELL_** environment variable, then the TOML file, then built-in defaults.

The usual user file is **~/.config/openshell/gateway.toml**. On macOS with Homebrew, if that file is missing the service uses **$(brew --prefix)/var/openshell/gateway.toml**. Debian and RPM packages also load **~/.config/openshell/gateway.env** (for example **OPENSHELL_SANDBOX_RUNTIME_IMAGE** and **OPENSHELL_SUPERVISOR_IMAGE**); those variables override image fields in the selected driver table.

Local TLS material defaults to **$XDG_STATE_HOME/openshell/tls** (**ca.crt**, **server/tls.crt**, **server/tls.key**, **client/tls.crt**, **client/tls.key**), or **OPENSHELL_LOCAL_TLS_DIR**. Sandbox JWT keys live beside them under **jwt/**.

On-disk SQLite uses WAL with **synchronous=FULL**. Keep the database on a local filesystem. Back it up with **sqlite3**.

To turn off anonymous telemetry, set **OPENSHELL_TELEMETRY_ENABLED=false** (or **server.telemetryEnabled=false** in Helm).

Check a file before restarting:

```openshell-gateway config preflight --path ~/.config/openshell/gateway.toml```

# CAVEATS

TLS certificate and key are required unless **--disable-tls**. Exposing the gateway on a non-loopback address without TLS or an authenticating proxy is unsafe.

A snap, Debian, RPM, or Homebrew install does not migrate into another packaging method. Remove the old install before switching. A snap user gateway binds **127.0.0.1:17670**, so only one user on the machine should run it.

**openshell gateway remove** drops a CLI registration and does not stop this process. Use **systemctl --user** (or **brew services**) to stop a packaged gateway.

Linux packages need glibc **2.28** or newer. Docker, Podman, or host virtualization (KVM on Linux, Hypervisor.framework on macOS) must be available for local sandboxes.

# HISTORY

NVIDIA published OpenShell in **March 2026**. The **0.1.x** line is the stable release cadence (Apache License 2.0). **openshell-gateway** is the packaged server binary; **generate-certs** exists for the Helm pre-install hook.

# INSTALL

```aur: yay -S openshell```

```brew: brew install openshell```

```nix: nix profile install nixpkgs#openshell```

<!-- packages: 2026-10-22 -->

# SEE ALSO

[openshell](/man/openshell)(1), [openshell-prover](/man/openshell-prover)(1), [openshell-supervisor](/man/openshell-supervisor)(1), [openshell-driver-docker](/man/openshell-driver-docker)(1), [openshell-driver-podman](/man/openshell-driver-podman)(1), [openshell-driver-kubernetes](/man/openshell-driver-kubernetes)(1), [openshell-driver-kubernetes-secrets](/man/openshell-driver-kubernetes-secrets)(1), [openshell-driver-vault](/man/openshell-driver-vault)(1), [openshell-driver-vm](/man/openshell-driver-vm)(1), [docker](/man/docker)(1), [podman](/man/podman)(1), [kubectl](/man/kubectl)(1), [systemctl](/man/systemctl)(1), [journalctl](/man/journalctl)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://docs.nvidia.com/openshell/latest/how-it-works/gateways/overview)```

<!-- verified: 2026-10-23 -->
