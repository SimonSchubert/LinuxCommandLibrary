# TLDR

**Mine to a pool** with wallet address

```xmrig -o [pool.example.com:3333] -u [wallet_address]```

**Mine using config file**

```xmrig --config [config.json]```

**Run benchmark**

```xmrig --bench [1M]```

**Mine with specific CPU threads**

```xmrig -o [pool:port] -u [wallet] -t [4]```

**Run in background**

```xmrig -o [pool:port] -u [wallet] -B```

**Enable CUDA** (NVIDIA GPU)

```xmrig -o [pool:port] -u [wallet] --cuda```

**Enable OpenCL** (AMD GPU)

```xmrig -o [pool:port] -u [wallet] --opencl```

**Dry run** to test configuration

```xmrig --config [config.json] --dry-run```

# SYNOPSIS

**xmrig** [_options_]

**xmrig** -o _pool_ -u _wallet_ [_options_]

# PARAMETERS

**-o** _URL_, **--url** _URL_
> Mining pool URL (host:port)

**-u** _WALLET_, **--user** _WALLET_
> Wallet address or username

**-p** _PASS_, **--pass** _PASS_
> Password for pool

**-t** _NUM_, **--threads** _NUM_
> Number of CPU threads

**-c** _FILE_, **--config** _FILE_
> JSON configuration file

**-B**, **--background**
> Run in background (daemon mode)

**--cuda**
> Enable CUDA backend (NVIDIA)

**--opencl**
> Enable OpenCL backend (AMD)

**--no-cpu**
> Disable CPU mining

**--cuda-devices** _LIST_
> Comma-separated CUDA device indices

**--opencl-devices** _LIST_
> Comma-separated OpenCL device indices

**--donate-level** _N_
> Donation percentage (default: 1%)

**--randomx-1gb-pages**
> Use 1GB hugepages (Linux, requires setup)

**--bench** _N_
> Run benchmark (1M to 10M hashes)

**--stress**
> Continuous stress test mode

**--dry-run**
> Test configuration without mining

**-V**, **--version**
> Show version

**-h**, **--help**
> Show help

# DESCRIPTION

**xmrig** is a high-performance cryptocurrency miner supporting RandomX (Monero), KawPow (Ravencoin), CryptoNight, and GhostRider algorithms. It supports CPU and GPU mining on Windows, Linux, macOS, and FreeBSD.

Configuration is preferably done via JSON config file, which supports features not available via command line like multiple pools and mining profiles. The miner automatically selects optimal settings based on hardware detection.

For RandomX mining on Linux, enabling hugepages significantly improves performance. The miner includes a 1% default donation to developers, which can be adjusted via configuration.

# CAVEATS

Cryptocurrency mining consumes significant electricity and generates heat. Profitability depends on hardware, electricity costs, and cryptocurrency prices. Some cloud providers and ISPs prohibit mining. Running at full capacity may reduce hardware lifespan. Ensure adequate cooling for sustained operation.

# HISTORY

XMRig was created as an open-source Monero miner, originally focusing on CPU mining with the CryptoNight algorithm. When Monero switched to the RandomX algorithm in **2019**, XMRig was updated to support it. The project expanded to include GPU support via CUDA and OpenCL backends. XMRig became one of the most widely used miners due to its performance, cross-platform support, and active development.

# SEE ALSO

[cgminer](/man/cgminer)(1), [bfgminer](/man/bfgminer)(1)
