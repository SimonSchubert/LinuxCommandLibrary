# TAGLINE

runs MinIO object storage

# TLDR

**Start** a single-node server on a directory

```minio server [/data]```

Pin the **web console** to a fixed port

```minio server --console-address ":[9001]" [/data]```

Set the **root credentials**

```MINIO_ROOT_USER=[admin] MINIO_ROOT_PASSWORD=[password] minio server [/data]```

Bind the **S3 API** to a specific address and port

```minio server --address "[127.0.0.1]:[9000]" [/data]```

Start a **distributed** deployment across 4 hosts with 4 drives each

```minio server http://[host]{1...4}/mnt/disk{1...4}```

Use a custom **TLS certificate** directory

```minio server --certs-dir [/etc/minio/certs] [/data]```

Load the configuration from a **YAML file**

```minio server --config [/etc/minio/config.yaml]```

Output **JSON** logs without the startup banner

```minio server --quiet --json [/data]```

# SYNOPSIS

**minio server** [_options_] _DIR_ | _URL_...

# PARAMETERS

_DIR_ | _URL_
> Drive paths or endpoints; **{1...n}** expands to a range of hosts or drives.

**--address** _ADDR:PORT_
> S3 API listen address (default **:9000**).

**--console-address** _ADDR:PORT_
> Web console listen address (random port if unset).

**--config** _FILE_
> Server configuration in YAML format.

**--certs-dir**, **-S** _DIR_
> Directory with public.crt, private.key and CAs (default **~/.minio/certs**).

**--ftp** _KEY=VALUE_
> Enable and configure an FTP(S) server.

**--sftp** _KEY=VALUE_
> Enable and configure an SFTP server.

**--memlimit** _SIZE_
> Global memory limit per server (GOMEMLIMIT).

**--log-dir** _DIR_
> Write the server log to a directory.

**--quiet**
> Disable the startup banner.

**--json**
> Output server logs in JSON format.

**--anonymous**
> Hide sensitive information from logs.

**--help**
> Display help information.

# DESCRIPTION

**minio server** runs MinIO, an S3-compatible object storage server. With a single directory it runs as a single-node deployment; with several drives or hosts it uses **erasure coding** to survive drive and node failures.

Credentials and most settings come from environment variables such as **MINIO_ROOT_USER**, **MINIO_ROOT_PASSWORD** and **MINIO_VOLUMES**. Buckets are managed with the **mc** client or any S3 tool.

# CAVEATS

The default credentials are minioadmin/minioadmin; always change them. Erasure-coded deployments need drives of equal size and a consistent drive order. The upstream community repository is **no longer maintained**: MinIO removed most admin features from the community web console in 2025, stopped publishing community binaries and Docker images (source-only), and archived the repository in 2026 in favour of the commercial **AIStor** editions.

# HISTORY

MinIO was founded in **2014** by Anand Babu Periasamy and others as a Go-based, **S3-compatible** object store. It moved from Apache 2.0 to **AGPLv3** in 2021, and the community edition went into maintenance mode in late 2025.

# SEE ALSO

[minio-client](/man/minio-client)(1), [aws](/man/aws)(1)

# RESOURCES

```[Source code](https://github.com/minio/minio)```

```[Homepage](https://min.io)```

<!-- verified: 2026-09-29 -->
