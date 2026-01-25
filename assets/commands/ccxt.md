# TLDR

**Fetch the order book** for a trading pair

```ccxt [binance] fetchOrderBook [BTC/USDT]```

**Fetch recent trades** for a market

```ccxt [okx] fetchTrades [ETH/USDT]```

**Fetch all tickers** in table format

```ccxt [bitget] fetchTickers --table```

**Fetch account balance** (requires API keys)

```ccxt [bybit] fetchBalance```

**Display available markets** on an exchange

```ccxt [gate] markets```

**Create a limit order** (requires API keys)

```ccxt [binance] createOrder [BTC/USDT] limit buy [0.001] [50000]```

**Use sandbox mode** for testing

```ccxt [okx] fetchTicker [BTC/USDT] --sandbox```

**Get help on a method**

```ccxt explain createOrder```

# SYNOPSIS

**ccxt** _exchange_id_ [_method_] [_arguments_...] [_OPTIONS_]

# PARAMETERS

**--table**
> Format output as a readable table instead of JSON.

**--raw**
> Output raw JSON without formatting.

**--sandbox**
> Use the exchange's sandbox/testnet environment.

# COMMANDS

_exchange_id_
> The exchange to connect to (e.g., binance, okx, bybit, kraken, coinbase).

_exchange_id_ **markets**
> List all available markets on the exchange.

_exchange_id_ **currencies**
> Show available currencies and their properties.

_exchange_id_ **fetchTicker** _symbol_
> Fetch current ticker data for a trading pair.

_exchange_id_ **fetchOrderBook** _symbol_
> Fetch the order book for a trading pair.

_exchange_id_ **fetchTrades** _symbol_
> Fetch recent trades for a market.

_exchange_id_ **fetchOHLCV** _symbol_ _timeframe_
> Fetch candlestick/OHLCV data.

_exchange_id_ **fetchBalance**
> Fetch account balance (requires authentication).

_exchange_id_ **createOrder** _symbol_ _type_ _side_ _amount_ [_price_]
> Create a new order (requires authentication).

**explain** _method_
> Show required arguments for a method.

# DESCRIPTION

**CCXT** (CryptoCurrency eXchange Trading) CLI is a command-line interface for interacting with over 100 cryptocurrency exchanges using the CCXT library. It allows fetching market data, checking balances, placing orders, and more without writing code.

The CLI supports both public APIs (no authentication needed) and private APIs (requiring API keys). Credentials can be provided via environment variables (e.g., BINANCE_APIKEY, BINANCE_SECRET) or a keys.local.json configuration file.

Output is JSON by default and can be piped to tools like **jq** for processing. The **--table** option provides human-readable formatted output.

# CAVEATS

The CLI executes commands immediately without confirmation. Confusing amounts with prices can cause loss of funds. CCXT is non-custodian software—it does not hold funds but provides direct API access to exchanges. Always test with sandbox mode or small amounts first. Rate limits and API restrictions vary by exchange.

# HISTORY

CCXT was created to provide a unified API across cryptocurrency exchanges, abstracting away differences between exchange APIs. The project started around **2017** and has grown to support over 100 exchanges. It is available as a library for JavaScript, TypeScript, Python, C#, PHP, and Go, with the CLI providing command-line access to the same functionality.

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1), [node](/man/node)(1)
