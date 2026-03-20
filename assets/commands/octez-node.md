# TAGLINE

tezos blockchain node

# TLDR

**Start node**

```octez-node run```

**Initialize configuration** for a specific network

```octez-node config init --network=[mainnet]```

**Generate node identity**

```octez-node identity generate```

**Start with RPC enabled**

```octez-node run --rpc-addr=[127.0.0.1:8732]```

**Reconstruct storage**

```octez-node reconstruct```

**Snapshot export**

```octez-node snapshot export [snapshot.full]```

**Import from snapshot**

```octez-node snapshot import [snapshot.full]```

# SYNOPSIS

**octez-node** _command_ [_options_]

# PARAMETERS

**run**
> Run the node.

**config init**
> Initialize configuration.

**snapshot export**
> Export snapshot.

**snapshot import**
> Import snapshot.

**identity generate**
> Generate a new node identity (required on first launch).

**reconstruct**
> Reconstruct archive storage from full mode storage.

**--rpc-addr** _addr_
> RPC listen address (default: localhost:8732).

**--network** _name_
> Network to connect to (mainnet, ghostnet, etc.).

**--data-dir** _dir_
> Data directory (default: ~/.tezos-node).

**--history-mode** _mode_
> Storage mode: archive, full (default), or rolling.

**--connections** _num_
> Maximum number of peer connections.

**--net-addr** _addr_
> P2P listening address (default: [::]:9732).

# DESCRIPTION

**octez-node** is the Tezos blockchain node. It connects to the Tezos network, validates blocks, and provides RPC access for clients, bakers, and applications.

The node stores blockchain data and participates in peer-to-peer networking.

# STORAGE MODES

```
archive - All block history + full context (largest)
full    - All block headers, operations, but pruned contexts (default)
rolling - Only recent blocks and contexts (smallest)
```

# CONFIGURATION

```
~/.tezos-node/
├── config.json
├── context/
└── store/
```

# CAVEATS

Requires significant disk space. Initial sync takes time. Use snapshots for faster bootstrap.

# HISTORY

Tezos was created by **Arthur Breitman** and **Kathleen Breitman**, launching mainnet in **2018**. The node software was rebranded to Octez.

# SEE ALSO

[octez-client](/man/octez-client)(1), [octez-baker](/man/octez-baker)(1)
