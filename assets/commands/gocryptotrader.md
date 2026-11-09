# TAGLINE

cryptocurrency trading engine with CLI client

# TLDR

**Start the trading engine**

```gocryptotrader```

**Start with a specific config file**

```gocryptotrader -config [config.json]```

**List exchanges using the CLI client**

```gctcli getexchanges```

**List only enabled exchanges**

```gctcli getexchanges --enabled```

**Connect to an engine with custom gRPC credentials**

```gctcli --rpchost [localhost:9052] --rpcuser [user] --rpcpassword [password] getinfo```

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

**-datadir** _DIR_
> Default data directory for GoCryptoTrader files.

**-dryrun**
> Dry run the bot without saving the config file.

**-enableallexchanges**
> Enable all exchanges.

**-enableallpairs**
> Enable all pairs for enabled exchanges.

**-exchanges** _LIST_
> Comma-separated list of exchanges to load. If empty, all exchanges enabled in the config are loaded.

**-grpc**
> Enable the gRPC server (default: true).

**-grpcproxy**
> Enable the gRPC proxy server.

**-verbose**
> Increase logging verbosity.

**-version**
> Display version.

**-help**
> Display help.

**--rpchost** _HOST:PORT_
> gRPC host and port (gctcli, default: localhost:9052).

**--rpcuser** _USER_
> gRPC username (gctcli, default: admin).

**--rpcpassword** _PASSWORD_
> gRPC password (gctcli, default: Password).

**--cert** _FILE_
> Path to the TLS certificate used to connect to the engine (gctcli).

**--timeout** _DURATION_
> Timeout for gRPC requests (gctcli).

# DESCRIPTION

**gocryptotrader** is an open-source cryptocurrency trading engine written in Go. It supports simultaneous connections to multiple exchanges for trading, portfolio management, and market data retrieval.

The companion CLI tool **gctcli** provides command-line access to the trading engine via gRPC, allowing users to query tickers, manage orders, view portfolios, and configure exchange connections. A separate event-driven backtester application is included in the repository.

# CAVEATS

Requires API keys from supported exchanges for trading functionality. The trading engine must be running with gRPC enabled for gctcli commands to work, and the gctcli credentials must match the engine's configuration. Written in Go.

# SEE ALSO

[freqtrade](/man/freqtrade)(1), [cointop](/man/cointop)(1)

# RESOURCES

```[Source code](https://github.com/thrasher-corp/gocryptotrader)```

<!-- verified: 2026-11-09 -->
