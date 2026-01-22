# TLDR

**Get** blockchain info

```bitcoin-cli getblockchaininfo```

**Get** wallet balance

```bitcoin-cli getbalance```

**Send** Bitcoin

```bitcoin-cli sendtoaddress [address] [amount]```

**Get** new address

```bitcoin-cli getnewaddress```

**List** transactions

```bitcoin-cli listtransactions```

# SYNOPSIS

**bitcoin-cli** [_options_] _command_ [_params_]

# DESCRIPTION

**bitcoin-cli** is the command-line interface for Bitcoin Core. It connects to a running bitcoind daemon via RPC and allows querying blockchain data, managing wallets, and performing transactions.

The tool is essential for interacting with Bitcoin Core nodes programmatically or from scripts.

# PARAMETERS

**-conf=**_file_
> Configuration file

**-datadir=**_dir_
> Data directory

**-rpcuser=**_user_
> RPC username

**-rpcpassword=**_pass_
> RPC password

**-rpcconnect=**_host_
> RPC host (default: localhost)

**-rpcport=**_port_
> RPC port (default: 8332)

**-testnet**
> Use testnet

**-regtest**
> Use regression test network

# COMMON COMMANDS

**Blockchain:**
- **getblockchaininfo** - Chain information
- **getblock** - Get block data
- **getblockhash** - Get block hash by height

**Wallet:**
- **getbalance** - Wallet balance
- **getnewaddress** - Generate new address
- **sendtoaddress** - Send Bitcoin
- **listtransactions** - List transactions

**Network:**
- **getpeerinfo** - Connected peers
- **getnetworkinfo** - Network information

# WORKFLOW

```bash
# Check blockchain sync status
bitcoin-cli getblockchaininfo

# Get balance
bitcoin-cli getbalance

# Generate new receiving address
bitcoin-cli getnewaddress

# Send Bitcoin
bitcoin-cli sendtoaddress "1ABC..." 0.1

# List recent transactions
bitcoin-cli listtransactions "*" 10
```

# CAVEATS

Requires bitcoind running. RPC credentials needed. Transactions are irreversible. Testnet for testing only. Wallet operations can lose funds if misconfigured. Keep RPC credentials secure.

# HISTORY

**bitcoin-cli** has been part of Bitcoin Core since the project's creation by Satoshi Nakamoto in **2009**, providing command-line access to the node.

# SEE ALSO

[bitcoind](/man/bitcoind)(1), [bitcoin-qt](/man/bitcoin-qt)(1)
