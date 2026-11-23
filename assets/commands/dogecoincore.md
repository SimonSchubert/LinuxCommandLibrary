# TAGLINE

Dogecoin Core daemon and CLI client

# TLDR

**Start the Dogecoin daemon**

```dogecoind -daemon```

**Get blockchain info**

```dogecoin-cli getblockchaininfo```

**Show network status**, version, and peer connections

```dogecoin-cli getnetworkinfo```

**Generate a new receiving address**

```dogecoin-cli getnewaddress```

**Get wallet balance**

```dogecoin-cli getbalance```

**Send Dogecoin to an address**

```dogecoin-cli sendtoaddress "[address]" [amount]```

**Start a pruned node** keeping about 2 GB of block data

```dogecoind -daemon -prune=[2200]```

**Stop the daemon**

```dogecoin-cli stop```

# SYNOPSIS

**dogecoind** [_options_]

**dogecoin-cli** [_options_] _command_ [_params_]

# PARAMETERS

**-daemon**
> Run dogecoind in the background as a daemon.

**-testnet**
> Use the test network.

**-regtest**
> Use a private regression test network for development.

**-datadir** _DIR_
> Specify data directory.

**-conf** _FILE_
> Specify configuration file.

**-rpcuser** _USER_
> Username for JSON-RPC connections.

**-rpcpassword** _PASS_
> Password for JSON-RPC connections.

**-rpcport** _PORT_
> Listen for JSON-RPC connections on this port (default: 22555, testnet: 44555).

**-server**
> Accept command-line and JSON-RPC commands.

**-port** _PORT_
> Listen for peer connections on this port (default: 22556).

**-prune** _MiB_
> Reduce storage by deleting old blocks, keeping roughly the given size (minimum 2200).

**-txindex**
> Maintain a full transaction index, needed for **getrawtransaction** on arbitrary transactions.

**-reindex**
> Rebuild the chain state and block index from the blk*.dat files on disk.

**-printtoconsole**
> Send trace and debug output to the console instead of debug.log.

**-help**
> Display help information.

**-version**
> Display version information.

# DESCRIPTION

**Dogecoin Core** consists of **dogecoind**, the full node daemon that validates and relays transactions on the Dogecoin network, and **dogecoin-cli**, a command-line client for interacting with the daemon via JSON-RPC.

The CLI supports wallet operations (sending, receiving, balance queries), blockchain queries, network management, and mining controls. Configuration is stored in **dogecoin.conf** inside the data directory (**~/.dogecoin/** on Linux). Options are given as **-name=value** on the command line or **name=value** in the config file.

# CAVEATS

Running a full node requires downloading the entire Dogecoin blockchain. The daemon must be running for dogecoin-cli to work. The 1.14.x series is based on Bitcoin Core 0.14, so newer Bitcoin Core RPCs and options (e.g. descriptor wallets, multiwallet) are not available. **-prune** is incompatible with **-txindex**.

# SEE ALSO

[bitcoind](/man/bitcoind)(1), [bitcoin-cli](/man/bitcoin-cli)(1), [electrum](/man/electrum)(1), [geth](/man/geth)(1)

# RESOURCES

```[Source code](https://github.com/dogecoin/dogecoin)```

```[Homepage](https://dogecoin.com)```

<!-- verified: 2026-11-23 -->

