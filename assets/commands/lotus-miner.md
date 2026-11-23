# TAGLINE

Filecoin storage provider CLI

# TLDR

**Initialize a new miner** with an owner wallet and sector size

```lotus-miner init --owner=[wallet_address] --worker=[wallet_address] --sector-size=[32GiB]```

**Start the miner daemon**

```lotus-miner run```

**Check miner status**

```lotus-miner info```

**List sectors**

```lotus-miner sectors list```

**Show sector status**

```lotus-miner sectors status [sectorNumber]```

**Pledge** a committed-capacity sector

```lotus-miner sectors pledge```

**Attach a storage path** for long-term sector storage

```lotus-miner storage attach --init --store [/path/to/storage]```

**Show proving deadlines**

```lotus-miner proving deadlines```

**List running sealing jobs**

```lotus-miner sealing jobs```

# SYNOPSIS

**lotus-miner** [_global options_] _command_ [_command options_]

# PARAMETERS

**init**
> Initialize a lotus miner repo and create the miner actor on chain (**init restore** restores from a backup).

**run**
> Start the storage miner daemon.

**stop**
> Stop the running miner daemon.

**info**
> Display miner information and status.

**actor**
> Manipulate the miner actor (addresses, owner, worker, withdraw funds).

**config**
> Manage node configuration.

**backup**
> Create a metadata backup.

**sectors**
> Inspect and manage sectors (list, status, pledge, extend, terminate, remove).

**proving**
> View Window PoSt proving information (deadlines, faults, check).

**storage**
> Manage sector storage paths (attach, detach, list, find).

**sealing**
> Interact with the sealing pipeline (jobs, workers, abort).

**auth**
> Manage RPC permissions and tokens.

**log**
> Manage logging.

**fetch-params**
> Fetch proving parameters.

**-a**, **--actor** _ADDRESS_
> Specify another miner actor to query or manipulate.

**--miner-repo** _PATH_
> Miner repo path (default **~/.lotusminer**, env **LOTUS_MINER_PATH**).

**--help**, **-h**
> Show help.

**--version**, **-v**
> Print version.

# DESCRIPTION

**lotus-miner** is the storage provider component of the **Lotus** Filecoin implementation. It manages sector sealing, storage paths, and the Window PoSt and WinningPoSt proofs required to keep storage power on the Filecoin network.

The miner communicates with a running **lotus** daemon (full node) and handles pledging storage capacity, sealing sectors (optionally with separate **lotus-worker** processes), and submitting storage proofs to the blockchain.

# CAVEATS

Requires a synced **lotus** full node daemon. Storage mining requires significant disk space, a GPU for proof generation, and FIL for collateral and gas. Deal-making commands such as **storage-deals** were removed from lotus-miner in 2024 (Lotus v1.28) and are handled by separate software such as **Boost**. **Curio** is being developed as the successor that will eventually replace lotus-miner and lotus-worker. Written in Go.

# SEE ALSO

[ipfs](/man/ipfs)(1)

# RESOURCES

```[Source code](https://github.com/filecoin-project/lotus)```

```[Homepage](https://lotus.filecoin.io/)```

```[Documentation](https://lotus.filecoin.io/storage-providers/)```

<!-- verified: 2026-11-23 -->
