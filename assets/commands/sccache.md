# TAGLINE

Shared compilation cache for C/C++ and Rust

# TLDR

**Start server**

```sccache --start-server```

**Show statistics**

```sccache --show-stats```

**Stop server**

```sccache --stop-server```

**Zero statistics**

```sccache --zero-stats```

**Use with cargo**

```RUSTC_WRAPPER=sccache cargo build```

**Use with cmake**

```cmake -DCMAKE_C_COMPILER_LAUNCHER=sccache -DCMAKE_CXX_COMPILER_LAUNCHER=sccache [..]```

**Show cache location**

```sccache --show-adv-stats```

# SYNOPSIS

**sccache** [_--start-server_] [_--stop-server_] [_--show-stats_] [_options_]

# PARAMETERS

**--start-server**
> Start the server daemon.

**--stop-server**
> Stop the server.

**--show-stats**
> Show cache statistics.

**--zero-stats**
> Reset statistics.

**--show-adv-stats**
> Show advanced statistics.

**--dist-auth** _TOKEN_
> Authenticate to dist server.

**--dist-status**
> Show distributed status.

# CONFIGURATION

**SCCACHE_DIR**
> Local cache directory path (default: ~/.cache/sccache).

**SCCACHE_CACHE_SIZE**
> Maximum local cache size (e.g., "10G").

**SCCACHE_REDIS**
> Redis server URL for shared caching across machines.

**SCCACHE_BUCKET**
> S3 bucket name for AWS-based shared caching.

**SCCACHE_GCS_BUCKET**
> Google Cloud Storage bucket for GCS-based shared caching.

**RUSTC_WRAPPER**
> Set to "sccache" to enable caching for Rust builds via cargo.

# DESCRIPTION

**sccache** is a compiler cache supporting C, C++, Rust, and other languages. It caches compilation results to speed up rebuilds.

The server runs as a daemon, caching compilation outputs. Subsequent compilations with the same inputs return cached results instantly.

Local caching stores results on disk. Cloud backends (S3, GCS, Redis, Azure) enable shared caching across machines and CI.

Rust integration through RUSTC_WRAPPER caches rustc invocations. The cargo build system automatically uses the wrapper.

C/C++ integration uses compiler launchers or wrapper scripts. CMake's launcher variables provide clean integration.

Distributed compilation schedules work across multiple machines. This scales builds beyond single-machine parallelism.

# CAVEATS

Non-deterministic builds reduce hit rates. Some compiler options prevent caching. Cloud storage has latency. Server must be running.

# HISTORY

**sccache** was developed by **Mozilla** starting around **2016** for Firefox builds. It provides an alternative to ccache with cloud storage and Rust support.

# SEE ALSO

[ccache](/man/ccache)(1), [cargo](/man/cargo)(1), [rustc](/man/rustc)(1)
