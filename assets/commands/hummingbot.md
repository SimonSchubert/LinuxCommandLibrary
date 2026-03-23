# TAGLINE

open-source crypto trading bot framework

# TLDR

**Start the interactive TUI**

```hummingbot```

**Start with a specific strategy**

```hummingbot -s [strategy_name]```

**Start with a specific config file**

```hummingbot --config-file-name [config.yml]```

**Start with a password**

```hummingbot --config-password [password]```

# SYNOPSIS

**hummingbot** [_options_]

# PARAMETERS

**-s** _STRATEGY_, **--strategy** _STRATEGY_
> Strategy to start with.

**--config-file-name** _FILE_
> Configuration file to use.

**--config-password** _PASSWORD_
> Password for encrypted config files.

**-h**, **--help**
> Display help.

# DESCRIPTION

**hummingbot** is an open-source cryptocurrency trading bot framework that provides an interactive terminal interface for automated trading. It supports strategies such as market making, arbitrage, and liquidity mining across centralized and decentralized exchanges.

The TUI provides real-time status updates, order tracking, and profit/loss reporting. Users configure strategies through interactive prompts or YAML configuration files. The bot supports paper trading mode for testing strategies without risking funds.

# CAVEATS

Requires API keys from supported exchanges. Trading involves financial risk. Requires Python 3.8+ and various dependencies. Available via Docker or source installation.

# SEE ALSO

[freqtrade](/man/freqtrade)(1), [gocryptotrader](/man/gocryptotrader)(1), [cointop](/man/cointop)(1)

