# TAGLINE

Ethereum blockchain interaction tool from Foundry

# TLDR

**Get the balance** of an address

```cast balance [0x...address] --rpc-url [https://eth-mainnet.g.alchemy.com/v2/key]```

**Call a contract function** (read-only)

```cast call [0x...contract] "balanceOf(address)" [0x...holder] --rpc-url [rpc_url]```

**Send a transaction**

```cast send [0x...contract] "transfer(address,uint256)" [0x...to] [amount] --rpc-url [rpc_url] --private-key [0x...]```

**Decode transaction input data**

```cast 4byte-decode [0x23b872dd...]```

**Convert wei to ether**

```cast from-wei [1000000000000000000]```

**Convert ether to wei**

```cast to-wei [1.5]```

**Get current gas price**

```cast gas-price --rpc-url [rpc_url]```

**Decode ABI-encoded data**

```cast abi-decode "transfer(address,uint256)" [0x...]```

**Lookup function signature**

```cast sig "transfer(address,uint256)"```

# SYNOPSIS

**cast** _subcommand_ [_options_]

# DESCRIPTION

**cast** is a command-line tool for interacting with Ethereum and EVM-compatible blockchains. It's part of the Foundry toolkit and provides utilities for querying blockchain state, sending transactions, encoding/decoding data, and performing conversions.

Cast can interact with deployed contracts by calling view functions or sending state-changing transactions. It handles ABI encoding/decoding, making it easy to work with smart contracts from the command line.

The tool also provides utilities for working with Ethereum data formats, including conversions between wei/ether, hex/decimal, and various encoding schemes. It integrates with Etherscan-like services for signature lookups.

# PARAMETERS

**call** _contract_ _sig_ [_args_]
> Call a contract function (read-only).

**send** _contract_ _sig_ [_args_]
> Send a transaction to a contract.

**balance** _address_
> Get ETH balance of address.

**block** [_number_]
> Get block information.

**tx** _hash_
> Get transaction details.

**receipt** _hash_
> Get transaction receipt.

**gas-price**
> Get current gas price.

**abi-encode** _sig_ [_args_]
> ABI encode function call data.

**abi-decode** _sig_ _data_
> Decode ABI-encoded data.

**sig** _signature_
> Get function selector (4 bytes).

**4byte-decode** _selector_
> Look up function signature.

**to-wei** _amount_
> Convert ether to wei.

**from-wei** _amount_
> Convert wei to ether.

**--rpc-url** _url_
> Ethereum RPC endpoint.

**--private-key** _key_
> Private key for signing.

**--chain** _chain_
> Chain name or ID.

# CONFIGURATION

**foundry.toml**
> Project-level Foundry configuration including default RPC URLs, chain settings, and etherscan API keys.

# CAVEATS

Requires access to an Ethereum RPC endpoint. Private keys should be handled securely (use environment variables or keystore). Gas estimation may be inaccurate for complex transactions. Some functions require an Etherscan API key for signature lookups.

# HISTORY

**cast** is part of **Foundry**, developed by **Georgios Konstantopoulos** and the **Paradigm** team, announced in **December 2021**. Foundry was created as a fast, portable Ethereum development toolkit written in Rust, inspired by DappTools. Cast provides the CLI utilities while Forge handles testing and Anvil provides local nodes.

# SEE ALSO

[forge](/man/forge)(1), [anvil](/man/anvil)(1), [chisel](/man/chisel)(1), [geth](/man/geth)(1)
