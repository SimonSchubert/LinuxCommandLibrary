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

**ipfs** is the command-line interface for the InterPlanetary File System, a distributed peer-to-peer file system. Files are identified by content-addressed CIDs (Content Identifiers) using cryptographic hashes. Content can be accessed through local nodes or public gateways like ipfs.io.

# SEE ALSO

[ipget](/man/ipget)(1), [wget](/man/wget)(1)

