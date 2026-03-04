# TAGLINE

Bittensor blockchain CLI tool

# TLDR

**Check wallet balance**

```btcli wallet balance --wallet.name [default]```

**List** available subnets

```btcli subnets list```

**Register** on a subnet

```btcli subnets register --netuid [1] --wallet.name [default]```

**View** stake information

```btcli stake show --wallet.name [default]```

**Transfer** TAO tokens

```btcli wallet transfer --dest [address] --amount [1.0]```

# SYNOPSIS

**btcli** _command_ [_subcommand_] [_options_]

# DESCRIPTION

**btcli** is the command-line interface for the **Bittensor** decentralized machine learning network. It provides tools for managing wallets, staking TAO tokens, registering on subnets, and interacting with the Bittensor blockchain.

Bittensor is a protocol that creates a decentralized marketplace for machine intelligence, where miners provide computational resources and validators assess quality. The CLI is the primary tool for participants to manage their involvement in the network.

# CAVEATS

Requires a Bittensor wallet to be created before most operations. Blockchain operations involve real cryptocurrency and transaction fees. Network registration may require proof-of-work or recycled TAO. Always verify transaction details before confirming.

# SEE ALSO

[python](/man/python)(1)
