# TAGLINE

Dogecoin Core daemon and CLI client

# TLDR

**Start the Dogecoin daemon**

```dogecoind -daemon```

**Get blockchain info**

```dogecoin-cli getblockchaininfo```

**Get wallet balance**

```dogecoin-cli getbalance```

**Send Dogecoin to an address**

```dogecoin-cli sendtoaddress "[address]" [amount]```

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

**-datadir** _DIR_
> Specify data directory.

**-conf** _FILE_
> Specify configuration file.

**-rpcuser** _USER_
> Username for JSON-RPC connections.

**-rpcpassword** _PASS_
> Password for JSON-RPC connections.

**-rpcport** _PORT_
> Listen for JSON-RPC connections on this port.

**-help**
> Display help information.

**-version**
> Display version information.

# DESCRIPTION

**Dogecoin Core** consists of **dogecoind**, the full node daemon that validates and relays transactions on the Dogecoin network, and **dogecoin-cli**, a command-line client for interacting with the daemon via JSON-RPC.

The CLI supports wallet operations (sending, receiving, balance queries), blockchain queries, network management, and mining controls. Configuration is stored in **dogecoin.conf**.

# CAVEATS

Running a full node requires downloading the entire Dogecoin blockchain. The daemon must be running for dogecoin-cli to work. Based on Bitcoin Core.

# SEE ALSO

[electrum](/man/electrum)(1), [geth](/man/geth)(1)

