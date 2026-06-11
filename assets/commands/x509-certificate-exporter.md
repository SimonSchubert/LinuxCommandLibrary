# TAGLINE

Prometheus exporter for X.509 certificate expiration

# TLDR

**Watch all PEM files** in a directory

```x509-certificate-exporter --watch-dir [/etc/ssl/certs] --listen-address :[9793]```

**Watch specific files**

```x509-certificate-exporter -f [/etc/nginx/ssl/site.pem] -f [/etc/nginx/ssl/api.pem]```

**Watch certificates referenced by a kubeconfig**

```x509-certificate-exporter --watch-kubeconf [~/.kube/config]```

**Run with a YAML config file** and debug logging

```x509-certificate-exporter --config [exporter.yaml] --debug```

**Serve metrics over TLS / BasicAuth**

```x509-certificate-exporter --web.config.file [web-tls.yaml] -b :[9793]```

# SYNOPSIS

**x509-certificate-exporter** [**--watch-file** _file_]... [**--watch-dir** _dir_]... [**--watch-kubeconf** _file_]... [**--listen-address** _addr_] [_flags_]

# PARAMETERS

**-C**, **--config** _file_
> Load configuration from a YAML file.

**-f**, **--watch-file** _file_
> Watch a single certificate or PEM bundle (repeatable).

**-d**, **--watch-dir** _dir_
> Watch every certificate file in a directory (repeatable).

**-k**, **--watch-kubeconf** _file_
> Parse a kubeconfig and watch every certificate it references.

**--watch-kube-secrets**
> When running in-cluster, watch certificates stored in Kubernetes Secrets.

**-b**, **--listen-address** _addr_
> Address for the metrics endpoint (default `:9793`).

**--web.config.file** _file_
> Prometheus exporter-toolkit config for TLS and BasicAuth on the metrics endpoint.

**--probe.listen-address** _addr_
> Bind address for the readiness/liveness probe endpoint.

**--debug**
> Enable debug logging.

**--profile**
> Enable Go pprof endpoints for profiling.

**-v**, **--version**
> Show version and exit.

# DESCRIPTION

**x509-certificate-exporter** is a **Prometheus** exporter that scrapes X.509 certificates from disk and from a Kubernetes cluster and exposes their lifetimes as metrics on **/metrics**. Every certificate found — including each leaf in a chain — becomes its own time series labeled with subject, issuer, SANs, serial number, and source, so alerts can be written against well-known metrics such as **x509_cert_not_after**.

The exporter understands PEM bundles, Kubernetes **Secret** objects, **ConfigMap** entries, kubeconfig files, and password-protected **PKCS#12** keystores. Parsed certificates are cached between scrapes to keep CPU and I/O cost low, and the standard Prometheus **exporter-toolkit** is integrated for TLS and BasicAuth on the metrics endpoint.

Distributed as a single static Go binary for Linux, macOS, Windows, and several BSDs across amd64/arm64/armv7/riscv64. A Helm chart and container images make it straightforward to deploy in Kubernetes.

# CAVEATS

The exporter inspects certificates **on disk** (or via the Kubernetes API); it does **not** open TLS connections to remote servers. To monitor remote endpoints, combine it with **blackbox_exporter**. PKCS#12 keystores need their passwords supplied through the YAML config file. Default port **9793** can collide with other services if not changed.

# HISTORY

Developed at **ENIX** (a French infrastructure company) and released under the **MIT** license. Active development continues with frequent releases on GitHub at **enix/x509-certificate-exporter**.

# SEE ALSO

[prometheus](/man/prometheus)(1)
