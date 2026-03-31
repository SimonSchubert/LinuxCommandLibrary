# TAGLINE

cryptocurrency trading engine with CLI client

# TLDR

**Start the trading engine**

```gocryptotrader```

**Start with a specific config file**

```gocryptotrader -config [config.json]```

**List supported exchanges using the CLI client**

```gctcli getexchanges```

**Get ticker for a currency pair**

```gctcli getticker --exchange [binance] --pair [BTC-USDT] --asset [spot]```

**Get account portfolio summary**

```gctcli getportfoliosummary```

**Enable or disable an exchange**

```gctcli enableexchange --exchange [binance]```

**Get orderbook for a currency pair**

```gctcli getorderbook --exchange [binance] --pair [BTC-USDT] --asset [spot]```

# SYNOPSIS

**gocryptotrader** [_options_]

**gctcli** _command_ [_options_]

# PARAMETERS

**-config** _FILE_
> Path to configuration file.

**-verbose**
> Enable verbose output.

**-version**
> Display version.

**-help**
> Display help.

**-grpchost** _HOST_
> gRPC host address (gctcli, default: localhost).

**-grpcport** _PORT_
> gRPC port (gctcli, default: 9052).

# DESCRIPTION

**gocryptotrader** is an open-source cryptocurrency trading engine written in Go. It supports simultaneous connections to multiple exchanges for trading, portfolio management, and market data retrieval.

The companion CLI tool **gctcli** provides command-line access to the trading engine via gRPC, allowing users to query tickers, manage orders, view portfolios, and configure exchange connections. The engine supports backtesting, live trading, and paper trading modes.

# CAVEATS

Requires API keys from supported exchanges for trading functionality. The trading engine must be running for gctcli commands to work. Written in Go.

# SEE ALSO

[freqtrade](/man/freqtrade)(1), [cointop](/man/cointop)(1)

