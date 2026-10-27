# TAGLINE

deCDN sponsorship daemon that signs payment capabilities and tops up a pool

# TLDR

Start on **loopback** with a treasury keystore and a bearer file

```sponsord --bind [127.0.0.1:8090] --api-token-file [token] --rpc-url [https://sepolia-rollup.arbitrum.io/rpc] --chain-id [421614] --payment-pool-addr [0xpool] --pool-id [0xid] --treasury-keystore [treasury.json] --treasury-password-file [password]```

Show **flags and defaults**

```sponsord --help```

# SYNOPSIS

**sponsord** [**--bind** _addr_] [**--api-token** _token_ | **--api-token-file** _file_] [**--rpc-url** _url_] [**--chain-id** _id_] [**--payment-pool-addr** _addr_] [**--pool-id** _id_] [**--treasury-keystore** _file_] [**--treasury-password** _password_ | **--treasury-password-file** _file_] [**--max-spending-cap-micro-usdc** _n_] [**--max-ttl-secs** _n_] [**--pool-low-water-micro-usdc** _n_] [**--pool-refill-micro-usdc** _n_] [**--pool-watch-interval-secs** _n_]

# DESCRIPTION

**sponsord** holds the owner key of one deCDN **PaymentPool**. It signs capped, expiring capabilities (`dcap1:` tokens) for trusted callers over a small HTTP API, and it keeps that pool funded from the treasury wallet. The process loads the keystore, checks that the key owns the pool, then serves until Ctrl-C or SIGTERM. A top-up already sent is allowed to finish before exit.

Every setting is a flag and an environment variable of the same name: uppercase, a **SPONSORD** prefix, hyphens written as underscores. A secret may be given as a value or as a file (`--api-token-file`, `--treasury-password-file`). **--rpc-url** is hidden from **--help** because the URL often carries an API key. Fatal errors are printed through a redacting formatter so that URL is not dumped on stderr.

The pool itself is opened out of band with `decdn pool open`. Default listen address is **127.0.0.1:8090**. Default chain id is **421614** (Arbitrum Sepolia). The bearer must be at least **32 bytes**. A zero spending cap, TTL, or watch interval is refused.

Signed Linux binaries are on the deCDN GitHub releases. A container image is published as `ghcr.io/decdn/sponsord`.

# PARAMETERS

**--bind** _addr_
> HTTP listen address. Default **127.0.0.1:8090**

**--api-token** _token_
> Bearer callers present. At least 32 bytes. Hidden value

**--api-token-file** _file_
> File holding the bearer, instead of **--api-token**

**--rpc-url** _url_
> JSON-RPC endpoint of the chain the pool is on. Hidden from **--help**

**--chain-id** _id_
> Chain id. Default **421614** (Arbitrum Sepolia)

**--payment-pool-addr** _addr_
> PaymentPool contract address

**--pool-id** _id_
> Id of the sponsor's pool

**--treasury-keystore** _file_
> Encrypted keystore JSON of the wallet that owns the pool. It signs capabilities and pays for top-ups

**--treasury-password** _password_
> Password of that keystore. Hidden value

**--treasury-password-file** _file_
> File holding the keystore password

**--max-spending-cap-micro-usdc** _n_
> Largest cap a caller may request per capability, in micro-USDC. Default **5000000** ($5). Must be above zero

**--max-ttl-secs** _n_
> Longest TTL a caller may request, in seconds. Default **172800** (48 hours). Must be above zero

**--pool-low-water-micro-usdc** _n_
> Top the pool up when its remaining balance drops below this, in micro-USDC. Default **20000000** ($20)

**--pool-refill-micro-usdc** _n_
> Amount each top-up adds, in micro-USDC. Default **100000000** ($100)

**--pool-watch-interval-secs** _n_
> How often the balance is checked, in seconds. Default **3600**. Must be above zero

# CAVEATS

The treasury key signs real top-ups. Fund that wallet only with what you are willing to spend. Default chain id is the Arbitrum Sepolia testnet, matching deCDN's public testnet. **--rpc-url** and the bearer are secrets: prefer the file forms and do not put them in a process listing. The daemon does not open the pool; `decdn pool open` does that first. A bind failure is avoided while a top-up is in flight, but a wrong pool id or a key that does not own the pool fails at startup.

# HISTORY

**sponsord** is a crate in the **deCDN** repository (`decdn/decdn`), MIT or Apache-2.0. It is the operator-side companion of the **decdn** client and the **decdn-node** daemon.

# SEE ALSO

[decdn](/man/decdn)(1), [decdn-node](/man/decdn-node)(8)

# RESOURCES

```[Source code](https://github.com/decdn/decdn)```

```[Homepage](https://decdn.org)```

```[Documentation](https://github.com/decdn/decdn/blob/main/docs/sponsord/operator.md)```

<!-- verified: 2026-10-27 -->
