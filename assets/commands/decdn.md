# TAGLINE

Client for the deCDN content network

# TLDR

**Download** a content-addressed blob

```decdn get decdn:[hash] -o [blob.bin]```

**Download** every file of a bundle into a directory

```decdn get decdn:[hash]/ -o [output-dir]```

**Download** one file from a bundle

```decdn get decdn:[hash]/[path/to/file] -o [output-dir]```

Pull a bundle through a **namespace**

```decdn get 'decdn:[hash]/?ns=[id]' -o [output-dir]```

Choose bundle files in an **editor** before downloading

```decdn get decdn:[hash]/ -o [output-dir] --select```

Write a **client** config

```decdn config init --client --output ~/.decdn/client.toml```

Generate a **client keystore**

```decdn key-gen --output-dir ~/.decdn/client```

Print the **local identity**

```decdn whoami```

**Probe** whether a node holds a blob

```decdn probe --node-id [id] --hash [hash] --addr [host:port]```

Import local files into an **origin store**

```decdn origin import --input [path] --to [origin-dir]```

# SYNOPSIS

**decdn** [**--config** _PATH_] [**--log-level** _LEVEL_] [**-v**] _command_ [_args_]

# DESCRIPTION

**decdn** is the user-facing command for deCDN, a decentralized content-delivery network. Bonded nodes cache and serve BLAKE3-addressed blobs over QUIC. The client checks every byte against that hash and pays the serving node per megabyte in USDC, with off-chain vouchers drawn on one shared on-chain payment pool.

This binary is what a person types. The long-running cache process is **decdn-node**. Commands under **decdn node** talk to that daemon on a loopback admin port and fail when no daemon is running. There is no **run** subcommand here.

A `decdn:` URI names what **get** pulls:

```decdn:<hash>```

> One blob. **-o** is the output file, or `-` to write verified bytes to stdout.

```decdn:<hash>/```

> Every file in the bundle whose manifest has that hash. **-o** is a directory.

```decdn:<hash>/<path>```

> One file of that bundle. **-o** is a directory, and the file is written at `<directory>/<path>`.

```?ns=<id>```

> Routes the fetch to that namespace's origins. Applies to a blob, a bundle, or one entry.

The public network is a testnet on Arbitrum Sepolia. Upstream publishes **decdn** from the `decdn-cli` crate.

# COMMANDS

**key-gen**

> Generate an Ed25519 node key and an Ethereum keystore. The default directory is **~/.decdn**. **--force** overwrites keys that are already there.

**whoami**

> Print the iroh node id, the Ethereum address, and the resolved key paths. Does not generate or rotate keys. Without a keystore password, the node id and paths still print.

**config init**

> Write a TOML config. **--client** writes a fetch-only client file, with none of the cache or serving sections the daemon reads. **--origin** _URL_ writes an origin-node config: an `http(s)://` base, a `file:///` path, or `s3` / `s3://<bucket>`. **--chain** _NAME_ fills contract addresses from a shipped deployment manifest; **none** leaves a blank template. **--force** overwrites an existing file. The default path is **~/.decdn/node.toml**.

**config validate**

> Resolve the daemon config, including the same **DECDN_** environment variables **decdn-node run** honors, without binding ports or dialing RPC.

**get** _URI_ **-o** _PATH_

> Paid fetch of the URI over `cdn/client/v1`. A blob is written atomically (a temp file in the destination directory, then a rename). A bundle defaults to 4 concurrent jobs (**--jobs**) and 4 streams to one payment lane (**--max-lane-streams**, from 1 to 64). **--include** and **--exclude** take repeatable gitignore globs matched against the manifest path; **--exclude** wins. **--select** opens the remaining file list in **$VISUAL** or **$EDITOR** so commented-out or deleted lines are skipped. Files already present and still matching the saved manifest are skipped unless **--overwrite**. **--dry-run** lists what would be pulled and does not touch the network, but only when that output directory already cached the bundle manifest. **--json** prints a one-line JSON summary for a bundle pull.

**probe**

> Ask a node, over `cdn/probe/v1`, whether it holds **--hash** (64 hex characters, optional `0x` prefix). Requires **--node-id**. Reach it with **--addr** _HOST:PORT_ or a relay (**--relay-url**, or `network.relay_urls` in the config). **--timeout-ms** defaults to 5000. **--json** prints one JSON line.

**gateway**

> Serve `decdn:` URIs to a browser from a loopback HTTP gateway. Default listen address is **127.0.0.1:8484**. `GET /<hash>[/<path>][?ns=<id>]` serves the matching URI. The gateway token lives under **~/.decdn/gateway** unless **--data-dir** is set.

**setup** **--mbps** _N_ **--region** _CODE_

> Operator onboarding: pre-flight checks, key generation, the TOKEN capacity bond, and on-chain registration, then a go or no-go summary. **--region** is an ISO 3166-1 alpha-2 code. **--multiaddr** is repeatable (for example `/ip4/203.0.113.10/udp/4433/quic-v1`). **--yes** skips the bond confirmation. **--accept-terms** accepts the current operator terms without a prompt; on a terminal the terms are shown and confirmed instead. **--dry-run** builds the transactions and does not send them.

**node**

