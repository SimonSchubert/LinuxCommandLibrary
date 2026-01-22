# TLDR

**Start Electrum GUI**

```electrum```

**Create a new wallet**

```electrum create```

**Get wallet balance**

```electrum getbalance```

**List all addresses** in the wallet

```electrum listaddresses```

**Generate a new receiving address**

```electrum createnewaddress```

**Send Bitcoin** to an address

```electrum payto [address] [amount]```

**Start the daemon** for background operation

```electrum daemon start```

**Load a specific wallet** in the daemon

```electrum load_wallet -w [path/to/wallet]```

# SYNOPSIS

**electrum** [_options_] [_command_] [_args_]

**electrum** daemon [_start_|_stop_|_status_]

**electrum** [_-w wallet_] _command_

# PARAMETERS

**-w**, **--wallet** _PATH_
> Use wallet from specified path

**-o**, **--offline**
> Run in offline mode without network access

**-g**, **--gui** _GUI_
> Select user interface (qt, text)

**-s**, **--server** _HOST:PORT:PROTOCOL_
> Set server address

**-p**, **--proxy** _TYPE:HOST:PORT_
> Set proxy server

**-v**, **--verbose**
> Show debugging information

**-P**, **--portable**
> Use portable wallet mode

**-L**, **--lang** _LANGUAGE_
> Set default language for GUI

**--testnet**
> Use Bitcoin testnet

**--mainnet**
> Use Bitcoin mainnet (default)

**-a**, **--all**
> Show all addresses

**-h**, **--help**
> Show help message and exit

**--version**
> Show program version

# COMMANDS

**create**
> Create a new wallet

**restore**
> Restore wallet from seed

**getbalance**
> Display wallet balance

**listaddresses**
> List all wallet addresses

**createnewaddress**
> Generate a new receiving address

**getaddresshistory** _ADDRESS_
> Show transaction history for an address

**history**
> Show wallet transaction history

**payto** _ADDRESS_ _AMOUNT_
> Create and send a transaction

**broadcast** _TX_
> Broadcast a signed transaction

**signmessage** _ADDRESS_ _MESSAGE_
> Sign a message with an address

**verifymessage** _ADDRESS_ _SIGNATURE_ _MESSAGE_
> Verify a signed message

**commands**
> List all available commands

# DESCRIPTION

**electrum** is a lightweight Bitcoin wallet that connects to remote servers instead of downloading the entire blockchain. It supports both a graphical interface and command-line operations, making it suitable for desktop use and scripted automation.

The wallet uses hierarchical deterministic (HD) key generation from a mnemonic seed phrase, allowing full wallet recovery from the seed alone. It supports multi-signature wallets, hardware wallet integration (Trezor, Ledger), and watch-only wallets.

For command-line operations, the daemon can run in the background handling network communication while CLI commands interact with it. Some commands work offline without the daemon using the **-o** flag. The special argument **!** means "maximum amount available" and **-** reads from stdin.

# CAVEATS

Electrum connects to third-party servers that can see your addresses and transaction history, though they cannot access your funds. For maximum privacy, run your own Electrum server. The wallet file is encrypted by default but should be backed up securely. Hardware wallet integration requires additional packages.

# HISTORY

Electrum was created by **Thomas Voegtlin** and first released in **November 2011**. It was one of the first lightweight Bitcoin wallets, pioneering the use of SPV (Simplified Payment Verification) with remote servers. The name comes from the Latin word for amber, chosen because amber produces static electricity when rubbed. Electrum introduced the concept of seed phrases for wallet backup, which became a standard across the cryptocurrency industry.

# SEE ALSO

[bitcoin-cli](/man/bitcoin-cli)(1), [trezorctl](/man/trezorctl)(1)
