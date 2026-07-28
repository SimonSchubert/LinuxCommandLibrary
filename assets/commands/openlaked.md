# TAGLINE

OpenLake storage daemon for LLM inference and GPU workloads

# TLDR

Start the store with a **config** file

```openlaked --config [path/to/config.toml]```

Start after **building** from source

```./target/release/openlaked --config crates/openlake_server/configs/storage-tcp-local.toml```

Install the **vLLM connector** helper package

```pip install openlake-vllm```

```openlaked```

# SYNOPSIS

**openlaked** [_--config_ _path_] [_options_]

# PARAMETERS

**--config** _path_
> Path to OpenLake server configuration (TCP local storage, RDMA KV, etc.)

# DESCRIPTION

**openlaked** is the OpenLake server binary: a high-performance storage engine for GPU-centric workloads, including KV-cache offload for LLM inference, checkpoint storage, and S3-compatible object storage. It is implemented in Rust and optimized for Linux (`io_uring`, optional RDMA/GPUDirect paths).

Typical use: run `openlaked` on GPU hosts, then point vLLM (via `openlake-vllm` / OpenLakeConnector) at the node list so long-context prefixes can be reused from host RAM/disk. In object-store mode it exposes an S3-compatible endpoint for tools like the AWS CLI.

# CAVEATS

Production RDMA and GPUDirect features target Linux GPU clusters; macOS is for development only. Single-node defaults use local data directories you must create. S3 demo credentials in docs are for local testing only—change for any shared deployment.

# HISTORY

**OpenLake** is an Apache-2.0 project for AI infrastructure storage (KV pool + object store).

# SEE ALSO

[vllm](/man/vllm)(1), [aws](/man/aws)(1)

# RESOURCES

```[Source code](https://github.com/openlake-project/openlake)```

```[Homepage](https://theopenlake.com)```

```[Documentation](https://github.com/openlake-project/openlake/tree/main/docs)```

<!-- verified: 2026-07-28 -->
