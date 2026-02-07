# TAGLINE

Bitcoin Core full node daemon

# TLDR

**Start** Bitcoin daemon

```bitcoind -daemon```

**Start** with configuration

```bitcoind -conf=[bitcoin.conf]```

**Stop** daemon

```bitcoin-cli stop```

**Run** in foreground

```bitcoind```

# SYNOPSIS

**bitcoind** [_options_]

# DESCRIPTION

**bitcoind** is the Bitcoin Core daemon. It maintains a full copy of the Bitcoin blockchain, validates transactions and blocks, and can serve as a wallet. The daemon provides RPC and REST interfaces for interaction.

Running a full node contributes to Bitcoin network decentralization and allows trustless validation of transactions.

# PARAMETERS

**-daemon**
> Run as background daemon

**-conf=**_file_
> Configuration file path

**-datadir=**_dir_
> Data directory

**-testnet**
> Use testnet

**-regtest**
> Regression test mode

**-prune=**_n_
> Enable pruning (keep only N MB)

**-txindex**
> Maintain full transaction index

**-rpcuser=**_user_
> RPC username

**-rpcpassword=**_pass_
> RPC password

**-rpcport=**_port_
> RPC port

# CONFIGURATION

**~/.bitcoin/bitcoin.conf**
> Main configuration file for daemon mode, RPC credentials, network selection, pruning, and indexing options.

# SYSTEM REQUIREMENTS

- **Disk**: ~500 GB (full blockchain)
- **RAM**: 2 GB minimum, 4 GB recommended
- **Network**: Unlimited or high cap
- **Bandwidth**: ~20 GB/month upload

# FEATURES

- Full blockchain validation
- Wallet functionality
- Mining support (via external miners)
- RPC/REST APIs
- Pruning mode (reduced storage)
- Testnet/regtest support
- ZMQ notifications

# WORKFLOW

```bash
# Start daemon
bitcoind -daemon

# Check status
bitcoin-cli getblockchaininfo

# Wait for sync (can take days)
bitcoin-cli getblockcount

# Stop daemon
bitcoin-cli stop
```

# CAVEATS

Initial sync takes days/weeks. Large disk space required (unless pruned). High bandwidth usage. Keep wallet.dat backed up securely. RPC should not be exposed to internet. Requires consistent uptime for full node benefits.

# HISTORY

**bitcoind** was created by Satoshi Nakamoto as part of the original Bitcoin software in **2009**, serving as the reference implementation of the Bitcoin protocol.

# SEE ALSO

[bitcoin-cli](/man/bitcoin-cli)(1), [bitcoin-qt](/man/bitcoin-qt)(1)
