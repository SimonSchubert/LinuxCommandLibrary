# TAGLINE

Terminal client for Longbridge market data and trading

# TLDR

**Log in** to a Longbridge account (opens a browser for OAuth)

```longbridge auth login```

**Show a real-time quote** for a symbol (CODE.MARKET notation)

```longbridge quote [NVDA.US]```

**Show a candlestick (K-line) chart** for a symbol

```longbridge kline [700.HK]```

**List current positions**

```longbridge positions```

**Show portfolio profit and loss**

```longbridge portfolio```

**Fetch the latest news** for a symbol

```longbridge news [AAPL.US]```

**Output machine-readable JSON** for scripting or piping into jq

```longbridge quote [TSLA.US] --format json```

# SYNOPSIS

**longbridge** _command_ [_arguments_] [**--format** _json_]

# DESCRIPTION

**longbridge** is a command-line client for **Longbridge Securities** that exposes the Longbridge OpenAPI from the terminal. It covers real-time and historical market data, fundamentals, account and portfolio management, and order placement through a single binary, with over a hundred subcommands mapping onto the underlying API endpoints.

Securities are addressed with **CODE.MARKET** notation, for example `TSLA.US` for a US stock, `700.HK` for a Hong Kong listing, or `600519.SH` for a Shanghai A-share. Most commands accept **--format json** so their output can be scripted, piped into tools such as `jq`, or fed to an AI agent; without it, results are printed as human-readable tables and charts.

Authentication uses OAuth 2.0 through the Longbridge SDK. Running `longbridge auth login` opens a browser to authorize the account, after which the SDK stores and refreshes the token, so individual commands do not need manual credentials.

# COMMANDS

**auth login**

> Authorize a Longbridge account via OAuth and store the session token.

**quote** _symbol_

> Print a real-time quote for the given symbol.

**kline** _symbol_

> Display a candlestick (K-line) chart used for technical analysis.

**positions**

> List the account's current holdings.

**portfolio**

> Show portfolio overview and profit-and-loss metrics.

**news** _symbol_

> Show recent news for a symbol.

**financial-report** _symbol_

> Retrieve a company's financial statements.

Additional command groups cover depth and filings, options and warrants, IPOs, watchlists, trading, statements, insider trades, recurring investments, short selling, and stock screening.

# PARAMETERS

**--format** _json_

> Emit machine-readable JSON instead of formatted terminal output. Useful for scripting and piping into `jq`.

# CAVEATS

longbridge places real orders and exposes live account data, so trading subcommands move real money and carry the usual market risk. It requires a funded Longbridge account and OpenAPI access, and is only useful in markets and instrument types that Longbridge supports. Quote entitlements depend on the account's market-data subscriptions.

# HISTORY

The tool is developed and open-sourced by **Longbridge**, a financial-technology company, under the **Apache License 2.0**. It is written in **Rust** and pairs a scriptable CLI with an interactive terminal UI, positioning itself as an "AI-native" front end to the Longbridge OpenAPI.

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/longbridge/longbridge-terminal)```

```[Documentation](https://open.longbridge.com/docs/cli)```

<!-- verified: 2026-06-27 -->
