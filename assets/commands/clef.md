# TAGLINE

standalone Ethereum account manager and transaction signer

# TLDR

**Initialize clef** for the first time with a master seed

```clef init```

**Start clef** on mainnet with default settings

```clef```

**Start clef on the Sepolia** testnet with a custom keystore

```clef --chainid 11155111 --keystore [path/to/keystore]```

**Start clef with a custom** configuration directory

```clef --configdir [path/to/clef/config]```

**Start clef with automatic** rule-based transaction approval

```clef --rules [path/to/rules.js]```

**Set a password** for a keystore account

```clef setpw [0xaddress]```

**Start clef in stdio mode** for external signing requests

```clef --stdio-ui```

**Create a new account**

```clef newaccount```

# SYNOPSIS

**clef** [_options_] [_command_]

# SUBCOMMANDS

**init**
> Initialize the signer, generating a master seed and creating necessary directories.

**attest**
> Attest that a JavaScript rules file is to be used (stores the sha256 hash).

**setpw**
> Store a credential for a keystore file.

**delpw**
> Remove a credential for a keystore file.

**newaccount**
> Create a new account.

**gendoc**
> Generate documentation about the JSON-RPC format.

# PARAMETERS

**--keystore** _DIR_
> Directory for the keystore (default: $HOME/.ethereum/keystore).

**--configdir** _DIR_
> Directory for Clef configuration (default: $HOME/.clef).

**--chainid** _ID_
> Chain ID for transaction signing (default: 1). Common values: 1=mainnet, 11155111=sepolia.

**--rules** _FILE_
> Path to JavaScript rules file for automatic transaction approval.

**--stdio-ui**
> Use standard input/output for user interface (for integration with external tools).

**--ipcpath** _PATH_
> Filename for IPC socket/pipe.

**--ipcdisable**
> Disable the IPC-RPC server.

**--http**
> Enable HTTP-RPC server for remote signing requests.

**--http.addr** _ADDR_
> HTTP server listening address (default: localhost).

**--http.port** _PORT_
> HTTP server listening port (default: 8550).

**--http.vhosts** _HOSTS_
> Comma-separated list of virtual hostnames (default: localhost).

**--signersecret** _FILE_
> File containing the encrypted master seed.

**--auditlog** _FILE_
> File for audit logs (default: audit.log).

**--loglevel** _LEVEL_
> Log level to emit to the screen (default: 4).

**--lightkdf**
> Reduce key-derivation RAM and CPU usage at some expense of KDF strength.

**--advanced**
> Issue warnings instead of rejections for advanced operations.

**--suppress-bootwarn**
> Suppress the boot warning display.

**--help**
> Display help information.

# DESCRIPTION

**Clef** is a standalone Ethereum account management and signing tool from the go-ethereum project. It provides secure storage of private keys and transaction signing capabilities separate from the main Ethereum client.

Clef acts as a signing oracle that can approve or reject transaction signing requests. It supports hardware wallets, encrypted keystores, and can run in a detached mode where a JavaScript rules engine automatically processes signing requests based on predefined policies.

The tool is designed for enhanced security by isolating key management from network-facing components. It can serve multiple clients through IPC or HTTP interfaces, making it suitable for both individual use and as part of larger infrastructure deployments.

# CAVEATS

Clef requires careful backup of the master seed created during initialization. Lost seeds cannot be recovered. The HTTP interface should only be enabled with proper firewall rules in production environments. Rules-based automatic signing requires thorough security auditing.

# HISTORY

Clef was introduced by the **go-ethereum** (Geth) team in **2018** as part of an effort to improve Ethereum account security. It was designed to replace the integrated account management in Geth with a more secure, standalone signing solution that reduces attack surface.

# SEE ALSO

[geth](/man/geth)(1)
