# TLDR

**Start server**

```minio server [/data]```

**Start with console port**

```minio server --console-address ":[9001]" [/data]```

**Distributed mode**

```minio server [http://server{1...4}/data]```

**Set credentials**

```MINIO_ROOT_USER=[admin] MINIO_ROOT_PASSWORD=[password] minio server [/data]```

**Specify address**

```minio server --address ":[9000]" [/data]```

# SYNOPSIS

**minio server** [_options_] _path_

# PARAMETERS

_PATH_
> Data directory or endpoints.

**--address** _ADDR_
> Server address.

**--console-address** _ADDR_
> Console address.

**--certs-dir** _DIR_
> TLS certificates.

**--help**
> Display help information.

# DESCRIPTION

**minio server** runs MinIO object storage. MinIO is S3-compatible storage server.

The tool provides high-performance object storage. Supports erasure coding and distributed mode.

minio-server provides S3 storage.

# CAVEATS

Requires persistent storage. Set secure credentials. Memory intensive for large deployments.

# HISTORY

MinIO was created to provide high-performance, **S3-compatible** object storage that's Kubernetes-native.

# SEE ALSO

[minio-client](/man/minio-client)(1), [mc](/man/mc)(1), [aws](/man/aws)(1)

