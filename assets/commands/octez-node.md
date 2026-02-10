# TAGLINE

tezos blockchain node

# TLDR

**Start node**

```octez-node run```

**Initialize configuration**

```octez-node config init --network=[mainnet]```

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

**--rpc-addr** _addr_
> RPC listen address.

**--network** _name_
> mainnet, ghostnet, etc.

**--data-dir** _dir_
> Data directory.

# DESCRIPTION

**octez-node** is the Tezos blockchain node. It connects to the Tezos network, validates blocks, and provides RPC access for clients, bakers, and applications.

The node stores blockchain data and participates in peer-to-peer networking.

# STORAGE MODES

```
full    - Full block history
rolling - Recent blocks only
archive - All history + contexts
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

[octez-client](/man/octez-client)(1), [octez-baker](/man/octez-baker)(1), [tezos](/man/tezos)(7)