> **health**, **status**, **lanes**, **slashes**, **pools**, **top**, **reload**, **drain**, and **doctor** query a running daemon over its loopback admin API. **evict** _HASH_ permanently stops that node from serving or re-fetching the blob. **bond**, **unbond**, **register**, **deregister**, **rotate-key**, **update-multiaddrs**, and **update-region** submit on-chain operator transactions. **lookup** reads the active set without a keystore. **bond** stakes `max(minBond, bondRequired(mbps))` and is safe to repeat: it bonds only the shortfall.

**origin import** **--input** _PATH_ **--to** _DIR_

> Offline import of a file or directory into a local origin store, in the layout the daemon reads. No config file and no running node are required. An S3 origin is filled by syncing that directory; an `s3://` or `http(s)://` value for **--to** is rejected. **--move** moves each source file instead of copying it. **--to** may be omitted with **--dry-run**.

**pool**

> Client payment-pool lifecycle: **list** (alias **status**), **open**, **top-up**, **close**, **reclaim**, and **assign**. One pool pays every provider. **list** can read the client store, a running daemon, a stopped node's store, or the chain.

**publish namespace create**

> Mint a namespace and print its id. **publish assign** _NAMESPACE_ _OPERATOR_... seats those bonded operators as authorized origins, one transaction each. The signer must already be vetted; vetting is granted outside this command. **publish revoke** _NAMESPACE_ _OPERATOR_ unseats one origin.

**appeal slash** _SLASH-ID_ _EVIDENCE-HASH_

> File an appeal of a slash and post the appeal bond. Must be run by the slashed operator inside the 30-day filing window. _EVIDENCE-HASH_ is a `0x`-prefixed 32-byte hex reference stored on-chain as given.

# PARAMETERS

**--config** _PATH_

> TOML config file. Default **~/.decdn/node.toml**. Global; a per-command **--config** overrides it. An explicit path that is missing is an error. A missing default path means no config has been written yet.

**--log-level** _LEVEL_

> Client-side log level: **trace**, **debug**, **info**, **warn**, or **error**. Logging stays off unless this, **-v**, or **RUST_LOG** is set. **RUST_LOG** wins.

**-v**, **--verbose**

> Counted shorthand for **--log-level**. **-v** is info, **-vv** is debug, **-vvv** is trace. **--log-level** wins when both are given. **RUST_LOG** wins over both.

**--keystore-password-file** _PATH_

> File whose contents are the keystore password. Consulted after **DECDN_KEYSTORE_PASSWORD** and before an interactive prompt. One trailing newline is stripped. An empty file after that strip is an empty password. A missing path is skipped; an unreadable path is an error.

**--rpc-url** _URL_

> JSON-RPC endpoint. Overrides `blockchain.rpc_url`.

**--chain-id** _ID_

> EIP-712 chain id. Overrides `blockchain.chain_id` and otherwise defaults to Arbitrum Sepolia (**421614**). Signatures are rejected on-chain when this does not match the deployment. **publish** and **setup** also read the RPC's own chain id and refuse to submit on a mismatch.

**--data-dir** _DIR_

> Directory holding `node.secret`. Overrides `identity.data_dir`. Node-shaped commands default to **~/.decdn**. **get** and **pool** default to **~/.decdn/client** so a client install is not treated as a node.

**--dry-run**

> On chain commands, print what would be submitted and send nothing. On a bundle **get**, list the entries and exit without network or chain activity.

**--json**

> Emit JSON instead of the human-readable report.

# CONFIGURATION

**~/.decdn/node.toml**

> Default operator and daemon config, created by **decdn config init**. Holds the chain RPC, contract addresses, identity paths, cache settings, and an optional origin backend.

**~/.decdn/client.toml**

> Fetch-only config from **decdn config init --client --output ~/.decdn/client.toml**. Point **get** at it with **--config**.

**~/.decdn**

> Default node data directory: `node.secret` and `keystore.json`.

**~/.decdn/client**

> Default client data directory. The spending keystore and the buyer-pool store live here, separate from a node identity on the same machine.

**DECDN_KEYSTORE_PASSWORD**

> Keystore password for non-interactive commands. Checked before **--keystore-password-file**.

A flag overrides the config file. **~/** at the start of a path is expanded to the home directory.

# CAVEATS

**get** spends USDC from a payment pool the wallet owns. It reuses an open pool or creates one, and it can top that pool up on-chain without another prompt when the balance runs low. Fund the wallet only with what you are willing to spend.

The public deployment is a testnet on Arbitrum Sepolia. Wire format, contract ABI, config, and on-disk storage can change without a compatibility shim until mainnet on Arbitrum One.

**node evict** is permanent for that daemon: it will not serve the hash again and will not fetch it again. The bytes can remain in the blob store until the next cache garbage-collection sweep.

**--select** needs an interactive terminal and cannot be combined with **--json** or **--dry-run**.

# HISTORY

deCDN is written in Rust. Its public testnet on Arbitrum Sepolia opened in October 2026. The intended production chain is Arbitrum One.

# SEE ALSO

[decdn-node](/man/decdn-node)(8), [sponsord](/man/sponsord)(8)

# RESOURCES

```[Source code](https://github.com/decdn/decdn)```

```[Homepage](https://decdn.org)```

```[Documentation](https://docs.decdn.org)```

<!-- verified: 2026-10-15 -->
