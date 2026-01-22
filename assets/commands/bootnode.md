# TLDR

**Generate a node key**

```bootnode -genkey [node.key]```

**Run a bootnode** with existing key

```bootnode -nodekey [node.key]```

**Run on specific address** and port

```bootnode -nodekey [node.key] -addr [192.168.1.1:30303]```

**Write node URL** to file

```bootnode -nodekey [node.key] -writeaddress```

**Run with verbosity**

```bootnode -nodekey [node.key] -verbosity [4]```

# SYNOPSIS

**bootnode** [_options_]

# DESCRIPTION

**bootnode** runs a bootstrap node for the Ethereum Discovery Protocol. Bootstrap nodes help new nodes discover and connect to peers in the Ethereum network without being full nodes themselves.

The tool is part of the go-ethereum (geth) project and implements the Node Discovery Protocol v4 and v5, enabling peer-to-peer network formation.

# PARAMETERS

**-genkey** _file_
> Generate a new node key and save to file

**-nodekey** _file_
> Path to the node's private key file

**-addr** _ip:port_
> Listen address (default: :30301)

**-writeaddress**
> Write the node's public key/URL to stdout

**-verbosity** _level_
> Logging verbosity (0=silent, 5=detail)

**-nat** _method_
> NAT port mapping mechanism (none, upnp, pmp, extip:IP)

**-netrestrict** _CIDR_
> Restrict network communication to given CIDR

**-v5**
> Enable Discovery v5 protocol

# CAVEATS

Bootnodes should have stable, publicly reachable IP addresses. The node key must be kept secure as it identifies the node. Bootnodes do not participate in blockchain consensus or store chain data.

# HISTORY

bootnode was developed as part of the **go-ethereum** project by the Ethereum Foundation. It implements the Kademlia-like discovery protocol that enables Ethereum's peer-to-peer network to function without centralized coordination.

# SEE ALSO

[geth](/man/geth)(1), [enode](/man/enode)(1)
