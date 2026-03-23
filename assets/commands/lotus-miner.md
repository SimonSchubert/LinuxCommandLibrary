# TAGLINE

Filecoin storage provider CLI

# TLDR

**Initialize a new miner**

```lotus-miner init```

**Start the miner daemon**

```lotus-miner run```

**Check miner status**

```lotus-miner info```

**List storage deals**

```lotus-miner storage-deals list```

**Show sector status**

```lotus-miner sectors status [sectorNumber]```

# SYNOPSIS

**lotus-miner** [_command_] [_options_]

# PARAMETERS

**init**
> Initialize a new storage miner.

**run**
> Start the storage miner daemon.

**info**
> Display miner information and status.

**stop**
> Stop the running miner daemon.

**config**
> Manage miner configuration.

**storage-deals**
> Manage storage deals.

**sectors**
> Manage and inspect sectors.

**auth**
> Manage RPC authentication tokens.

**backup**
> Create a metadata backup.

**--help**, **-h**
> Show help.

**--version**, **-v**
> Print version.

# DESCRIPTION

**lotus-miner** is the storage provider component of the **Lotus** Filecoin implementation. It manages the lifecycle of storage deals, sector sealing, and proof generation for participating as a storage provider on the Filecoin network.

The miner communicates with a running **lotus** daemon (full node) and handles pledging storage capacity, accepting storage deals from clients, and submitting storage proofs to the blockchain.

# CAVEATS

Requires a running **lotus** full node daemon. Storage mining requires significant disk space, GPU for proof generation, and a pledged FIL balance. Written in Go.

# SEE ALSO

[cardano-node](/man/cardano-node)(1), [geth](/man/geth)(1)

