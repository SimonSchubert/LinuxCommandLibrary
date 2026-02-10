# TAGLINE

tezos baking daemon

# TLDR

**Start baker**

```octez-baker-[protocol] run with local node [~/.tezos-node] [baker_alias]```

**Run with RPC endpoint**

```octez-baker-[protocol] --endpoint [http://localhost:8732] run with local node [data_dir] [baker]```

**Run with votes**

```octez-baker-[protocol] run with local node [data_dir] [baker] --liquidity-baking-toggle-vote [pass]```

**List known bakers**

```octez-baker-[protocol] list known addresses```

# SYNOPSIS

**octez-baker-_protocol_** [_options_] _command_

# PARAMETERS

**run**
> Run the baker daemon.

**--endpoint** _uri_
> Node RPC endpoint.

**--liquidity-baking-toggle-vote** _vote_
> on, off, or pass.

**with local node** _dir_
> Node data directory.

# DESCRIPTION

**octez-baker** is the Tezos baking daemon. Bakers create new blocks and participate in consensus. The baker monitors the blockchain and produces blocks when selected.

The command name includes the protocol version (e.g., octez-baker-PtParisA).

# REQUIREMENTS

```
- Running octez-node
- Registered baker key
- Sufficient stake
- Key imported to client
```

# CAVEATS

Requires registered delegate. Protocol-specific binary. Needs synchronized node. Stake requirements apply.

# HISTORY

The Tezos baker is part of the **Tezos** blockchain developed by **Arthur and Kathleen Breitman**, using liquid proof-of-stake consensus.

# SEE ALSO

[octez-node](/man/octez-node)(1), [octez-client](/man/octez-client)(1), [octez-accuser](/man/octez-accuser)(1)
