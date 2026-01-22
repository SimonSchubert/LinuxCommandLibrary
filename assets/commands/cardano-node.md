# TLDR

**Run a Cardano node** on mainnet

```cardano-node run --topology [path/to/topology.json] --database-path [path/to/db] --socket-path [path/to/node.socket] --config [path/to/config.json]```

**Run a node** with specific host and port

```cardano-node run --topology [topology.json] --database-path [db/] --socket-path [node.socket] --host-addr [127.0.0.1] --port [3001] --config [config.json]```

**Run a block-producing node** with keys

```cardano-node run --topology [topology.json] --database-path [db/] --socket-path [node.socket] --config [config.json] --shelley-kes-key [kes.skey] --shelley-vrf-key [vrf.skey] --shelley-operational-certificate [node.cert]```

**Run as a relay node** (non-producing)

```cardano-node run --non-producing-node --topology [topology.json] --database-path [db/] --socket-path [node.socket] --config [config.json]```

**Validate the database** before running

```cardano-node run --validate-db --topology [topology.json] --database-path [db/] --socket-path [node.socket] --config [config.json]```

# SYNOPSIS

**cardano-node** run [_options_]

**cardano-node** --version

**cardano-node** --help

# PARAMETERS

**--topology** _FILEPATH_
> Path to the topology.json file describing network peers

**--database-path** _FILEPATH_
> Directory where blockchain state is stored

**--socket-path** _FILEPATH_
> Path to the Unix domain socket for IPC communication

**--config** _FILEPATH_
> Path to the node configuration JSON file

**--host-addr** _IPV4_
> IPv4 address to bind for incoming connections

**--host-ipv6-addr** _IPV6_
> IPv6 address to bind for incoming connections

**--port** _PORT_
> Port number for listening to peer connections

**--shelley-kes-key** _FILEPATH_
> Path to the KES (Key Evolving Signature) signing key for block production

**--shelley-vrf-key** _FILEPATH_
> Path to the VRF (Verifiable Random Function) signing key

**--shelley-operational-certificate** _FILEPATH_
> Path to the operational certificate for stake pool

**--non-producing-node**
> Start as a relay node even if credentials are specified

**--validate-db**
> Validate all database files on startup

**--shutdown-on-slot-synced** _SLOT_
> Shut down after syncing to the specified slot number

**--shutdown-on-block-synced** _BLOCK_
> Shut down after syncing to the specified block number

**--shutdown-ipc** _FD_
> Shut down when the inherited file descriptor reaches EOF

**-h**, **--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**cardano-node** is the core component of the Cardano blockchain network, implementing the Ouroboros consensus protocol. It maintains a local copy of the blockchain, validates transactions, and participates in the peer-to-peer network.

The node can operate in two modes: as a relay node that forwards transactions and blocks, or as a block-producing node (stake pool) that creates new blocks when selected by the protocol. Block producers require KES keys, VRF keys, and an operational certificate.

Communication with the node happens through a Unix domain socket specified by **--socket-path**. The **cardano-cli** tool and other applications use the **CARDANO_NODE_SOCKET_PATH** environment variable to locate this socket for queries and transaction submission.

# CAVEATS

Running a full node requires significant disk space (over 100GB for mainnet) and memory. Initial synchronization can take many hours depending on hardware and network speed. The node must remain running and connected for stake pool operation. Configuration files must match the network (mainnet, preprod, preview) you intend to connect to.

# HISTORY

Cardano-node was developed by **Input Output Hong Kong (IOHK)** as part of the Cardano blockchain project founded by Charles Hoskinson. The project launched its mainnet in **September 2017** with the Byron era. Major upgrades include the **Shelley** era in **2020** introducing staking and decentralization, **Alonzo** in **2021** adding smart contracts, and continued development through the Basho and Voltaire eras. The node is written in **Haskell** and implements peer-reviewed cryptographic protocols.

# SEE ALSO

[cardano-cli](/man/cardano-cli)(1), [cardano-wallet](/man/cardano-wallet)(1)
