# TAGLINE

Graphical interface for Bitcoin Core

# TLDR

**Start Bitcoin Core** with graphical interface

```bitcoin-qt```

**Start on testnet**

```bitcoin-qt -testnet```

**Start with specific data directory**

```bitcoin-qt -datadir=[/path/to/data]```

**Start with limited connections**

```bitcoin-qt -maxconnections=[8]```

**Start in prune mode** to save disk space

```bitcoin-qt -prune=[550]```

**Start minimized** to system tray

```bitcoin-qt -min```

**Start without splash screen**

```bitcoin-qt -splash=0```

**Reset GUI settings**

```bitcoin-qt -resetguisettings```

# SYNOPSIS

**bitcoin-qt** [_options_]

# DESCRIPTION

**bitcoin-qt** is the graphical user interface for Bitcoin Core, the reference implementation of the Bitcoin protocol. It provides a full Bitcoin node with wallet functionality and a user-friendly interface for sending, receiving, and managing Bitcoin.

Running bitcoin-qt downloads and verifies the entire Bitcoin blockchain (several hundred gigabytes). It connects to the Bitcoin peer-to-peer network, validates transactions and blocks, and relays them to other nodes.

The wallet features include address generation, transaction history, coin control, and fee estimation. It supports multiple wallets, watch-only addresses, and hardware wallet integration.

# PARAMETERS

**-datadir=** _path_
> Specify data directory.

**-testnet**
> Use the test network.

**-regtest**
> Enter regression test mode.

**-prune=** _n_
> Reduce storage by deleting old blocks (MB).

**-maxconnections=** _n_
> Limit peer connections.

**-proxy=** _ip:port_
> Connect through SOCKS5 proxy.

**-onion=** _ip:port_
> Use separate proxy for Tor.

**-listen**
> Accept incoming connections.

**-server**
> Accept JSON-RPC commands.

**-rpcuser=** _user_
> RPC username.

**-rpcpassword=** _pass_
> RPC password.

**-min**
> Start minimized.

**-splash=** _0|1_
> Show splash screen on startup.

**-resetguisettings**
> Reset GUI settings to defaults.

**-choosedatadir**
> Show data directory chooser on startup.

**-lang=** _lang_
> Set interface language.

# CONFIGURATION

**~/.bitcoin/bitcoin.conf**
> Bitcoin Core configuration file for network, RPC, wallet, and GUI settings.

# CAVEATS

Initial blockchain sync takes hours to days depending on hardware and network. Full node requires 500+ GB disk space (or use pruning). High bandwidth usage during sync and operation. Wallet file (wallet.dat) should be backed up securely. Running on mainnet involves real money.

# HISTORY

**Bitcoin Core** was originally written by **Satoshi Nakamoto** and released in **January 2009** as the first Bitcoin implementation. The graphical interface (bitcoin-qt) was added later using the Qt framework. After Satoshi's departure, development continued under lead maintainers including Gavin Andresen, Wladimir van der Laan, and others. It remains the reference implementation that defines Bitcoin protocol rules.

# SEE ALSO

[bitcoind](/man/bitcoind)(1), [bitcoin-cli](/man/bitcoin-cli)(1), [bitcoin-wallet](/man/bitcoin-wallet)(1)
