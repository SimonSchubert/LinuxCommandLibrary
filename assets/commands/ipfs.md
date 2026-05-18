# TAGLINE

InterPlanetary File System distributed peer-to-peer CLI

# TLDR

**Initialize IPFS repository**

```ipfs init```

**Start IPFS daemon**

```ipfs daemon```

**Add file to IPFS**

```ipfs add [file]```

**Add directory recursively**

```ipfs add -r [directory]```

**Get file by CID**

```ipfs get [CID]```

**View file contents**

```ipfs cat [CID]```

**Pin a file**

```ipfs pin add [CID]```

**List pinned files**

```ipfs pin ls```

**Show node info**

```ipfs id```

# SYNOPSIS

**ipfs** _command_ [_options_]

# SUBCOMMANDS

**init**
> Initialize local repository.

**daemon**
> Start IPFS daemon.

**add** _file_
> Add file to IPFS.

**get** _cid_
> Download file by CID.

**cat** _cid_
> Display file contents.

**pin add** _cid_
> Pin content locally.

**pin ls**
> List pinned content.

**id**
> Show node identity.

**swarm peers**
> List connected peers.

**files**
> Manage MFS (Mutable File System).

# PARAMETERS

**-r**, **--recursive**
> Add directories recursively.

**-q**, **--quiet**
> Minimal output.

**-w**, **--wrap-with-directory**
> Wrap files in directory.

# DESCRIPTION

**ipfs** is the command-line interface for the **Kubo** implementation of the InterPlanetary File System, a peer-to-peer content-addressed storage and distribution network. Each file or block is identified by a CID (Content Identifier) derived from the cryptographic hash of its contents, so the same data is reachable from any node that holds it without requiring a fixed host or URL.

A local **ipfs daemon** acts as a gateway between the user and the global IPFS swarm: it dials peers, fetches blocks, pins content for long-term retention, and exposes both an HTTP gateway and a JSON-RPC API. The **add** subcommand stores files in the local datastore and prints the resulting CID; **cat** and **get** retrieve content; **pin add** keeps content from being garbage-collected; and **files** offers a POSIX-like mutable filesystem (MFS) layered on top of immutable IPLD objects.

# CAVEATS

A daemon must be running for most subcommands; **ipfs init** must be called once per user to create the configuration in **~/.ipfs/**. Content is not private by default - anyone who knows a CID can fetch the underlying data through any IPFS node. The default port allocation (4001 TCP/UDP for swarm, 5001 for API, 8080 for gateway) needs to be firewall-friendly for good connectivity.

# HISTORY

**IPFS** was proposed by **Juan Benet** at **Protocol Labs** in a **2014** whitepaper. The first reference implementation in Go (later renamed **Kubo**) reached **0.4.0** in **2016** and **1.0.0** in **2023**. A Rust implementation (**iroh**) and a JavaScript implementation (**js-ipfs**, later **Helia**) followed.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [rsync](/man/rsync)(1)

