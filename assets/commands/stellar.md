# TAGLINE

Build, sign, and deploy on the Stellar network

# TLDR

**Build** contracts in the current workspace

```stellar contract build```

**Create** an identity and fund it on testnet

```stellar keys generate [alice] -n testnet --fund```

**Deploy** a compiled contract

```stellar contract deploy --wasm [path/to/contract.wasm] --source [alice] --network testnet```

**Call** a contract function

```stellar contract invoke --contract-id [ID] --source [alice] --network testnet -- --hello```

**List** configured networks

```stellar network ls```

Print a **shell completion** script

```stellar completion --shell [bash]```

Show the **version**

```stellar -V```

# SYNOPSIS

**stellar** [_OPTIONS_] _COMMAND_

# DESCRIPTION

**stellar** is the command-line client for the Stellar network. The binary name is `stellar`. The Rust package is `stellar-cli`. It builds Soroban contracts, manages identities and networks, signs and sends transactions, and talks to a local network container.

Top-level commands:

- `contract` — compile, deploy, invoke, and inspect smart contracts
- `doctor` — check the local setup
- `events` — read contract events
- `env` — environment helpers
- `keys` — identities
- `network` — named networks, including `network ls`
- `container` — local networks
- `config` — client configuration
- `snapshot` — ledger snapshots
- `token` — SEP-41 / SAC tokens
- `tx` — sign, simulate, and send transactions
- `xdr` — encode and decode XDR
- `strkey` — StrKey helpers
- `completion` — shell completion
- `cache` — local cache
- `version` — version
- `skill` — print a guide meant for an AI agent
- `plugin` — plugins
- `ledger` — ledger queries
- `message` — SEP-53 sign and verify
- `fees` — fee stats
- `fee-stats` — deprecated name of `fees stats`

Global options:

- `--config-dir` — configuration directory. The default is `~/.config/stellar`, or the `stellar` directory under XDG config home
- `-f`, `--filter-logs` — log filter. The same filter is read from the Rust log variable
- `-q`, `--quiet`
- `-v`, `--verbose`
- `--very-verbose` (also `vv`)
- `--no-cache`

Each command has its own flags. `stellar contract --help` and the same form for the other commands print them.

# CAVEATS

`--fund` and deploy commands submit transactions. A network name of `mainnet` spends real lumens. `fee-stats` is deprecated in favor of `fees stats`.

Distro packages named `stellar` are often the unrelated stellar-core daemon. This client is the `stellar-cli` package when a distribution ships it under that name.

# CONFIGURATION

Configuration lives in the directory from `--config-dir`. Identities created with `keys generate` and networks added with the `network` command are stored there.

# INSTALL

```brew: brew install stellar-cli```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/stellar/stellar-cli)```

```[Homepage](https://stellar.org)```

```[Documentation](https://developers.stellar.org/docs/tools/developer-tools/cli/stellar-cli)```

<!-- verified: 2026-11-17 -->
