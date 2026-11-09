# TAGLINE

Ethereum network bootstrap node

# TLDR

**Generate a node key**

```bootnode -genkey [node.key]```

**Run a bootnode** with existing key

```bootnode -nodekey [node.key]```

**Run on specific address** and port

```bootnode -nodekey [node.key] -addr [192.168.1.1:30301]```

**Write node URL** to file

```bootnode -nodekey [node.key] -writeaddress```

**Run with verbosity**

```bootnode -nodekey [node.key] -verbosity [4]```

# SYNOPSIS

**bootnode** [_options_]

# DESCRIPTION

**bootnode** runs a bootstrap node for the Ethereum Discovery Protocol. Bootstrap nodes help new nodes discover and connect to peers in the Ethereum network without being full nodes themselves.

The tool was part of the go-ethereum (geth) project until its removal in v1.15.0. It implements the Node Discovery Protocol v4 and v5, enabling peer-to-peer network formation.

# PARAMETERS

**-genkey** _file_
> Generate a new node key and save to file

**-nodekey** _file_
> Path to the node's private key file

**-nodekeyhex** _hex_
> Private key as hex (for testing)

**-addr** _ip:port_
> Listen address (default: :30301)

**-writeaddress**
> Write out the node's public key and quit

**-verbosity** _level_
> Logging verbosity, 0 to 5 (default: 3)

**-vmodule** _pattern_
> Per-module log verbosity pattern

**-nat** _method_
> NAT port mapping mechanism (any, none, upnp, pmp, pmp:IP, extip:IP; default: none)

**-netrestrict** _CIDR_
> Restrict network communication to given CIDR

**-v5**
> Enable Discovery v5 protocol

# CAVEATS

Bootnodes should have stable, publicly reachable IP addresses. The node key must be kept secure as it identifies the node. Bootnodes do not participate in blockchain consensus or store chain data. The **bootnode** utility was removed in go-ethereum v1.15.0 and is only available in older releases (last in the v1.14 series). Use **devp2p** from the same project instead, for example **devp2p key generate** and **devp2p discv5 listen**.

# HISTORY

bootnode was developed as part of the **go-ethereum** project by the Ethereum Foundation. It implements the Kademlia-like discovery protocol that enables Ethereum's peer-to-peer network to function without centralized coordination.

# SEE ALSO

[geth](/man/geth)(1)

# RESOURCES

```[Source code](https://github.com/ethereum/go-ethereum)```

```[Homepage](https://geth.ethereum.org/)```

```[Documentation](https://geth.ethereum.org/docs)```

<!-- verified: 2026-11-09 -->
