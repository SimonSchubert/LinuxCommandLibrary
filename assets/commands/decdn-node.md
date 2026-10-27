# TAGLINE

deCDN cache-node daemon

# TLDR

Run the node with the default config

```decdn-node run```

Use a **specific config file**

```decdn-node --config [path/to/node.toml] run```

Listen for QUIC on another **UDP port**

```decdn-node run --bind-port [port]```

Cap the on-disk **cache**

```decdn-node run --cache-size-mb [megabytes]```

Set the **price per megabyte** in USDC base units

```decdn-node run --rate-per-mb [units]```

Write **JSON logs** at debug level

```decdn-node run --log-level debug --log-format json```

Check the resolved config **without starting**

```decdn config validate```

# SYNOPSIS

**decdn-node** [**--config** _PATH_] **run** [_options_]

# DESCRIPTION

**decdn-node** is the deCDN cache daemon. It serves BLAKE3-addressed blobs to clients and to other nodes over QUIC, redeems USDC vouchers, and answers the loopback admin API that **decdn node** calls. The only subcommand is **run**.

On startup it reads **~/.decdn/node.toml** unless **--config** is set. The same settings can be overridden by the flags below or by the matching **DECDN_** environment variables. **decdn config validate** resolves that set without binding ports or opening RPC.

The process listens on UDP port **4433** by default. **--relay-url** sets the iroh relay peers use when the node is not directly dialable. Prometheus metrics default to **127.0.0.1:9090**. The admin API defaults to loopback port **9191**; set **--admin-port 0** to disable it.

Startup waits for the first sync of the on-chain content blacklist before accepting protocol connections. Node-to-node cache-miss pull-through stays off unless the config turns it on. An origin backend (HTTP, a local directory, or S3-compatible storage) is set only in the `[cache.origin]` table of the config file, not by a flag.

Operator bonding, registration, and day-to-day admin are **decdn** commands. This binary only runs the node.

# PARAMETERS

**--config** _PATH_

> TOML config file. Default **~/.decdn/node.toml**. Place it before **run**.

**--data-dir** _DIR_

> Directory for keys, cache, and state. Default **~/.decdn**. Environment **DECDN_DATA_DIR**.

**--region** _CODE_

> ISO 3166-1 alpha-2 region code, such as **US** or **DE**. Environment **DECDN_REGION**.

**--bind-port** _PORT_

> QUIC UDP port. Default **4433**. Environment **DECDN_BIND_PORT**.

**--relay-url** _URL_

> iroh relay URL used for NAT traversal. Environment **DECDN_RELAY_URL**.

**--rpc-url** _URL_

> JSON-RPC endpoint. Environment **DECDN_RPC_URL**.

**--eth-keystore** _PATH_

> Ethereum keystore JSON file. Overrides the path in the config. Environment **DECDN_ETH_KEYSTORE**.

**--keystore-password-file** _PATH_

> File containing the keystore password. Consulted after **DECDN_KEYSTORE_PASSWORD**. One trailing newline is stripped. Environment **DECDN_KEYSTORE_PASSWORD_FILE**.

**--chain-id** _ID_

> EIP-712 chain id for the slash-signature domain. Default **421614** (Arbitrum Sepolia). Environment **DECDN_CHAIN_ID**.

**--cache-dir** _DIR_

> Directory for cached blobs. Default `<data-dir>/cache`. Environment **DECDN_CACHE_DIR**.

**--cache-size-mb** _MB_

> Maximum cache size in megabytes. Default **102400** (100 GB). Environment **DECDN_CACHE_SIZE_MB**.

**--max-blob-size-mb** _MB_

> Largest single blob, in megabytes. Default **51200** (50 GB), and it must not exceed the cache size. **0** means unlimited up to that cap. Environment **DECDN_MAX_BLOB_SIZE_MB**.

**--rate-per-mb** _UNITS_

> Advertised price per megabyte in USDC base units (6 decimal places). Default **10**, which is 0.00001 USDC per megabyte. Environment **DECDN_RATE_PER_MB**.

**--log-level** _LEVEL_

> **trace**, **debug**, **info**, **warn**, or **error**. Default **info**. Environment **DECDN_LOG_LEVEL**.

**--log-format** _FORMAT_

> **pretty** or **json**. Default **pretty**. Environment **DECDN_LOG_FORMAT**.

**--metrics-port** _PORT_

> Port for the Prometheus `/metrics` HTTP server. Default **9090**. Environment **DECDN_METRICS_PORT**.

**--metrics-bind** _ADDR_

> Address for that metrics server. Default **127.0.0.1**. Use **0.0.0.0** when a scraper runs on another host. Environment **DECDN_METRICS_BIND**.

**--admin-port** _PORT_

> Loopback admin HTTP port used by **decdn node**. Default **9191**. **0** disables it. Environment **DECDN_ADMIN_PORT**.

Further **--*-address** flags set the payment-pool, capacity-bond, origin-assignment, slash-judge, and content-blacklist contracts. **decdn config init** fills those from the shipped deployment manifest, which is the usual way to set them.

# CONFIGURATION

**~/.decdn/node.toml**

> Primary config. Create it with **decdn config init**, optionally **--origin** to record a pull-through backend. A relay node omits that backend and serves cached foreign content for pay.

**~/.decdn**

> Default data directory: `node.secret`, the Ethereum keystore, and the cache.

**DECDN_KEYSTORE_PASSWORD**

> Password for a headless **run**. The alternative is a file passed with **--keystore-password-file**. A daemon without a terminal cannot prompt.

Flags override the config file, and the environment variables above override the file when the matching flag is omitted. **decdn config validate** applies the same precedence.

# CAVEATS

The public deployment is a testnet on Arbitrum Sepolia. Wire format, contract ABI, config, and on-disk storage can change without a compatibility shim until mainnet.

Other peers can dial this host directly only when UDP **--bind-port** is reachable. Otherwise they depend on the relay. The metrics port and the admin port bind to loopback unless **--metrics-bind** is changed. Do not expose the admin port.

A fatal error during startup is printed with the RPC URL redacted, because API keys are often embedded in that URL.

**decdn-node** does not bond, register, or fetch. Those are **decdn** commands, and they need their own keystore password source.

# SEE ALSO

[decdn](/man/decdn)(1), [sponsord](/man/sponsord)(8)

# RESOURCES

```[Source code](https://github.com/decdn/decdn)```

```[Homepage](https://decdn.org)```

```[Documentation](https://docs.decdn.org)```

<!-- verified: 2026-10-15 -->
