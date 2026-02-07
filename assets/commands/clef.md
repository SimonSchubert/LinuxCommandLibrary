# TAGLINE

standalone Ethereum account manager and transaction signer

# TLDR

**Start clef** with default settings

```clef```

**Initialize clef** for the first time with a master seed

```clef init```

**Start clef on a specific** network (mainnet, sepolia, etc.)

```clef --chainid [1]```

**Start clef with a custom** keystore directory

```clef --keystore [path/to/keystore]```

**List all accounts** managed by clef

```clef --list```

**Start clef with advanced rules** engine enabled

```clef --rules [path/to/rules.js]```

**Start clef in stdio mode** for external signing requests

```clef --stdio-ui```

# SYNOPSIS

**clef** [_options_] [_command_]

# PARAMETERS

**init**
> Initialize the signer, generating a master seed and creating necessary directories.

**--keystore** _DIR_
> Directory for the keystore containing encrypted account keys.

**--chainid** _ID_
> Chain ID for transaction signing (1=mainnet, 11155111=sepolia).

**--rules** _FILE_
> Path to JavaScript rules file for automatic transaction approval.

**--stdio-ui**
> Use standard input/output for user interface (for integration with external tools).

**--ipcpath** _PATH_
> Path for the IPC endpoint.

**--http**
> Enable HTTP-RPC server for remote signing requests.

**--http.addr** _ADDR_
> HTTP server listening address (default: localhost).

**--http.port** _PORT_
> HTTP server listening port (default: 8550).

**--list**
> List all accounts in the keystore.

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

[geth](/man/geth)(1), [ethkey](/man/ethkey)(1)
