# TAGLINE

privacy-focused Bitcoin wallet with CoinJoin

# TLDR

**Start the wallet GUI**

```wassabee```

**Start the headless daemon**

```wassabeed```

**Start the daemon on testnet**

```wassabeed --network testnet```

**Specify a custom data directory**

```wassabeed --datadir [/path/to/data]```

# SYNOPSIS

**wassabee** [_options_]

**wassabeed** [_options_]

# PARAMETERS

**--network** _NETWORK_
> Bitcoin network to use (main, testnet, regtest).

**--datadir** _DIR_
> Custom data directory path.

**--jsonrpcserverenabled** _BOOL_
> Enable JSON-RPC server for remote control.

**--jsonrpcserverprefix** _URL_
> JSON-RPC server URL prefix.

**--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**Wasabi Wallet** is an open-source, privacy-focused Bitcoin wallet that implements **CoinJoin** for transaction anonymization. It uses the **WabiSabi** protocol for trustless, coordinator-based coin mixing.

The wallet can run as a graphical application (**wassabee**) or as a headless daemon (**wassabeed**) for server deployments. The daemon exposes a JSON-RPC interface for programmatic wallet control. All connections are routed through **Tor** by default for network-level privacy.

# CAVEATS

CoinJoin transactions require a minimum amount and incur coordinator fees. Tor is bundled and used by default. Written in C# (.NET).

# SEE ALSO

[electrum](/man/electrum)(1), [lnd](/man/lnd)(1)

